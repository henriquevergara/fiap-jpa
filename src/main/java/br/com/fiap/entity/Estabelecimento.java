package br.com.fiap.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="tb_estabelecimento")
public class Estabelecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nm_estabelecimento",length = 50)
    private String nome;

    @OneToOne(mappedBy = "estabelecimento",cascade = CascadeType.PERSIST)
    private ContratoAluguel contratoAluguel;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "id_tipo_estabelecimento")
    private TipoEstabelecimento tipoEstabelecimento;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(joinColumns = @JoinColumn(name = "id_estabelecimento"),inverseJoinColumns = @JoinColumn(name = "id_cliente"),name = "tb_cliente_estabelecimento")
    private List<Cliente> clientes;

    public TipoEstabelecimento getTipoEstabelecimento() {
        return tipoEstabelecimento;
    }

    public void setTipoEstabelecimento(TipoEstabelecimento tipoEstabelecimento) {
        this.tipoEstabelecimento = tipoEstabelecimento;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Estabelecimento() {
    }

    public ContratoAluguel getContratoAluguel() {
        return contratoAluguel;
    }

    public void setContratoAluguel(ContratoAluguel contratoAluguel) {
        this.contratoAluguel = contratoAluguel;
    }

    public Estabelecimento(Integer id, String nome,List<Cliente> clientes, ContratoAluguel contratoAluguel, TipoEstabelecimento tipoEstabelecimento) {
        this.id = id;
        this.nome = nome;
        this.contratoAluguel = contratoAluguel;
        this.tipoEstabelecimento = tipoEstabelecimento;
        this.clientes = clientes;
    }

    public Estabelecimento(String nome,List<Cliente> clientes, ContratoAluguel contratoAluguel, TipoEstabelecimento tipoEstabelecimento) {
        this.id = id;
        this.nome = nome;
        this.contratoAluguel = contratoAluguel;
        this.tipoEstabelecimento = tipoEstabelecimento;
        this.clientes = clientes;
    }
}
