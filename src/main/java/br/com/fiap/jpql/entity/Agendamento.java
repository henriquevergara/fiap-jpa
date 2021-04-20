package br.com.fiap.jpql.entity;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "tb_agendamento")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agendamento")
    private Integer id;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_agendamento")
    private Calendar dataAgendamento;

    @Temporal(TemporalType.DATE)
    @Column(name = "dt_consulta_prevista")
    private Calendar dataConsultaPrevista;

    @ManyToOne
    @JoinColumn(name = "id_especialidade")
    private Especialidade especialidade;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    public Agendamento(Integer id, Calendar dataAgendamento, Calendar dataConsultaPrevista, Especialidade especialidade, Paciente paciente) {
        this.id = id;
        this.dataAgendamento = dataAgendamento;
        this.dataConsultaPrevista = dataConsultaPrevista;
        this.especialidade = especialidade;
        this.paciente = paciente;
    }

    public Agendamento() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Calendar dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Calendar getDataConsultaPrevista() {
        return dataConsultaPrevista;
    }

    public void setDataConsultaPrevista(Calendar dataConsultaPrevista) {
        this.dataConsultaPrevista = dataConsultaPrevista;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
