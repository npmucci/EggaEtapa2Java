package main;

import servicios.PerroServicio;

public class Main {
    public static void main(String[] args) {

        PerroServicio servicio1 = new PerroServicio();
        servicio1.crearPerro();
        servicio1.borrarPerro();
    }
}