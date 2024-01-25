package Entidades;

import Servicios.AutorServicio;
import Servicios.EditorialServicio;
import Servicios.LibroServicio;
import Servicios.ClienteServicio;
import Servicios.PrestamoServicio;
import java.util.List;
import java.util.Scanner;

public class MenuLibreria {
    private final AutorServicio autorServicio;
    private final EditorialServicio editorialServicio;
    private final LibroServicio libroServicio;
    private final ClienteServicio clienteServicio;
    private final PrestamoServicio prestamoServicio;

    public MenuLibreria() {
        autorServicio = new AutorServicio();
        editorialServicio = new EditorialServicio();
        libroServicio = new LibroServicio();
        clienteServicio = new ClienteServicio();
        prestamoServicio = new PrestamoServicio();
    }

    public void mostrarMenu() {
        Scanner leer = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n-- MENÚ LIBRERÍA --");
            System.out.println("1. Agregar nuevo autor");
            System.out.println("2. Agregar nueva editorial");
            System.out.println("3. Agregar nuevo libro");
            System.out.println("4. Buscar autor por nombre");
            System.out.println("5. Buscar libro por ISBN");
            System.out.println("6. Buscar libro por título");
            System.out.println("7. Buscar libros por nombre de autor");
            System.out.println("8. Buscar libros por nombre de editorial");
            System.out.println("9. Modificar los datos de un libro");
            System.out.println("10. Dar de baja un libro");
            System.out.println("11. Agregar nuevo cliente");
            System.out.println("12. Generar préstamo de libro");
            System.out.println("13. Salir");
            System.out.print("Ingresa tu opción: ");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    try {
                        String respuesta = "";
                        do {
                            autorServicio.crearAutor();
                            System.out.println("¿Quiere cargar otro Autor? SI/NO");
                            respuesta = leer.next();
                        } while (respuesta.equalsIgnoreCase("SI"));
                    } catch (Exception e) {
                        System.out.println("El autor no ha sido agregado: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        String respuesta = "";
                        do {
                            editorialServicio.crearEditorial();
                            System.out.println("¿Quiere cargar otra Editorial? SI/NO");
                            respuesta = leer.next();
                        } while (respuesta.equalsIgnoreCase("SI"));
                    } catch (Exception e) {
                        System.out.println("La Editorial no ha sido agregada: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        String respuesta = "";
                        do {
                            libroServicio.cargarLibro();
                            System.out.println("¿Quiere cargar otro libro? SI/NO");
                            respuesta = leer.next();
                        } while (respuesta.equalsIgnoreCase("SI"));
                    } catch (Exception e) {
                        System.out.println("El libro no ha sido agregado: " + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        autorServicio.buscarAutorNombre();
                    } catch (Exception e) {
                        System.out.println("Error al buscar el autor por nombre: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        libroServicio.buscarLibroISBN();
                    } catch (Exception e) {
                        System.out.println("Error al buscar el libro por ISBN: " + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        List<Libro> libroTitulo = libroServicio.buscarLibroTitulo();
                        for (Libro libro : libroTitulo) {
                            System.out.println(libro);
                        }
                    } catch (Exception e) {
                        System.out.println("Error al buscar el libro por título: " + e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        List<Libro> libroAutor = libroServicio.buscarLibroNombreAutor();
                        for (Libro libro : libroAutor) {
                            System.out.println(libro);
                        }
                    } catch (Exception e) {
                        System.out.println("Error al buscar el libro por nombre de autor: " + e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        List<Libro> libroEditorial = libroServicio.buscarLibroNombreEditorial();
                        for (Libro libro : libroEditorial) {
                            System.out.println(libro);
                        }
                    } catch (Exception e) {
                        System.out.println("Error al buscar el libro por nombre de editorial: " + e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        libroServicio.modificarLibro();
                    } catch (Exception e) {
                        System.out.println("Error al modificar el libro: " + e.getMessage());
                    }
                    break;
                case 10:
                    try {
                        libroServicio.eliminarLibro();
                    } catch (Exception e) {
                        System.out.println("Error al eliminar el libro: " + e.getMessage());
                    }
                    break;
                case 11:
                    try {
                        clienteServicio.crearCliente();
                    } catch (Exception e) {
                        System.out.println("Error al crear el cliente: " + e.getMessage());
                    }
                    break;
                case 12:
                    try {
                        prestamoServicio.generarPrestamo();
                    } catch (Exception e) {
                        System.out.println("Error al generar el préstamo: " + e.getMessage());
                    }
                    break;
                case 13:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, ingrese una opción.");
            }
        } while (opcion != 13);
    }
}
