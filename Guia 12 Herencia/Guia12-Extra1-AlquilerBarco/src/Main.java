import entidades.Barco;
import entidades.BarcoMotor;
import entidades.Velero;
import entidades.Yate;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");




        int opcion;
        do {

            System.out.println("----------------------------------");
            System.out.println("Bienvenidos al Muelle de San Blas");
            System.out.println("Ingrese la opcion\n"
                    + "1-Alquilar un Barco a Motor\n"
                    + "2-Alquilar un Velero \n"
                    + "3-Alquilar un Yate\n"
                    + "4-Salir");
            System.out.println("----------------------------------");
            opcion = leer.nextInt();


            switch (opcion) {
                case 1:
                    Barco barcoMotor = new BarcoMotor(100, "ABC123", 300, 1985);
                    barcoMotor.alquiler();
                    break;
                case 2:
                    Barco velero = new Velero(2, "ABC789", 200, 2010);
                    velero.alquiler();
                    break;
                case 3:
                    Barco yate = new Yate(200, "ABC456", 5, 400, 2023);
                    yate.alquiler();
                    break;
                case 4:
                    System.out.println("Muchas gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta");
                    break;

            }
            System.out.println("Presione Enter para continuar...");
            leer.next();
        } while (opcion != 4);
    }
}
