package Classes;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class MontaGrid extends JPanel {
    private final ResultsModel modelo = new ResultsModel();//Classe desenvolvida do Abstract Table Model
    public JTable tabela = new JTable();

    public MontaGrid(String SQL) throws IOException {
        //Montar o modelo de dados
        modelo.setResultSet(SQL);
    
        //Setar o modelo
        tabela.setModel(modelo);
        tabela.setLayout(new BorderLayout());
        
        JScrollPane grid = new JScrollPane(tabela);
        
        this.setLayout(new BorderLayout());
        this.add(grid, BorderLayout.CENTER);
        
    }
    
}
