package Main;

import Entidades.Nif;
import Servicios.NifServicios;

public class Main {
    public static void main(String[] args) {
        NifServicios servicio = new NifServicios();
        Nif nif = servicio.crearNif();
        servicio.mostrarNif(nif);

    }
}