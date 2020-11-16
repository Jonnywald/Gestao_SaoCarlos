
package Model.DAO;

import Model.Bean.Barril;
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
public class BarrilDAO {
    public Barril BuscaBarril(Integer numB){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Barril b = new Barril();
        try {
            stmt = con.prepareStatement("SELECT * FROM barril where numBarril=?");
            stmt.setInt(1, numB);
            rs = stmt.executeQuery();
            while (rs.next()){
                b.setNumBarril(numB);
                b.setDtCheio(rs.getDate("dtCheio"));
                b.setDtTipoArmazenado(rs.getDate("dtTipoA"));
                b.setDtTipoEnvelhecido(rs.getDate("dtTipoE"));
                b.setDtTipoExtraPremium(rs.getDate("dtTipoEP"));
                b.setDtTipoPremium(rs.getDate("dtTipoP"));
                b.setMaterial(rs.getString("material"));
                b.setTipoAtual(rs.getString("tipoAtual"));
                b.setVolumeAtual(rs.getDouble("volumeAtual"));
                b.setVolumeTotal(rs.getDouble("volumeTotal"));
            }
            
        }  catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return b;
    }
    public List<Barril> ListarBarril(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Barril> barrils = new ArrayList<>();
        try{
            stmt = con.prepareStatement("SELECT ALL FROM barril");
            rs = stmt.executeQuery();
            while (rs.next()){
                Barril b = new Barril();
                b.setNumBarril(rs.getInt("numBarril"));
                b.setDtCheio(rs.getDate("dtCheio"));
                b.setDtTipoArmazenado(rs.getDate("dtTipoA"));
                b.setDtTipoEnvelhecido(rs.getDate("dtTipoE"));
                b.setDtTipoExtraPremium(rs.getDate("dtTipoEP"));
                b.setDtTipoPremium(rs.getDate("dtTipoP"));
                b.setMaterial(rs.getString("material"));
                b.setTipoAtual(rs.getString("tipoAtual"));
                b.setVolumeAtual(rs.getDouble("volumeAtual"));
                b.setVolumeTotal(rs.getDouble("volumeTotal"));
                barrils.add(b);
            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return barrils;
    }
}
