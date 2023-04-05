package Ejercicios;

import java.util.Scanner;

/*
7.	Realizar un programa que simule el funcionamiento de un dispositivo RS232,
 este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben
 llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo,
 el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia
distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String fde = "&&&&";
        String frase = "";
        int sumaCorrecto = 0;
        int sumaIncorrecto = 0;


        do{
            System.out.println("Ingrese una frase");
            frase = leer.nextLine();
            if (frase.length()==5 && frase.substring(0,1).equalsIgnoreCase("x") && frase.substring(4,5).equalsIgnoreCase("o") ){
                sumaCorrecto++;
            }else{
                sumaIncorrecto++;
            }

        }while(frase.equalsIgnoreCase(fde)== false);

        System.out.println("La cantidad de frases ingresadas de forma correcta es: " + sumaCorrecto);
        System.out.printf("La cantidad de frases ingresadas de forma incorrecta es :" + (sumaIncorrecto -1));


    }

}
