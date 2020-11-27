package Model.DAO;

import Model.Bean.ProducaoCachaca;
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
            stmt.setDate(2, new java.sql.Date(p.getDtMoagem().getTime()));
            stmt.setInt(3, p.getQtdCaldo());
            stmt.setInt(4, p.getQtdAgua());
            stmt.setInt(5, p.getTotalCaldo());
            stmt.setDouble(6, p.getBrix());
            stmt.setDate(7, new java.sql.Date( p.getDtInicioFerment().getTime()));
            stmt.setDate(8, new java.sql.Date( p.getDtAlarmFerment().getTime()));
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

    public void FinalizarProducao(ProducaoCachaca p) {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("UPDATE producaoCachaca set dtAlambicagem=?, qtdCoracao= ?, rendimento=?, gl=?, numBarril=? where lote=?");
            stmt.setDate(1, (Date) p.getDtAlambicagem());
            stmt.setDouble(2, p.getQtdCoracao());
            stmt.setDouble(3, p.getRendimento());
            stmt.setDouble(4, p.getGl());
            stmt.setInt(5, p.getNumBarril());
            stmt.setInt(6, p.getLote());

            stmt.executeUpdate();
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<ProducaoCachaca> ListarProducao() {
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<ProducaoCachaca> pCachaca = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM producaoCachaca");
            rs = stmt.executeQuery();

            while (rs.next()) {

                ProducaoCachaca pc = new ProducaoCachaca();
                pc.setLote(rs.getInt("lote"));
                pc.setDtMoagem(rs.getDate("dtMoagem"));
                pc.setQtdCaldo(rs.getInt("qtdCaldo"));
                pc.setQtdAgua(rs.getInt("qtdAgua"));
                pc.setTotalCaldo(rs.getInt("totalCaldo"));
                pc.setBrix(rs.getDouble("brix"));
                pc.setDtInicioFerment(rs.getDate("dtInicioFerment"));
                pc.setDtAlarmFerment(rs.getDate("dtAlarmFerment"));
                pc.setNumDorna(rs.getInt("numDorna"));
                pc.setDtAlambicagem(rs.getDate("dtAlambicagem"));
                pc.setQtdCoracao(rs.getDouble("qtdCoracao"));
                pc.setRendimento(rs.getDouble("rendimento"));
                pc.setGl(rs.getDouble("gl"));
                pc.setNumBarril(rs.getInt("numBarril"));

                pCachaca.add(pc);
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
    public ProducaoCachaca BuscaLote(Integer L){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ProducaoCachaca pCachaca = new ProducaoCachaca();
        try {
            stmt = con.prepareStatement("SELECT * FROM producaoCachaca where lote=?");
            stmt.setInt(1,L);
            rs = stmt.executeQuery();
            while(rs.next()){
                
                pCachaca.setLote(rs.getInt("lote"));
                pCachaca.setDtMoagem(rs.getDate("dtMoagem"));
                pCachaca.setQtdCaldo(rs.getInt("qtdCaldo"));
                pCachaca.setQtdAgua(rs.getInt("qtdAgua"));
                pCachaca.setTotalCaldo(rs.getInt("totalCaldo"));
                pCachaca.setBrix(rs.getDouble("brix"));
                pCachaca.setDtInicioFerment(rs.getDate("dtInicioFerment"));
                pCachaca.setDtAlarmFerment(rs.getDate("dtAlarmFerment"));
                pCachaca.setNumDorna(rs.getInt("numDorna"));
                pCachaca.setDtAlambicagem(rs.getDate("dtAlambicagem"));
                pCachaca.setQtdCoracao(rs.getDouble("qtdCoracao"));
                pCachaca.setRendimento(rs.getDouble("rendimento"));
                pCachaca.setGl(rs.getDouble("gl"));
                pCachaca.setNumBarril(rs.getInt("numBarril"));
                
            }
            
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler: " + ex);
        }finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
        return pCachaca;
    }
    public void Delete(ProducaoCachaca p){
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("DELETE FROM producaoCachaca WHERE lote = ?");
            stmt.setInt(1, p.getLote());
             // executar a operacao no banco
            stmt.executeUpdate();
            // mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
        }finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public ResultSet selecionarTabela() {
        try {
            Connection con = ConnectionFactory.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select lote, dtAlambicagem, rendimento from producaoCachaca "); //where ..data é ????...
            return rs;
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Erro ao deletar: " + ex);
        }
        return null;
    }
}
