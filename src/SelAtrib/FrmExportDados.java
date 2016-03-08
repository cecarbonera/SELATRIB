package SelAtrib;

import Classes.MontaGrid;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.JOptionPane.showMessageDialog;
import weka.core.Attribute;
import weka.core.FastVector;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.filters.Filter;
import weka.filters.unsupervised.instance.NonSparseToSparse;

public class FrmExportDados extends javax.swing.JDialog {

    private MontaGrid Grid;

    public FrmExportDados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        //Setar o título
        setTitle("Exportação/Consulta Informações Banco de Dados");

        //Setar modal
        setModal(true);

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
        jbSalvar.setText("Salvar");
        jbSalvar.setToolTipText("Salvar Priocessamento");
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
        //Declaração Variáveis e Objetos
        Instances dados = null;
        ArffSaver ExpDados = new ArffSaver();
        ExpDados.setInstances(dados);

        try {
            //Declaração Variáveis e Objetos 
            FastVector colunas = new FastVector();
            Date data = new Date();

            double[] valores = null;

            String lsnomeArq = data.toString().replace(":", "").replace("/", "").replace(".", "").replace("-", "").trim();
            String lsCamArquivo = new FrmEdasa().leituraParametros() + "\\" + lsnomeArq;

            ArffSaver arquivoARFF = new ArffSaver();

            //Definição do Caminho do Arquivo
            ExpDados.setFile(new File(lsCamArquivo));

            //Percorrer todos os atributos(Colunas) do grid
            for (int i = 0; i < Grid.tabela.getColumnCount(); i++) {
                //Adicionar as colunas (nomes)
                colunas.addElement(new Attribute(Grid.tabela.getColumnName(i)));

            }

            //Criar o DataSet de Dados (zerado)
            Instances dsDados = new Instances("Dados", colunas, 0);

            //Percorrer todas as linhas da tabela
            for (int iLinha = 0; iLinha < Grid.tabela.getRowCount(); iLinha++) {
                //Percorrer todas as colunas da tabela
                for (int iColuna = 0; iColuna < Grid.tabela.getColumnCount(); iColuna++) {
                    //Gravar a linha
                    dsDados.add(new Instance(1, valores));

                }
                
            }
            
            //NonSparseToSparse nonSparseToSparseInstance = new NonSparseToSparse();
            //nonSparseToSparseInstance.setInputFormat(dsDados);
            //Instances sparseDataset = Filter.useFilter(dsDados, nonSparseToSparseInstance);
            //arffSaverInstance.setInstances(sparseDataset);
            //Setar os dados
            arquivoARFF.setInstances(dsDados);

            //Definir o arquivo
            arquivoARFF.setFile(new File(lsCamArquivo));

            //Escrever o arquivo
            arquivoARFF.writeBatch();

            //Gravar o Arquivo
            ExpDados.writeBatch();

            //Mensagem de Processamento finalizado com sucesso
            showMessageDialog(null, "Arquivo Salvo c/ sucesso. \n\r" + lsCamArquivo);

        } catch (IOException ex) {
            showMessageDialog(null, "Erro Processamento.: " + ex.getMessage());

        } catch (SQLException ex) {
            Logger.getLogger(FrmExportDados.class.getName()).log(Level.SEVERE, null, ex);

        } catch (Exception ex) {
            Logger.getLogger(FrmExportDados.class.getName()).log(Level.SEVERE, null, ex);
            
        }

    }//GEN-LAST:event_jbSalvarjButton1ActionPerformed

    private void jbConsultarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarjButton1ActionPerformed
        try {
            //Executar a Consulta
            MontaGrid Lactos = new MontaGrid(jtaConsulta.getText().trim());
            jspGrid.getViewport().add(Lactos, null);

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
