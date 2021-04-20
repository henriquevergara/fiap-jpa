package br.com.fiap.jpql.dao;

import br.com.fiap.jpql.entity.Especialidade;

import javax.persistence.EntityManager;

public class EspecialidadeDAO extends GenericDAO<Especialidade, Integer>{
    public EspecialidadeDAO(EntityManager em) {
        super(em);
    }
}
