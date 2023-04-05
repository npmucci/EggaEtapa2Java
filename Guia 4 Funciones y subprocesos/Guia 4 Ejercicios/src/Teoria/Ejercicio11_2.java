/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y
terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
(incluyendo a las vocales acentuadas) se mantienen sin cambios.
a
e
i
o
u
@
#
$
%
*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */

package Teoria;

import java.util.Scanner;

public class Ejercicio11_2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String frase;
        System.out.println("Ingrese una frase: ");
        frase=leer.nextLine();
        System.out.println(codifica(frase));

    }

    public static String codifica (String cadena){
        StringBuilder otraCadena = new StringBuilder(cadena);
        char caracter,resultado=' ';
        for (int i = 0; i < cadena.length(); i++) {
            caracter = cadena.charAt(i);
            switch (caracter) {
                case 'a':
                case 'A':
                    resultado = '@';
                    break;
                case 'e':
                case 'E':
                    resultado= '#';
                    break;
                case 'i':
                case 'I':
                    resultado = '*';
                    break;
                case 'o':
                case 'O':
                    resultado = '$';
                    break;
                case 'u':
                case 'U':
                    resultado = '%';
                    break;
                default: resultado=caracter;
            } //del switch
            otraCadena.setCharAt(i, resultado);
        }// del for
        cadena=otraCadena.toString();
        return (cadena);
    }
}// del metodo

