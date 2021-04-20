package br.com.fiap.jpql.entity;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
@Table(name = "tb_paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_paciente")
    private Integer id;

    @Column(name = "nm_paciente",length = 80)
    private String nome;

    @Column(name = "ds_email_paciente",length = 80)
    private String email;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_nasc_paciente")
    private Calendar datNascimento;

    @Column(name = "ds_genero_paciente")
    @Enumerated(EnumType.STRING)
    private Genero genero;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDatNascimento() {
        return datNascimento;
    }

    public void setDatNascimento(Calendar datNascimento) {
        this.datNascimento = datNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Paciente() {
    }

    public Paciente(String nome, String email, Calendar datNascimento, Genero genero) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.datNascimento = datNascimento;
        this.genero = genero;
    }
}
