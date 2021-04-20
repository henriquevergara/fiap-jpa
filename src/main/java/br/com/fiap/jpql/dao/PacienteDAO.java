package br.com.fiap.jpql.dao;

import br.com.fiap.jpql.entity.Paciente;

import javax.persistence.EntityManager;
import java.util.List;

public class PacienteDAO extends GenericDAO<Paciente, Integer> {

    public PacienteDAO(EntityManager em) {
        super(em);
    }

    public List<Paciente> listarOrdenadoPorNomeDescrescente(){

        return em.createQuery("from Paciente order by nome desc",Paciente.class).getResultList();

    }

    public Long contarPaciente(){
        return em.createQuery("select count(*) from Paciente",Long.class).getSingleResult();
    }

    public List<Paciente> listarOrdenadoPorNomeCrescente(){

        return em.createQuery("from Paciente order by nome asc",Paciente.class).getResultList();

    }

    public List<Paciente> listaOsTresPrimeiros(){

        return em.createQuery("from Paciente order by nome asc",Paciente.class).setMaxResults(3).getResultList();

    }

    public List<Paciente> listaNPrimeiros(int n){

        return em.createQuery("from Paciente order by nome asc",Paciente.class).setMaxResults(n).getResultList();

    }

    public List<Paciente> buscarPorNome(String nome){
        return em.createQuery("from Paciente p where p.nome = :nomePaciente",Paciente.class)
                .setParameter("nomePaciente",nome).getResultList();
    }

    public List<Paciente> buscarPorNomeLike(String nome){
        return em.createQuery("from Paciente p where p.nome like :nomePaciente",Paciente.class)
                .setParameter("nomePaciente","%"+nome+"%").getResultList();
    }

}
