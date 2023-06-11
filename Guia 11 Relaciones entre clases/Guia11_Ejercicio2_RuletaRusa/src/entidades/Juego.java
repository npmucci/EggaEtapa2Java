package entidades;

/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Metodos
Metodos:
    • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
*/


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    private ArrayList<Jugador> jugadores;
    private RevolverAgua revolver;

    public void llenarJuego(ArrayList<Jugador> jugadores, RevolverAgua r) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de jugadores (entre 1 y 6): ");
        int cantidadJugadores = scanner.nextInt();
        if (cantidadJugadores < 1 || cantidadJugadores > 6) {
            System.out.println("Cantidad de jugadores inválida. Se utilizarán 6 jugadores por defecto.");
            cantidadJugadores = 6;
        }

        for (int i = 1; i <= cantidadJugadores; i++) {
            jugadores.add(new Jugador(i));
        }
        r.llenarRevolver();
        this.jugadores = jugadores;
        this.revolver = r;

    }

    public void ronda() {
        Random random = new Random();
        int index = random.nextInt(jugadores.size()); // Seleccionar un índice aleatorio
        Jugador jugador = jugadores.get(index);

        System.out.println(" El " + jugador.getNombre() + " inicia el juego");
        boolean alguienSeMojado = false;
        while (!alguienSeMojado) {

            if (jugador.disparo(revolver)) {
                System.out.println("Jugador " + (index + 1) + " se ha mojado. ¡Fin del juego!");
                alguienSeMojado = true;
            } else {
                System.out.println("Jugador " + (index + 1) + " se ha salvado.");
            }

            index++;
            if (index >= jugadores.size()) {
                index = 0;
            }
        }
    }
    }




