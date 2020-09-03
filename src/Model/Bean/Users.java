package Model.Bean;

/**
 *
 * @author guilherme.bertola
 */
public class Users {
    private String login; //Login do usuario
    private String password; //Senha do usuario
    private String Nome; // nome do usuario
    private boolean Adm; // Indica se o usuario é ou não admnistrador
    
    // metodo construtor completo para a classe usuario
    public Users(String login, String pass, String Name, boolean adm){
        this.login = login;
        this.password = pass;
        this.Nome = Name;
        this.Adm = adm;
    }
    
    //metodo construtor vazio para a classe usuario
    public Users(){
        
    }
    // Getter do Login
    public String getLogin() {
        return login;
    }
    // Setter do Login
    public void setLogin(String login) {
        this.login = login;
    }
    // Getter da senha
    public String getPassword() {
        return password;
    }
    // Setter da senha
    public void setPassword(String password) {
        this.password = password;
    }
    // Getter do Nome
    public String getNome() {
        return Nome;
    }
    // Setter do nome
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    // Getter ou Check de usuario administrador
    public boolean isAdm() {
        return Adm;
    }
    // Setter de usuario administrador
    public void setAdm(boolean Adm) {
        this.Adm = Adm;
    }
    
        
    
}
