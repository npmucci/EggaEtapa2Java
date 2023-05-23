package main;

import servicios.PaisesServicios;

public class Main {
    public static void main(String[] args) {
        PaisesServicios sc = new PaisesServicios();
        sc.cargarPaises();
        sc.mostrarPaises();
        sc.eliminarPais();
    }
}