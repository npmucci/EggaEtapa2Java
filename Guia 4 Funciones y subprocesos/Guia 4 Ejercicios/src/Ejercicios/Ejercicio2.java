/*
2.	Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas
 ingresadas por teclado e indique si son mayores o menores de edad.
 Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y
 frenar cuando el usuario ingrese la palabra “No”.
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int n= 10;
        datos(n);




    }

    public static void datos(int n) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "";

        for (int i = 0; i < n; i++) {
                    System.out.println("Ingrese nombre");
                    String nombre = leer.nextLine();
                    System.out.println("Ingrese edad");
                    int edad = leer.nextInt();
                    if (edad > 18) {
                        System.out.println(nombre + " es mayor de edad");
                    } else {
                        System.out.println(nombre + "es menor de edad");
                    }
                    System.out.println("¿Desea seguir mostrando personas?si/no");
                    respuesta = leer.next();
                    if(respuesta.equalsIgnoreCase("no")){
                        break;
                    } else{
                        continue;
                    }

            }

    }

}
