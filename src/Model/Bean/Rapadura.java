package Model.Bean;
import java.util.Date;

/**
 *
 * @author Guilherme Bertola
 */
public class Rapadura {
    private double peso; // peso da rapadura unitaria
    private Date dtProducao; // data de producao da rapadura unitaria

// construtor completo da classe rapadura
    public Rapadura(double p, Date dt){
        this.peso = p;
        this.dtProducao = dt;
}
// construtor vazio para a classe rapadura
    public Rapadura(){

}
// getter do peso
    public double getPeso(){
        return peso; // retorno de um double com o peso da rapadura
}
// getter da data de producao
    public Date getDtProducao(){
        return dtProducao; // retorno de um date com a data de producao
}
// setter de peso
    public void setPeso(double p){
        this.peso = p;
}
// setter da data de producao
    public void setDtProducao(Date dt){
        this.dtProducao = dt;
}
}
