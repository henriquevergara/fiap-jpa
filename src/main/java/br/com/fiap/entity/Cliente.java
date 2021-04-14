package br.com.fiap.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_cliente")
    private int id;

    @Column(name = "nm_cliente")
    private String nome;

    @ManyToMany(mappedBy = "clientes")
    private List<Estabelecimento> estabelecimentos;

    public Cliente() {
    }

    public Cliente(int id, String nome, List<Estabelecimento> estabelecimentos) {
        this.id = id;
        this.nome = nome;
        this.estabelecimentos = estabelecimentos;
    }

    public Cliente(String nome, List<Estabelecimento> estabelecimentos) {
        this.id = id;
        this.nome = nome;
        this.estabelecimentos = estabelecimentos;
    }

    public List<Estabelecimento> getEstabelecimentos() {
        return estabelecimentos;
    }

    public void setEstabelecimentos(List<Estabelecimento> estabelecimentos) {
        this.estabelecimentos = estabelecimentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
