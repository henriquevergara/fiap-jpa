package br.com.fiap.teste;

import br.com.fiap.entity.Cliente;
import br.com.fiap.entity.ClienteDAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class TesteDAO {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("fiap").createEntityManager();

        ClienteDAO clienteDAO = new ClienteDAO(em);

//        Cliente entidade = new Cliente("Ozzy", null);
//        clienteDAO.cadastrar(entidade);
//
//        try {
//            clienteDAO.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        List<Cliente> clientes = clienteDAO.listar();

        for (Cliente cliente:clientes) {
            System.out.println(cliente.getNome());
        }
    }

}
