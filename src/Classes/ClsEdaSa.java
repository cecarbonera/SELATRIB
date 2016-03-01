package Classes;

import Classes.ClsIndividuo;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import weka.classifiers.Evaluation;
import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.meta.FilteredClassifier;
import weka.core.Instances;
import weka.filters.unsupervised.attribute.Remove;

public class ClsEdaSa {

    //<editor-fold defaultstate="collapsed" desc="1° Configuração das Bases de Dados e atributos iniciais">    	    
    //Arquivo com Atributos Numéricos
    public static final int _NroFolds = 10;
    public static final Classes.MersenneTwister _MT = new Classes.MersenneTwister();
    public static ClsIndividuo[] populacao;

    private static ClsIndividuo[] melhorPopulacao;
    private static double[] probabilidades;
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="2° Definição do Método Inicializador da Classe e Demais Métodos">
    public ClsEdaSa() {

    }
    // </editor-fold>

    //<editor-fold defaultstate="collapsed" desc="3° Funcionalidades Pertinentes aos métodos de processamento">       
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // Geração da População Inicial
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    // 1° Definir a Quantidade de Atributos de Cada indivíduo 
    // 2° Efetuar a Criação de Indvíduos com probabilidade de 50% p* 0´s ou 1´s 
    // 3° Calcular o fitness do indivíduo apartir de um classificador 
    // 4° Selecionar 50% dos mellhores indivíduos(Menor Erro)
    // 5° Calcular o vetor das probabilidades E imprimir os valores       
    // -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public void GerarPopulacaoInicial(Instances dados, int geracao, int quantidade, String[][] tblAtributos) throws Exception {
        try {
            //Declaração Variáveis e Objetos
            populacao = new ClsIndividuo[quantidade];
            int qtdCromossomos = dados.numAttributes() - 1;

            //Inicializar a população (pelo tamanho definido)
            for (int i = 0; i < quantidade; i++) {
                //Inicialização do Objeto
                populacao[i] = new ClsIndividuo(qtdCromossomos);

                //Geração da população com 50% de probabilidade
                populacao[i].CromossomosRandomicos(0.5);

            }

            //Cálculo do Fitness(Quantidade de 1´s encontrados X Cromossomo)
            CalcularFitness(populacao, qtdCromossomos, dados);

            //Pegar os 50% melhores indivíduos da população
            melhorPopulacao = melhorPopulacao(qtdCromossomos, quantidade);

            //Calcular a probabilidade de cada posição
            CalcularVetorProbabilidades(qtdCromossomos, geracao, tblAtributos);
           

        } catch (Exception e) {
            throw e;

        }

    }

    //Calcular o Fitness da População (Utilizando Classificador definido)
    public void CalcularFitness(ClsIndividuo[] Individuos, int nroAtribs, Instances dados) throws Exception {
        try {
            //Declaração variáveis e atributos
            NaiveBayes nb = new NaiveBayes();
            Remove rm;

            //Percorrer todos os indivíduos
            for (ClsIndividuo Individuo : Individuos) {
                //Declaração variáveis e Inicializações
                rm = new Remove();
                String regs = "";

                //Percorrer TODOS os atributos do individuo
                for (int iatr = 1; iatr < nroAtribs; iatr++) {
                    //Se for igual a 1 Seleciona o Atributo
                    if (Individuo.getCromossomo(iatr) == 1) {
                        //Concatenação - Os Atributos na base de dados(Weka) começam em "1"..."N"
                        regs += String.valueOf(iatr + 1).concat(",");

                    }

                }

                //Definição dos atributos - { Remover o último "," }
                rm.setOptions(new String[]{"-R", regs.substring(0, regs.length() - 1)});

                //Declaração do Classificador em cima do filtro estabelecido
                FilteredClassifier fc = new FilteredClassifier();
                Evaluation eval = new Evaluation(dados);

                //Filtrar os registros
                fc.setFilter(rm);

                //Setar o classificador
                fc.setClassifier(nb);

                //Calcular a Taxa de Erro
                eval.crossValidateModel(fc, dados, _NroFolds, new Random(1));

                //Atualizar o valor de Fitness do indivíduo
                Individuo.setFitnessValue(eval.errorRate());

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    //Encontrar os 50% melhores indivíduos da população
    public ClsIndividuo[] melhorPopulacao(int nroCromossomos, int quantidade) {
        //Declaração Variáveis e Objetos
        ClsIndividuo[] bestPopulation = new ClsIndividuo[quantidade / 2];
        List<ClsIndividuo> dados = new ArrayList<>();

        //Percorrer todos os indivíduos
        for (ClsIndividuo individuo : populacao) {
            //Adicionar o Indivíduo
            dados.add(new ClsIndividuo(individuo.getCromossomo(), individuo.getFitnessValue()));

        }

        //Ordenar decrescente
        Collections.sort(dados);

        //Percorrer o vetor e adicionar os melhores indivíduos (50% deles)
        for (int i = 0; i < quantidade / 2; i++) {
            //Alocar memória p/ o Objeto
            bestPopulation[i] = new ClsIndividuo(dados.get(i).getCromossomo().length);

            //Atribuições das propriedades
            bestPopulation[i].setCromossomo(dados.get(i).getCromossomo());
            bestPopulation[i].setFitnessValue(dados.get(i).getFitnessValue());

        }

        //Definir o retorno
        return bestPopulation;

    }

    //Geração das Populações após a População Inicial
    public void GerarPopulacao(Instances dados, int geracao, int quantidade, String[][] tblAtributos) {
        try {
            //Declaração Variáveis e Objetos
            int qtdCromossomos = dados.numAttributes() - 1;
            populacao = new ClsIndividuo[quantidade];

            //Inicializar a população (pelo tamanho definido)
            for (int i = 0; i < quantidade; i++) {
                //Inicialização do Objeto
                populacao[i] = new ClsIndividuo(qtdCromossomos);

                //Geração da população tendo como base o vetor de probabilidades
                populacao[i].CromossomosRandomicos(probabilidades);

            }

            //Cálcular Fitness(Quantidade de 1´s encontrados X Cromossomo)
            CalcularFitness(populacao, qtdCromossomos, dados);

            //Pegar os 50% melhores indivíduos da população
            melhorPopulacao = melhorPopulacao(qtdCromossomos, quantidade);

            //Recalcular o vetor de probabilidades
            CalcularVetorProbabilidades(qtdCromossomos, geracao, tblAtributos);

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

    //Calcular vetor de probabilidades
    //public void CalcularVetorProbabilidades(int qtdCromossomos, int geracao, JTable tblAtributos) {
    public void CalcularVetorProbabilidades(int qtdCromossomos, int geracao, String[][] tblAtributos) {
        //Inicializar o vetor de probabilidade
        probabilidades = new double[qtdCromossomos];

        //Percorrer a quantidade de registros existentes
        for (int j = 0; j < qtdCromossomos; j++) {
            //Declaração e inicialização da variável
            double percentual = 0;

            //Percorre os cromossomos existentes na posição "j" e totaliza a valor(1 - Válido / 0 - Inválido)
            for (ClsIndividuo individuo : melhorPopulacao) {
                //Totalizar o Indivíduo
                percentual += individuo.getCromossomo(j);

            }

            //Resultado da Probabilidade do cromossomo da posição "j"
            probabilidades[j] = percentual == 0 ? 0 : percentual / melhorPopulacao.length;

        }

        //Imprimir o vetor de probabilidades
        imprimirVetorProbabilidades(geracao, tblAtributos);

    }

    //Inserir o registro no Grid
    public void imprimirVetorProbabilidades(int geracao, String[][] tblAtributos) {
        //Declaração Variáveis e Objetos
        //DefaultTableModel dados = (DefaultTableModel) tblAtributos.getModel();
        //Vector linha = new Vector();

        //Setar a Geração Processada
        //linha.add(0, geracao == 0 ? "Inicial" : geracao + "° Geração");
        tblAtributos[geracao][0] = (geracao == 0 ? "Inicial" : geracao + "° Geração");

        //Percorrer os atributos
        for (int i = 0; i < probabilidades.length; i++) {
            //setar a probabilidade da coluna
            //linha.add(i + 1, new DecimalFormat("##0.00").format(probabilidades[i]));
            tblAtributos[geracao][i + 1] = new DecimalFormat("##0.00").format(probabilidades[i]).toString();

        }

        //Adicionar a linhas
        //dados.addRow(linha);

    }

    // </editor-fold>    

}
