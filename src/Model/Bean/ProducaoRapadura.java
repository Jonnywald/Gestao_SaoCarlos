/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Bean;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author guilherme.bertola
 */
public class ProducaoRapadura {
    private Integer lote; // lote da producao
    private Date dtProducao; // data da producao do lote
    private Integer qtdCaldo; // quantidade de caldo utlizado para produzir
    private Integer qtdRapaduras; // quantidade de rapaduras produzidas
    private List<Rapadura> rapaduras = new ArrayList<>(); // lista de rapaduras produzidas nesse lote
    private double pesoTotal; // peso total das rapaduras
    private double rendimento; // rendimento (em porcentagem) da producao
    private Date validade; // validade da rapadura
    // construtor da classe de producao de rapadura
    public ProducaoRapadura(Integer lote, Date dtProducao, Integer qtdCaldo) {
        this.lote = lote;
        this.dtProducao = dtProducao;
        this.qtdCaldo = qtdCaldo;
    }
    // construtor vazio da classe rapadura
    public ProducaoRapadura() {
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
    // setter da data de producap
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
    // getter da quantidade de rapadura
    public Integer getQtdRapaduras() {
        return qtdRapaduras;
    }
    // setter da quantidade de rapadura
    public void setQtdRapaduras(Integer qtdRapaduras) {
        this.qtdRapaduras = qtdRapaduras;
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
    // getter da validade
    public Date getValidade() {
        return validade;
    }
    // Setter da Validade
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    
    // adiciona uma rapadura na lista de rapaduras produzidas
    public void addRapadura(Rapadura r){
        rapaduras.add(r);
    }
    // remove a ultima rapadura adcionado na lista
    //nao faz nada caso a lista esteja vazia
    public void rmRapadura(){
        Integer i;
        i = rapaduras.size();
        if (!(rapaduras.isEmpty())){
            rapaduras.remove(i-1);
        }
    }
    // calculo do rendimento da procucao (em porcentagem)
    public void calcRendimento(){
        this.rendimento = (this.pesoTotal/this.qtdCaldo)*100;
    }
    // calculo do peso total das rapaduras
    public void calcPesoTotal(){
        this.pesoTotal = 0;
        this.rapaduras.forEach(r -> {
            this.pesoTotal += r.getPeso();
        });
    }
    // calculo da quantidade de rapaduras produzidas
    public void calcQtdRapaduras(){
        this.qtdRapaduras = rapaduras.size();
    }
    public void calcValidade(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.dtProducao);
        cal.add(Calendar.MONDAY,6);
        this.validade = cal.getTime();
    }
}
