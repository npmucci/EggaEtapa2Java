package servicios;

import entidades.Pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
22
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
    public Pelicula crearPelicula(){
        System.out.println("Ingresa el nombre de la pelicula");
        String titulo = leer.next();
        System.out.println("Ingresa el autor de la pelicula");
        String autor = leer.next();
        System.out.println("Ingresa laduración de la pelicula");
        double duracion = leer.nextDouble();

        return new Pelicula(titulo,autor,duracion);
    }

    public void cargarPelicula(){
        String respuesta = "";

        do{
            listaPeliculas.add(crearPelicula());
            System.out.println("¿Quiere seguir cargando peliculas?");
            respuesta = leer.next();
        }while (respuesta.equalsIgnoreCase("si"));
    }

    public void mostrarPelicula() {
        for (Pelicula pelicula:listaPeliculas) {
            System.out.println(pelicula);
        }
        System.out.println("-----------------------------------------");
    }
    public void duracionMasUnaHora(){
        for (Pelicula pelicula:listaPeliculas) {
            if (pelicula.getDuracion()>1){
                System.out.println(pelicula);
            }
        }
        System.out.println("-----------------------------------------");
    }

    public void duracionMenor() {
        listaPeliculas.sort(Pelicula.compararDuracion);
        for (Pelicula pelicula: listaPeliculas) {
            System.out.println(pelicula);
        }
        System.out.println("-----------------------------------------");
    }
    public void duracionMayor() {
        listaPeliculas.sort(Pelicula.compararDuracion.reversed());
        for (Pelicula pelicula: listaPeliculas) {
            System.out.println(pelicula);
        }
        System.out.println("-----------------------------------------");
    }


    public void tituloAlfabeticamente() {
        listaPeliculas.sort(Pelicula.compararTitulo);
        for (Pelicula pelicula: listaPeliculas) {
            System.out.println(pelicula);
        }
        System.out.println("-----------------------------------------");


    }


    public void directorAlfabeticamente() {
       listaPeliculas.sort(Pelicula.compararDirector);

        for (Pelicula pelicula: listaPeliculas) {
            System.out.println(pelicula);
        }
        System.out.println("-----------------------------------------");

    }
}
