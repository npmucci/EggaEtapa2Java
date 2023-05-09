package servicios;

import entidad.Juego;

import javax.swing.*;

public class JuegoServicio {
        public void adivinarMes(Juego j1) {
            String eleccion = JOptionPane.showInputDialog("Juguemos un juego \n" +
                    "Intenta adivinar el mes secreto");

            while (!eleccion.equalsIgnoreCase(j1.getMesSecreto())) {
                eleccion = JOptionPane.showInputDialog("El mes ingresado es incorrecto. \n" +
                        "Ingrese otro mes:");
            }
            JOptionPane.showMessageDialog(null, "Acertaste!!!!\n" +
                    "El mes secreto era: " + j1.getMesSecreto());

        }
}


