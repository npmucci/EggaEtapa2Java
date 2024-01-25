package Servicios;

import DAO.LibroDao;
import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import java.util.List;
import java.util.Scanner;

public class LibroServicio {

    // agregando una intancia del dao de la entidad en el servicio logramos relacionar las clases
    private final LibroDao libroDao;
    AutorServicio autorsc = new AutorServicio();
    EditorialServicio editorialsc = new EditorialServicio();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public LibroServicio() {
        //cuando se instancie un objeto del tipo Editorial servicio, se va a 
        //instanciar un objeto del tipo EditorialDao y por lo tanto se crea la conección a la base de datos
        this.libroDao = new LibroDao();
    }

    //metodo para cargar libros
    public void cargarLibro() throws Exception {
        Libro libro = null;

        System.out.println("Ingrese el número de ISBN");
        Long isbn = leer.nextLong();

        libro = libroDao.buscarLibrosId(isbn);

        if (libro == null) {
            System.out.println("Ingrese el título del libro");
            String titulo = leer.next();
            System.out.println("Ingrese el año de publicación");
            Integer anio = leer.nextInt();
            System.out.println("Ingrese la cantidad de ejemplares del libro que posee la librería");
            Integer ejemplares = leer.nextInt();
            Integer prestados = 0;
            Integer restantes = (ejemplares - prestados);

            Autor autor = autorsc.asignarAutor();
            Editorial editorial = editorialsc.asignarEditorial();

            libro = new Libro(isbn, titulo, anio, ejemplares, prestados, restantes, autor, editorial);

            libroDao.guardar(libro);
            System.out.println("Libro cargado correctamente.");
        } else {
            System.out.println("El libro ya se encuentra ingresado en el sistema.");
        }
    }

    public Libro buscarLibroISBN() throws Exception {
        System.out.println("Ingrese el ISBN del libro a buscar");
        return libroDao.buscarLibrosId(leer.nextLong());
    }

    public List<Libro> buscarLibroTitulo() throws Exception {
        System.out.println("Ingrese el Titulo  del libro a buscar");
        return libroDao.buscarLibrosTitulo(leer.next());
    }

    public List<Libro> buscarLibroNombreAutor() throws Exception {
        System.out.println("Ingrese del Autor del libro a buscar");
        return libroDao.buscarLibrosAutor(leer.next());
    }

    public List<Libro> buscarLibroNombreEditorial() throws Exception {
        System.out.println("Ingrese el nombre de la Editorial del libro a buscar");
        return libroDao.buscarLibrosEditorial(leer.next());
    }

    //Le pido que ingrese el isbn del libro, la busco
    //la retorno,  y se lo paso al metodo eliminarLibro  del dao para que la inactive o la borre
    public void eliminarLibro() throws Exception {
        System.out.println("Ingrese el ISBN  del libro a eliminar");
        Libro libroEliminar = libroDao.buscarLibrosId(leer.nextLong());
        libroDao.eliminarLibro(libroEliminar);
    }

    public void modificarLibro() throws Exception {
        System.out.println("Ingrese el ISBN  del libro a modificar");
        Long isbn = leer.nextLong();
        Libro libroExistente = libroDao.buscarLibrosId(isbn);

        if (libroExistente != null) {
            System.out.println("Elija el campo que desea modificar:");
            System.out.println("1. Título");
            System.out.println("2. Año de publicación");
            System.out.println("3. Cantidad de ejemplares");
            System.out.println("4. Autor");
            System.out.println("5. Editorial");
            System.out.println("0. Cancelar");

            int opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nuevo título:");
                    String nuevoTitulo = leer.next();
                    libroExistente.setTitulo(nuevoTitulo);
                    break;
                case 2:
                    System.out.println("Ingrese el nuevo año de publicación:");
                    int nuevoAnio = leer.nextInt();
                    libroExistente.setAnio(nuevoAnio);
                    break;
                case 3:
                    System.out.println("Ingrese la nueva cantidad de ejemplares:");
                    int nuevaCantidad = leer.nextInt();
                    libroExistente.setEjemplares(nuevaCantidad);
                    break;
                case 4:
                    Autor nuevoAutor = autorsc.asignarAutor();
                    libroExistente.setAutor(nuevoAutor);
                    break;
                case 5:
                    Editorial nuevaEditorial = editorialsc.asignarEditorial();
                    libroExistente.setEditorial(nuevaEditorial);
                    break;
                case 0:
                    System.out.println("Modificación cancelada.");
                    return;
                default:
                    System.out.println("Opción inválida.");
                    return;
            }

            if (opcion != 0) {
                libroDao.editar(libroExistente);
                System.out.println("El libro ha sido modificado exitosamente.");
            } else {
                System.out.println("Modificación cancelada.");
            }
        } else {
            System.out.println("El libro con ISBN " + isbn + " no se encuentra en la base de datos.");
        }

    }

}
