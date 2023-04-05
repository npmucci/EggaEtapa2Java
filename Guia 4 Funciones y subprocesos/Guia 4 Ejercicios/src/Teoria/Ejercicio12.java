/*
Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo,
sino informe que no lo son.
 */
package Teoria;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        esMultiplo(num1,num2);


    }

    private static void esMultiplo(int num1, int num2) {
        if (num1%num2 == 0) {
            System.out.println("Son multiplos");
        } else{
            System.out.println("No son multiplos");
        }
    }
}
