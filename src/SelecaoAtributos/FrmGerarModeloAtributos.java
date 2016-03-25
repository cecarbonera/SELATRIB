
package SelecaoAtributos;

public class FrmGerarModeloAtributos extends javax.swing.JDialog {
    
    public FrmGerarModeloAtributos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Setar o título
        this.setTitle("Manutenção Seleção de Atributos");

        //Setar modal
        setModal(true);

        //Tentar Centralizar
        setLocationRelativeTo(null);
   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        jbProcessar = new javax.swing.JButton();
        jbProcessar2 = new javax.swing.JButton();
        jbProcessar3 = new javax.swing.JButton();
        jbProcessar5 = new javax.swing.JButton();
        jbProcessar4 = new javax.swing.JButton();
        jbProcessar1 = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jbConsultar = new javax.swing.JButton();
        jbImprimir1 = new javax.swing.JButton();
        jbImprimir = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtArquivo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAtributos = new javax.swing.JTable();
        jToolBar3 = new javax.swing.JToolBar();
        jbProcessar6 = new javax.swing.JButton();
        jbProcessar7 = new javax.swing.JButton();
        jbProcessar8 = new javax.swing.JButton();
        jbProcessar9 = new javax.swing.JButton();
        jbProcessar10 = new javax.swing.JButton();
        jbProcessar11 = new javax.swing.JButton();
        jbSalvar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jbProcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arrow_large_left.png"))); // NOI18N
        jbProcessar.setText("Primeiro");
        jbProcessar.setToolTipText("Primeiro Registro Cadastrado");
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

        jbProcessar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/application_windows_left.png"))); // NOI18N
        jbProcessar2.setText("Anterior");
        jbProcessar2.setToolTipText("Registro Anterior Cadastrado");
        jbProcessar2.setFocusable(false);
        jbProcessar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar2.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar2.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar2.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar2jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbProcessar2);

        jbProcessar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/application_windows_right.png"))); // NOI18N
        jbProcessar3.setText("Próximo ");
        jbProcessar3.setToolTipText("Próximo Registro Cadastrado");
        jbProcessar3.setFocusable(false);
        jbProcessar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar3.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar3.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar3.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar3jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbProcessar3);

        jbProcessar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arrow_large_right.png"))); // NOI18N
        jbProcessar5.setText("Último");
        jbProcessar5.setToolTipText("Último Registro Cadastrado");
        jbProcessar5.setFocusable(false);
        jbProcessar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar5.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar5.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar5.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar5jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbProcessar5);

        jbProcessar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        jbProcessar4.setText("Novo");
        jbProcessar4.setToolTipText("Novo Registro");
        jbProcessar4.setFocusable(false);
        jbProcessar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar4.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar4.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar4.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar4jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbProcessar4);

        jbProcessar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar16X16.png"))); // NOI18N
        jbProcessar1.setText("Salvar");
        jbProcessar1.setToolTipText("Salvar Registro");
        jbProcessar1.setFocusable(false);
        jbProcessar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar1.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar1.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar1.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar1jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbProcessar1);

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar_16x16.gif"))); // NOI18N
        jbSalvar.setText("Excluir");
        jbSalvar.setToolTipText("Excluir Registro Cadastrado");
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

        jbConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pesquisar16X16.png"))); // NOI18N
        jbConsultar.setText("Consultar");
        jbConsultar.setToolTipText("Consultar Processamentos/Atributos Realizados");
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

        jbImprimir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/printer.png"))); // NOI18N
        jbImprimir1.setText("Imprimir");
        jbImprimir1.setToolTipText("Imprimir Relatório");
        jbImprimir1.setFocusable(false);
        jbImprimir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbImprimir1.setMaximumSize(new java.awt.Dimension(70, 45));
        jbImprimir1.setMinimumSize(new java.awt.Dimension(70, 45));
        jbImprimir1.setPreferredSize(new java.awt.Dimension(70, 45));
        jbImprimir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbImprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbImprimir1jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jbImprimir1);

        jbImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ListCompl16X16.png"))); // NOI18N
        jbImprimir.setText("Duplicar");
        jbImprimir.setToolTipText("Duplicar Registro");
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

        jLabel1.setText("Código Modelo");

        txtCodigo.setEditable(false);

        jLabel2.setText("Descrição");

        jLabel3.setText("Descrição");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel4.setText("Categorização dos Atributos");

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
        jScrollPane2.setViewportView(tblAtributos);

        jToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar3.setFloatable(false);
        jToolBar3.setRollover(true);

        jbProcessar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arrow_large_left.png"))); // NOI18N
        jbProcessar6.setText("Primeiro");
        jbProcessar6.setToolTipText("Primeiro Atributo");
        jbProcessar6.setFocusable(false);
        jbProcessar6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar6.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar6.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar6.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar6jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jbProcessar6);

        jbProcessar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/application_windows_left.png"))); // NOI18N
        jbProcessar7.setText("Anterior");
        jbProcessar7.setToolTipText("Atributo Anterior");
        jbProcessar7.setFocusable(false);
        jbProcessar7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar7.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar7.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar7.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar7jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jbProcessar7);

        jbProcessar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/application_windows_right.png"))); // NOI18N
        jbProcessar8.setText("Próximo ");
        jbProcessar8.setToolTipText("Próximo Atributo");
        jbProcessar8.setFocusable(false);
        jbProcessar8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar8.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar8.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar8.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar8jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jbProcessar8);

        jbProcessar9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arrow_large_right.png"))); // NOI18N
        jbProcessar9.setText("Último");
        jbProcessar9.setToolTipText("Último Atributo");
        jbProcessar9.setFocusable(false);
        jbProcessar9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar9.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar9.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar9.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar9jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jbProcessar9);

        jbProcessar10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        jbProcessar10.setText("Novo");
        jbProcessar10.setToolTipText("Novo Atributo");
        jbProcessar10.setFocusable(false);
        jbProcessar10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar10.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar10.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar10.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar10jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jbProcessar10);

        jbProcessar11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/refresh.png"))); // NOI18N
        jbProcessar11.setText("Editar");
        jbProcessar11.setToolTipText("Editar Atributo");
        jbProcessar11.setFocusable(false);
        jbProcessar11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbProcessar11.setMaximumSize(new java.awt.Dimension(70, 45));
        jbProcessar11.setMinimumSize(new java.awt.Dimension(70, 45));
        jbProcessar11.setPreferredSize(new java.awt.Dimension(70, 45));
        jbProcessar11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbProcessar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProcessar11jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jbProcessar11);

        jbSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cancelar_16x16.gif"))); // NOI18N
        jbSalvar1.setText("Excluir");
        jbSalvar1.setToolTipText("Excluir Atributo");
        jbSalvar1.setFocusable(false);
        jbSalvar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbSalvar1.setMaximumSize(new java.awt.Dimension(70, 45));
        jbSalvar1.setMinimumSize(new java.awt.Dimension(70, 45));
        jbSalvar1.setPreferredSize(new java.awt.Dimension(70, 45));
        jbSalvar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvar1jButton1ActionPerformed(evt);
            }
        });
        jToolBar3.add(jbSalvar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 959, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbProcessarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessarjButton1ActionPerformed
        
    }//GEN-LAST:event_jbProcessarjButton1ActionPerformed

    private void jbSalvarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarjButton1ActionPerformed
        
    }//GEN-LAST:event_jbSalvarjButton1ActionPerformed

    private void jbImprimirjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimirjButton1ActionPerformed

    }//GEN-LAST:event_jbImprimirjButton1ActionPerformed

    private void jbConsultarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConsultarjButton1ActionPerformed
       
    }//GEN-LAST:event_jbConsultarjButton1ActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        //Liberar a Tela
        dispose();
    }//GEN-LAST:event_jbSairActionPerformed

    private void jbProcessar1jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar1jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar1jButton1ActionPerformed

    private void jbProcessar2jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar2jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar2jButton1ActionPerformed

    private void jbProcessar3jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar3jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar3jButton1ActionPerformed

    private void jbProcessar4jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar4jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar4jButton1ActionPerformed

    private void jbProcessar5jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar5jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar5jButton1ActionPerformed

    private void jbImprimir1jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbImprimir1jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbImprimir1jButton1ActionPerformed

    private void jbProcessar6jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar6jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar6jButton1ActionPerformed

    private void jbProcessar7jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar7jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar7jButton1ActionPerformed

    private void jbProcessar8jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar8jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar8jButton1ActionPerformed

    private void jbProcessar9jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar9jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar9jButton1ActionPerformed

    private void jbProcessar10jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar10jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar10jButton1ActionPerformed

    private void jbProcessar11jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProcessar11jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbProcessar11jButton1ActionPerformed

    private void jbSalvar1jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvar1jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalvar1jButton1ActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton jbConsultar;
    private javax.swing.JButton jbImprimir;
    private javax.swing.JButton jbImprimir1;
    private javax.swing.JButton jbProcessar;
    private javax.swing.JButton jbProcessar1;
    private javax.swing.JButton jbProcessar10;
    private javax.swing.JButton jbProcessar11;
    private javax.swing.JButton jbProcessar2;
    private javax.swing.JButton jbProcessar3;
    private javax.swing.JButton jbProcessar4;
    private javax.swing.JButton jbProcessar5;
    private javax.swing.JButton jbProcessar6;
    private javax.swing.JButton jbProcessar7;
    private javax.swing.JButton jbProcessar8;
    private javax.swing.JButton jbProcessar9;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbSalvar1;
    private javax.swing.JTable tblAtributos;
    private javax.swing.JTextField txtArquivo;
    private javax.swing.JTextField txtCodigo;
    // End of variables declaration//GEN-END:variables
}
