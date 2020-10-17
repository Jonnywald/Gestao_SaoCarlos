package Model.Bean;

/**
 *
 * @author Guilherme Bertola
 */
public class BebidaMista {
    private String nome; // nome da bebida mista
    private Integer TempoCura; // tempo de cura necessario (em dias)
    private String materiaPrima; // Materia prima utlizada para para fazer a bebida mista
    // construtor para a classe bebida mista
    public BebidaMista(String nome, Integer TempoCura, String materiaPrima) {
        this.nome = nome;
        this.TempoCura = TempoCura;
        this.materiaPrima = materiaPrima;
    }
    // construtor vazio da bebida mista
    public BebidaMista(){
        
    }
    // getter do nome da bebida mista
    public String getNome() {
        return nome;
    }
    // setter do nome da bebida mista
    public void setNome(String nome) {
        this.nome = nome;
    }
    // getter do tempo de cura da bebida mista (em dias)
    public Integer getTempoCura() {
        return TempoCura;
    }
    // setter do tempo de cura da bedida mista (em dias)
    public void setTempoCura(Integer TempoCura) {
        this.TempoCura = TempoCura;
    }
    // getter da materia prima
    public String getMateriaPrima() {
        return materiaPrima;
    }
    // setter da materia prima
    public void setMateriaPrima(String materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
    
}
