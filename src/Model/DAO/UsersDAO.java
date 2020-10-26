
package Model.DAO;

import Model.Bean.Users;
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
 * @author guilherme bertola
 */
public class UsersDAO {
    // metodo de criacao de usuarios no banco de dados
    public void Create(Users u){
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        try {
            // operacao de inserção de dados (login, Nome, Senha, Adm)
            stmt = con.prepareStatement("INSERT INTO Users VALUES(?,?,?,?)");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getNome());
            stmt.setString(3, u.getPassword());
            stmt.setBoolean(4, u.isAdm());
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
    // metodo para a atualizacao de um usuario com o login sendo a chave de atualizacao
    public void Update(Users u,String chave) {
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        try {
            // operacao de atualização de dados
            stmt = con.prepareStatement("UPDATE Users SET login = ?,nome = ?, senha = ?, adm = ? WHERE login = ?");
            stmt.setString(1, u.getLogin());
            stmt.setString(2, u.getNome());
            stmt.setString(3, u.getPassword());
            stmt.setBoolean(4, u.isAdm());
            stmt.setString(5, chave);
            // executar a operacao no banco
            stmt.executeUpdate();
            // mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
             // caso ocorra uma excecao tratar ela
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    // metodo para exclusao de usuario com chave sendo o login
    public void Delete(Users u) {
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        try {
            // operacao de exclusao de usuarios
            stmt = con.prepareStatement("DELETE FROM Users WHERE login = ?");
            stmt.setString(1, u.getLogin());
            // executar a operacao no banco
            stmt.executeUpdate();
            // mensagem de sucesso
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            // caso ocorra uma excecao tratar ela
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    // metodo de listagem de usuarios (abastecer a tabela)
    public List<Users> Read() {
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        // gera a variavel de resultado de busca de banco
        ResultSet rs = null;
        // cria uma lista de usuarios
        List<Users> users = new ArrayList<>();

        try {
            // operacao de busca de todos os usuarios
            stmt = con.prepareStatement("SELECT * FROM Users");
            // executar a operacao no banco
            rs = stmt.executeQuery();
            // percorre a lista do resultado alimentando a lista dos usuarios
            while (rs.next()) {
                Users u = new Users();
                u.setLogin(rs.getString("login"));
                u.setNome(rs.getString("nome"));
                u.setPassword(rs.getString("senha"));
                u.setAdm(rs.getBoolean("adm"));
                users.add(u);
            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler dados: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return users;
    }
    // metodo para validar a usuario e senha
    public boolean Check(String login, String senha) {
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        // gera a variavel de resultado de busca de banco
        ResultSet rs = null;
        boolean check = false;

        try {
            // operacao de busca onde o login e senha fornecidos batem
            stmt = con.prepareStatement("SELECT * FROM Users WHERE login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            // executar a operacao no banco
            rs = stmt.executeQuery();
            if (rs.next()) {

                check = true;
            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler usuarios!: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
    // metodo para verificar se o usuario em questao é adm
    public boolean CheckAdm(String login) {
        // iniciar a conexao com o banco usando a classe connection factory
        Connection con = ConnectionFactory.getConnection();
        // gerar uma variavel de operacao com o banco
        PreparedStatement stmt = null;
        // gera a variavel de resultado de busca de banco
        ResultSet rs = null;
        boolean check = false;

        try {
            // opercao de busca pelo usuario com o login fornecido
            stmt = con.prepareStatement("SELECT * FROM Users WHERE login = ?");
            stmt.setString(1, login);
            // executar a operacao no banco
            rs = stmt.executeQuery();
            if (rs.next()) {
                check = rs.getBoolean("adm");
            }
        } catch (SQLException ex) {
            // mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro ao ler usuarios!: " + ex);
        } finally {
            // sempre finalizar encerrando a conexão com o banco
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return check;
    }
}
