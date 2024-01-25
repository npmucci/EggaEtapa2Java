
package Servicios;

import DAO.ClienteDao;
import DAO.LibroDao;
import DAO.PrestamoDao;
import Entidades.Cliente;
import Entidades.Libro;
import Entidades.Prestamo;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PrestamoServicio {
    private final PrestamoDao prestamoDao;
    private final ClienteDao clienteDao;
    private final LibroDao libroDao;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public PrestamoServicio() {
        this.prestamoDao = new PrestamoDao();
        this.clienteDao = new ClienteDao();
        this.libroDao = new LibroDao();
    }

   public void generarPrestamo() throws Exception {
    System.out.println("Ingrese el DNI del cliente que realizará el préstamo:");
    Long dni = leer.nextLong();

    List<Cliente> clientes = clienteDao.buscarClientePorDni(dni);

    if (clientes.isEmpty()) {
        System.out.println("El cliente con DNI " + dni + " no existe en la base de datos.");
        return;
    }

    System.out.println("Ingrese el nombre del libro a prestar:");
    String nombreLibro = leer.next();

    List<Libro> libros = libroDao.buscarLibrosTitulo(nombreLibro);

    if (libros.isEmpty()) {
        System.out.println("No se encontró ningún libro con el nombre ingresado.");
        return;
    }

    System.out.println("Lista de libros encontrados:");
    for (Libro libro : libros) {
        System.out.println(libro.getIsbn() + ". " + libro.getTitulo());
    }

    System.out.println("Ingrese el ISBN del libro que desea prestar:");
    Long libroId = leer.nextLong();

    Libro libroPrestamo = libroDao.buscarLibrosId(libroId);

    if (libroPrestamo == null) {
        System.out.println("El libro con ID " + libroId + " no existe en la base de datos.");
        return;
    }

    if (libroPrestamo.getEjemplaresRestantes() <= 0) {
        System.out.println("No hay ejemplares disponibles para prestar del libro con ID " + libroId);
        return;
    }

    // Crear objeto Prestamo y establecer sus atributos
    Prestamo prestamo = new Prestamo();
    prestamo.setCliente(clientes.get(0));
    prestamo.setLibro(libroPrestamo);
    prestamo.setFechaPrestamo(new Date());

    prestamoDao.guardar(prestamo);

    // Actualizar la cantidad de ejemplares restantes del libro prestado
    libroPrestamo.setEjemplaresRestantes(libroPrestamo.getEjemplaresRestantes() - 1);
    libroDao.editar(libroPrestamo);

    System.out.println("Préstamo generado exitosamente.");
}


}
