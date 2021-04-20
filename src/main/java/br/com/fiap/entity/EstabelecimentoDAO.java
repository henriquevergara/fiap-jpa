package br.com.fiap.entity;

import javax.persistence.EntityManager;

public class EstabelecimentoDAO extends GenericDAO<Estabelecimento,Integer>{

    public EstabelecimentoDAO(EntityManager em) {
        super(em);
    }
}
