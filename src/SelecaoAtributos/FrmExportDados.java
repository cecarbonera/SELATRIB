package SelecaoAtributos;

import Classes.MontaGrid;
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
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

public class FrmExportDados extends javax.swing.JDialog {

    //Declaração Variáveis e Objetos      
    private MontaGrid Grid;   

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

        //Tentar Centralizar
        setLocationRelativeTo(null);

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(911, 488));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imprimir16X16.png"))); // NOI18N
        jbConsultar.setMnemonic('P');
        jbConsultar.setText("Consultar");
        jbConsultar.setToolTipText("Consultar Processamentos Efetuados");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jspGrid)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 891, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jspGrid, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarjButton1ActionPerformed
        try {
            //Se confirmado o processament
            if (JOptionPane.showConfirmDialog(null, "Confirma a Exportação dos Dados Consultados ?",
                    "Atenção", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                //Declaração Variáveis e Objetos 
                CSVLoader loader = new CSVLoader();

                String lsArquivo = "DADOS" + String.valueOf(Calendar.YEAR) + String.valueOf(Calendar.MONTH)
                        + String.valueOf(Calendar.DAY_OF_MONTH) + String.valueOf(Calendar.HOUR)
                        + String.valueOf(Calendar.MINUTE) + String.valueOf(Calendar.SECOND);

                String lsCamArquivo = (new FrmEdasa().leituraParametros() + "\\" + lsArquivo).trim();

                //Gravar o arquivo em formato CSV
                GravarArquivoCSV(Grid.tabela , lsCamArquivo + ".CSV");

                //Definiro caminho do arquivo CSV
                File arquivoCSV = new File(lsCamArquivo + ".CSV");

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

                //Se for um arquivo válido
                if (arquivoCSV.isFile()) {
                    //Excluir o Arquivo
                    arquivoCSV.delete();

                }

                //Liberar os objetos
                arquivoARFF = null;
                dados = null;
                loader = null;
                lsArquivo = lsCamArquivo = null;

                //Controle dos botões
                jbSalvar.setEnabled(false);
                jbConsultar.setEnabled(true);

                //Mensagem de Processamento finalizado com sucesso
                showMessageDialog(null, "Arquivo.: " + lsCamArquivo + ".arff Salvo c/ sucesso.");

            }

        } catch (IOException ex) {
            showMessageDialog(null, "Erro Processamento.: " + ex.getMessage());

        } catch (SQLException ex) {
            Logger.getLogger(FrmExportDados.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception ex) {
            Logger.getLogger(FrmExportDados.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jbSalvarjButton1ActionPerformed

    /*
     Arquivo deverá ser salvo em formato TXT
     */
    public void GravarArquivoCSV(JTable tabela, String arquivo) throws IOException, ClassNotFoundException, SQLException {
        //Declaração Variáveis e Objetos      
        Writer gravar = null;

        try {
            //Inicializar a Tabela (Aqruivo sempre deverá ser no format TXT)
            gravar = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(arquivo), "utf-8"));

            //Declaração Variáveis e Objetos
            String colunasTabela = "";

            //Percorrer todas as colunas
            for (int j = 0; j < tabela.getModel().getColumnCount(); j++) {
                //Montas as colunas
                colunasTabela += tabela.getModel().getColumnName(j) +
                        (j != tabela.getModel().getColumnCount() ? ", " : "");

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
                    linhaDados += tabela.getModel().getValueAt(i, j) + (j != 
                            tabela.getModel().getColumnCount() ? ", " : "");

                }

                //Gravar a linha de dados
                gravar.write(linhaDados + "\r\n");

            }

        } finally {
            //Finalizar o objeto
            gravar.close();

        }

    }

    private void jbConsultarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarjButton1ActionPerformed
        try {
            //Executar a Consulta
            Grid = new MontaGrid(jtaConsulta.getText().trim());
            jspGrid.getViewport().add(Grid, null);

            //Inicializar o Objeto
            //this.tabelaConsulta = new JTable();

            //Atribuir a tabela de dados (do resultSet)
            //this.tabelaConsulta = Lactos.tabela;

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JScrollPane jspGrid;
    private javax.swing.JTextArea jtaConsulta;
    // End of variables declaration//GEN-END:variables
}
