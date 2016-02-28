/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaselatrib;

import ConexaoBD.*;
import ConexaoBD.MontaGrid;
import ConexaoBD.PesqPadrao;
import java.awt.event.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class pesqProcessamento extends PesqPadrao {

    //Declaração Variáveis e Objetos
    private final MontaGrid Lactos;
    public String rsCodProc = "";

    public pesqProcessamento() throws SQLException, IOException {
        super();
        ConexaoBD objConexaoBD = new ConexaoBD();

        this.setTitle("Pesquisa Processamentos Efetuados");
        setLocation(22, 48);

        objConexaoBD.carrCamposCombo(PesqPadrao.JCBSelecao, "  * FROM PROCESSAMENTO ");

        Lactos = new MontaGrid(
                " CODIGO, DTPPROCESS, CAMINHOARQ, QTDINDIVIDUOS, QTDGERACOES "
                + "  FROM PROCESSAMENTO "
                + " ORDER BY CODIGO");

        Grid.getViewport().add(Lactos, null);

        this.JBtExecutar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    ExecPesquisa("SELECT CODIGO, DTPPROCESS, CAMINHOARQ, QTDINDIVIDUOS, QTDGERACOES FROM PROCESSAMENTO ");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(pesqProcessamento.class.getName()).log(Level.SEVERE, null, ex);
                    
                } catch (IOException ex) {
                    Logger.getLogger(pesqProcessamento.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
                
            }
            
        });
        
        JBtSelec.addActionListener((ActionEvent e) -> {
            //Setar o Código do processamento
            rsCodProc = Lactos.tabela.getModel().getValueAt(Lactos.tabela.getSelectedRow(), 0).toString();
            dispose();

        });

    }

}
