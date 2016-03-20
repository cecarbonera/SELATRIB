package SelecaoAtributos;

import Classes.MontaGrid;
import Classes.clsFuncoes;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;
import weka.core.converters.CSVSaver;

public class FrmExportDados extends javax.swing.JDialog {

    //Declaração Variáveis e Objetos      
    private MontaGrid Grid;

    @SuppressWarnings("empty-statement")
    public FrmExportDados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //Setar o título
        setTitle("Exportação/Consulta Informações Banco de Dados");

        //Setar modal
        setModal(true);

        //Controlar Botões
        jbSalvar.setEnabled(false);
        jbConsultar.setEnabled(true);
        jbConsultar.setEnabled(true);
        jtaConsulta.setEnabled(true);
        txtArquivo.setEnabled(false);
        btnSelArquivo.setEnabled(false);

        //Tentar Centralizar
        setLocationRelativeTo(null);

        cbArquivoCSV.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {//checkbox has been selected
                //Desabilitar
                jbConsultar.setEnabled(false);
                jtaConsulta.setEnabled(false);

                //Habilitar
                jbSalvar.setEnabled(true);
                txtArquivo.setEnabled(true);
                btnSelArquivo.setEnabled(true);
                txtArquivo.setText("");

            } else {
                //Habilitar
                jbConsultar.setEnabled(true);
                jtaConsulta.setEnabled(true);

                //Desabilitar
                jbSalvar.setEnabled(false);
                txtArquivo.setEnabled(false);
                btnSelArquivo.setEnabled(false);
                txtArquivo.setText("");

            };

        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        jbConsultar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaConsulta = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jspGrid = new javax.swing.JScrollPane();
        cbArquivoCSV = new java.awt.Checkbox();
        jLabel2 = new javax.swing.JLabel();
        txtArquivo = new javax.swing.JTextField();
        btnSelArquivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(911, 488));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imprimir16X16.png"))); // NOI18N
        jbConsultar.setText("Processar");
        jbConsultar.setToolTipText("Consultar Dados / Processar Arquivo Selecionado.");
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

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar16X16.png"))); // NOI18N
        jbSalvar.setText("Exportar");
        jbSalvar.setToolTipText("Salvar Dados em Arquivo extensão arff");
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

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sair16X16.png"))); // NOI18N
        jbSair.setText("Sair");
        jbSair.setToolTipText("Sair da Tela");
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

        jLabel1.setText("Instrução SQL");

        jtaConsulta.setColumns(20);
        jtaConsulta.setRows(5);
        jScrollPane2.setViewportView(jtaConsulta);

        jLabel3.setText("Resultado Consulta");

        cbArquivoCSV.setLabel("Processar Arquivo CSV");
        cbArquivoCSV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbArquivoCSVKeyPressed(evt);
            }
        });

        jLabel2.setText("Arquivo:");

        btnSelArquivo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSelArquivo.setText("....");
        btnSelArquivo.setToolTipText("Localizar Arquivo");
        btnSelArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelArquivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 1021, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtArquivo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSelArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jspGrid, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 908, Short.MAX_VALUE)))
                                    .addComponent(cbArquivoCSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbArquivoCSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelArquivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarjButton1ActionPerformed
        try {
            //Declaração Variáveis e Objetos
            String strMensagem = txtArquivo.getText().equals("") ? "Confirma a Exportação dos Dados Consultados ?"
                    : "Confirma a Exportação do Arquivo Selecionado ?";
            boolean bolArquivoCSV = txtArquivo.getText().equals("") ? false : true;

            //Se confirmado o processamento
            if (JOptionPane.showConfirmDialog(null, strMensagem, "Atenção", JOptionPane.YES_NO_OPTION)
                    == JOptionPane.YES_OPTION) {
                //Declaração Variáveis e Objetos 
                CSVLoader loader = new CSVLoader();
                File arquivoCSV = null;

                String lsArquivo = "DADOS" + String.valueOf(Calendar.YEAR) + String.valueOf(Calendar.MONTH)
                        + String.valueOf(Calendar.DAY_OF_MONTH) + String.valueOf(Calendar.HOUR)
                        + String.valueOf(Calendar.MINUTE) + String.valueOf(Calendar.SECOND);

                String lsCamArquivo = (new clsFuncoes().leituraParametros() + "\\" + lsArquivo).trim();

                //Se não for Arquivo CSV
                if (!bolArquivoCSV) {
                    //Gravar o arquivo em formato CSV
                    GravarArquivoCSV(Grid.tabela, lsCamArquivo + ".CSV");

                    //Definir o caminho do arquivo CSV
                    arquivoCSV = new File(lsCamArquivo + ".CSV");

                } else {
                    //Pegar o caminho do arquivo CSV
                    arquivoCSV = new File(txtArquivo.getText());

                }

                //Carregar arquivo CSV
                loader.setSource(arquivoCSV);

                //Setar as instâncias
                Instances dados = loader.getDataSet();

                //Salvar arquivo ARFF 
                ArffSaver arquivoARFF = new ArffSaver();

                arquivoARFF.setInstances(dados);
                arquivoARFF.setFile(new File(lsCamArquivo + ".arff"));

                //Gravar o arquivo arff
                arquivoARFF.writeBatch();

                //Se não for Arquivo CSV, exclui o arquivo gerado
                if (!bolArquivoCSV) {
                    //Se for um arquivo válido
                    if (arquivoCSV.isFile()) {
                        //Excluir o Arquivo
                        arquivoCSV.delete();

                    }

                }

                //Controle dos botões
                jbSalvar.setEnabled(false);
                jbConsultar.setEnabled(true);

                //Mensagem de Processamento finalizado com sucesso
                showMessageDialog(null, "Arquivo.: " + lsCamArquivo + ".arff Salvo c/ sucesso.");

                //Liberar os objetos
                arquivoARFF = null;
                dados = null;
                loader = null;
                lsArquivo = lsCamArquivo = null;

            }

        } catch (IOException ex) {
            showMessageDialog(null, "Erro Processamento.: " + ex.getMessage());

        } catch (SQLException ex) {
            Logger.getLogger(FrmExportDados.class.getName()).log(Level.SEVERE, null, ex);

        } catch (HeadlessException | ClassNotFoundException ex) {
            Logger.getLogger(FrmExportDados.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jbSalvarjButton1ActionPerformed

    /*
     Arquivo deverá ser salvo em formato TXT
     */
    public void GravarArquivoCSV(JTable tabela, String arquivo) throws IOException, ClassNotFoundException, SQLException {
        try {
            //Declaração Variáveis e Objetos      
            Writer gravar = null;

            //Inicializar a Tabela (Aqruivo sempre deverá ser no format TXT)
            gravar = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), "utf-8"));

            //Declaração Variáveis e Objetos
            String colunasTabela = "";

            //Percorrer todas as colunas
            for (int j = 0; j < tabela.getModel().getColumnCount(); j++) {
                //Montas as colunas
                colunasTabela += tabela.getModel().getColumnName(j)
                        + (j != tabela.getModel().getColumnCount() ? ", " : "");

            }

            //Gravar a linha do arquivo
            gravar.write(colunasTabela + "\r\n");

            //Percorrer as linhas
            for (int i = 0; i < tabela.getModel().getRowCount(); i++) {
                //Declaração Variáveis e Objetos
                String linhaDados = "";

                //Percorrer todas as colunas
                for (int j = 0; j < tabela.getModel().getColumnCount(); j++) {
                    //Montar a linhas
                    linhaDados += tabela.getModel().getValueAt(i, j) + (j
                            != tabela.getModel().getColumnCount() ? ", " : "");

                }

                //Gravar a linha de dados
                gravar.write(linhaDados + "\r\n");

            }
            //Finalizar o objeto
            gravar.close();

        } catch (Exception e) {

        }

    }

    private void jbConsultarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarjButton1ActionPerformed
        try {
            //Executar a Consulta
            Grid = new MontaGrid(jtaConsulta.getText().trim());
            jspGrid.getViewport().add(Grid, null);

            //Se encontrou linhas
            if (Grid.tabela.getRowCount() > 0) {
                //Controlar os botões
                jbConsultar.setEnabled(false);
                jbSalvar.setEnabled(true);

            }

            this.getContentPane().validate();
            this.getContentPane().repaint();

        } catch (IOException ex) {
            //Atribuir o Erro
            showMessageDialog(null, "Erro no Processamento da Consulta. Erro.: " + ex.getMessage());

        }

    }//GEN-LAST:event_jbConsultarjButton1ActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        //Liberar a Tela
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void btnSelArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelArquivoActionPerformed
        //Declaração Variáveis e Objetos
        JFileChooser file = new JFileChooser();

        //Filtar modo Arquivos
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.setDialogTitle("Selecione um arquivo");

        //Atribuir o local do diretório dos arquivos
        file.setCurrentDirectory(new File(new clsFuncoes().leituraParametros()));

        //Inicialização
        txtArquivo.setText("");

        //Se selecionou
        if (file.showSaveDialog(null) != 1) {
            //Declaração Variáveis e Objetos
            File arquivo = file.getSelectedFile();

            //Pegar o caminho do Arquivo
            txtArquivo.setText(arquivo.getPath());

        }

    }//GEN-LAST:event_btnSelArquivoActionPerformed

    private void cbArquivoCSVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbArquivoCSVKeyPressed


    }//GEN-LAST:event_cbArquivoCSVKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelArquivo;
    private java.awt.Checkbox cbArquivoCSV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JScrollPane jspGrid;
    private javax.swing.JTextArea jtaConsulta;
    private javax.swing.JTextField txtArquivo;
    // End of variables declaration//GEN-END:variables

    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    private void ExportarArffParaCSV() {
        try {
            // TODO add your handling code here:            
            ArffLoader loader = new ArffLoader();
            loader.setSource(new File("C:\\SELATRIB\\Arquivos\\vote.arff"));
            Instances dados = loader.getDataSet();

            //Salvar Como CSV
            CSVSaver salvar = new CSVSaver();
            salvar.setInstances(dados);
            salvar.setFile(new File("C:\\SELATRIB\\Arquivos\\vote.csv"));
            salvar.writeBatch();

        } catch (IOException ex) {
            Logger.getLogger(FrmExportDados.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
        //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar
    //Rotina para exportar CSV ->>>>> Não apagar   
}
