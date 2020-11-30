/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

/**
 *
 * @author guilherme.bertola
 */
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Model.Bean.ProducaoRapadura;

public class RapaduraDAO {
    public void CriarRapadura(ProducaoRapadura p){
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO producaoRapadura (lote, dtProducaoR, qtdCaldoR, qtdRapadura, pesoTotalR, rendimentoR, validadeR) VALUES (?,?,?,?,?,?,?)");
            stmt.setInt(1, p.getLote());
            stmt.setDate(2, new java.sql.Date(p.getDtProducao().getTime()));
            stmt.setInt(3, p.getQtdCaldo());
            stmt.setInt(4, p.getQtdRapaduras());
            stmt.setDouble(5, p.getPesoTotal());
            stmt.setDouble(6, p.getRendimento());
            stmt.setDate(7, new java.sql.Date(p.getValidade().getTime()));
            // executar a operacao no banco
            stmt.executeUpdate();
            // mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao Salvar " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public void excluirLote(Integer L){
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM producaoRapadura WHERE lote = ?");
            stmt.setInt(1, L);
            // executar a operacao no banco
            stmt.executeUpdate();
            // mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public List<ProducaoRapadura> ListarRapaduras(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ProducaoRapadura> pRapaduras = new ArrayList<ProducaoRapadura>();
        try{
            stmt = con.prepareStatement("SELECT * FROM producaoRapadura");
            rs = stmt.executeQuery();
            while(rs.next()){
                ProducaoRapadura p= new ProducaoRapadura();
                p.setLote(rs.getInt("lote"));
                p.setDtProducao(rs.getDate("dtProducaoR"));
                p.setQtdCaldo(rs.getInt("qtdCaldoR"));
                p.setQtdRapaduras(rs.getInt("qtdRapadura"));
                p.setPesoTotal(rs.getDouble("pesoTotalR"));
                p.setRendimento(rs.getDouble("rendimentoR"));
                p.setValidade(rs.getDate("validadeR"));
                pRapaduras.add(p);
            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return pRapaduras;
    }
    public Integer ultimoLote(){
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int i = 0;
        try {
            stmt = con.prepareStatement("SELECT * FROM producaoRapadura ORDER BY lote DESC LIMIT 1");
            rs = stmt.executeQuery();
            while (rs.next()) {
                i = rs.getInt("lote");
            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao Ler " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return i;
    }
    public ProducaoRapadura buscaLote(Integer L){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ProducaoRapadura p = new ProducaoRapadura();
        try {
            stmt = con.prepareStatement("SELECT * FROM producaoRapadura where lote=?");
            stmt.setInt(1, L);
            rs = stmt.executeQuery();
            while (rs.next()) {
                p.setLote(rs.getInt("lote"));
                p.setDtProducao(rs.getDate("dtProducaoR"));
                p.setQtdCaldo(rs.getInt("qtdCaldoR"));
                p.setQtdRapaduras(rs.getInt("qtdRapadura"));
                p.setPesoTotal(rs.getDouble("pesoTotalR"));
                p.setRendimento(rs.getDouble("rendimentoR"));
                p.setValidade(rs.getDate("validadeR"));
            }

        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return p;
    }
}
