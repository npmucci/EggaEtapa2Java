package main;

import entidades.Alumno;
import servicios.AlumnosServicio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnosServicio servicio1 = new AlumnosServicio();
        ArrayList<Alumno> alumnos = servicio1.curso();

        System.out.print("Ingrese un nombre");
        String nombre = leer.next();

        for (Alumno alumno: alumnos) {
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                System.out.print("El promedio del alumno " + nombre +" es:" + servicio1.notaFinal(alumno.getNotas()));
            }
        }


    }
}