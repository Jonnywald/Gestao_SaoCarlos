/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Bean.ProducaoMelado;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author guilherme.bertola
 */
public class MeladoDAO {
    public void CriarMelado(ProducaoMelado p){
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO producaoMelado (lote, dtProducaoM, qtdCaldoM, qtdMelado, pesoTotalM, rendimentoM, validadeM) VALUES (?,?,?,?,?,?,?)");
            stmt.setInt(1, p.getLote());
            stmt.setDate(2, new java.sql.Date(p.getDtProducao().getTime()));
            stmt.setInt(3, p.getQtdCaldo());
            stmt.setInt(4, p.getQtdMelado());
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
            stmt = con.prepareStatement("DELETE FROM producaoMelado WHERE lote = ?");
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
    public List<ProducaoMelado> ListarMelado(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<ProducaoMelado> pMelados = new ArrayList<ProducaoMelado>();
        try{
            stmt = con.prepareStatement("SELECT * FROM producaoMelado");
            rs = stmt.executeQuery();
            while(rs.next()){
                ProducaoMelado p= new ProducaoMelado();
                p.setLote(rs.getInt("lote"));
                p.setDtProducao(rs.getDate("dtProducaoM"));
                p.setQtdCaldo(rs.getInt("qtdCaldoM"));
                p.setQtdMelado(rs.getInt("qtdMelado"));
                p.setPesoTotal(rs.getDouble("pesoTotalM"));
                p.setRendimento(rs.getDouble("rendimentoM"));
                p.setValidade(rs.getDate("validadeM"));
                pMelados.add(p);
            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return pMelados;
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
    public ProducaoMelado buscarLote(Integer L){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ProducaoMelado p = new ProducaoMelado();
        try {
            stmt = con.prepareStatement("SELECT * FROM producaoMelado where lote=?");
            stmt.setInt(1, L);
            rs = stmt.executeQuery();
            while (rs.next()) {
                p.setLote(rs.getInt("lote"));
                p.setDtProducao(rs.getDate("dtProducaoM"));
                p.setQtdCaldo(rs.getInt("qtdCaldoR"));
                p.setQtdMelado(rs.getInt("qtdMelado"));
                p.setPesoTotal(rs.getDouble("pesoTotalM"));
                p.setRendimento(rs.getDouble("rendimentoM"));
                p.setValidade(rs.getDate("validadeM"));
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
    public void Atualizar(ProducaoMelado p){
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE producaoMelado SET dtProducaoM=?, qtdCaldoM=?, qtdMelado=?, pesoTotalM=?, rendimentoM=?, validadeM=? WHERE lote =?");
            stmt.setInt(7, p.getLote());
            stmt.setDate(1, new java.sql.Date(p.getDtProducao().getTime()));
            stmt.setInt(2, p.getQtdCaldo());
            stmt.setInt(3, p.getQtdMelado());
            stmt.setDouble(4, p.getPesoTotal());
            stmt.setDouble(5, p.getRendimento());
            stmt.setDate(6, new java.sql.Date(p.getValidade().getTime()));
            // executar a operacao no banco
            stmt.executeUpdate();
            // mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
