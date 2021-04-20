package br.com.fiap.jpql.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_consulta")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_consulta")
    private Integer id;

    @Column(name = "dt_consulta")
    @Temporal(TemporalType.DATE)
    private Calendar dataConsulta;

    @ManyToOne
    @JoinColumn(name = "id_especialidade")
    private Especialidade especialidade;

    @ManyToOne
    @JoinColumn(name = "id_agendamento")
    private Agendamento agendamento;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(Calendar dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Agendamento getAgendamento() {
        return agendamento;
    }

    public void setAgendamento(Agendamento agendamento) {
        this.agendamento = agendamento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Consulta() {
    }

    public Consulta(Integer id, Calendar dataConsulta, Especialidade especialidade, Agendamento agendamento, Paciente paciente) {
        this.id = id;
        this.dataConsulta = dataConsulta;
        this.especialidade = especialidade;
        this.agendamento = agendamento;
        this.paciente = paciente;
    }
}
