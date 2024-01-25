
package tienda.servicios;

import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDao;


public class FabricanteServicio {
    
  private   FabricanteDao daoF;
    
  public FabricanteServicio(){
      this.daoF = new FabricanteDao();
  }
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
   
   
  public void ingresarFabricante() throws Exception {
     
     try {
           
         Fabricante fabricante = new Fabricante();
         System.out.println("Ingrese el nombre del fabricante");
         fabricante.setNombre(leer.next());
         daoF.guardarFabricante(fabricante);
         
     } catch (Exception e) {
     }
 }
}
