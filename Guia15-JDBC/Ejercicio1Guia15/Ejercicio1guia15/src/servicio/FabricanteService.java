package servicio;

import entidades.Fabricante;
import persistencia.FabricanteDAO;
import java.util.Scanner;

public class FabricanteService {

    Scanner leer = new Scanner(System.in);
    FabricanteDAO fab = new FabricanteDAO();

    public void fabricanteInsertar() {
        try {
            System.out.println("Ingrese el nombre del fabricante");
            String nombre = leer.nextLine();

            Fabricante fabricante = new Fabricante();
            fabricante.setNombre(nombre);
            fab.fabricanteInsertar(fabricante);
        } catch (Exception e) {
            System.out.println("Error al insertar el fabricante: " + e.getMessage());
        }
    }

    // Cierre del recurso Scanner
    public void cerrarScanner() {
        leer.close();
    }
}
