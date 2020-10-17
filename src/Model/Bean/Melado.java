package Model.Bean;
import java.util.Date;

/**
 *
 * @author Guilherme Bertola
 */
public class Melado {
    private double peso; // peso do melado unitario
    private Date dtProducao; // data de producao do melado unitario

// construtor completo da classe melado
    public Melado(double p, Date dt){
        this.peso = p;
        this.dtProducao = dt;
}
// construtor vazio para a classe melado
    public Melado(){

}
// getter do peso
    public double getPeso(){
        return peso; // retorno de um double com o peso do melado
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
