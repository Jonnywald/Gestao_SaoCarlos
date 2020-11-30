
package Model.Bean;

import java.util.Date;

/**
 *
 * @author Guilherme Bertola
 */
public class Garrafa {
    private Integer Lote;
    private String tipoBebida; // tipo da bebida na garrafa
    private Double volumeGarrafa;
    private Date dtEngarrafamento; // data de engarrafamento
    private Integer qtdGarrfas;
    
    // metodo construtor vazio
    public Garrafa() {
    }
    // metodo construtor da classe garrafa
    public Garrafa(String tipoBebida, Double volumeGarrafa, Date dtEngarrafamento) {
        this.tipoBebida = tipoBebida;
        this.volumeGarrafa = volumeGarrafa;
        this.dtEngarrafamento = dtEngarrafamento;
    }

    // getter do tipo de bebida
    public String getTipoBebida() {
        return tipoBebida;
    }
    // setter do tipo de bebida
    public void setTipoBebida(String tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    // getter da data de engarrafamento
    public Date getDtEngarrafamento() {
        return dtEngarrafamento;
    }
    // setter da data de engarrafamento
    public void setDtEngarrafamento(Date dtEngarrafamento) {
        this.dtEngarrafamento = dtEngarrafamento;
    }

    public Integer getLote() {
        return Lote;
    }

    public void setLote(Integer Lote) {
        this.Lote = Lote;
    }

    public Integer getQtdGarrfas() {
        return qtdGarrfas;
    }

    public void setQtdGarrfas(Integer qtdGarrfas) {
        this.qtdGarrfas = qtdGarrfas;
    }

    public Double getVolumeGarrafa() {
        return volumeGarrafa;
    }

    public void setVolumeGarrafa(Double volumeGarrafa) {
        this.volumeGarrafa = volumeGarrafa;
    }
    
    
    
}
