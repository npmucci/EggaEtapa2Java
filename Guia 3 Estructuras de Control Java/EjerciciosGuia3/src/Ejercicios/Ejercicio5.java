package Ejercicios;

import javax.swing.plaf.ScrollPaneUI;
import java.util.Scanner;

/*
5.	Escriba un programa en el cual se ingrese un valor límite positivo,
 y a continuación solicite números al usuario hasta que la suma de los números
 introducidos supere el límite inicial.
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num2 = 0;
        int suma = 0;
        int num1;
        do {
            System.out.print("Ingrese un número positivo");
            num1 = leer.nextInt();

        } while (num1 < 0);


        do {
            System.out.println("Ingrese otro número");
            num2 = leer.nextInt();
            suma = (suma + num2);
        } while (suma <= num1);
        System.out.println("La suma de los numeros ingresados: " + suma + " es mayor al valor limite " + num1);

    }
}
