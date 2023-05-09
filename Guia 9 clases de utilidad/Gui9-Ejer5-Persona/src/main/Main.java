package main;

import entidades.Persona;
import servicios.PersonaService;

import javax.swing.*;
import java.util.Date;


public class Main {
    public static void main(String[] args) {

        PersonaService sc = new PersonaService();
        Persona persona1 = sc.crearPersona();
        Date hoy = new Date();
        int edad = sc.Edad(persona1, hoy);
        JOptionPane.showMessageDialog(null, persona1.toString());
        JOptionPane.showMessageDialog(null, sc.mostrarDatos(persona1) +
                "\n Edad : " + edad + " años");


        int edadAComparar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad que desea comparar"));
        if (sc.menorQue(persona1, edadAComparar, hoy)) {
            JOptionPane.showMessageDialog(null, persona1.getNombre() + " Tiene menos edad que la comparada");
        } else {
            JOptionPane.showMessageDialog(null, persona1.getNombre() + " Tiene mas edad que la comparada");

        }
    }
}