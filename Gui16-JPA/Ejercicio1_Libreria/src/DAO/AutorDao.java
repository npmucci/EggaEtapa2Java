
package DAO;

import Entidades.Autor;
import java.util.List;
import java.util.Scanner;

public class AutorDao extends DAO {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //busca un autor por id
    public Autor buscarAutorId(Integer id) throws Exception {
        Autor autor = null;
        try {
            conectar();
            autor = em.find(Autor.class, id);
            desconectar();

        } catch (Exception e) {

            System.out.println("Fallo en encontrar por id" + e.getMessage());
        }
        return autor;
    }

    //listar todos los registros de la tabla de autores
    public List<Autor> listarAutores() throws Exception {
        List<Autor> autores = null;
        try {
            conectar();
            autores = em.createQuery("SELECT a FROM Autor a")
                    .getResultList();
            desconectar();

        } catch (Exception e) {
            System.out.println("No se pudieron listar los autores" + e.getMessage());
        }
        return autores;
    }

    // buscar un autor por nombre
    public List<Autor> buscarAutoresNombre(String nombre) throws Exception {
        List<Autor> autores = null;
        try {
            conectar();
            autores = em.createQuery("SELECT a FROM Autor a where a.nombre LIKE :nombre ")
                    .setParameter("nombre", "%" + nombre + "%").getResultList();
            desconectar();
        } catch (Exception ex) {
            autores = null;
            System.out.println("Error al buscar el autor por nombre" + ex.getMessage());
        }
        return autores;
    }
// Este método nos permite eliminar un registro de la base de datos.
// Como parámetro se pasa el objeto a eliminar de la base de datos.
// Se verifica el atributo "alta" para decidir si marcar la entidad como inactiva o eliminarla definitivamente de la base.
    public void eliminarAutor(Autor autor) throws Exception {
        try {
            conectar();
            // Verificar si la entidad está activa (alta)
            if (autor.getAlta()) {
                // Si la entidad está activa (alta==true), se cambia el estado a inactiva (baja)
                autor.setAlta(false);
               super.editar(autor);
            } else {
                // Si la entidad ya está inactiva (alta == false), se pregunta si se quiere
                //eliminar definitivamente de la base
                System.out.println("El autor ya está inactivo en la base de datos"
                        + "¿Quiere eliminarlo definitivamente?Si/No.");
                String opcion = leer.next();
                if (opcion.equalsIgnoreCase("Si")) {
                  eliminar(autor);
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el autor: " + e.getMessage());
        } finally {
            desconectar();
        }
    }
}
