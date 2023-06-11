package main;

import entidades.CantanteFamoso;
import servicios.CantanteFamosoServicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        CantanteFamosoServicio sc = new CantanteFamosoServicio();

        ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();

        //cargar cantantes
        listaCantantes.add(new CantanteFamoso("Alejandro Sanz", "Más"));
        listaCantantes.add(new CantanteFamoso("Bon Jovi", "Slippery when wet"));
        listaCantantes.add(new CantanteFamoso("Michael Jackson", "Thriller"));
        listaCantantes.add(new CantanteFamoso("Amy Winehouse", "Back to Black"));
        listaCantantes.add(new CantanteFamoso("Madonna", "Like a Virgin"));

        // mostrar cantantes
        for (CantanteFamoso listaCantante : listaCantantes) {
            System.out.println(listaCantante);
        }
        System.out.println("-----------------------------------------");
        //menu de opciones
        int opcion  =0;
        do {
            System.out.println("Elija una opcion del menu");
            System.out.println("Menu Pricipal \n"
                    + "1- Agregar un cantante\n"
                    + "2-Mostrar todos los cantantes\n"
                    + "3-Eliminar un cantante\n"
                    + "4-Salir");
            opcion=leer.nextInt();

            switch(opcion){
                case 1: sc.agregarCantante(listaCantantes);
                    break;
                case 2: sc.mostrarCantante(listaCantantes);
                    break;
                case 3: sc.eliminarCantante(listaCantantes);
                    break;

                case 4:
                    System.out.println("Usted está saliendo del programa");
                    break;
                default:
                    System.out.println("La opcion ingresada ese incorrecta");

            }
        } while (opcion!=4);

        System.out.println("Lista de cantantes");
        for (CantanteFamoso listaCantante : listaCantantes) {
            System.out.println(listaCantante);
        }
    }
    }
