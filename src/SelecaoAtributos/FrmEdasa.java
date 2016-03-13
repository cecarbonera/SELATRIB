package SelecaoAtributos;

import Classes.ClsEdaSa;
import Classes.ClsIndividuo;
import Classes.ClsProcessamento;
import Classes.ClspesqProcessamento;
import ConexaoBD.tabAtributos;
import ConexaoBD.tabProcessamento;
import java.awt.Color;
import java.awt.Cursor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import weka.core.Instances;

public class FrmEdasa extends javax.swing.JDialog {

    public FrmEdasa(java.awt.Frame parent, boolean modal) throws SQLException, IOException {
        super(parent, modal);
        initComponents();

        //Inicialização Default dos componentes
        InicializarComponentes();

        //Setar o título
        this.setTitle("EDASA - Algoritmo de Estimativa de Distribuição p/ Seleção de Atributos");

        //Setar modal
        setModal(true);

        //Tentar Centralizar
        setLocationRelativeTo(null);

    }

    public FrmEdasa() throws SQLException, IOException {
        //Componentes Criados pelo netBeans
        initComponents();

        //Inicialização Default dos componentes
        InicializarComponentes();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        jbProcessar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAtributos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jspGeracoes = new javax.swing.JSpinner();
        lblMellhorIndividuo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jspQuantidade = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jbProcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Processar16x16.gif"))); // NOI18N
        jbProcessar.setText("Processar");
        jbProcessar.setToolTipText("Iniciar Processamento dos Atributos");
        jbProcessar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbProcessar.setFocusable(false);
        jbProcessar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessarjButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbProcessar);

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar16X16.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.setToolTipText("Salvar Processamento dos Dados");
        jbSalvar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbSalvar.setFocusable(false);
        jbSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSalvar.setMaximumSize(new java.awt.Dimension(70, 45));
        jbSalvar.setMinimumSize(new java.awt.Dimension(70, 45));
        jbSalvar.setPreferredSize(new java.awt.Dimension(70, 45));
        jbSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarjButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbSalvar);

        jbImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ListCompl16X16.png"))); // NOI18N
        jbImprimir.setMnemonic('P');
        jbImprimir.setText("Imprimir");
        jbImprimir.setToolTipText("Imprimir Relatório do Resultado do Processamento");
        jbImprimir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbImprimir.setFocusable(false);
        jbImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbImprimir.setMaximumSize(new java.awt.Dimension(70, 45));
        jbImprimir.setMinimumSize(new java.awt.Dimension(70, 45));
        jbImprimir.setPreferredSize(new java.awt.Dimension(70, 45));
        jbImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimirjButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbImprimir);

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar16X16.png"))); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.setToolTipText("Consultar Processamentos/Atributos Realizados");
        jbConsultar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbConsultar.setFocusable(false);
        jbConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbConsultar.setMaximumSize(new java.awt.Dimension(70, 45));
        jbConsultar.setMinimumSize(new java.awt.Dimension(70, 45));
        jbConsultar.setPreferredSize(new java.awt.Dimension(70, 45));
        jbConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConsultarjButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbConsultar);

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair16X16.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.setToolTipText("Sair da Tela");
        jbSair.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbSair.setFocusable(false);
        jbSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSair.setMaximumSize(new java.awt.Dimension(70, 45));
        jbSair.setMinimumSize(new java.awt.Dimension(70, 45));
        jbSair.setPreferredSize(new java.awt.Dimension(70, 45));
        jbSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });
        jToolBar2.add(jbSair);

        jPanel2.setAlignmentX(0.0F);
        jPanel2.setAlignmentY(0.0F);

        jLabel1.setText("Código.:");

        txtCodigo.setEditable(false);

        jLabel2.setText("Arquivo:");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("....");
        jButton4.setToolTipText("Localizar Arquivo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tblAtributos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblAtributos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAtributos);

        jLabel3.setText("Categorização dos Atributos");

        jLabel4.setText("Gerações:");

        lblMellhorIndividuo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setText("Quantidade Individuos:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jspGeracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jspQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblMellhorIndividuo)
                                .addGap(238, 238, 238))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 909, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jspQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jspGeracoes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMellhorIndividuo)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbProcessarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessarjButton1ActionPerformed
        try {
            //Se Caminho arquivo for vazio
            if (txtArquivo.getText().trim().equals("")) {
                showMessageDialog(null, "Arquivo inválido.");
                return;
            }

            //Se Quantidade de indivíduos for vazio
            if ((int) jspQuantidade.getValue() <= 0) {
                showMessageDialog(null, "Quantidade de indivíduos inválida.");
                return;
            }

            //Se Quantidade de indivíduos for vazio
            if ((int) jspGeracoes.getValue() <= 0) {
                showMessageDialog(null, "Quantidade de gerações inválida.");
                return;
            }

            //Se confirmado o processament
            if (JOptionPane.showConfirmDialog(null, "Confirma o processamento dos Atributos ?",
                    "Atenção", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                //Thread de atualização dos dados
                new Thread() {
                    @Override
                    public void run() {
                        //Declaração Variáveis e Objetos
                        Instances dados = new Instances(new ClsProcessamento(txtArquivo.getText()).lerArquivoDados());
                        String colunas[] = new String[dados.numAttributes()];
                        String[][] matrizDados = new String[Integer.parseInt(jspGeracoes.getValue().toString())][dados.numAttributes()];
                        ClsEdaSa objEdasa = new ClsEdaSa();
                        int nroGeracao = 1;

                        try {
                            //Setar o valor
                            colunas[0] = "Geração";

                            //Percorrer todas as colunas
                            for (int i = 0; i < dados.numAttributes() - 1; i++) {
                                //Se for a primeira posição
                                colunas[i + 1] = dados.attribute(i).name();

                            }

                            //Geração da População Inicial
                            objEdasa.GerarPopulacaoInicial(dados, 0, (int) jspQuantidade.getValue(), matrizDados);

                            //Adicionar as colunas e os dados
                            tblAtributos.setModel(new javax.swing.table.DefaultTableModel(matrizDados, colunas));

                            //Formatar Colunas da Tabela de Atributos
                            formatarColunasTabAtributos(tblAtributos);

                            //Enquanto puder processar
                            while (nroGeracao < (int) jspGeracoes.getValue()) {
                                //Gerar População
                                objEdasa.GerarPopulacao(dados, nroGeracao, (int) jspQuantidade.getValue(), matrizDados);

                                //Adicionar as colunas e os dados
                                tblAtributos.setModel(new javax.swing.table.DefaultTableModel(matrizDados, colunas));

                                //Formatar Colunas da Tabela de Atributos
                                formatarColunasTabAtributos(tblAtributos);

                                //Atualizar a posição
                                nroGeracao += 1;

                            }

                            //Atualizar o processamento
                            dados.stratify(ClsEdaSa._NroFolds);

                            //Percorrer os folds
                            for (int nFolds = 0; nFolds < ClsEdaSa._NroFolds; nFolds++) {
                                //Definir respectivamente as "Divisões" dos Folds
                                Instances treinamento = dados.trainCV(ClsEdaSa._NroFolds, nFolds);  //Pegar O COMPLEMENTO da divisão(90% DOS DADOS - Dados Complementares)
                                ClsIndividuo[] dadosTemp = new ClsIndividuo[1];

                                //Adicionar o registro
                                dadosTemp[0] = ClsEdaSa.populacao[0];

                                try {
                                    //Calcular o Fitness dos Inidivíduos
                                    objEdasa.CalcularFitness(dadosTemp, ClsEdaSa.populacao[0].getTamCromoss(), treinamento);

                                } catch (Exception ex) {
                                    //  Logger.getLogger(jifEdasa.class.getName()).log(Level.SEVERE, null, ex);

                                }

                            }

                            //Atualizar os Status dos botões
                            ControlarBotoes("P");

                            //Mensagem de processamento Finalizado
                            showMessageDialog(null, "Processamento Finalizado c/ Sucesso !");

                        } catch (Exception ex) {
                            //Logger.getLogger(jifEdasa.class.getName()).log(Level.SEVERE, null, ex);

                        }

                    }

                }.start();

            } else {
                //Atualizar os Status dos botões
                ControlarBotoes("I");

            }
        } finally {
            //Troca do cursor para o Padrão
            this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));

        }

    }//GEN-LAST:event_jbProcessarjButton1ActionPerformed

    private void jbSalvarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarjButton1ActionPerformed
        //Deletar tudo e gravar novamente
        try {
            //Declaração Variáveis e Objetos
            tabProcessamento objtabProces = new tabProcessamento(
                    Integer.parseInt(txtCodigo.getText()),
                    new Date(),
                    txtArquivo.getText(),
                    null,
                    (int) jspQuantidade.getValue(),
                    (int) jspGeracoes.getValue());

            tabAtributos objtabAtrib = new tabAtributos();

            //Excluri todos os atributos
            if (objtabAtrib.ExcluirPorCodigo(Integer.parseInt(txtCodigo.getText())) == 0) {
                //Se conseguiu Excluir o registro da tabeClsProcessamentonto e por cascata exclui da tabela Atributos
                if (objtabProces.Excluir(Integer.parseInt(txtCodigo.getText())) == 0) {
                    //Tentar Gravar o Registro na tClsProcessamentoamento
                    if (objtabProces.Inserir(objtabProces) == 0) {
                        //Percorrer todas as linhas da tabela
                        for (int iLinha = 0; iLinha < tblAtributos.getRowCount(); iLinha++) {
                            //Percorrer todas as colunas da tabela
                            for (int iColuna = 0; iColuna < tblAtributos.getColumnCount(); iColuna++) {
                                //Se não for a primeira coluna(1° Geração, 2° Geração, 3° Geração...)
                                if (iColuna > 0) {
                                    //Inicializar o Objeto
                                    objtabAtrib = new tabAtributos(
                                            Integer.parseInt(txtCodigo.getText()),
                                            iColuna,
                                            tblAtributos.getModel().getColumnName(iColuna),
                                            null,
                                            null,
                                            Double.parseDouble(tblAtributos.getModel().getValueAt(iLinha, iColuna).toString().replace(",", ".")),
                                            'S',
                                            iLinha);

                                    //Inserir o Registro na tabela
                                    objtabAtrib.Inserir(objtabAtrib);

                                }

                            }

                        }
                        //Mensagem de confirmação de gravação
                        showMessageDialog(null, "Gravação Efetuada c/ Sucesso !");

                    }

                }

            }

        } catch (NumberFormatException | SQLException e) {
            showMessageDialog(null, "Erro na Gravação Banco Dados.: " + e.getMessage());

        } catch (IOException ex) {
            Logger.getLogger(FrmEdasa.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jbSalvarjButton1ActionPerformed

    private void jbImprimirjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirjButton1ActionPerformed

    }//GEN-LAST:event_jbImprimirjButton1ActionPerformed

    private void jbConsultarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarjButton1ActionPerformed
        try {
            //Declaração Variáveis e Objetos        
            ClspesqProcessamento pqProcess = new ClspesqProcessamento();

            //Tronar a Tela visível
            pqProcess.setVisible(true);

            if (!pqProcess.rsCodProc.equals("")) {
                List<tabProcessamento> dados = new tabProcessamento().Consultar(pqProcess.rsCodProc);

                if (dados != null) {
                    //Atribuiçõs
                    txtCodigo.setText(String.valueOf(dados.get(0).getCodigo()));
                    txtArquivo.setText(String.valueOf(dados.get(0).getCaminhoArq()));
                    jspGeracoes.setValue(dados.get(0).getQtdGeracoes());
                    jspQuantidade.setValue(dados.get(0).getQtdIndividuos());

                    //Consultar os indivíduos da Geração Selecionada
                    ConsultarInviduosGeracao(txtCodigo.getText());

                }

            }

        } catch (SQLException | IOException ex) {
            Logger.getLogger(FrmEdasa.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jbConsultarjButton1ActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        //Liberar a Tela
        dispose();

    }//GEN-LAST:event_jbSairActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Declaração Variáveis e Objetos
        JFileChooser file = new JFileChooser();

        //Filtar modo Arquivos
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setDialogTitle("Selecione um arquivo");

        //Atribuir o local do diretório dos arquivos
        file.setCurrentDirectory(new File(leituraParametros()));

        //Inicialização
        txtArquivo.setText("");

        //Se selecionou
        if (file.showSaveDialog(null) != 1) {
            //Declaração Variáveis e Objetos
            File arquivo = file.getSelectedFile();

            //Pegar o caminho do Arquivo
            txtArquivo.setText(arquivo.getPath());

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //Controlar o status dos botoes
    private void ControlarBotoes(String opcao) {
        //Se for Inicial
        switch (opcao) {
            case "I":
                jbProcessar.setEnabled(true);
                jbSalvar.setEnabled(false);
                jbImprimir.setVisible(false);
                jbConsultar.setEnabled(true);
                break;
            case "P":
                jbProcessar.setEnabled(false);
                jbSalvar.setEnabled(true);
                jbImprimir.setEnabled(true);
                jbConsultar.setEnabled(false);
                break;
            case "C":
                jbProcessar.setEnabled(false);
                jbSalvar.setEnabled(false);
                jbImprimir.setEnabled(false);
                jbConsultar.setEnabled(false);
                break;

        }

    }

    private void InicializarComponentes() throws SQLException, IOException {
        //Atribuições Iniciais
        txtCodigo.setText(new tabProcessamento().ConsultarRegs());
        jspGeracoes.setValue(100);
        jspQuantidade.setValue(1000);
        txtArquivo.setText("");

        //Desabilitar o campo
        txtCodigo.setEnabled(false);
        txtCodigo.setEditable(false);

        //Controlar os Botões Inicialmente
        ControlarBotoes("I");

    }

    private void ConsultarInviduosGeracao(String codigo) throws SQLException, IOException {
        //Limpar os dados
        DefaultTableModel dados = (DefaultTableModel) tblAtributos.getModel();

        //remover todas as linhas da tabela (Somente Dados)
        for (int i = dados.getRowCount() - 1; i >= 0; i--) {
            //Remover a Linha de Dados
            dados.removeRow(i);

        }
        //Consultar os dados 
        List<tabAtributos> atributos = new tabAtributos().Consultar(codigo);

        //Se encontrou dados
        if (atributos != null) {
            //Criar ClsEdaSaeto
            String colunas[] = new String[atributos.size()];
            int iLinhaTemp = atributos.get(0).getLinha();
            int iqtdLinhas = new tabAtributos().QtdLinhaProc(codigo);

            //Setar o valor
            colunas[0] = "Geração";

            //Percorrer todas as colunas
            for (int iColuna = 0; iColuna < atributos.size() - 1; iColuna++) {
                //Se trocou a linha para o processamento
                if (iLinhaTemp != atributos.get(iColuna).getLinha()) {
                    //Atribuir nova linha
                    break;

                }

                //Se for a primeira posição
                colunas[iColuna + 1] = atributos.get(iColuna).getnomeAtrib();

            }

            //Declaração Variáveis e Objetos
            String[][] dadosConsulta = new String[iqtdLinhas][colunas.length];

            //Processar as linhas de dados
            //Declaração Variáveis e Objetos
            Vector linha = null;
            int iCodLinha = 0;

            //Percorrer a quantidade de linhas
            for (int iLinha = 0; iLinha < iqtdLinhas; iLinha++) {
                //percorrer a quantidade de atributos
                for (int iColuna = 0; iColuna < colunas.length; iColuna++) {

                    //Se for a primeira geração - Informa e adiciona qual a geração (coluna 0)
                    if (iColuna == 0) {
                        //Setar a Geração Processada
                        dadosConsulta[iLinha][iColuna] = (iCodLinha == 0 ? "Inicial" : (iCodLinha - 1) + "° Geração");

                    } else {
                        //setar a probabilidade da coluna
                        dadosConsulta[iLinha][iColuna] = new DecimalFormat("##0.00").format(atributos.get(iColuna).getPercentual());

                    }

                }

            }

            //Adicionar as colunas
            tblAtributos.setModel(new javax.swing.table.DefaultTableModel(dadosConsulta, colunas));

            //Fomatar as colunas
            formatarColunasTabAtributos(tblAtributos);

        }

    }

    //Formatar a Tabela de Atributos
    public void formatarColunasTabAtributos(JTable tblAtributos) {
        //Remover todas as linhas
        DefaultTableModel dtModelo = (DefaultTableModel) tblAtributos.getModel();
        int iColuna = 0;

        while (dtModelo.getColumnCount() > iColuna) {
            //Setar o tamanho da coluna
            tblAtributos.getColumnModel().getColumn(iColuna).setPreferredWidth(iColuna == 0 ? 90 : 45);

            //Atualizar o Contatdor
            iColuna += 1;

        }

        //Setar para usar o scroll
        tblAtributos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tblAtributos.revalidate();
        tblAtributos.repaint();

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbProcessar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JSpinner jspGeracoes;
    private javax.swing.JSpinner jspQuantidade;
    private javax.swing.JLabel lblMellhorIndividuo;
    private javax.swing.JTable tblAtributos;
    private javax.swing.JTextField txtArquivo;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables

}
