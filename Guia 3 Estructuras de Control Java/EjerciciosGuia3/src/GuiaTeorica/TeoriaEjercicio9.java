package GuiaTeorica;/*Ejercicio 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
El programa deberá calcular y mostrar el resultado de la suma de los números leídos,
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */

import java.util.Scanner;

public class TeoriaEjercicio9 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int i = 0;

        for (i=0;i<20;i++){

            System.out.println("Ingrese un número");
            int num = leer.nextInt();

            if (num >=1){
                suma = (suma + num);
            } else if (num<0) {
                continue;
            } else if (num == 0) {
                break;
            }
        }
        System.out.printf("La suma de los numeros ingresados es :" + suma);


    }
}
