package Extras.Ejercicio3.Entidad;

import javax.swing.*;
import java.util.Scanner;

/*
3. Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
public class Juego {
    private String jugador1;
    private String jugador2;
    private int numMisterioso;
    private int numPropuesto;
    private int intentos;

    private int ganador1;
    private int ganador2;


    // metodo constructor vacio
    public Juego() {
    }
    //metodo constructor con parametros

    public Juego(String jugador1, String jugador2, int numMisterioso, int numPropuesto, int intentos, int ganador1, int ganador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.numMisterioso = numMisterioso;
        this.numPropuesto = numPropuesto;
        this.intentos = intentos;
        this.ganador1 = ganador1=0;
        this.ganador2 = ganador2=0;
    }


    //metodos getters y seteers

    public String getJugador1() {
        return jugador1;
    }

    public void setJugador1(String jugador1) {
        this.jugador1 = jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public void setJugador2(String jugador2) {
        this.jugador2 = jugador2;
    }

    public int getNumMisterioso() {
        return numMisterioso;
    }

    public void setNumMisterioso(int numMisterioso) {
        this.numMisterioso = numMisterioso;
    }

    public int getNumPropuesto() {
        return numPropuesto;
    }

    public void setNumPropuesto(int numPropuesto) {
        this.numPropuesto = numPropuesto;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getGanador1() {
        return ganador1;
    }

    public void setGanador1(int ganador1) {
        this.ganador1 = ganador1;
    }

    public int getGanador2() {
        return ganador2;
    }

    public void setGanador2(int ganador2) {
        this.ganador2 = ganador2;
    }


    //metodos de la clase

    public void iniciarJuego(){
        Scanner leer = new Scanner(System.in);
        //pido los datos iniciales
        this.jugador1 = JOptionPane.showInputDialog("Ingrese el nombre del primer jugador");
        this.jugador2 = JOptionPane.showInputDialog("Ingrese el nombre del segundo jugador");



        String respuesta = JOptionPane.showInputDialog("quieren jugar a la adivinanza de números?");

        //consulto si quieren jugar  y segun la respuesta inicia el juego

        while( respuesta.equalsIgnoreCase("si")){
        this.numMisterioso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a adivinar que sea mayor a 0"));
        while (this.numMisterioso <=0){
            this.numMisterioso = Integer.parseInt(JOptionPane.showInputDialog("El número ingresado no cumple los requisitos, ingrese otro número"));
        } // validacion que el numero no sea negativo

        this.intentos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de intentos posibles"));
        while (this.intentos <1){
            this.intentos = Integer.parseInt(JOptionPane.showInputDialog("El número de intentos tiene que ser mayor a 1, ingrese nuevamente"));
        } // validacion de que por lo menos tenga un intento

            System.out.println(this.jugador2 +"¿Cuál es el número que eligió " + this.jugador1 + "?");
            this.numPropuesto =Integer.parseInt(JOptionPane.showInputDialog(this.jugador2 +"¿Cuál es el número que eligió " + this.jugador1 + "?"));
            this.intentos--;
            // compara los numeros y da las pistas hasta que se terminene los intentos o se adivine el numero
        do {
            if (this.numPropuesto == this.numMisterioso){
                System.out.println("Felicitaciones! adivinaste el número!");
                ganador2++;
                break;
            } else if (this.numPropuesto>this.numMisterioso) {
                numPropuesto = Integer.parseInt(JOptionPane.showInputDialog("El número que tenés que adivinar es mas chico, ingresa otro"));
                this.intentos--;

            } else if (this.numPropuesto < this.numMisterioso){
                numPropuesto = Integer.parseInt(JOptionPane.showInputDialog("El número que tenés que adivinar es mas grande, ingresa otro"));
                this.intentos--;
            }

        }while(this.intentos > 0 );
        this.ganador1 ++; // si se terminan los intentos gana el juador uno
        if (this.ganador2>0){
            JOptionPane.showMessageDialog(null, this.jugador2 + " adivinó el número en " + this.intentos + " intentos y ganó esta partida");

        }else {
            JOptionPane.showMessageDialog(null,"Se terminaron los intentos, " +this.jugador1+ " ganó esta partida");
        }

        respuesta = JOptionPane.showInputDialog(" Quieren seguir jugando?"); // vuelvo a preguntar si quieren jugar y reutilizo la variable respuesta
        if (respuesta.equalsIgnoreCase("no")){ // si la respuesta es no termina el juego, si es si, como se usa la misma variable respuesta se vuelve a la linea 116
            JOptionPane.showMessageDialog(null,this.jugador2 + " ganó " + this.ganador2 + " veces.");
            JOptionPane.showMessageDialog(null,this.jugador1 + " ganó " + this.ganador1 + " veces.");


        }


        }

    }
}
