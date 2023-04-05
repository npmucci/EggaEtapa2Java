package GuiaTeorica;/*Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */

import java.util.Scanner;

public class TeoriaEjercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número entre 1 y 10");
        int nota = leer.nextInt();


        while (nota>10 || nota<1){
            System.out.println("La nota ingresada no es valida, ingrese otra nota ");
            nota = leer.nextInt();
        }
    }

}
