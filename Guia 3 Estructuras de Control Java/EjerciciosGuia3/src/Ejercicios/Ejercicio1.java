package Ejercicios;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/*
1.	Crear un programa que dado un número determine si es par o impar.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un número");
        int num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El número ingresado es par");
        }else{
            System.out.println("El número ingresado es impar");
        }
    }
}
