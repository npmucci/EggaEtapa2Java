import entidades.Juego;
import entidades.Jugador;
import entidades.RevolverAgua;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> listaJugadores = new ArrayList();
        Juego juego = new Juego();
        juego.llenarJuego(listaJugadores, new RevolverAgua());
        juego.ronda();

    }

}