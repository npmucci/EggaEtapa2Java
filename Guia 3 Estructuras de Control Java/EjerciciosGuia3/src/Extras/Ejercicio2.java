package Extras;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
2.	Declarar cuatro variables de tipo entero A, B, C y D y
asignarle un valor diferente a cada una. A continuación, realizar
las instrucciones necesarias para que: B tome el valor de C, C tome el
valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int A = 5;
        int B = 7;
        int C = 9;
        int D = 11;
        int X = B;
        System.out.println("El valor original de las variables es: A="+A + " B="+B + " C=" + C + " D="+D);

        B=C;
        C=A;
        A=D;
        D=X;
        System.out.println("El valor final de las variables es: A="+A + " B="+B + " C=" + C + " D="+D);
    }

}
