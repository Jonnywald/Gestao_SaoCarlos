/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import Model.Bean.Garrafa;
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
 * @author delri
 */
public class GarrafaDAO {
    public List<Garrafa> ListarGarrafas(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Garrafa> garrafas =  new ArrayList<Garrafa>();
        try {
            stmt = con.prepareStatement("SELECT * FROM garrafa");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Garrafa g = new Garrafa();
                g.setTipoBebida(rs.getString("tpBebida"));
                g.setTipoGarrafa(rs.getString("tpGarrafa"));
                g.setDtEngarrafamento(rs.getDate("dtEngarrafamento"));
                garrafas.add(g);
            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return garrafas;
    }
}
