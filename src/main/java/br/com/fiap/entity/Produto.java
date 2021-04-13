package br.com.fiap.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;

@Entity
@Table(name = "tb_produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nm_produto",nullable = false,length = 100)
    private String nome;

    @Column(name = "vl_preco")
    private double valor;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_data_validade")
    private Calendar dataValidade;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    @Column(name = "dt_cadastro")
    @CreationTimestamp
    private Calendar dataCadastro;

    @Column(name = "dt_modificacao")
    @UpdateTimestamp
    private Calendar dataModificacao;

    @Formula("vl_preco*0.9")
    private double precoDesconto;

    public Produto(Long id, String nome, double valor, Calendar dataValidade, Estado estado, Calendar dataCadastro, Calendar dataModificacao, double precoDesconto) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.dataValidade = dataValidade;
        this.estado = estado;
        this.dataCadastro = dataCadastro;
        this.dataModificacao = dataModificacao;
        this.precoDesconto = precoDesconto;
    }

    public Produto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Calendar getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Calendar dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Calendar getDataModificacao() {
        return dataModificacao;
    }

    public void setDataModificacao(Calendar dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public double getPrecoDesconto() {
        return precoDesconto;
    }

    public void setPrecoDesconto(double precoDesconto) {
        this.precoDesconto = precoDesconto;
    }
}
