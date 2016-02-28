package ConexaoBD;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MontaGrid extends JPanel {

    private ResultsModel modelo = new ResultsModel();//Classe desenvolvida do Abstract Table Model
    public JTable tabela = new JTable();

    public MontaGrid(String SQL) throws IOException {
        ResultsModel modelo = new ResultsModel();
        modelo.setResultSet(SQL);
    
        tabela.setModel(modelo);
        tabela.setLayout(new BorderLayout());
        
        JScrollPane grid = new JScrollPane(tabela);
        
        this.setLayout(new BorderLayout());
        this.add(grid, BorderLayout.CENTER);
        
    }
    
}
