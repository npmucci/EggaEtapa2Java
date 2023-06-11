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
package Service;

import Entidad.Pelicula;
import java.util.*;

public class PeliculaService {

    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashSet<Pelicula> peliculasHas = new HashSet();
    ArrayList<Pelicula> peliculaList;

    private Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();

        System.out.println("Director: ");
        pelicula.setDirector(read.next());

        System.out.println("Duracion: (HS)");
        pelicula.setDuracion(read.nextInt());

        System.out.println("Titulo: ");
        pelicula.setTitulo(read.next());

        return pelicula;
    }

    public void iterarPeliculas() {
        String x;

        do {
            peliculasHas.add(crearPelicula());

            do {
                System.out.println("Quiere ingresar otra Peli ? S/N");
                x = read.next();
            } while (!x.equalsIgnoreCase("s") && !x.equalsIgnoreCase("n"));

        } while (!x.equalsIgnoreCase("n"));

        peliculaList = new ArrayList(peliculasHas);

    }

    public void mostrarPeliculas() {
        System.out.println(peliculasHas);

        peliculaList.forEach((h) -> {
            System.out.println(h);
        });
        
        
    }

    public void mostrarMasDeUnaHora() {
        peliculaList.forEach((h) -> {
            if (h.getDuracion() > 1) {
                System.out.println(h.getDuracion());
            }
        });
        
        System.out.println("------------------");
    }

    public void mayorMenor() {
        Collections.sort(peliculaList, Pelicula.compararDuracion.reversed());

        peliculaList.forEach((h) -> {
            System.out.println(h.getDuracion());
        });
        
        System.out.println("------------------");
    }

    public void menorMayor() {
        Collections.sort(peliculaList, Pelicula.compararDuracion);

        peliculaList.forEach((h) -> {
            System.out.println(h.getDuracion());
        });
        System.out.println("------------------");
    }

    public void tituloAlfabeticamente() {

        Collections.sort(peliculaList, Pelicula.compararTitulo);
        peliculaList.forEach((h) -> {
            System.out.println(h.getTitulo());
        });
        System.out.println("------------------");
    }
    

    public void directorAlfabeticamente() {
        Collections.sort(peliculaList, Pelicula.compararDirector);
        
        peliculaList.forEach((h) -> {
            System.out.println(h.getDirector());
        });
    }
}
