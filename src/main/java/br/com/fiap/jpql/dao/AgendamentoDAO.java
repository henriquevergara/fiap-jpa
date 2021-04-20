package br.com.fiap.jpql.dao;

import br.com.fiap.jpql.entity.Agendamento;

import javax.persistence.EntityManager;

public class AgendamentoDAO extends GenericDAO<Agendamento, Integer> {


    public AgendamentoDAO(EntityManager em) {
        super(em);
    }
}
