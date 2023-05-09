package main;

import servicio.FechaService;

import javax.swing.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        FechaService sc = new FechaService();
        Date nacimiento = sc.fechaNacimiento();
        Date hoy = sc.fechaActual();
        JOptionPane.showMessageDialog(null, "Tu edad es : " +sc.Edad(nacimiento, hoy) );

    }
}