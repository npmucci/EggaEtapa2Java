package main;

import servicios.PeliculaServicio;

public class Main {
    public static void main(String[] args) {

        PeliculaServicio servicio1 = new PeliculaServicio();
        servicio1.cargarPelicula();
        servicio1.mostrarPelicula();
        servicio1.duracionMasUnaHora();
        servicio1.duracionMenor();
        servicio1.duracionMayor();
        servicio1.directorAlfabeticamente();
        servicio1.tituloAlfabeticamente();

    }


}