package Model.Bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Guilherme Bertola
 */
public class Venda {

    private Integer id; // id da venda
    private Double valor; // valor da venda
    private String desc; // descricao da venda
    private Date data; // data da venda
    private List<Garrafa> garrafas = new ArrayList<>(); // lista de garrafas
    private List<Rapadura> rapaduras = new ArrayList<>(); // lista de rapaduras
    private List<Melado> melados = new ArrayList<>(); // lista de melados
    private Integer qtdMelado = 0;
    private Integer qtdRapadura = 0;
    private Integer qtdGarrafa = 0;

    // construtor vazio
    public Venda() {
    }
    // metodo construtor da classe de venda

    public Venda(Double valor, String desc, Date data) {
        this.valor = valor;
        this.desc = desc;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQtdMelado() {
        return qtdMelado;
    }

    public void setQtdMelado(Integer qtdMelado) {
        this.qtdMelado = qtdMelado;
    }

    public Integer getQtdRapadura() {
        return qtdRapadura;
    }

    public void setQtdRapadura(Integer qtdRapadura) {
        this.qtdRapadura = qtdRapadura;
    }

    public Integer getQtdGarrafa() {
        return qtdGarrafa;
    }

    public void setQtdGarrafa(Integer qtdGarrafa) {
        this.qtdGarrafa = qtdGarrafa;
    }

    // getter do valor
    public Double getValor() {
        return valor;
    }

    // setter do valor
    public void setValor(Double valor) {
        this.valor = valor;
    }

    // getter da descricao
    public String getDesc() {
        return desc;
    }

    // setter da descricao
    public void setDesc(String desc) {
        this.desc = desc;
    }

    // getter da data
    public Date getData() {
        return data;
    }

    // setter da data
    public void setData(Date data) {
        this.data = data;
    }

    // adiciona um objeto Melado para a lista de melados
    public void addMelado(Melado m) {
        melados.add(m);
    }

    // adiciona um objeto garrafa para a lista de garrafas
    public void addGarrafa(Garrafa g) {
        garrafas.add(g);
    }

    // adiciona uma rapadura na lista de rapaduras produzidas
    public void addRapadura(Rapadura r) {
        rapaduras.add(r);
    }

    // remove o ultimo melado adcionado na lista
    //nao faz nada caso a lista esteja vazia
    public void rmMelado() {
        Integer i;
        i = melados.size();
        if (!(melados.isEmpty())) {
            melados.remove(i - 1);
        }
    }

    // remove a ultima rapadura adcionado na lista
    //nao faz nada caso a lista esteja vazia
    public void rmRapadura() {
        Integer i;
        i = rapaduras.size();
        if (!(rapaduras.isEmpty())) {
            rapaduras.remove(i - 1);
        }
    }

    // remove a ultima garrafa adcionado na lista
    //nao faz nada caso a lista esteja vazia
    public void rmGarrafa() {
        Integer i;
        i = garrafas.size();
        if (!(garrafas.isEmpty())) {
            garrafas.remove(i - 1);
        }
    }

    public void calcItem() {
        this.qtdMelado = melados.size();
        this.qtdRapadura = rapaduras.size();
        this.garrafas.forEach(g -> {
            this.qtdGarrafa += g.getQtdGarrfas();
        });
    }
}
