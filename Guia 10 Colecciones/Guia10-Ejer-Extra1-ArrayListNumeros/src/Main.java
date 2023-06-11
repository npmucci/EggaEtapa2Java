/*
1.Diseñar un programa que lea una serie de valores numéricos enteros desde 
el teclado y los guarde en un ArrayList de tipo Integer. La lectura de números se 
termina cuando se introduzca el valor -99. Este valor no se guarda en el ArrayList.
A continuación, el programa mostrará por pantalla el número de valores que se han leído, 
su suma y su media(promedio).
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        Integer numero  = leer.nextInt();

        while(numero!= (-99)){
            numeros.add(numero);
            System.out.println("Ingrese otro número/(para salir ingrese -99)/");
            numero = leer.nextInt();
            if (numero==(-99)){
                break;
            }
        }
        //mostrar nuemeros
        for (Integer numero1 : numeros) {
            System.out.print("[" + numero1 +"]");
        }
        //sumar numeros y promerio
        Integer suma =0;

        for (Integer numero1 : numeros) {
            suma+=numero1;
        }
        System.out.println("La suma de los números es :  " + suma);
        System.out.println("EL promedio de los números es :  " + (suma / numeros.size()));
    }

}
