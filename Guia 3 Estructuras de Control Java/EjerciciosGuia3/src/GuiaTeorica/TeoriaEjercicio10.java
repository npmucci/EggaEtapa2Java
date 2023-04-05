package GuiaTeorica;

import java.util.Scanner;

/*Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
*/
public class TeoriaEjercicio10 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; 4 > i; i++) {
            System.out.println("");
            System.out.println("Ingrese un número entre 1 y 20");
            int num = leer.nextInt();
            while (num < 1 || num > 20) {
                System.out.println("El número ingresado no esta comprendido entre el rango permitido,");
                System.out.println("Ingrese un número entre 1 y 20");
                num = leer.nextInt();
            }
            System.out.print(num);
            for (int j = 0; j <= num; j++) {
                System.out.print("*");

            }
        }
    }
}
