package Model.Bean;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Guilherme Bertola
 */
public class Barril {
    private Double volumeTotal; // volume total da capacidade do barril
    private Double volumeAtual; // volume atual de cachaca no barril
    private Integer numBarril; // numero de indentificacao do barril
    private String material; // material do barril
    private Date dtCheio; // data onde o barril ficou cheio
    private Date dtTipoArmazenado; // data para a trensicao do tipo para armazenado
    private Date dtTipoEnvelhecido; // data para a transicao do tipo para envelhecido
    private Date dtTipoPremium; // data para a  transicao do tipo para premium
    private Date dtTipoExtraPremium; // data para a transicao do tipo para extra premium
    private String tipoAtual; // tipo de envelhecimento atual da cachaca
    
    // construtor da classe barril
    public Barril(double v, String m, Integer num){
        this.volumeTotal = v;
        this.material = m;
        this.numBarril = num;
    }
    // metodo construtor vazio do barril
    public Barril(){
    }
    // getter do volume total
    public Double getVolumeTotal() {
        return volumeTotal;
    }
    // setter do volume total
    public void setVolumeTotal(double volumeTotal) {
        this.volumeTotal = volumeTotal;
    }
    // getter do volume atual
    public Double getVolumeAtual() {
        return volumeAtual;
    }
    // setter do volume atual
    public void setVolumeAtual(double volumeAtual) {
        this.volumeAtual = volumeAtual;
    }
    // getter do numero do barril
    public Integer getNumBarril() {
        return numBarril;
    }
    // setter do numero do barril
    public void setNumBarril(Integer numBarril) {
        this.numBarril = numBarril;
    }
    // getter do material do barril
    public String getMaterial() {
        return material;
    }
    // setter do material do barril
    public void setMaterial(String material) {
        this.material = material;
    }
    // getter da data onde o barril ficou cheio
    public Date getDtCheio() {
        return dtCheio;
    }
    // setter da data onde o barril ficou cheio
    public void setDtCheio(Date dtCheio) {
        this.dtCheio = dtCheio;
    }
    // getter da data de alteracao para o tipo armazenado
    public Date getDtTipoArmazenado() {
        return dtTipoArmazenado;
    }
    // setter da data de alteracao para o tipo armazenado
    public void setDtTipoArmazenado(Date dtTipoArmazenado) {
        this.dtTipoArmazenado = dtTipoArmazenado;
    }
    // getter da data de alteracao para o tipo envelhecido
    public Date getDtTipoEnvelhecido() {
        return dtTipoEnvelhecido;
    }
    // setter da data de alteracao para o tipo envelhecido
    public void setDtTipoEnvelhecido(Date dtTipoEnvelhecido) {
        this.dtTipoEnvelhecido = dtTipoEnvelhecido;
    }
    // getter da data de alteracao para o tipo premium
    public Date getDtTipoPremium() {
        return dtTipoPremium;
    }
    // setter da data de alteracao para o tipo premium
    public void setDtTipoPremium(Date dtTipoPremium) {
        this.dtTipoPremium = dtTipoPremium;
    }
    // getter da data de alteracao para o tipo extra premium
    public Date getDtTipoExtraPremium() {
        return dtTipoExtraPremium;
    }
    // setter da data de alteracao para o tipo extra premium
    public void setDtTipoExtraPremium(Date dtTipoExtraPremium) {
        this.dtTipoExtraPremium = dtTipoExtraPremium;
    }
    // getter do tipo atual
    public String getTipoAtual() {
        return tipoAtual;
    }
    // setter do tipo atual
    public void setTipoAtual(String tipoAtual) {
        this.tipoAtual = tipoAtual;
    }
    // adiciona o volume dado ao volume atual
    public void addVolume(double v){
        this.volumeAtual = this.volumeAtual + v;
    }
    // remove o volume dado do volume atual
    public void subVolume(double v){
        this.volumeAtual = this.volumeAtual - v;
    }
    // checa se o volueme pode ser inserido no barril
    // retorna true caso consiga e retorna false caso ultrapasse o total
    public boolean checkVolume(double v){
        return !(v + this.volumeAtual > this.volumeTotal);
    }
    // calculo das datas dos diversos tipos
    public void calcDtTipos(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(this.dtCheio);
        cal.add(Calendar.MONTH,4); // adicao de 4 meses para a data de barril cheio
        this.dtTipoArmazenado = cal.getTime();
        cal.setTime(this.dtCheio);
        cal.add(Calendar.YEAR,1); // adicao de 12 meses para a data de barril cheio
        this.dtTipoEnvelhecido = cal.getTime();
        cal.setTime(this.dtCheio);
        cal.add(Calendar.YEAR,1); // adicao de 12 meses para a data de barril cheio
        this.dtTipoPremium = cal.getTime();
        cal.setTime(this.dtCheio);
        cal.add(Calendar.YEAR,3); // adicao de 3 anos para a data de barril cheio
        this.dtTipoExtraPremium = cal.getTime();
        
    }
}
