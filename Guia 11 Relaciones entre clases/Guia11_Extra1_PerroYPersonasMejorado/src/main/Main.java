package main;

import entidades.Perro;
import servicios.ServicioEntidades;

public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro();
        ServicioEntidades sc = new ServicioEntidades();
        sc.crearPerro();
        sc.datosPersona();
        sc.mostrar();
    }
}