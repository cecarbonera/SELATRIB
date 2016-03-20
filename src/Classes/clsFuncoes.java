package Classes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class clsFuncoes {

    public clsFuncoes() {
    }

    //Leitura do diretório
    public String leituraParametros() {
        //Declaração Variáveis e Objetos
        String strRetorno = "";

        //1° Linha - Caminho do Banco de Dados
        //2° Linha - Usuário do Banco de Dados
        //3° Linha - Senha do Banco de Dados 
        //4° Linha - Diretório dos Arquivos a serem importados
        try {
            //Declaração Variáveis e Objetos
            File arquivo = new File("ParamSelecaoAtributos.txt");

            //Se o Arquivo Existe
            if (arquivo.exists()) {
                //Inicialização/Leitura dos Arquivos
                FileReader leitor = new FileReader("ParamSelecaoAtributos.txt");
                BufferedReader bufferDados = new BufferedReader(leitor);

                //Declaração Veriáveis e Objetos
                String linhaDados = "";
                int ilinha = 1;

                //Enquanto ler dados do Arquivo
                while ((linhaDados = bufferDados.readLine()) != null) {
                    //Se não for nulo os dados da linha
                    if (linhaDados.trim() != "") {
                        //Se for a linha do diretório
                        if (ilinha == 4) {
                            //Atribuição do diretório
                            strRetorno = linhaDados;

                        }

                        //Atualizar a Linha
                        ilinha += 1;

                    }

                }

                //Fechar o leitor do Arquivo
                leitor.close();
                bufferDados.close();

                //Liberar os Objetos
                leitor = null;
                bufferDados = null;

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

        //Definir o retorno
        return strRetorno;

    }

}
