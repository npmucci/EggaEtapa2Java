package main;

import entidades.ParDeNumeros;
import servicio.ParDeNumerosServicio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ParDeNumerosServicio sc = new ParDeNumerosServicio();
        ParDeNumeros numeros = new ParDeNumeros();
        sc.mostrarValores(numeros);
        JOptionPane.showMessageDialog(null, " El numero mas grande es : "+
                sc.devolverMayor(numeros));
        sc.calcularPotencia(numeros);
        sc.calcularRaiz(numeros);
    }
}