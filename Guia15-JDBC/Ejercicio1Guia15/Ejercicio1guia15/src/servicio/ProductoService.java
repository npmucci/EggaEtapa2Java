package servicio;

import entidades.Producto;
import persistencia.FabricanteDAO;
import persistencia.ProductoDAO;
import java.util.Scanner;

public class ProductoService {

    ProductoDAO prod = new ProductoDAO();
    FabricanteDAO fab = new FabricanteDAO();
    Scanner leer = new Scanner(System.in);

    public void todoProductos() {
        try {
            prod.productoTodos();
        } catch (Exception e) {
            System.out.println("Error al listar todos los productos: " + e.getMessage());
        }
    }

    public void listarNombreYPrecioDeProductos() {
        try {
            prod.productoNombrePrecio();
        } catch (Exception e) {
            System.out.println("Error al listar nombres y precios de productos: " + e.getMessage());
        }
    }

    public void listarProductosEnRangoDePrecio() {
        try {
            prod.productoPrecioEntre();
        } catch (Exception e) {
            System.out.println("Error al listar productos en rango de precios: " + e.getMessage());
        }
    }

    public void listarPortatiles() {
        try {
            prod.productoPortatil();
        } catch (Exception e) {
            System.out.println("Error al listar portátiles: " + e.getMessage());
        }
    }

    public void listarProductoMasBarato() {
        try {
            prod.productoBarato();
        } catch (Exception e) {
            System.out.println("Error al listar producto más barato: " + e.getMessage());
        }
    }

    public void insertarProductos() {
        try {
            System.out.println("Ingrese el nombre del producto");
            String nombre = leer.nextLine();

            System.out.println("Ingrese el precio del producto");
            double precio = leer.nextDouble();

            leer.nextLine(); // Consumir el carácter de nueva línea pendiente

            System.out.println("Ingrese el código del fabricante");
            fab.fabricanteSeleccionar();
            int codigo = leer.nextInt();

            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(codigo);
            prod.productoInsertar(producto);

        } catch (Exception e) {
            System.out.println("Error al insertar el producto: " + e.getMessage());
        }
    }

    public void modificarProductos() {
        try {
            leer.nextLine(); // Consumir el carácter de nueva línea pendiente

            System.out.println("Ingrese el nombre del producto a modificar");
            String nombreModificar = leer.nextLine();

            System.out.println("Ingrese el nombre del nuevo producto");
            String nombre = leer.nextLine();

            System.out.println("Ingrese el precio del nuevo producto");
            double precio = leer.nextDouble();

            leer.nextLine(); // Consumir el carácter de nueva línea pendiente

            System.out.println("Ingrese el código del fabricante del nuevo producto");
            fab.fabricanteSeleccionar();
            int fabricante = leer.nextInt();

            Producto producto = new Producto();
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigoFabricante(fabricante);
            prod.productoModificar(producto, nombreModificar);
        } catch (Exception e) {
            System.out.println("Error al modificar el producto: " + e.getMessage());
        }
    }

    // Cierre del recurso Scanner
    public void cerrarScanner() {
        leer.close();
    }
}
