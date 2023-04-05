/*
3.	Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros,
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y
mostrará un mensaje indicando el cambio (void).

El cambio de divisas es:
i.	* 0.86 libras es un 1 €
ii.	* 1.28611 $ es un 1 €
iii.	* 129.852 yenes es un 1 €

 */

package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el monto de euros a convertir");
        int monto = leer.nextInt();
        System.out.println("Ingrese a que moneda desea convertir \n" +
                "1-Libra \n" +
                "2-Dolares\n" +
                "3-Yenes\n");
        int moneda = leer.nextInt();
        convertir(monto,moneda);
    }

    public static void convertir(int monto, int moneda) {
       double libras = (monto*0.86);
        double dolares = (monto * 1.28611);
        double yenes =(monto*129.852);

        switch (moneda){
            case 1:
                System.out.println(monto + " euros, se corresponden con: "  + libras + " libras");
                break;
            case 2:
                System.out.println(monto + " euros, se corresponden con: " +  dolares + " dolares");
                break;
            case 3:
                System.out.println(monto + " euros, se corresponden con: " + yenes + " yenes");
                break;
            default:
                System.out.println("La opcion ingresada no es correcta");
        }
    }
}
