package entidades;
/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.

Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */

import java.util.Random;

public class RevolverAgua {

    private int posicionActual;
    private int posicionAgua;

    public RevolverAgua() {
        this.posicionActual = 0;
        this.posicionAgua = 0;
    }

    public void llenarRevolver() {
        Random random = new Random();
        this.posicionActual = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
        this.posicionAgua = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }

    public void siguienteChorro() {
        if (this.posicionActual == 6) {
            this.posicionActual = 1;
        } else {
            this.posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Revolver de agua: [Posición actual: " + this.posicionActual + ", Posición del agua: " + this.posicionAgua + "]";
    }
}



