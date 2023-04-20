package Extras.Ejercicio6.Main;

import Extras.Ejercicio6.Entidad.Rectangulo;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Rectangulo rec1 = new Rectangulo(4,6);
        int area = rec1.area(); //llamo al metodo y guardo el return en una variable

        JOptionPane.showMessageDialog(null, "El area del rectangulo es : " + area);

    }
}
