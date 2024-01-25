package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDao;

public class ProductoServicio {
// ponemos como atributo de la clase producto un objeto  del tipo ProductoDAO, 
//para establecer la relación entre ambas clases

    private ProductoDao dao;

//Modificacmos el costructor de la clase producto servicio, para que cada vez
//que se instancie la clase ProductoServicio se cree un objeto del tipo Dao y se puedan
//acceder a sus metodos  
    public ProductoServicio() {
        this.dao = new ProductoDao();
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void MenuPrincipal() throws Exception {
        int opcion;
        do {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Listar todos los productos");
            System.out.println("2. Listar nombres y precios de los productos");
            System.out.println("3. Listar productos por rango de precio");
            System.out.println("4. Buscar y listar portátiles");
            System.out.println("5. Listar nombre y precio del producto más barato");
            System.out.println("6. Ingresar un producto");
            System.out.println("7. Ingresar un fabricante");
            System.out.println("8. Editar un producto");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    listaProducto();
                    break;
                case 2:
                    listaNombresYPrecios();
                    break;
                case 3:
                    listaPorPrecio();
                    break;
                case 4:
                    buscarPortatiles();
                    break;
                case 5:
                    productoMasBarato();
                    break;
                case 6:
                    ingresarProducto();
                    break;
                case 7:
                    FabricanteServicio sf = new FabricanteServicio();
                    sf.ingresarFabricante();
                    break;
                case 8:
                    modificarProducto();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
    }

    public void listaProducto() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductos();

            for (Producto producto : productos) {
                System.out.println("Código: " + producto.getId());
                System.out.println("Nombre: " + producto.getNombre());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Código de fabricante: " + producto.getCodigoFabricante());
                System.out.println("----------------------");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listaNombresYPrecios() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductos();
            System.out.println("=== Nombres y precios de los productos ===");
            for (Producto producto : productos) {
                System.out.println("Nombre: " + producto.getNombre() + "\n"
                        + "Precio: " + producto.getPrecio() + "\n");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void listaPorPrecio() throws Exception {
        try {
            Collection<Producto> productos = dao.productosOrdenPrecio();
            System.out.println("=== Nombres y precios de los productos ===");
            for (Producto producto : productos) {
                System.out.println("Nombre: " + producto.getNombre() + "\n"
                        + "Precio: " + producto.getPrecio() + "\n");
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void buscarPortatiles() throws Exception {
        try {
            Collection<Producto> portatiles = dao.buscarPortatiles();

            System.out.println("=== Portátiles ===");
            for (Producto producto : portatiles) {
                System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void productoMasBarato() throws Exception {
        try {
            Producto productoMasBarato = dao.obtenerProductoMasBarato();
            if (productoMasBarato != null) {
                System.out.println("=== Producto más barato ===");
                System.out.println("Nombre: " + productoMasBarato.getNombre() + ", Precio: " + productoMasBarato.getPrecio());
            } else {
                System.out.println("No hay productos disponibles.");
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void ingresarProducto() throws Exception {
        try {
            Producto producto = new Producto();
            System.out.println("Ingrese el nombre del producto");
            producto.setNombre(leer.next());
            System.out.println("Ingrese el precio del producto");
            producto.setPrecio(leer.nextDouble());
            System.out.println("Ingrese el codigo del fabricante");
            producto.setCodigoFabricante(leer.nextInt());

            dao.guardarProducto(producto);

        } catch (Exception e) {
            throw e;
        }
    }

    public void modificarProducto() throws Exception {
    String eleccion;
    try {
       
        System.out.println("Ingrese el Id del producto a modificar");
        //llamamos al metodo buscar producto, para que busque el producto por id
        // nos devuelva el producto, y despues modificamos los valores de ese producto.
        Producto productoModificar = dao.buscarProductoPorId(leer.nextInt());
        System.out.println("Ingrese la opción:");
        System.out.println("A - Modificar Nombre");
        System.out.println("B - Modificar Precio");
        System.out.println("C - Modificar Código de Fabricante");
        eleccion = leer.next().toUpperCase();
        switch (eleccion) {
            case "A":
                System.out.println("Ingrese el nuevo nombre del producto");
                productoModificar.setNombre(leer.next());
                dao.modificarProducto(productoModificar);
                System.out.println("El nombre del producto ha sido modificado exitosamente");
                break;
            case "B":
                System.out.println("Ingrese el nuevo precio del producto");
                productoModificar.setPrecio(leer.nextDouble());
                dao.modificarProducto(productoModificar);
                System.out.println("El precio del producto ha sido modificado exitosamente");
                break;
            case "C":
                System.out.println("Ingrese el nuevo código de fabricante");
                productoModificar.setCodigoFabricante(leer.nextInt());
                dao.modificarProducto(productoModificar);
                System.out.println("El código de fabricante del producto ha sido modificado exitosamente");
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");
        }
    } catch (Exception e) {
        throw e;
    }
}


}
