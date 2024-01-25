package DAO;

import Entidades.Prestamo;
import java.util.List;

public class PrestamoDao extends DAO {

    public void guardarPrestamo(Prestamo prestamo) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.persist(prestamo);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo guardar el prestamo: " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    public void eliminarPrestamo(Prestamo prestamo) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.remove(prestamo);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el prestamo: " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    public void modificarPrestamo(Prestamo prestamo) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.merge(prestamo);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("No se pudo modificar el prestamo: " + e.getMessage());
        } finally {
            desconectar();
        }
    }

    public List<Prestamo> listarPrestamos() throws Exception {
        List<Prestamo> prestamos = null;
        try {
            conectar();
            prestamos = em.createQuery("SELECT p FROM Prestamo p").getResultList();
        } catch (Exception e) {
            System.out.println("Error al listar los prestamos " + e.getMessage());
        } finally {
            desconectar();
        }
        return prestamos;
    }
}
