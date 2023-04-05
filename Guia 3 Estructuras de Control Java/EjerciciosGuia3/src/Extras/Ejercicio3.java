package Extras;

import java.util.Scanner;

/*
3.	Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una sola letra");
        String letra = leer.next();

        boolean caracter = "a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra);

        if (caracter) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada es una consonante");
        }
    }
}
