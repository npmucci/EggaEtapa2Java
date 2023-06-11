package main;

import entidades.Libro;
import servicios.LibroServicio;

import javax.swing.*;
import java.util.HashSet;

/*
También se creará en el main un HashSet de tipo Libro que guardará
todos los libros creados. En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario
todos sus datos y los seteandolos en el Libro. Después, ese Libro se guarda en el conjunto y se le pregunta
al usuario si quiere crear otro Libro o no
 */
public class Main {
    public static void main(String[] args) {
        LibroServicio sc1 = new LibroServicio();
        HashSet<Libro> listaLibros = new HashSet<>();
        String respuesta = "";

        do {
            listaLibros.add(sc1.crearLibro());
            do{
                respuesta = JOptionPane.showInputDialog("¿Desea seguir agregando libros? si/no");
            }while(!respuesta.equalsIgnoreCase("si") & !respuesta.equalsIgnoreCase("no"));
        }while(!respuesta.equalsIgnoreCase("si"));


    }
}