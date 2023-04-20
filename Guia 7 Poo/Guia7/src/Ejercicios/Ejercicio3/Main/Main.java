package Ejercicios.Ejercicio3.Main;

import Ejercicios.Ejercicio3.Entidad.Operacion;

public class Main {
    public static void main(String[] args) {
        Operacion calculo = new Operacion();

        calculo.crearOperacion();
        calculo.sumar();
        calculo.restar();
        calculo.multiplicar();
        calculo.dividir();

    }
}
