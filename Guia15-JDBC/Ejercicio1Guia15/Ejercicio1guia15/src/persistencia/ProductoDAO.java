package persistencia;

import entidades.Producto;
import java.sql.ResultSet;

public class ProductoDAO extends DAO {

    public void productoTodos() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));
            }

        } catch (Exception e) {
            throw e;
        }
    }

    public void productoNombrePrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Producto: " + rs.getString("nombre") + ", Precio: " + rs.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void productoPrecioEntre() throws Exception {
        try {
            String sql = "SELECT nombre FROM producto WHERE precio BETWEEN 120 AND 200";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void productoPortatil() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto WHERE nombre LIKE 'Portatil%'";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre") + ", Precio: " + rs.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void productoBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio LIMIT 1";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString("nombre") + ", Precio: " + rs.getDouble("precio"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void productoInsertar(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("El Producto es nulo (null)");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante) VALUES ('" + producto.getNombre()
                    + "', " + producto.getPrecio() + ", " + producto.getCodigoFabricante() + ")";
            insertarModificarEliminar(sql);

        } catch (Exception e) {
            throw e;
        }
    }

    public void productoModificar(Producto producto, String nombreProducto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("El Producto es nulo (null)");
            }
            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio()
                    + ", codigo_fabricante = " + producto.getCodigoFabricante() + " WHERE nombre = '" + nombreProducto
                    + "';";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
