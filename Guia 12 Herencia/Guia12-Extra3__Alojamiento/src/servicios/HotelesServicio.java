/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Alojamiento;
import entidades.Hotel;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author User
 */
public class HotelesServicio {
//creamos una lista de los hoteles y aplicamos el metodo comparator de la clase hotel para ordenar por precio
    public void hotelesOrdenados(ArrayList<Alojamiento> alojamientos) {
        ArrayList<Hotel> hoteles = new ArrayList<>();
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel) {
                hoteles.add((Hotel) alojamiento);
            }
        }
        hoteles.sort(Hotel.compararPrecio);
    
        // Mostrar los hoteles ordenados
        System.out.println("----- Hoteles de más caro a más barato -----");
        for (Hotel hotel : hoteles) {
            System.out.println(hotel);
        }
        System.out.println("-------------------------------------------");
    }
}