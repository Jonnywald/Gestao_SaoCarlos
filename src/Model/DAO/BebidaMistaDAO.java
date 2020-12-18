/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Bean.BebidaMista;
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
 * @author Débora
 */
public class BebidaMistaDAO {

    public void CadastrarBebidaMista(BebidaMista bm) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO bebidaMista VALUES(?,?,?,?)");
            stmt.setInt(1, bm.getId());
            stmt.setString(2, bm.getNome());
            stmt.setInt(3, bm.getTempoCura());
            stmt.setString(4, bm.getMateriaPrima());
            // executar a operacao no banco
            stmt.executeUpdate();
            // mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            // caso ocorra uma excecao tratar ela
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void AtualizaBebida(BebidaMista bm){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE bebidaMista SET nomeBM = ?, tpCura = ?, materiaPrima = ? WHERE id = ?");
            stmt.setInt(4, bm.getId());
            stmt.setString(1, bm.getNome());
            stmt.setInt(2, bm.getTempoCura());
            stmt.setString(3, bm.getMateriaPrima());
            // executar a operacao no banco
            stmt.executeUpdate();
            // mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            // caso ocorra uma excecao tratar ela
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<BebidaMista> ListarProducao() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<BebidaMista> bMista = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM bebidaMista");
            rs = stmt.executeQuery();

            while (rs.next()) {

                BebidaMista bm = new BebidaMista();
                bm.setId(rs.getInt("id"));
                bm.setNome(rs.getString("nomeBM"));
                bm.setTempoCura(rs.getInt("tpCura"));
                bm.setMateriaPrima(rs.getString("materiaPrima"));

                bMista.add(bm);
            }

        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return bMista;
    }
    public BebidaMista BuscaID(Integer id){
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        ResultSet rs = null;
        BebidaMista bm = new BebidaMista();
        try{
            stmt = con.prepareStatement("SELECT * FROM bebidaMista where id=?");
            stmt.setInt(1,id);
            rs = stmt.executeQuery();
            while (rs.next()){
                bm.setId(rs.getInt("id"));
                bm.setNome(rs.getString("nomeBM"));
                bm.setTempoCura(rs.getInt("tpCura"));
                bm.setMateriaPrima(rs.getString("materiaPrima"));
            }
        }catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return bm;
    }
    public Integer UltimoID(){
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer i = 0;
        try{
            stmt = con.prepareStatement("SELECT * FROM bebidaMista ORDER BY id DESC LIMIT 1");
            rs = stmt.executeQuery();
            while (rs.next()){
                i = rs.getInt("id");
            }
        }catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return i;
    }

    public void Deletar(Integer id) {
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM bebidaMista WHERE id = ?");
            stmt.setInt(1, id);
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

    
}
