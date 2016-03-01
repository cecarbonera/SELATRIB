package SelAtrib;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        try {
            initComponents();
            this.setExtendedState(JFrame.MAXIMIZED_BOTH);
            this.setTitle("SELATRIB - SELeção de ATRIButos");

        } catch (Exception e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuSistema = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Parametros = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        GerarModeloAtributos = new javax.swing.JMenuItem();
        SelecaoAtributos = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ConsExpoDados = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(574, 395));
        setName("frmMenuPrincipal"); // NOI18N

        jMenu1.setText("Cadastro");

        Parametros.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Parametros.setText("Parâmetros");
        Parametros.setToolTipText("Cadastro/Manutenção Parâmetros Sistema");
        Parametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParametrosActionPerformed(evt);
            }
        });
        jMenu1.add(Parametros);

        menuSistema.add(jMenu1);

        jMenu2.setText("Processamento");

        GerarModeloAtributos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        GerarModeloAtributos.setText("Gerar Modelo de Atributos");
        GerarModeloAtributos.setToolTipText("Geração Modelo de Atributos (Leitura Arquivo Dados)");
        GerarModeloAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GerarModeloAtributosActionPerformed(evt);
            }
        });
        GerarModeloAtributos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                GerarModeloAtributosKeyPressed(evt);
            }
        });
        jMenu2.add(GerarModeloAtributos);

        SelecaoAtributos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        SelecaoAtributos.setText("Seleção de Atributos");
        SelecaoAtributos.setToolTipText("Seleção/Vinculação dos Atributos Processados");
        SelecaoAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelecaoAtributosActionPerformed(evt);
            }
        });
        jMenu2.add(SelecaoAtributos);
        jMenu2.add(jSeparator1);

        ConsExpoDados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        ConsExpoDados.setText("Consultar/Exportar Dados");
        ConsExpoDados.setToolTipText("Consultar/Exportar Dados cadastrados em Banco de Dados");
        ConsExpoDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsExpoDadosActionPerformed(evt);
            }
        });
        jMenu2.add(ConsExpoDados);

        menuSistema.add(jMenu2);

        jMenu4.setText("Finalizar");

        jMenuItem3.setText("Finalizar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        menuSistema.add(jMenu4);

        setJMenuBar(menuSistema);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            //Finalizar a Aplicação
            System.exit(0);

        } catch (Throwable ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParametrosActionPerformed
        //Inicializar o Objeto
        FrmParametros objFrmParam = new FrmParametros(this, true);

        //Tornar Visível
        objFrmParam.setVisible(true);

    }//GEN-LAST:event_ParametrosActionPerformed

    private void GerarModeloAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GerarModeloAtributosActionPerformed
        try {
            //Inicializar o Objeto
            FrmEdasa objFrmEdasa = new FrmEdasa(this, true);

            //Tornar Visível
            objFrmEdasa.setVisible(true);

        } catch (SQLException | IOException ex) {
            Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);

        }

    }//GEN-LAST:event_GerarModeloAtributosActionPerformed

    private void GerarModeloAtributosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GerarModeloAtributosKeyPressed

    }//GEN-LAST:event_GerarModeloAtributosKeyPressed

    private void SelecaoAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelecaoAtributosActionPerformed
        //Inicializar o Objeto
        FrmSelecaoAtributos objFrmSelecaoAtributos = new FrmSelecaoAtributos(this, true);

        //Tornar Visível
        objFrmSelecaoAtributos.setVisible(true);

    }//GEN-LAST:event_SelecaoAtributosActionPerformed

    private void ConsExpoDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsExpoDadosActionPerformed
        //Inicializar o Objeto
        FrmExportDados objFrmExportaDados = new FrmExportDados(this, true);

        //Tornar Visível
        objFrmExportaDados.setVisible(true);

    }//GEN-LAST:event_ConsExpoDadosActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuPrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ConsExpoDados;
    private javax.swing.JMenuItem GerarModeloAtributos;
    private javax.swing.JMenuItem Parametros;
    private javax.swing.JMenuItem SelecaoAtributos;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuBar menuSistema;
    // End of variables declaration//GEN-END:variables
}
