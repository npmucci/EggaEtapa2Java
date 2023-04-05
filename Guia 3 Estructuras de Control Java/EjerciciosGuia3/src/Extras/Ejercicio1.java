package Extras;

import java.util.Scanner;

/*
1.	Dado un tiempo en minutos, calcular su equivalente en días y horas.
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los minutos y el programa le calculara los dias y las horas");
        int minutos = leer.nextInt();
        int dias = ((minutos / 60) / 24);
        int horas =   (minutos/60) - (dias*24);

        System.out.println("Los minutos ingresados :" + minutos + " se corresponden con: " + dias + " dias y " +horas +" horas");


    }
}
