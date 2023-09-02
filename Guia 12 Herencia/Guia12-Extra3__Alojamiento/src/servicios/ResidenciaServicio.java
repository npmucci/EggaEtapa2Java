/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alojamiento;
import entidades.Residencias;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ResidenciaServicio {
    public void residenciasConDescuento(ArrayList<Alojamiento> alojamientos){
        //recorremjos la lista, nos fijamos que sea un camping, y nos fijamos que tenga restaurante
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencias) {
                if(((Residencias) alojamiento).isDescuentoGremios())
                    System.out.println(alojamiento);
            }      
        }
    }
    
}
