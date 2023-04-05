package Ejercicios;

import java.util.Scanner;

/*
8.	Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
****
*  *
*  *
****
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();

        for(int i =0; i<num; i ++){
            System.out.print("*");
        }
        System.out.println("");
        for (int i = 0; i<(num-2); i++){
            System.out.print("*");
            for(int j = 0; j < (num-2);j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }


        for(int i =0; i<num; i ++){
            System.out.print("*");
        }


    }
}
