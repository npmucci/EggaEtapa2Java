package Extras.Ejercicio5.Main;

import Extras.Ejercicio5.Entidad.Empleado;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Josefina", 40, 100000);
        Empleado empleado2 = new Empleado ("Juan", 25,100000);
        empleado1.calcularAumento();
        empleado2.calcularAumento();


    }
}
