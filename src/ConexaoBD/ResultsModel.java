package ConexaoBD;

import java.io.IOException;
import java.util.*;
import javax.swing.table.*;

public class ResultsModel extends AbstractTableModel {
    //Declaração Variáveis e Objetos
    private String[] colunas;
    public Vector Linhas;

    public void setResultSet(String SQL) throws IOException {
        //Declaração Variáveis e Obejtos
        ConexaoBD objConexaoBD = new ConexaoBD();
        
        try {          
            //Conectar ao Banco de Dados
            objConexaoBD.ConectarBD();

            //Carregar Colunas e Dados
            colunas = objConexaoBD.carrNomes(SQL);
            Linhas = objConexaoBD.carrVetor(SQL);

        } catch (Exception e) {

        } finally {
            objConexaoBD = null;

        }

    }

    @Override
    public int getColumnCount() {
        return colunas.length;

    }

    @Override
    public int getRowCount() {
        //definir o retorno    
        return (Linhas == null) ? 0 : Linhas.size();
    }

    //Fun��es existentes na Classe AbstractTableModel
    @Override
    public Object getValueAt(int linha, int coluna) {
        return ((String[]) (Linhas.elementAt(linha)))[coluna];

    }

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];

    }

}
