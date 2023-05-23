package servicio;

import entidades.Producto;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class ProductoServicio {
    HashMap<String, Double> listaProductos = new HashMap<>();

    public void intoducirElemento() {
        Producto producto = new Producto();
        producto.setNombre (JOptionPane.showInputDialog("Ingresa el nombre del articulo"));
        producto.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del articulo")));
        listaProductos.put(producto.getNombre(), producto.getPrecio());
    }

    public void modificarPrecio() {

        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del articulo");

        for (Map.Entry<String, Double> producto : listaProductos.entrySet()) {
            if (producto.getKey().equalsIgnoreCase(nombre)) {
                System.out.println("Ingrese el precio nuevo");
                Double precioNuevo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del articulo"));
                listaProductos.put(nombre, precioNuevo);
                break;
            } else {
                System.out.println("El producto ingresado no se encuentra en la lista");
            }
        }
    }

    public void eliminarProducto() {
        String nombre = JOptionPane.showInputDialog("Ingresa el nombre del articulo a eliminar");
        for (Map.Entry<String, Double> producto : listaProductos.entrySet()) {
            if (producto.getKey().equalsIgnoreCase(nombre)) {
                listaProductos.remove(nombre);
                break;
            }
        }
    }

    public void mostrarProducto() {
        StringBuilder lista = new StringBuilder();
        for (Map.Entry<String, Double> producto: listaProductos.entrySet()) {
            //uso el StringBuilder para poder crear un mensaje todo junto por cada itereacion del bucle y asi mostralo con el JOptionPane.
            lista.append("Producto: ").append(producto.getKey()).append(" - Precio : $").append(producto.getValue()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista);
    }
}
