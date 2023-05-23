package main;

import entidades.Alumno;
import servicios.AlumnoServicio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AlumnoServicio servicio1 = new AlumnoServicio();
        ArrayList<Alumno> listaAlumnos = servicio1.cargarAlumno();
        System.out.println("Ingrese el nombre del alumno que quiere saber el promedio");
        String nombre = leer.next();
        for (Alumno alumno : listaAlumnos) {
            if (nombre.equals(alumno.getNombre())){
                System.out.println("El promedio del alumno es " + servicio1.notafinal(alumno.getNota()) );
            }
        }
    }
}