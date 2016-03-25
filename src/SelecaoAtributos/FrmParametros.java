package SelecaoAtributos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;

public class FrmParametros extends javax.swing.JDialog {

    public FrmParametros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //Setar o título
        setTitle("Manutenção Parâmetros do Sistema");
        
        //Setar modal
        setModal(true);
        
        //Tentar Centralizar
        setLocationRelativeTo(null);
        
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
                        switch (ilinha) {
                            case 1:
                                txtBancoDados.setText(linhaDados);
                                break;

                            case 2:
                                txtUsuario.setText(linhaDados);
                                break;

                            case 3:
                                txtSenha.setText(linhaDados);
                                break;

                            default:
                                txtDiretorio.setText(linhaDados);
                                break;

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

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        jbSalvar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDiretorio = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        lblMellhorIndividuo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtBancoDados = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(733, 232));

        jToolBar2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Salvar16X16.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.setToolTipText("Salvar Priocessamento");
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

        jLabel1.setText("Banco de Dados");

        jLabel2.setText("Diretório Arquivos Importação");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("....");
        jButton4.setToolTipText("Localizar Arquivo");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        lblMellhorIndividuo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setText("Usuário Banco Dados");

        jLabel7.setText("Senha Banco Dados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDiretorio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMellhorIndividuo)
                    .addComponent(jLabel1)
                    .addComponent(txtBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addComponent(txtBancoDados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addGap(2, 2, 2)
                .addComponent(lblMellhorIndividuo)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarjButton1ActionPerformed
        //Se o Banco de Dados for vazio
        if (txtBancoDados.getText().trim().equals("")) {
            showMessageDialog(null, "Banco de Dados inválido.");
            return;

        }

        //Se o Usuário for vazio
        if (txtUsuario.getText().trim().equals("")) {
            showMessageDialog(null, "Usuário inválido.");
            return;

        }

        //Se a Senha for vazia
        if (txtSenha.getText().trim().equals("")) {
            showMessageDialog(null, "Senha inválida.");
            return;

        }

        //Se o Diretório for vazio
        if (txtDiretorio.getText().trim().equals("")) {
            showMessageDialog(null, "Diretório inválido.");
            return;

        }

        try {
            //Declaração Variáveis e Objetos
            File arquivo = new File("ParamSelecaoAtributos.txt");

            //Se o Arquivo Existir
            if (arquivo.exists()) {
                //Deletar o Arquivo
                arquivo.delete();

            }

            //Definir o Local e o Nome do Arquivo de parâmetros
            FileOutputStream gravacao = new FileOutputStream("ParamSelecaoAtributos.txt");

            //Gravar as linhas no arquivo
            gravacao.write((txtBancoDados.getText() + "\n").getBytes());
            gravacao.write((txtUsuario.getText() + "\n").getBytes());
            gravacao.write((txtSenha.getText()+ "\n").getBytes());
            gravacao.write((txtDiretorio.getText()).getBytes());

            //Fechar o Arquivo
            gravacao.close();

            //Liberar o Objeto
            gravacao = null;

            //Mensagem de Confirmação
            showMessageDialog(null, "Dados Gravados c/ Sucesso .");

        } catch (IOException e) {
            e.printStackTrace();

        }

    }//GEN-LAST:event_jbSalvarjButton1ActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
        //Liberar a Tela
        dispose();

    }//GEN-LAST:event_jbSairActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Declaração Variáveis e Objetos
        JFileChooser diretorios = new JFileChooser();
        diretorios.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        diretorios.showSaveDialog(null);

        //Setar o diretorio
        txtDiretorio.setText(diretorios.getSelectedFile().getPath());

    }//GEN-LAST:event_jButton4ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel lblMellhorIndividuo;
    private javax.swing.JTextField txtBancoDados;
    private javax.swing.JTextField txtDiretorio;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
