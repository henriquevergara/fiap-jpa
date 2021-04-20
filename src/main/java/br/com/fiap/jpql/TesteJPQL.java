package br.com.fiap.jpql;

import br.com.fiap.jpql.dao.PacienteDAO;
import br.com.fiap.jpql.entity.Genero;
import br.com.fiap.jpql.entity.Paciente;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.Calendar;
import java.util.List;

public class TesteJPQL {

    public static void main(String[] args) {

        EntityManager em = Persistence.createEntityManagerFactory("jpql").createEntityManager();

        PacienteDAO dao = new PacienteDAO(em);

        Paciente p1 = new Paciente("Henrique Vergara", "henriquevergara@hotmail.com", Calendar.getInstance(), Genero.MASCULINO);
        Paciente p2 = new Paciente("Marina Giangiulio", "magiangiulio@gmail.com", Calendar.getInstance(), Genero.FEMININO);
        Paciente p3 = new Paciente("Paulo Monteiro", "pmv@hotmail.com", Calendar.getInstance(), Genero.MASCULINO);
        Paciente p4 = new Paciente("Clecio Gomes", "cle.gomes@hotmail.com", Calendar.getInstance(), Genero.MASCULINO);

//        dao.cadastrar(p1);
//        dao.cadastrar(p2);
//        dao.cadastrar(p3);
//        dao.cadastrar(p4);
//
//        try{
//            dao.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        System.out.println(dao.contarPaciente());
    }

}
