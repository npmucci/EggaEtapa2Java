package main;

import entidad.Juego;
import servicios.JuegoServicio;

public class Main {
    public static void main(String[] args) {
        Juego juego1 = new Juego();
        JuegoServicio sc1 = new JuegoServicio();
        sc1.adivinarMes(juego1);

    }
}
