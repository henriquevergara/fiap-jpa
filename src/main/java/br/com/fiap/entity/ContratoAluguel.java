package br.com.fiap.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "tb_contrato_aluguel")
public class ContratoAluguel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_contrato")
    private Integer id;

    @Column(name = "vl_aluguel")
    private float valor;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_vencimento_aluguel")
    private Calendar dataVencimento;

    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_estabelecimento")
    private Estabelecimento estabelecimento;

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public void setEstabelecimento(Estabelecimento estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Calendar getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Calendar dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public ContratoAluguel() {
    }

    public ContratoAluguel(Integer id, float valor, Calendar dataVencimento, Estabelecimento estabelecimento) {
        this.id = id;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.estabelecimento = estabelecimento;
    }

    public ContratoAluguel( float valor, Calendar dataVencimento, Estabelecimento estabelecimento) {
        this.id = id;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.estabelecimento = estabelecimento;
    }

}
