/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Bean.Venda;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author delri
 */
public class VendaDAO {

    public void lancarVenda(Venda v) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO venda (ic, valor, descricao, dtVenda, qtdMelado, qtdRapadura, qtdGarrafa) VALUES (?,?,?,?,?,?,?)");
            stmt.setInt(1, v.getId());
            stmt.setDouble(2, v.getValor());
            stmt.setString(3, v.getDesc());
            stmt.setDate(4, new java.sql.Date(v.getData().getTime()));
            stmt.setInt(5, v.getQtdMelado());
            stmt.setInt(6, v.getQtdRapadura());
            stmt.setInt(7, v.getQtdGarrafa());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao Inserir: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public Venda buscaVenda(Integer i) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Venda v = new Venda();
        try {
            stmt = con.prepareStatement("SELECT * FROM venda where id=?");
            stmt.setInt(1, i);
            rs = stmt.executeQuery();
            while (rs.next()) {
                v.setId(rs.getInt("id"));
                v.setDesc(rs.getString("descricao"));
                v.setValor(rs.getDouble("valor"));
                v.setData(rs.getDate("dtVenda"));
                v.setQtdGarrafa(rs.getInt("qtdGarrafa"));
                v.setQtdMelado(rs.getInt("qtdMelado"));
                v.setQtdRapadura(rs.getInt("qtdRapadura"));
            }

        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return v;
    }

    public Integer ultimoID() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer id = 0;
        try {
            stmt = con.prepareStatement("SELECT * FROM venda ORDER BY id DESC LIMIT 1");
            rs = stmt.executeQuery();
            while (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao Ler " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return id;
    }
}
