package SelAtrib;

public class FrmExportDados extends javax.swing.JDialog {

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
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAtributos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(911, 488));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SelAtrib/Imagens/Pesquisar16X16.png"))); // NOI18N
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

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SelAtrib/Imagens/Salvar16X16.png"))); // NOI18N
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

        jbSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SelAtrib/Imagens/Sair16X16.png"))); // NOI18N
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

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

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

        jLabel3.setText("Resultado Consulta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarjButton1ActionPerformed


    }//GEN-LAST:event_jbSalvarjButton1ActionPerformed

    private void jbConsultarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarjButton1ActionPerformed

    }//GEN-LAST:event_jbConsultarjButton1ActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        //Liberar a Tela
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTable tblAtributos;
    // End of variables declaration//GEN-END:variables
}
