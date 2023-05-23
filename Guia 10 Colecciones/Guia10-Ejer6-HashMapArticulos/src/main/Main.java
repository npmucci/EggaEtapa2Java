package main;

import servicio.ProductoServicio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        ProductoServicio sc = new ProductoServicio();
        int opcion= 0;

        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog(
                    "***MENU PRINCIPAL***\n"
                            + "1. Introducion Producto\n"
                            + "2. Modificar Precio\n"
                            + "3. Eliminar Producto\n"
                            + "4. Mostrar Listado de Productos\n"
                            + "5. SALIR\n"
                            + "ELIJA SU OPCION :)"));

            switch(opcion){
                case 1:
                    sc.intoducirElemento();
                    JOptionPane.showMessageDialog(null, "Agregando Producto...");
                    break;
                case 2:
                    sc.modificarPrecio();

                    JOptionPane.showMessageDialog(null, "Modificando Precio...");
                    break;
                case 3:
                    sc.eliminarProducto();
                    JOptionPane.showMessageDialog(null, "Eliminando el producto seleccionado");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Lista de productos");
                    sc.mostrarProducto();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Usted esta saliendo del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion Invalida");
                    break;

            }

        }while(opcion!=5);


    }
}
