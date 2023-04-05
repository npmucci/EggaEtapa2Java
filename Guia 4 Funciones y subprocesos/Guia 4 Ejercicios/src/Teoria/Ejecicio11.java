package Teoria;

import java.text.BreakIterator;
import java.util.Scanner;

public class Ejecicio11 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();

        String resultado = conversion(frase);
        System.out.println("La nueva frase es" + resultado);

    }

    private static String conversion(String frase) {
        String nuevaFrase = " ";
        for (int i = 0; i<frase.length(); i++){

            switch (frase.substring(i,i+1)){
                case "a":
                case"A":
                    nuevaFrase = nuevaFrase +"@";
                    break;
                case "e":
                case"E":
                    nuevaFrase = nuevaFrase + "#" ;
                    break;
                case "i":
                case"I":
                    nuevaFrase = nuevaFrase + "$" ;
                    break;
                case "o":
                case"O":
                    nuevaFrase = nuevaFrase + "%";
                    break;
                case "u":
                case"U":
                    nuevaFrase = nuevaFrase +"*";
                    break;
                default:
                    nuevaFrase = nuevaFrase + frase.substring(i,i+1);

            }
        }
        return nuevaFrase;
    }
}
