package br.com.fiap.teste;

import br.com.fiap.entity.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteRemocao {


    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("fiap");
        EntityManager em = emf.createEntityManager();

        Cliente clienteEncontrado = em.find(Cliente.class,1);
        em.remove(clienteEncontrado);

        try {
            em.getTransaction().begin();
            em.getTransaction().commit();
        }catch (Exception e){
            if (em.getTransaction().isActive()){
                em.getTransaction().rollback();
            }
        }
        em.close();
        emf.close();


    }


}
