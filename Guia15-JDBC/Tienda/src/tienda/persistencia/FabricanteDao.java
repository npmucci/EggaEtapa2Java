
package tienda.persistencia;

import tienda.entidades.Fabricante;

public class FabricanteDao extends DAO {
    
       public void guardarFabricante(Fabricante fabricante) throws Exception {
        try {
            if (fabricante == null) {
                throw new Exception("Debe indicar el fabricante");
            }
           String sql = "INSERT INTO fabricante (nombre) "
        + "VALUES ('" + fabricante.getNombre() + "');";
            System.out.println("El fabricante ha sido agregado con éxito");
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
}
