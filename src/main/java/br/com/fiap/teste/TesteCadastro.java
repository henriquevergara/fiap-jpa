package br.com.fiap.teste;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.ContratoAluguel;
import br.com.fiap.entity.Estabelecimento;
import br.com.fiap.entity.TipoEstabelecimento;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class TesteCadastro {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("fiap").createEntityManager();

        TipoEstabelecimento tipo = new TipoEstabelecimento("Pet Shop",null);

        Cliente cliente = new Cliente("Thiago",null);
        Cliente cliente2 = new Cliente("Leandro",null);

        ContratoAluguel contrato = new ContratoAluguel(2000,new GregorianCalendar(2021, Calendar.AUGUST,10),null);

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        clientes.add(cliente2);

        Estabelecimento estabelecimento = new Estabelecimento("Fiap Pet",clientes,null,tipo);
        Estabelecimento est2 = new Estabelecimento("Poyatos dog",clientes,contrato,tipo);

        contrato.setEstabelecimento(est2);

        em.persist(estabelecimento);
        em.persist(est2);

        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();


    }
}
