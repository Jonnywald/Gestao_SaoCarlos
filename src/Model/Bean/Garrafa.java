
package Model.Bean;

import java.util.Date;

/**
 *
 * @author Guilherme Bertola
 */
public class Garrafa {
    private Integer Lote;
    private String tipoBebida; // tipo da bebida na garrafa
    private String tipoGarrafa; // tipo de garrafa que foi utilizada
    private Date dtEngarrafamento; // data de engarrafamento
    
    // metodo construtor vazio
    public Garrafa() {
    }
    // metodo construtor da classe garrafa
    public Garrafa(String tipoBebida, String tipoGarrafa, Date dtEngarrafamento) {
        this.tipoBebida = tipoBebida;
        this.tipoGarrafa = tipoGarrafa;
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
    // getter do tipo de garrafa
    public String getTipoGarrafa() {
        return tipoGarrafa;
    }
    // setter do tipo de garrafa
    public void setTipoGarrafa(String tipoGarrafa) {
        this.tipoGarrafa = tipoGarrafa;
    }
    // getter da data de engarrafamento
    public Date getDtEngarrafamento() {
        return dtEngarrafamento;
    }
    // setter da data de engarrafamento
    public void setDtEngarrafamento(Date dtEngarrafamento) {
        this.dtEngarrafamento = dtEngarrafamento;
    }
    
    
}
