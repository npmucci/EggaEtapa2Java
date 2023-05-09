package main;

import entidades.Cadena;
import servicios.CadenaServicio;

public class Main {
    public static void main(String[] args) {

        CadenaServicio sc = new CadenaServicio();
        Cadena cadena =  sc.crearCadena(); // le asigno a cadena la creacion de un objeto, y asi creo el objeto cadena
        //sc.mostrarVocales(cadena);
        //sc.invertirFrase(cadena);
        //sc.vecesRepetido(cadena);
       // sc.compararLongitud(cadena);
        //sc.unirFrases(cadena);
        //sc.reemplazar(cadena);
        sc.contiene(cadena);





    }
}