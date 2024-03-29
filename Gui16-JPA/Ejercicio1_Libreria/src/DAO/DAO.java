package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author usuario
 */
public class DAO<T> {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Ejercicio1_LibreriaPU");
    EntityManager em = emf.createEntityManager();

    // Este método nos permite conectar con la base de datos
    // se verifica si la conexión está realizada, en caso que
    // no esté realizada, se realiza.
    public void conectar() {
        if (!em.isOpen()) {
            em = emf.createEntityManager();
        }
    }

    // Este método nos permite desconectarnos de la base de datos
    // Se verifica si existe una conexión, y de ser el caso, se
    // cierra la conexión y se desconecta el programa con la base de datos.
    public void desconectar() {
        if (em.isOpen()) {
            em.close();
        }
    }

    // este método nos permite persistir un objeto en la base de datos.
    // Toma como parámetro el objeto de tipo Direccion que se quiere persistir
    public void guardar(T objeto) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {

            System.out.println("No se puedo gaurdar el objeto " + objeto + e.getMessage());
        } finally {
            desconectar();
        }
    }

    // Este método nos permite eliminar un registro de la base de datos.
    // Como parámetro se pasa el objeto a eliminar de la base de datos.
    // Se busca en la base de datos el registro que contenga la misma información
    // que el parámetro recibido, y se elimina.
    public void eliminar(T objeto) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.remove(objeto);
            em.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("La editorial no se pudo eliminar" + e.getMessage());
        } finally {
            desconectar();
        }
    }

    // Este método nos permite modificar un registro de una base de datos.
    // Recibe como parámetro el objeto con los datos cambiados (debe mantener
    // la misma llave primaria) y lo reemplaza por el anterior.
    public void editar(T objeto) throws Exception {
        try {
            conectar();
            em.getTransaction().begin();
            em.merge(objeto);
            em.getTransaction().commit();

        } catch (Exception e) {
            System.out.println("La editorial no se pudo modificar" + e.getMessage());
        } finally {
            desconectar();
        }
    }
}
