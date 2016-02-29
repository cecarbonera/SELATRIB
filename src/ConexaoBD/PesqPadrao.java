package ConexaoBD;

import java.io.IOException;
import java.sql.SQLException;

public class PesqPadrao extends javax.swing.JDialog {
    //Método Inicializador
    public PesqPadrao() throws SQLException {
        super();
        initComponents();
        
        //Atribuições Iniciais
        this.setSize(600, 380);
        this.setResizable(false);
        this.setModal(true);

    }

    public void ExecPesquisa(String lSQL) throws SQLException, IOException {
        //Se algum deles foi selecionado
        if (RBIgual.isSelected()) {
            lSQL += " WHERE " + JCBSelecao.getSelectedItem() + " = " + JTFDescr.getText();

        } else if (RBMaior.isSelected()) {
            lSQL += " WHERE " + JCBSelecao.getSelectedItem() + " > " + JTFDescr.getText();

        } else if (RBMenor.isSelected()) {
            lSQL += " WHERE " + JCBSelecao.getSelectedItem() + " < " + JTFDescr.getText();

        } else if (RBComeca.isSelected()) {
            lSQL += " WHERE " + JCBSelecao.getSelectedItem() + " LIKE '" + JTFDescr.getText() + "%'";

        } else if (RBContem.isSelected()) {
            lSQL += " WHERE " + JCBSelecao.getSelectedItem() + " LIKE '%" + JTFDescr.getText() + "%'";

        } else if (RBTermina.isSelected()) {
            lSQL += " WHERE " + JCBSelecao.getSelectedItem() + " LIKE '%" + JTFDescr.getText() + "'";

        }
                
        MontaGrid Lactos = new MontaGrid(lSQL);

        Grid.getViewport().add(Lactos, null);
        
        this.getContentPane().validate();
        this.getContentPane().repaint();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JCBSelecao = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        JTFDescr = new javax.swing.JTextField();
        RBIgual = new javax.swing.JRadioButton();
        RBMaior = new javax.swing.JRadioButton();
        RBMenor = new javax.swing.JRadioButton();
        RBComeca = new javax.swing.JRadioButton();
        RBContem = new javax.swing.JRadioButton();
        RBTermina = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        JBtExecutar = new javax.swing.JButton();
        JBtSelec = new javax.swing.JButton();
        JBtFechar = new javax.swing.JButton();
        Grid = new javax.swing.JScrollPane();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(630, 445));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Seleção");

        jLabel2.setText("Descrição");

        RBIgual.setSelected(true);
        RBIgual.setText("É igual a");

        RBMaior.setText("Maior que");
        RBMaior.setToolTipText("");

        RBMenor.setText("Menor que");

        RBComeca.setText("Começa com");

        RBContem.setText("Contêm");

        RBTermina.setText("Termina com");
        RBTermina.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(JCBSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RBIgual)
                        .addGap(18, 18, 18)
                        .addComponent(RBMaior)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(RBMenor)
                        .addGap(33, 33, 33)
                        .addComponent(RBComeca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(RBContem)
                        .addGap(42, 42, 42)
                        .addComponent(RBTermina))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(JTFDescr))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JCBSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFDescr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBIgual)
                    .addComponent(RBMaior)
                    .addComponent(RBMenor)
                    .addComponent(RBComeca)
                    .addComponent(RBContem)
                    .addComponent(RBTermina))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JBtExecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaselatrib/Imagens/Pesquisar16X16.png"))); // NOI18N
        JBtExecutar.setText("Pesquisar");
        JBtExecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtExecutarActionPerformed(evt);
            }
        });

        JBtSelec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaselatrib/Imagens/Processar16x16.gif"))); // NOI18N
        JBtSelec.setText("Selecionar");

        JBtFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jaselatrib/Imagens/Sair16X16.png"))); // NOI18N
        JBtFechar.setText("Fechar");
        JBtFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBtFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBtExecutar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBtSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBtFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JBtExecutar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JBtSelec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JBtFechar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Grid)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Grid, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBtFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtFecharActionPerformed
        dispose();

    }//GEN-LAST:event_JBtFecharActionPerformed

    private void JBtExecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBtExecutarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBtExecutarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JScrollPane Grid;
    public javax.swing.JButton JBtExecutar;
    public javax.swing.JButton JBtFechar;
    public javax.swing.JButton JBtSelec;
    public static javax.swing.JComboBox JCBSelecao;
    private javax.swing.JTextField JTFDescr;
    private javax.swing.JRadioButton RBComeca;
    private javax.swing.JRadioButton RBContem;
    private javax.swing.JRadioButton RBIgual;
    private javax.swing.JRadioButton RBMaior;
    private javax.swing.JRadioButton RBMenor;
    private javax.swing.JRadioButton RBTermina;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
