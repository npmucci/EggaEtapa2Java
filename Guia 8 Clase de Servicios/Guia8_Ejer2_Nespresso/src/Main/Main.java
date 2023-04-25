package Main;

import Entidades.Cafetera;
import Servicios.CafeteraServicio;

public class Main {
    public static void main(String[] args) {
        Cafetera cafetera1 = new Cafetera(1000,0);
        CafeteraServicio servicio = new CafeteraServicio();
        servicio.agregarCafe(cafetera1);
        servicio.servirTaza(cafetera1);

    }
}