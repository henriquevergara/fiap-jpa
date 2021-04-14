package br.com.fiap.teste;

import br.com.fiap.entity.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteBusca {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("fiap");
        EntityManager em = emf.createEntityManager();

        Cliente clienteEncontrado = em.find(Cliente.class,1);
        System.out.println(clienteEncontrado.getId() + "     " + clienteEncontrado.getNome());

        em.close();
        emf.close();


    }

}
