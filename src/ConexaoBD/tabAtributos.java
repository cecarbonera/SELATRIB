package ConexaoBD;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class tabAtributos {

    //Declaração dos Atributos
    private int codigo;
    private int codAtrib;
    private String nomeAtrib;
    private String tpDadoAtrib;
    private String observacao;
    private double percImport;
    private char selecionado;
    private int linha;

    //Método Inicializador
    public tabAtributos() {
        //Inicialização default
        codigo = 0;
        codAtrib = 0;
        nomeAtrib = "";
        tpDadoAtrib = "";
        observacao = "";
        percImport = 0.0;
        selecionado = 'S';
        linha = 0;
    }

    public tabAtributos(
            int pcodigo,
            int pcodAtrib,
            String pnomeAtrib,
            String ptpDadoAtrib,
            String pobservacao,
            double ppercImport,
            char pselecionado,
            int plinha) {
        //Inicialização Default dos atributos
        codigo = pcodigo;
        codAtrib = pcodAtrib;
        nomeAtrib = pnomeAtrib;
        tpDadoAtrib = ptpDadoAtrib;
        observacao = pobservacao;
        percImport = ppercImport;
        selecionado = pselecionado;
        linha = plinha;

    }

    //Consultar Dados da Tabela: TabProcessamento
    public List<tabAtributos> Consultar(String codProc) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        List<tabAtributos> lstConsulta = new ArrayList<>();

        try {

            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();

                //Consultar os registros
                ResultSet rsDados = stmBD.executeQuery(
                        "SELECT codigo, "
                        + "     codatrib, "
                        + "     nomeatrib, "
                        + "     tpdadoatrib, "
                        + "     observacao, "
                        + "     percimport, "
                        + "     selecionado, "
                        + "     linha "
                        + " FROM atributos"
                        + (codProc != "" ? " where codigo = " + codProc : ""));

                //Percorrer todas as linhas
                while (rsDados.next()) {
                    //Adicionar a linha de dados
                    lstConsulta.add(new tabAtributos(
                            rsDados.getInt("codigo"),
                            rsDados.getInt("codatrib"),
                            rsDados.getString("nomeatrib"),
                            rsDados.getString("tpdadoatrib"),
                            rsDados.getString("observacao"),
                            rsDados.getDouble("percimport"),
                            rsDados.getString("selecionado").charAt(0),
                            rsDados.getInt("linha")));
                }

            }

        } catch (SQLException e) {
            //Aqui tratar a exceção

        }

        //Definir o retorno        
        return lstConsulta;

    }

    //Consultar Dados da Tabela: TabProcessamento
    public int QtdLinhaProc(String codProc) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        int quantidade = 0;

        try {

            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();

                //Consultar os registros
                ResultSet rsDados = stmBD.executeQuery(
                        "SELECT Count(Distinct(linha)) as QtdLinhas "
                        + " FROM atributos "
                        + " WHERE codigo = " + codProc);

                //Se encontrou dados
                if (rsDados.next()) {
                    //Atribuir a Quantidade
                    quantidade = rsDados.getInt("QtdLinhas");

                }

            }

        } catch (SQLException e) {
            //Aqui tratar a exceção

        }

        //Definir o retorno        
        return quantidade;

    }

    public int Inserir(tabAtributos objtabAtributos) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        //Statement stmBD = objConexaoBD.conexaoBD.createStatement();

        try {
            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();
                //Consultar os registros
                stmBD.executeUpdate(
                        "insert into Atributos("
                        + "codigo, "
                        + "codatrib, "
                        + "nomeatrib, "
                        + "tpdadoatrib, "
                        + "observacao, "
                        + "percimport, "
                        + "selecionado, "
                        + "linha) "
                        + " values ("
                        + objtabAtributos.codigo + ", "
                        + objtabAtributos.codAtrib + ", "
                        + "'" + objtabAtributos.nomeAtrib + "', "
                        + "'" + objtabAtributos.tpDadoAtrib + "', "
                        + "'" + objtabAtributos.observacao + "', "
                        + objtabAtributos.percImport + ", "
                        + "'" + objtabAtributos.selecionado + "', "
                        + objtabAtributos.linha + ") ");
            }

        } catch (SQLException e) {
            return e.getErrorCode();

        }

        //Processou OK
        return 0;

    }

    public int Excluir(int intCodigo, int intCodAtrib) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        //Statement stmBD = objConexaoBD.conexaoBD.createStatement();

        try {
            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();
                //Consultar os registros
                stmBD.executeUpdate("delete from Atributos"
                        + " where codigo   = " + intCodigo
                        + "   and codatrib = " + intCodAtrib);

            }

        } catch (SQLException e) {
            return e.getErrorCode();

        }

        //Processou OK
        return 0;

    }

    public int ExcluirPorCodigo(int intCodigo) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        //Statement stmBD = objConexaoBD.conexaoBD.createStatement();

        try {
            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();
                //Consultar os registros
                stmBD.executeUpdate("delete from Atributos where codigo = " + intCodigo);

            }

        } catch (SQLException e) {
            return e.getErrorCode();

        }

        //Processou OK
        return 0;

    }

    public int Alterar(tabAtributos objtabAtributos) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        //Statement stmBD = objConexaoBD.conexaoBD.createStatement();

        try {
            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();
                //Consultar os registros
                stmBD.executeUpdate(
                        "update Atributos "
                        + " set nomeatrib   = '" + objtabAtributos.nomeAtrib + "', "
                        + "     tpdadoatrib = '" + objtabAtributos.tpDadoAtrib + "',"
                        + "     observacao  = '" + objtabAtributos.observacao + "', "
                        + "     percimport  = " + objtabAtributos.percImport + ", "
                        + "     selecionado = '" + objtabAtributos.selecionado + "', "
                        + "     linha       = " + objtabAtributos.linha
                        + " where codigo    = " + objtabAtributos.codigo
                        + "   and codatrib  = " + objtabAtributos.codAtrib);

            }

        } catch (SQLException e) {
            return e.getErrorCode();

        }

        //Processou OK
        return 0;

    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setcodAtrib(int codAtr) {
        this.codAtrib = codAtr;
    }

    public int getcodAtrib() {
        return this.codAtrib;
    }

    public void setnomeAtrib(String nome) {
        this.nomeAtrib = nome;
    }

    public String getnomeAtrib() {
        return this.nomeAtrib;
    }

    public void setTpDadoAtrib(String tipo) {
        this.tpDadoAtrib = tipo;
    }

    public String getTpDadoAtrib() {
        return this.tpDadoAtrib;
    }

    public void setObservacao(String obs) {
        this.observacao = obs;
    }

    public String getObservacao() {
        return this.observacao;
    }

    public void setPercentual(double percImp) {
        this.percImport = percImp;
    }

    public double getPercentual() {
        return this.percImport;
    }

    public void setSelecionado(char sel) {
        this.selecionado = sel;

    }

    public char getSelecionado(char sel) {
        return this.selecionado;

    }

    public void setLinha(int linha) {
        this.linha = linha;

    }

    public int getLinha() {
        return this.linha;

    }

}
