package Extras.Ejercicio2.Main;

import Extras.Ejercicio2.Entidad.Puntos;

public class Main {
    public static void main(String[] args) {
        Puntos nuevaDistancia = new Puntos();

        nuevaDistancia.crearPuntos();

        System.out.println("La distancia entre los puntos ingresados es : " + nuevaDistancia.distancia());

    }
}
