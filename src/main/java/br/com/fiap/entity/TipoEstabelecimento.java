package br.com.fiap.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_tipo_estabelecimento")
public class TipoEstabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nm_tipo_estabelecimento")
    private String nome;


    @OneToMany(mappedBy = "tipoEstabelecimento",cascade = CascadeType.PERSIST)
    private List<Estabelecimento> estabelecimentos;


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

    public TipoEstabelecimento() {
    }

    public TipoEstabelecimento(int id, String nome, List<Estabelecimento> estabelecimentos) {
        this.id = id;
        this.nome = nome;
        this.estabelecimentos = estabelecimentos;
    }

    public TipoEstabelecimento( String nome, List<Estabelecimento> estabelecimentos) {
        this.id = id;
        this.nome = nome;
        this.estabelecimentos = estabelecimentos;
    }
}
