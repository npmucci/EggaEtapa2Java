/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alojamiento;
import java.util.ArrayList;
import entidades.Camping;

/**
 *
 * @author User
 */
public class CampingServicio {
    
    public void campingsConRestaurante(ArrayList<Alojamiento> alojamientos){
        //recorremjos la lista, nos fijamos que sea un camping, y nos fijamos que tenga restaurante
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                if(((Camping) alojamiento).isRestaurante() )
                    System.out.println(alojamiento);
            }      
        }
    }
    
}
