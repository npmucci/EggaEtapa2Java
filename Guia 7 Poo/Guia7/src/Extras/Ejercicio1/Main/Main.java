package Extras.Ejercicio1.Main;

import Extras.Ejercicio1.Entidad.Cancion;

public class Main {
    public static void main(String[] args) {
        Cancion song = new Cancion();

        song.setAutor("rodrigo");
        System.out.println("El autor es: " + song.getAutor());


    }
}
