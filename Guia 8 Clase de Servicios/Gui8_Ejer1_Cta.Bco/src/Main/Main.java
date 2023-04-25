package Main;

import Entidades.CuentaBancaria;
import Servicio.CuentaBancariaServicio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // CREO UN NUEVO OBJETO SERVICIO PARA CONECTARME CON LA CLASE SERVICIOS
        CuentaBancariaServicio servicios = new CuentaBancariaServicio();

        /*
        CREO UN NUEVO OBJETO DEL TIPO CUENTA BANCARIA Y LO IGUALO AL RETORNO QUE ME DA EL METODO CREAR CUENTA
        DE LA CLASE SERVICIO. PARA PODER ACCEDER AL METODO CREAR CUENTA, USO EL OBJETO CREADO EN LA LINEA 8
        -Si utilize el primer metodo para crear la cuenta, el retorno me devuelve un objeto ya creado con lo 3 parametros.
        -Si utilize el segundo metodo, el retorno me devuelve la creacion de un objeto(pero no el objeto ya creado)
         */
        CuentaBancaria cuenta1 = servicios.crearCuenta();
        int respuesta;
        String opcion;

        do{
            opcion =JOptionPane.showInputDialog( "1-Ingresar Dinero \n"+
                    "2-Extraer\n"+
                    "3-Extración Rápida \n"+
                    "4-Mostrar Saldo \n"+
                    "5-Mostrar Datos \n");
            switch (opcion){
                case "1": servicios.ingresar(cuenta1);
                    break;
                case "2": servicios.retirar(cuenta1);
                    break;
                case "3": servicios.extraccionRapida(cuenta1);
                    break;
                case "4": servicios.consultarSaldo(cuenta1);
                    break;
                case "5": servicios.mostrarDatos(cuenta1);
                    break;
                default: JOptionPane.showMessageDialog(null, "La opcion ingresada es incorrecta");

            }
            respuesta =JOptionPane.showConfirmDialog(null, "¿Desea salir","SELECCIONE LA OPCION",JOptionPane.YES_NO_OPTION);

        } while(respuesta != 0);

    }
}