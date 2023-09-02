/*
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package guia12.extra3__alojamiento;

import entidades.Alojamiento;
 import java.util.ArrayList;
import java.util.Scanner;
import servicios.AlojamientoServicio;
import servicios.CampingServicio;
import servicios.HotelesServicio;
import servicios.ResidenciaServicio;
public class Guia12Extra3__Alojamiento {

 
  


    public static void main(String[] args) {
        // Crear lista de alojamientos
        AlojamientoServicio sa1 = new AlojamientoServicio();
        HotelesServicio sh1= new HotelesServicio();
        CampingServicio sc1 = new CampingServicio();
        ResidenciaServicio sr1 = new ResidenciaServicio();
        
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        sa1.crearAlojamientos(alojamientos);

         Scanner scanner = new Scanner(System.in).useDelimiter("\n");
         int opcion;
do{
        // Mostrar menú
        System.out.println("----- Menú de Consultas -----");
        System.out.println("1. Todos los alojamientos");
        System.out.println("2. Todos los hoteles de más caro a más barato");
        System.out.println("3. Todos los campings con restaurante");
        System.out.println("4. Todos las residencias con descuento");
        System.out.println("0. Salir");
        System.out.println("-----------------------------");

        // Leer la opción del usuario
        System.out.print("Ingrese la opción deseada: ");
        opcion = scanner.nextInt();
  System.out.println("");
        // Realizar acciones según la opción seleccionada
        switch (opcion) {
            case 1:
                // Todos los alojamientos
                sa1.mostrarAlojamientos(alojamientos);
                break;
            case 2:
                // Todos los hoteles de más caro a más barato
                sh1.hotelesOrdenados(alojamientos);
                break;
            case 3:
                // Todos los campings con restaurante
                System.out.println("Campings con restaurantes");
                sc1.campingsConRestaurante(alojamientos);
                break;
            case 4:
                // Todos las residencias con descuento
                System.out.println("Residencias con descuento");
               sr1.residenciasConDescuento(alojamientos);
                break;
            case 0:
                // Salir
                System.out.println("¡Hasta luego!");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        
      System.out.println("");
    System.out.println("Para continuar presione enter");
    scanner.next();
            
        
    }while(opcion!=0);
}
}

    

