package persistencia;

import entidades.Fabricante;
import java.sql.ResultSet;
import java.util.Scanner;

public class FabricanteDAO extends DAO {

    Scanner leer = new Scanner(System.in);
    ProductoDAO prod = new ProductoDAO();

    public void fabricanteSeleccionar() throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM fabricante";
            ResultSet rs = select(sql);
            while (rs.next()) {
                System.out.println("Código: " + rs.getInt("codigo") + ", Nombre: " + rs.getString("nombre"));
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void fabricanteInsertar(Fabricante fabricante) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (nombre) VALUES ('" + fabricante.getNombre() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    // Cierre del recurso Scanner
    public void cerrarScanner() {
        leer.close();
    }
}

