package Model.DAO;

import Model.Bean.ProducaoCachaca;
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
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
public class CachacaDAO {

    public void IniciarProducao(ProducaoCachaca p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("INSERT INTO producaoCachaca (lote, dtMoagem, qtdCaldo, qtdAgua, totalCaldo, brix, dtInicioFerment, dtAlarmFerment, numDorna) VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, p.getLote());
            stmt.setDate(2, (Date) p.getDtMoagem());
            stmt.setInt(3, p.getQtdCaldo());
            stmt.setInt(4, p.getQtdAgua());
            stmt.setInt(5, p.getTotalCaldo());
            stmt.setDouble(6, p.getBrix());
            stmt.setDate(7, (Date) p.getDtInicioFerment());
            stmt.setDate(8, (Date) p.getDtAlarmFerment());
            stmt.setInt(9, p.getNumDorna());
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
}
