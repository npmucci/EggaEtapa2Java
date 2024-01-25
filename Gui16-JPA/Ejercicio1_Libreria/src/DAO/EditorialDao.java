package DAO;

import Entidades.Editorial;
import java.util.List;
import java.util.Scanner;

public class EditorialDao extends DAO {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //listar todos los registros de la tabla de autores
    public List<Editorial> listarEditorial() throws Exception {
        List<Editorial> autores = null;
        try {
            conectar();
            autores = em.createQuery("SELECT e FROM Editorial e")
                    .getResultList();
            desconectar();

        } catch (Exception e) {
            System.out.println("No se pudieron listar las editoriales" + e.getMessage());
        }
        return autores;
    }

    //busca un Editorial por id
    public Editorial buscarEditorialId(Integer id) throws Exception {
        Editorial editorial = null;
        try {
            conectar();
            editorial = em.find(Editorial.class, id);
            desconectar();

        } catch (Exception e) {

            System.out.println("Fallo en encontrar por id" + e.getMessage());
        }
        return editorial;
    }

    // buscar un editorial por nombre
    public List<Editorial> buscarEditorialNombre(String nombre) throws Exception {
        List<Editorial> editorial = null;
        try {
            conectar();
            editorial = em.createQuery("SELECT e FROM Editorial e where e.nombre LIKE :nombre ")
                    .setParameter("nombre", "%" + nombre + "%").getResultList();
            desconectar();
        } catch (Exception ex) {
            editorial = null;
            System.out.println("Error al buscar el autor por nombre" + ex.getMessage());
        }
        return editorial;
    }

    // Este método nos permite eliminar un registro de la base de datos.
// Como parámetro se pasa el objeto a eliminar de la base de datos.
// Se verifica el atributo "alta" para decidir si marcar la entidad como inactiva o eliminarla definitivamente de la base.
    public void eliminarEditorial(Editorial editorial) throws Exception {
        try {
            conectar();
            // Verificar si la entidad está activa (alta)
            if (editorial.getAlta()) {
                // Si la entidad está activa (alta==true), se cambia el estado a inactiva (baja)
                editorial.setAlta(false);
                em.merge(editorial);
                em.getTransaction().commit();
            } else {
                // Si la entidad ya está inactiva (alta == false), se pregunta si se quiere
                //eliminar definitivamente de la base
                System.out.println("La editorial ya está inactiva en la base de datos"
                        + "¿Quiere eliminarla definitivamente?Si/No.");
                String opcion = leer.next();
                if (opcion.equalsIgnoreCase("Si")) {
                    eliminar(editorial);
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo eliminar la editorial: " + e.getMessage());
        } finally {
            desconectar();
        }
    }
}
