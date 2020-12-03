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
                g.setVolumeGarrafa(rs.getDouble("VolumeGarrafa"));
                g.setDtEngarrafamento(rs.getDate("dtEngarrafamento"));
                g.setLote(rs.getInt("lote"));
                g.setQtdGarrfas(rs.getInt("qtdGarrafas"));
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
    public void LancarGarrafas(Garrafa g){
         Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO garrafa(lote, tpBebida, volumeGarrafa, qtdGarrafas, dtEngarrafamento) VALUES (?,?,?,?,?)");
            stmt.setInt(1, g.getLote());
            stmt.setString(2, g.getTipoBebida());
            stmt.setDouble(3, g.getVolumeGarrafa());
            stmt.setInt(4, g.getQtdGarrfas());
            stmt.setDate(5, new java.sql.Date(g.getDtEngarrafamento().getTime()));
            
            // executar a operacao no banco
            stmt.executeUpdate();
            // mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        }
        catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao Salvar: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public Integer ultimoLote(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Integer lote = 0;
        try{
            stmt = con.prepareStatement("SELECT * FROM garrafa ORDER BY lote DESC LIMIT 1");
            rs = stmt.executeQuery();
            while(rs.next()){
                lote = rs.getInt("lote");
            }
            
        }catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao Ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return lote;
    }
}
