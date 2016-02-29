package ConexaoBD;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;

/**
 *
 * @author user
 */
public class ConexaoBD {

    //Acesso JDBC  - Final para não ser mudada
    private String BD = "";
    private String usuario = "";
    private String senha = "";

    public Connection conexaoBD;

    //Método Inicializador da classe    
    public ConexaoBD() throws FileNotFoundException, IOException {
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
                            BD = linhaDados;
                            break;
                        case 2:
                            usuario = linhaDados;
                            break;
                        case 3:
                            senha = linhaDados;
                            break;

                        default:
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

    }

//Conectar com o Banco de Dados
    public boolean ConectarBD() {
        //Declaração Variáveis e Objetos
        boolean bRetorno = true;

        //Estabelecer a conexão com o Banco de Dados
        try {
            //Definir o drive de conexão com o Banco de Dados
            Class.forName("org.postgresql.Driver");

            //Estabeler a conexão com o Banco de Dados
            conexaoBD = DriverManager.getConnection(BD, usuario, senha);

        } catch (java.lang.ClassNotFoundException er1) {
            //Tratar a exceção
            System.out.println(er1.getMessage());

            conexaoBD = null;
            bRetorno = false;

        } catch (SQLException er2) {
            //Tratar a exceção
            System.out.println(er2.getMessage());

            conexaoBD = null;
            bRetorno = false;

        }

        //Definir o retorno
        return bRetorno;

    }

    //Desconectar o Banco
    public void DesconectarBD() {
        try {
            //Fechar Conexão
            conexaoBD.close();

        } catch (SQLException er2) {
            //Tratar a exceção
            System.out.println(er2.getMessage());

        }

    }

    public int veExiste(String cmplQuery) {
        int valor = 0;

        try {
            if (ConectarBD()) {
                Statement stmt = conexaoBD.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM " + cmplQuery);

                rs.next();

                valor = rs.getInt(1);

                //Fechar Conexão
                rs.close();
                stmt.close();
            }

        } catch (SQLException er) {
            System.out.println("Problemas na Query: Select COUNT(*) From " + cmplQuery);
        }

        //Definir o retorno
        return valor;

    }

    public int execSQL(String qry) {
        int valor = 0;

        try {
            if (ConectarBD()) {
                Statement stmt = conexaoBD.createStatement();
                valor = stmt.executeUpdate(qry);

                //Fechar Conexão
                stmt.close();
            }

        } catch (SQLException er) {
            //Tratar a exceção
            System.out.println("Problemas na Query " + qry);

        }

        //Definir o retorno
        return valor;

    }

    public String[] carrNomes(String qry) // Montar o nome das Colunas
    {
        String[] colNomes = new String[0];

        try {
            if (ConectarBD()) {
                Statement stmt = conexaoBD.createStatement();
                ResultSet rs = stmt.executeQuery(qry);
                ResultSetMetaData rsmd = rs.getMetaData();

                int nCol = rsmd.getColumnCount();

                colNomes = new String[nCol];

                for (int i = 0; i < nCol; i++) {
                    colNomes[i] = rsmd.getColumnName(i + 1);

                }

                //Fechar Conexão
                rs.close();

            }

        } catch (SQLException err) {
            //Tratar a exceção
            System.out.println("Problemas na Query: Select " + qry);

        }

        //Definir o retorno
        return colNomes;

    }

    public Vector carrVetor(String qry) {
        Vector vetResp = new Vector();
        String[] dados;

        try {
            if (ConectarBD()) {
                Statement stmt = conexaoBD.createStatement();

                ResultSet rs = stmt.executeQuery(qry);
                ResultSetMetaData rsmd = rs.getMetaData();
                int nCol = rsmd.getColumnCount();

                // Carrega o Vetor
                while (rs.next()) {
                    dados = new String[nCol];

                    for (int i = 0; i < nCol; i++) {
                        dados[i] = rs.getString(i + 1);

                    }

                    vetResp.addElement(dados);

                }

                //Fechar Conexão
                rs.close();
                stmt.close();

            }

        } catch (SQLException err) {
            //Tratar a exceção
            System.out.println("Problemas na Query: Select " + qry);

        }

        //Definir o retorno
        return vetResp;

    }

    public void carrCombo(JComboBox combobox, String SQL, String tabela) {
        try {
            if (ConectarBD()) {
                Statement stmt = conexaoBD.createStatement();
                ResultSet rs = stmt.executeQuery("Select " + SQL + " From " + tabela);

                while (rs.next()) {
                    combobox.addItem(rs.getString(1));

                }

                //Fechar Conexão
                rs.close();
                stmt.close();

            }

        } catch (SQLException er) {
            //Tratar a exceção
            System.out.println("Problemas na Query: Select " + SQL + " From " + tabela);

        }

    }

    public void retPosic(String[] cmps, String qry) {
        try {
            if (ConectarBD()) {
                Statement stmt = conexaoBD.createStatement();
                ResultSet rs = stmt.executeQuery(qry);

                if (rs.next()) {
                    for (int i = 0; i < cmps.length; i++) {
                        cmps[i] = rs.getString(i + 1);

                    }

                }

                //Fechar Conexão
                rs.close();
                stmt.close();

            }

        } catch (SQLException er) {
            //Tratar a exceção
            System.out.println("Problemas na Query: Select " + qry);

        }

    }

    public String[] carrCamposCombo(JComboBox combobox, String qry) {
        //Declaração Variáveis e Objetos
        String[] colNomes = new String[0];

        try {
            if (ConectarBD()) {
                Statement stmt = conexaoBD.createStatement();
                ResultSet rs = stmt.executeQuery("Select " + qry);

                ResultSetMetaData rsmd = rs.getMetaData();

                int nCol = rsmd.getColumnCount();
                colNomes = new String[nCol];

                for (int i = 0; i < nCol; i++) {
                    combobox.addItem(rsmd.getColumnName(i + 1));

                }

                //Fechar Conexão
                rs.close();

            }

        } catch (SQLException err) {
            //Tratar a exceção
            System.out.println("Problemas na Query: Select " + qry);

        }

        //Definir o retorno
        return colNomes;

    }

}
