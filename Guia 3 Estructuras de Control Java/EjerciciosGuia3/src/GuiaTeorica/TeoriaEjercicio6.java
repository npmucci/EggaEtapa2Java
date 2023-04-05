package GuiaTeorica;/*Ejercicio 6
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25
 */

import java.util.Scanner;

public class TeoriaEjercicio6 {

     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);

         System.out.println("Ingrese un numero");
         int num1 = leer.nextInt();
         System.out.println("Ingrese otro numero");
         int num2 = leer.nextInt();

         if (num1>25 && num2>25){
             System.out.println("Ambos números son mayores a 25");
         } else if (num1>25) {
             System.out.println("Solo el primer número ingresado es mayor a 25");
         } else if (num2>25) {
             System.out.println("Solo el segundo número ingresado es mayor a 25");
         } else {
             System.out.println("Nimguno de los números ingresados es mayor a 25");
         }


     }
}
