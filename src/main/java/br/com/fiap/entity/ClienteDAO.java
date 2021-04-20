package br.com.fiap.entity;

import javax.persistence.EntityManager;

public class ClienteDAO extends GenericDAO<Cliente, Integer> {

    public ClienteDAO(EntityManager em) {
        super(em);
    }



}
