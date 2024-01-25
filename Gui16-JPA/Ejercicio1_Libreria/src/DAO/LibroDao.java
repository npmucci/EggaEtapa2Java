package DAO;

import Entidades.Libro;
import java.util.List;
import java.util.Scanner;

public class LibroDao extends DAO {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public List<Libro> listarLibros() throws Exception {
        List<Libro> libros = null;
        try {
            conectar();
            libros = em.createQuery("SELECT l FROM Libro l").getResultList();
            desconectar();
        } catch (Exception ex) {
            libros = null;
            System.out.println("fallo el mostrar libros" + ex.getMessage());
        }
        return libros;
    }

    //busca un autor por id
    public Libro buscarLibrosId(Long isbn) throws Exception {
        Libro libro = null;
        try {
            conectar();
            libro = em.find(Libro.class, isbn);
            desconectar();
        } catch (Exception e) {
            System.out.println("Fallo en encontrar por id");
        }
        return libro;
    }
    // buscar un libro por titulo

    public List<Libro> buscarLibrosTitulo(String titulo) {
        List<Libro> libros = null;
        try {
            conectar();
            libros = em.createQuery("SELECT l FROM Libro a where l.titulo LIKE :nombre ")
                    .setParameter("nombre", "%" + titulo + "%").getResultList();
            desconectar();
        } catch (Exception ex) {
            libros = null;
            System.out.println("Error al buscar el libro por titulo" + ex.getMessage());
        }
        return libros;
    }

    public List<Libro> buscarLibrosAutor(String autor) {
        List<Libro> libros = null;
        try {
            conectar();
            libros = em.createQuery("SELECT l FROM Libro l where l.autor.nombre LIKE :nombre ")
                    .setParameter("nombre", "%" + autor + "%").getResultList();
            desconectar();
        } catch (Exception ex) {
            libros = null;
            System.out.println("Error al buscar el libro por nombre de autor" + ex.getMessage());
        }
        return libros;
    }

    public List<Libro> buscarLibrosEditorial(String editorial) {
        List<Libro> libros = null;
        try {
            conectar();
            libros = em.createQuery("SELECT l FROM Libro l where l.editorial.nombre LIKE :nombre ")
                    .setParameter("nombre", "%" + editorial + "%").getResultList();
            desconectar();
        } catch (Exception ex) {
            libros = null;
            System.out.println("Error al buscar el libro por nombre de autor" + ex.getMessage());
        }
        return libros;
    }

    // Este método nos permite eliminar un registro de la base de datos.
// Como parámetro se pasa el objeto a eliminar de la base de datos.
// Se verifica el atributo "alta" para decidir si marcar la entidad como inactiva o eliminarla definitivamente de la base.
    public void eliminarLibro(Libro libro) throws Exception {
        try {
            conectar();
            // Verificar si la entidad está activa (alta)
            if (libro.getAlta()) {
                // Si la entidad está activa (alta==true), se cambia el estado a inactiva (baja)
                libro.setAlta(false);
                em.merge(libro);
                em.getTransaction().commit();
            } else {
                // Si la entidad ya está inactiva (alta == false), se pregunta si se quiere
                //eliminar definitivamente de la base
                System.out.println("El libro ya está inactivo en la base de datos"
                        + "¿Quiere eliminarlo definitivamente? Si/No.");
                String opcion = leer.next();
                if (opcion.equalsIgnoreCase("Si")) {
                    super.eliminar(libro);
                }
            }
        } catch (Exception e) {
            System.out.println("No se pudo eliminar el libro: " + e.getMessage());
        } finally {
            desconectar();
        }
    }
    

}
