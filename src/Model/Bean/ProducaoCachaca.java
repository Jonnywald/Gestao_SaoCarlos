package Model.Bean;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Guilherme Bertola
 */
public class ProducaoCachaca {
    private Integer lote; // numero de lote da producao de cachaca
    private Date dtMoagem; // data da moagem 
    private Integer qtdCaldo; // quantidade de caldo
    private Integer qtdAgua; // quantidade de agua
    private Integer totalCaldo; // total de caldo (agua + caldo)
    private Double brix; // grau brix do caldo
    private Date dtInicioFerment; // data de inicio da fermentacao
    private Date dtAlarmFerment; // data maxima de fermentacao
    private LocalTime horaFerment;
    private Integer numDorna; // numero da dorna onde está sendo feita a fermentacao
    private Date dtAlambicagem; // data da destilacao (alabicagem)
    private Double qtdCoracao; // quantidade de coracao produzido
    private Double rendimento; // rendimento da producao
    private Double gl; // grau alcolico do coracao
    private Integer numBarril; // numero do barril armazenado
    // construtor vazio
    public ProducaoCachaca() {
    }
    // metodo construtor da classe de producao de cachaca

    public ProducaoCachaca(Integer lote, Date dtMoagem, Integer qtdCaldo, Double brix, Date dtInicioFerment) {
        this.lote = lote;
        this.dtMoagem = dtMoagem;
        this.qtdCaldo = qtdCaldo;
        this.brix = brix;
        this.dtInicioFerment = dtInicioFerment;
    }
    // getter do lote
    public Integer getLote() {
        return lote;
    }
    // setter do lote
    public void setLote(Integer lote) {
        this.lote = lote;
    }
    // getter da data de moagem
    public Date getDtMoagem() {
        return dtMoagem;
    }
    // setter da data de moagem
    public void setDtMoagem(Date dtMoagem) {
        this.dtMoagem = dtMoagem;
    }
    // getter da quantidade de caldo
    public Integer getQtdCaldo() {
        return qtdCaldo;
    }
    // setter da quantidade de caldo
    public void setQtdCaldo(Integer qtdCaldo) {
        this.qtdCaldo = qtdCaldo;
    }
    // getter da quantidade de agua
    public Integer getQtdAgua() {
        return qtdAgua;
    }
    // setter da quantidade de agua
    public void setQtdAgua(Integer qtdAgua) {
        this.qtdAgua = qtdAgua;
    }
    // getter do total de caldo
    public Integer getTotalCaldo() {
        return totalCaldo;
    }
    // setter do total de caldo
    public void setTotalCaldo(Integer totalCaldo) {
        this.totalCaldo = totalCaldo;
    }
    // getter do grau brix
    public Double getBrix() {
        return brix;
    }
    // setter do grau brix
    public void setBrix(Double brix) {
        this.brix = brix;
    }
    // getter da data de inicio da fermentacao
    public Date getDtInicioFerment() {
        return dtInicioFerment;
    }
    // setter da data de inicio da fermentacao
    public void setDtInicioFerment(Date dtInicioFerment) {
        this.dtInicioFerment = dtInicioFerment;
    }
    // getter da data maxima de fermentacao
    public Date getDtAlarmFerment() {
        return dtAlarmFerment;
    }
    // setter da data maxima de fermantacao
    public void setDtAlarmFerment(Date dtAlarmFerment) {
        this.dtAlarmFerment = dtAlarmFerment;
    }
    // getter do numero da dorna
    public Integer getNumDorna() {
        return numDorna;
    }
    // setter do numero da dorna
    public void setNumDorna(Integer numDorna) {
        this.numDorna = numDorna;
    }
    // getter da data de destilacao
    public Date getDtAlambicagem() {
        return dtAlambicagem;
    }
    // setter da data de destilacao
    public void setDtAlambicagem(Date dtAlambicagem) {
        this.dtAlambicagem = dtAlambicagem;
    }
    // getter da quantidade de coracao
    public Double getQtdCoracao() {
        return qtdCoracao;
    }
    // setter da quantidade de corcao
    public void setQtdCoracao(Double qtdCoracao) {
        this.qtdCoracao = qtdCoracao;
    }
    // getter do rendimento
    public Double getRendimento() {
        return rendimento;
    }
    // setter do rendimento
    public void setRendimento(Double rendimento) {
        this.rendimento = rendimento;
    }
    // getter do grau alcoolico
    public Double getGl() {
        return gl;
    }
    // setter do grau alcoolico
    public void setGl(Double gl) {
        this.gl = gl;
    }
    // getter do numero do barril
    public Integer getNumBarril() {
        return numBarril;
    }
    // setter do numero do barril
    public void setNumBarril(Integer numBarril) {
        this.numBarril = numBarril;
    }
    // Calculo da quantidade de agua teorica
    public Integer calcQtdAgua(Double brix, Integer qtdCaldo){
        Integer calcAgua;
        calcAgua = (brix.intValue()*qtdCaldo/15) - qtdCaldo;
        return calcAgua;
    }
    // calculo do total de caldo na dorna
    public Integer calcTotalCaldo(Integer qtdCaldo, Integer qtdAgua){
        return qtdCaldo + qtdAgua;
    }
    // calculo da data maxima de fermentacao
    public Date calcDtAlarmFerment(Date dtInicioFerment){
        Calendar cal = Calendar.getInstance();
        cal.setTime(dtInicioFerment);
        cal.add(Calendar.HOUR,48);
        return cal.getTime();
    }
    // calculo de rendimento da destilacao
    public Double calcRendimento(Integer totalCaldo, Double qtdCoracao){
        return (qtdCoracao/totalCaldo * 100);
    }
    // retorna true caso esse lote ja esteja pronto
    public Boolean isDone(){
        return (this.dtAlambicagem == null);
    }

    public LocalTime getHoraFerment() {
        return horaFerment;
    }

    public void setHoraFerment(LocalTime horaFerment) {
        this.horaFerment = horaFerment;
    }
    
}
