package Main;

import Entidades.Raices;
import Servicios.RaicesServicios;

public class Main {
    public static void main(String[] args) {
        Raices prueba1 = new Raices(1,2,1);
        RaicesServicios servicios = new RaicesServicios();
        servicios.calcular(prueba1);
    }
}