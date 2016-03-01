package Classes;

import ConexaoBD.*;
import ConexaoBD.MontaGrid;
import ConexaoBD.PesqPadrao;
import java.awt.event.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClspesqProcessamento extends PesqPadrao {

    //Declaração Variáveis e Objetos
    private final MontaGrid Lactos;
    public String rsCodProc = "";

    public ClspesqProcessamento() throws SQLException, IOException {
        super();
        ConexaoBD objConexaoBD = new ConexaoBD();

        this.setTitle("Pesquisa Processamentos Efetuados");
        setLocation(22, 48);

        objConexaoBD.carrCamposCombo(PesqPadrao.JCBSelecao, "  * FROM PROCESSAMENTO ");

        Lactos = new MontaGrid(
                "  SELECT CODIGO, DTPPROCESS, CAMINHOARQ, QTDINDIVIDUOS, QTDGERACOES "
                + "  FROM PROCESSAMENTO "
                + " ORDER BY CODIGO");

        Grid.getViewport().add(Lactos, null);

        this.JBtExecutar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    ExecPesquisa("SELECT CODIGO, DTPPROCESS, CAMINHOARQ, QTDINDIVIDUOS, QTDGERACOES FROM PROCESSAMENTO ");
                    
                } catch (SQLException | IOException ex) {
                    Logger.getLogger(ClspesqProcessamento.class.getName()).log(Level.SEVERE, null, ex);
                    
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
