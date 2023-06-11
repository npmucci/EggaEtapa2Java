package servicios;

import entidades.CantanteFamoso;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class CantanteFamosoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //metodo para crear un objeto del tipo CantanteFamoso y agregarlo al ArrayList
    public void agregarCantante(ArrayList<CantanteFamoso> listaCantantes){
        System.out.println("Ingrese el nombre del cantante");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el nombre del disco mas vendido del cantante");
        String disco = leer.nextLine();

        listaCantantes.add(new CantanteFamoso(nombre,disco));
    }

    // metodo para mostrar todos los cantantes
    public void mostrarCantante(ArrayList<CantanteFamoso> listaCantantes){

        for (CantanteFamoso listaCantante : listaCantantes) {
            System.out.println(listaCantantes);

        }
    }


    //metodo para eliminar cantante
    public void eliminarCantante(ArrayList<CantanteFamoso> listaCantantes){
        System.out.println("Ingrese el nombre del cantente a eliminar");
        String cantante = leer.nextLine();

        Iterator<CantanteFamoso> it = listaCantantes.iterator();
        while(it.hasNext()){
            if(it.next().getNombre().equalsIgnoreCase(cantante)){
                it.remove();
            }
        }
    }
}
