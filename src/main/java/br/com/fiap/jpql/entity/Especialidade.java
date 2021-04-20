package br.com.fiap.jpql.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_especialidade")
public class Especialidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_especialidade")
    private Integer id;

    @Column(name = "nm_especialidade")
    private String especialidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Especialidade() {
    }

    public Especialidade(Integer id, String especialidade) {
        this.id = id;
        this.especialidade = especialidade;
    }
}
