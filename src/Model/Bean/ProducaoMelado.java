package Model.Bean;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Guilherme Bertola
 */
public class ProducaoMelado {
    private Integer lote; // lote da producao
    private Date dtProducao; // data da producao do lote
    private Integer qtdCaldo; // quantidade de caldo utlizado para produzir
    private Integer qtdMelado; // quantidade (unidade) de melado produzido
    private List<Melado> melados = new ArrayList<>(); // lista de melados produzidos nesse lote
    private double pesoTotal; // peso total dos melados
    private double rendimento; // rendimento (em porcentagem) da producao
    private Date validade;
    // metodo construtor para a classe producao de melado
    public ProducaoMelado(Integer lote, Date dtProducao, Integer qtdCaldo) {
        this.lote = lote;
        this.dtProducao = dtProducao;
        this.qtdCaldo = qtdCaldo;
    }
    // metodo construtor vazio da classe
    public ProducaoMelado() {
    
    }
    // getter do numero de lote
    public Integer getLote() {
        return lote;
    }
    // setter do numero de lote
    public void setLote(Integer lote) {
        this.lote = lote;
    }
    // getter da data de producao
    public Date getDtProducao() {
        return dtProducao;
    }
    // setter da data de producao
    public void setDtProducao(Date dtProducao) {
        this.dtProducao = dtProducao;
    }
    // getter da quantidade de caldo
    public Integer getQtdCaldo() {
        return qtdCaldo;
    }
    // setter da quantidade de caldo
    public void setQtdCaldo(Integer qtdCaldo) {
        this.qtdCaldo = qtdCaldo;
    }
    // getter da quantidade de melado
    public Integer getQtdMelado() {
        return qtdMelado;
    }
    // setter da quantidade de melado
    public void setQtdMelado(Integer qtdMelado) {
        this.qtdMelado = qtdMelado;
    }
    // getter do peso total
    public double getPesoTotal() {
        return pesoTotal;
    }
    // setter do peso total
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    // getter do rendimento
    public double getRendimento() {
        return rendimento;
    }
    // setter do rendimento
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    // adiciona um objeto Melado para a lista de melados
    public void addMelado(Melado m){
        melados.add(m);
    }
    // remove o ultimo melado adcionado na lista
    //nao faz nada caso a lista esteja vazia
    public void rmMelado(){
        Integer i;
        i = melados.size();
        if (!(melados.isEmpty())){
            melados.remove(i-1);
        }
    }
    // calculo do rendimento da procucao (em porcentagem)
    public void calcRendimento(){
        this.rendimento = (this.pesoTotal/this.qtdCaldo)*100;
    }
    // calculo do peso total dos melados
    public void calcPesoTotal(){
        this.pesoTotal = 0;
        this.melados.forEach(m -> {
            this.pesoTotal += m.getPeso();
        });
    }
    // calculo da quantidade de melados produzidos
    public void calcQtdMelado(){
        this.qtdMelado = melados.size();
    }
    public void calcValidade(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.dtProducao);
        cal.add(Calendar.MONDAY,6);
        this.validade = cal.getTime();
    }
}
