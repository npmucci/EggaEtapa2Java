/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 *
 * @author usuario
 */
public class ProductoDao extends DAO {

    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                int id = resultado.getInt(1);
                String nombre = resultado.getString(2);
                double precio = resultado.getDouble(3);
                int codigoFabricante = resultado.getInt(4);
                producto = new Producto(id, nombre, precio, codigoFabricante);
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> productosOrdenPrecio() throws Exception {
        try {
            String sql = "SELECT * FROM producto ORDER BY precio";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto.setId(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Collection<Producto> buscarPortatiles() throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%portátil%'";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> portatiles = new ArrayList<>();
            while (resultado.next()) {
                int id = resultado.getInt(1);
                String nombre = resultado.getString(2);
                double precio = resultado.getDouble(3);
                int codigoFabricante = resultado.getInt(4);
                producto = new Producto(id, nombre, precio, codigoFabricante);
                portatiles.add(producto);
            }
            desconectarBase();
            return portatiles;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public Producto obtenerProductoMasBarato() throws Exception {
        try {
            String sql = "SELECT * FROM producto ORDER BY precio ASC LIMIT 1";
            consultarBase(sql);
            Producto producto = null;
            if (resultado.next()) {
                int id = resultado.getInt(1);
                String nombre = resultado.getString(2);
                double precio = resultado.getDouble(3);
                int codigoFabricante = resultado.getInt(4);
                producto = new Producto(id, nombre, precio, codigoFabricante);
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

    public void guardarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto");
            }
            String sql = "INSERT INTO producto (nombre, precio, codigo_fabricante)"
                    + "VALUES ( '" + producto.getNombre() + "' , " + producto.getPrecio() + " ," + producto.getCodigoFabricante() + ");";

            System.out.println("El producto ha sido agregado con éxito");
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
    // con este metodo, le decimos que nos buscque un prodcuto por el id que le pasamos
    // por parametro y guardamos los datos que nos trae la consulta en un objeto del tipo
    //producto y lo retornamos para despues poder manipularlo, ejemplo modificarlo.
    public Producto buscarProductoPorId(int id) throws Exception {
        try {
            String sql = "SELECT * FROM producto WHERE codigo = " + id + "";
            consultarBase(sql);
            Producto producto = null;
            while (resultado.next()) {
                producto = new Producto();
                producto.setId(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    public void modificarProducto(Producto producto) throws Exception {
    try {
        if (producto == null) {
            throw new Exception("Debe indicar el producto");
        }
        
        String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "', "
                + "precio = " + producto.getPrecio() + ", "
                + "codigo_fabricante = " + producto.getCodigoFabricante()
                + " WHERE codigo = " + producto.getId();

        insertarModificarEliminar(sql);
        
        System.out.println("El producto ha sido modificado exitosamente");
    } catch (Exception e) {
        throw e;
    }
}
    
    
}
