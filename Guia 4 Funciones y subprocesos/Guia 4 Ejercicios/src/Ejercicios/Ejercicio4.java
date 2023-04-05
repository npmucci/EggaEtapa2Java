/*
4.	Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por
parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
 ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */

package Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número y el sysitema determinará si es primo o no");
        int num = leer.nextInt();
        boolean primo = esPrimo(num);
        System.out.println(primo);
    }

    public static boolean esPrimo(int num) {
        int cont = 0;
        for(int i = 1; i<num;i++){
            if(num % i == 0){
                cont +=1;
            }
        }
    return cont<= 2;
    }
}
