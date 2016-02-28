package ConexaoBD;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class tabProcessamento {

    //Propriedades da Classe
    private int codigo;
    private Date dtPprocess;
    private String caminhoArq;
    private String observacao;
    private int qtdIndividuos;
    private int qtdGeracoes;

    public tabProcessamento() {
        //Inicialização Default
        codigo = 0;
        dtPprocess = null;
        caminhoArq = "";
        observacao = "";
        qtdIndividuos = 0;
        qtdGeracoes = 0;
    }

    public tabProcessamento(
            int pCodigo,
            Date pDtPprocess,
            String pCaminhoArq,
            String pObservacao,
            int pQtdIndividuos,
            int pQtdGeracoes) {
        //Inicialização Default dos atributos
        codigo = pCodigo;
        dtPprocess = pDtPprocess;
        caminhoArq = pCaminhoArq;
        observacao = pObservacao;
        qtdIndividuos = pQtdIndividuos;
        qtdGeracoes = pQtdGeracoes;
    }

    //Consultar Dados da Tabela: TabProcessamento
    public List<tabProcessamento> Consultar(String codigo) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        List<tabProcessamento> lstConsulta = new ArrayList<>();

        try {

            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();

                String sql = "SELECT codigo, "
                        + "     dtpprocess, "
                        + "     caminhoarq, "
                        + "     observacao, "
                        + "     qtdindividuos, "
                        + "     qtdgeracoes "
                        + " FROM processamento "
                        + (codigo != "" ? " where codigo = " + codigo : "");

                //Consultar os registros
                ResultSet rsDados = stmBD.executeQuery(sql);

                if (rsDados != null) {
                    //Percorrer todas as linhas
                    while (rsDados.next()) {
                        //Adicionar a linha de dados
                        lstConsulta.add(new tabProcessamento(
                                rsDados.getInt("codigo"),
                                rsDados.getDate("dtpprocess"),
                                rsDados.getString("caminhoarq"),
                                rsDados.getString("observacao"),
                                rsDados.getInt("qtdindividuos"),
                                rsDados.getInt("qtdgeracoes")));
                    }

                }

            }

        } catch (SQLException e) {
            //Aqui tratar a exceção

        }

        //Definir o retorno        
        return lstConsulta;

    }

    public int Inserir(tabProcessamento objtabProcessamento) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        //Statement stmBD = objConexaoBD.conexaoBD.createStatement();

        try {
            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();

                //Consultar os registros
                stmBD.executeUpdate(
                        "insert into processamento("
                        + "codigo, "
                        + "dtpprocess, "
                        + "caminhoarq, "
                        + "observacao, "
                        + "qtdindividuos, "
                        + "qtdgeracoes) "
                        + " values ("
                        + objtabProcessamento.codigo + ", "
                        + "'" + objtabProcessamento.dtPprocess + "', "
                        + "'" + objtabProcessamento.caminhoArq + "', "
                        + "'" + objtabProcessamento.observacao + "', "
                        + objtabProcessamento.qtdIndividuos + ", "
                        + objtabProcessamento.qtdGeracoes + ")");

            }

        } catch (SQLException e) {
            return e.getErrorCode();

        }

        //Processou OK
        return 0;

    }

    public int Excluir(int intCodigo) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        //Statement stmBD = objConexaoBD.conexaoBD.createStatement();

        try {
            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();
                //Consultar os registros
                stmBD.executeUpdate("delete from processamento where codigo = " + intCodigo);

            }

        } catch (SQLException e) {
            return e.getErrorCode();

        }

        //Processou OK
        return 0;

    }

    private int Alterar(tabProcessamento objtabProcessamento) throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();

        if (objConexaoBD.ConectarBD()) {
            Statement stmBD = objConexaoBD.conexaoBD.createStatement();

            try {
                //Consultar os registros
                stmBD.executeUpdate(
                        "update processamento set "
                        + "dtpprocess    = '" + objtabProcessamento.dtPprocess + "', "
                        + "caminhoarq    = '" + objtabProcessamento.caminhoArq + "',"
                        + "observacao    = '" + objtabProcessamento.observacao + "', "
                        + "qtdindividuos = " + objtabProcessamento.qtdIndividuos + ", "
                        + "qtdgeracoes   = " + objtabProcessamento.qtdGeracoes
                        + " where codigo = " + objtabProcessamento.codigo);

            } catch (SQLException e) {
                return e.getErrorCode();

            }

        }

        //Processou OK
        return 0;

    }

    //Consultar Dados da Tabela: TabProcessamento
    public String ConsultarRegs() throws SQLException, IOException {
        //Declaração Variáveis e Objetos
        ConexaoBD objConexaoBD = new ConexaoBD();
        int intRetorno = 1;

        try {
            if (objConexaoBD.ConectarBD()) {
                Statement stmBD = objConexaoBD.conexaoBD.createStatement();

                //Consultar os registros
                ResultSet rsDados = stmBD.executeQuery("SELECT count(*) + 1 as total FROM processamento");

                //Percorrer todas as linhas
                intRetorno = rsDados.next() ? rsDados.getInt("total") : 1;
            }

        } catch (SQLException e) {
            //Aqui tratar a exceção

        }

        //Definir o retorno
        return Integer.toString(intRetorno);

    }

    public int getCodigo() {
        return this.codigo;

    }

    public void setCodigo(int cod) {
        this.codigo = cod;

    }

    public Date getDtPprocess() {
        return this.dtPprocess;

    }

    public void setDtPprocess(Date dtProc) {
        this.dtPprocess = dtProc;

    }

    public String getCaminhoArq() {
        return this.caminhoArq;
    }

    public void setCaminhoArq(String caminho) {
        this.caminhoArq = caminho;

    }

    public String getObservacao() {
        return this.observacao;
    }

    public void setObservacao(String obs) {
        this.observacao = obs;

    }

    public int getQtdIndividuos() {
        return this.qtdIndividuos;

    }

    public void setQtdIndividuos(int qtd) {
        this.qtdIndividuos = qtd;

    }

    public void setQtdGeracoes(int qtd) {
        this.qtdGeracoes = qtd;

    }
    
    public int getQtdGeracoes() {
        return this.qtdGeracoes;

    }

}
