package br.com.fiap.jpql.dao;

import br.com.fiap.jpql.entity.Consulta;
import br.com.fiap.jpql.entity.Especialidade;

import javax.persistence.EntityManager;
import java.util.List;

public class ConsultaDAO extends GenericDAO<Consulta, Integer> {
    public ConsultaDAO(EntityManager em) {
        super(em);
    }

    public List<Consulta> buscaPorEspecialidade(Especialidade esp){
        return em.createQuery("from Consulta c where c.especialidade = :esp",Consulta.class)
                .setParameter("esp",esp).getResultList();
    }

    public List<Consulta> buscarPorEmailPaciente(String email){
        return em.createQuery("from Consulta c where c.paciente.email = :email",Consulta.class)
                .setParameter("email",email).getResultList();
    }

}
