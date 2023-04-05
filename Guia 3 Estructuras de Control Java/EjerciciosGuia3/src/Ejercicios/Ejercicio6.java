package Ejercicios;

import java.util.Scanner;

/*
6.	Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y
el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que,
si el usuario selecciona la opción 5, en vez de salir del programa directamente,
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir
del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, c
aso contrario se vuelve a mostrar el menú.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = (num1+num2);
        int resta = (num1-num2);
        int multiplicacion = (num1*num2);
        float division = (num1/num2);
        String rta = "";



do {
    System.out.println("1-Sumar");
    System.out.println("2-Restar");
    System.out.println("3-Multiplicar");
    System.out.println("4-Dividir");
    System.out.println("5-Salir");
    System.out.println("Elija una opción");
    int opcion = leer.nextInt();

    switch (opcion){
        case 1:
            System.out.println("Usted eligió sumar los números");
            System.out.println("El resultado de la suma es:" + suma);
            break;
        case 2:
            System.out.println("Usted eligió restar los números");
            System.out.println("El resultado de la resta es:" +resta);
            break;
        case 3:
            System.out.println("Usted eligió multiplicar los números");
            System.out.println("El resultado de la multiplicación es:" + multiplicacion );
            break;
        case 4:
            System.out.println("Usted eligió dividir los números");
            System.out.println("El resultado de la multiplicación es:" + division);
            break;
        case 5:
            System.out.println("¿Está seguro que desea salir del programa? S/N");
            rta = leer.next();
            break;

    }
}while(rta.equalsIgnoreCase("N"));






    }
}
