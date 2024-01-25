
package DAO;

import Entidades.Cliente;
import java.util.List;


public class ClienteDao extends DAO {
    
    public void guardarCliente(Cliente cliente) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo guardar el cliente: " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    public void eliminarCliente(Cliente cliente) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el cliente: " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    public void modificarCliente(Cliente cliente) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo modificar el cliente: " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    public Cliente buscarClientePorId(Long id) throws Exception {
        Cliente cliente = null;
        try {
            conectar();
            cliente = em.find(Cliente.class, id);
        } catch (Exception e) {
            System.out.println("Fallo en encontrar cliente por id: " + e.getMessage());
        } finally {
            desconectar();
        }
        return cliente;
    }

    public List<Cliente> buscarClientePorDni(Long dni) throws Exception {
        List<Cliente> clientes = null;
        try {
            conectar();
            clientes = em.createQuery("SELECT c FROM Cliente c WHERE c.documento = :dni")
                    .setParameter("dni", dni)
                    .getResultList();
        } catch (Exception e) {
            System.out.println("Error al buscar cliente por nombre: " + e.getMessage());
        } finally {
            desconectar();
        }
        return clientes;
    }

    public List<Cliente> listarClientes() throws Exception {
        List<Cliente> clientes = null;
        try {
            conectar();
            clientes = em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
        } catch (Exception e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        } finally {
            desconectar();
        }
        return clientes;
    }
    
}
