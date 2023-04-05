package Extras;

import java.util.Scanner;



/*
5.	Una obra social tiene tres clases de socios:
○	Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
○	Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos
 que los socios del tipo A.
○	Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que
represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a pagar
 por dicho socio

 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tipo de socio: A, B, C ");
        char letra = leer.next().charAt(0);

        System.out.println("Ingrese el monto del tratamiento");
        int costo = leer.nextInt();

        switch (letra){
            case 'A':
                costo *=0.5;
                System.out.println( "Para su categoria de socio: " + letra + " el costo final de su tratamiento es : " + costo);
                break;
            case 'B':
                costo *=0.65;
                System.out.println( "Para su categoria de socio: " + letra + " el costo final de su tratamiento es : " + costo);
                break;
            case 'C':
                System.out.println( "Para su categoria de socio: " + letra + " el costo final de su tratamiento es : " + costo);
                break;



        }

    }
}
