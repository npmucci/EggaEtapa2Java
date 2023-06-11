import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("El rey leon", 2.5, 12, "juan", 50.30);
        Cine sala1 = new Cine(pelicula1,8,6);

        ArrayList<Espectador> listaEspectadores = new ArrayList<>();




        for (int i = 0; i<48; i++){
            listaEspectadores.add(new Espectador("Natalia",18, 100.50));
            sala1.ubicarPersonas(listaEspectadores.get(i),pelicula1);
        }


        sala1.mostrarSala();

    }
}