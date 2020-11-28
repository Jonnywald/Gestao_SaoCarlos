/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Bean.ProducaoCachaca;
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
public class RelatorioDAO {

    public ProducaoCachaca buscarDadosCachaca28() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ProducaoCachaca pCachaca = new ProducaoCachaca();

        try {
            stmt = con.prepareStatement("SELECT AVG (rendimento) FROM producaoCachaca WHERE dtAlambicagem BETWEEN current_date()-28 AN D currente_date()");
            rs = stmt.executeQuery();

            while (rs.next()) {
                pCachaca.setRendimento(rs.getDouble("rendimento"));
                pCachaca.setDtMoagem(rs.getDate("dtMoagem"));

            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return pCachaca;

    }

    public ProducaoCachaca buscarDadosCachacaGeral() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ProducaoCachaca pCachaca = new ProducaoCachaca();

        try {
            stmt = con.prepareStatement("SELECT AVG (rendimento) FROM producaoCachaca");
            rs = stmt.executeQuery();

            while (rs.next()) {
                pCachaca.setRendimento(rs.getDouble("rendimento"));
                pCachaca.setDtMoagem(rs.getDate("dtMoagem"));

            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return pCachaca;

    }
}
