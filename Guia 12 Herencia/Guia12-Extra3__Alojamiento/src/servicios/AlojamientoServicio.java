/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import static com.sun.org.apache.bcel.internal.Repository.instanceOf;
import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hotel;
import entidades.Hotel4Estrellas;
import entidades.Hotel5Estrellas;
import entidades.Residencias;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AlojamientoServicio {
    
    public void crearAlojamientos(ArrayList<Alojamiento> alojamientos){
        // Agregar instancias de Hotel4Estrellas
        
         Hotel hotel4Estrellas1 = new Hotel4Estrellas ("A", "Restaurante", 1000, 300, 600, 5, 1d,
            "Hotel Costa Azul", "Calle del Mar 123",
            "Playa del Sol", "Juan Pérez");
          hotel4Estrellas1.precioHabitaciones();
        alojamientos.add(hotel4Estrellas1);

      Hotel hotel4Estrellas2 = new Hotel4Estrellas(
            "B", "Restaurante_2", 800, 200,
            600, 4,1d, "Hotel Montaña Verde", "Calle de los Pinos 456",
            "Villa Serenidad", "María Gómez");
      hotel4Estrellas2.precioHabitaciones();
        alojamientos.add(hotel4Estrellas2);

       Hotel hotel4Estrellas3 = new Hotel4Estrellas(
            "A", "Restaurante_3", 2000, 400,
            900, 7, 1d,
            "Hotel Oasis", "Calle de la Palmera 789",
            "Ciudad del Mar", "Carlos Rodríguez");
       hotel4Estrellas3.precioHabitaciones();
        alojamientos.add(hotel4Estrellas3);

        // Agregar instancias de Hotel5Estrellas
 
       Hotel hotel5Estrellas1 = new Hotel5Estrellas(4,10,5, "A", "Restaurante_4",200, 300, 600,5,1d,
            "Hotel Estrella del Mar", "Avenida Principal 234",
            "Ciudad de Ensueño", "Laura Sánchez");
       hotel5Estrellas1.precioHabitaciones();
        alojamientos.add(hotel5Estrellas1);

        Hotel hotel5Estrellas2 = new Hotel5Estrellas(
            2, 20, 3, "B", "Restaurante_5",
            100, 50, 250, 5,1D,
            "Gran Hotel Mirador", "Calle del Mirador 567",
            "Pueblo Encantado", "Roberto Fernández");
        hotel5Estrellas2.precioHabitaciones();
        alojamientos.add(hotel5Estrellas2);

        Hotel hotel5Estrellas3 = new Hotel5Estrellas(
            6, 12, 4, "A", "Restaurante_6",
            60, 140, 300, 14,1d,
            "Hotel Royal Palace", "Calle Real 890",
            "Villa Imperial", "Ana Martínez");
        hotel5Estrellas3.precioHabitaciones();
        alojamientos.add(hotel5Estrellas3);

        // Agregar instancias de Camping

        Alojamiento camping1 = new Camping(100, 10, true,false,200, "Camping Playa Dorada", "Carretera del Camping s/n",
            "Costa del Sol", "Pedro López");
        alojamientos.add(camping1);

        Alojamiento camping2 = new Camping(
            80, 8, false,false, 300,
            "Camping Los Pinos", "Camino de la Montaña km 5",
            "Sierra Nevada", "Isabel García");
        alojamientos.add(camping2);

        Alojamiento camping3 = new Camping(
            120, 12, true,true, 400,
            "Camping Río Azul", "Calle del Río 987",
            "Valle Verde", "Antonio Ramírez");
        alojamientos.add(camping3);

        // Agregar instancias de Residencias
        Alojamiento residencias1 = new Residencias(
            20, false, false,false, 200,
            "Residencia Estudiantil Sol Naciente", "Avenida Universitaria 123",
            "Ciudad Universitaria", "María López"
        );
        alojamientos.add(residencias1);

       Alojamiento residencias2 = new Residencias(
            25, true, true,true,300,
            "Residencia Jardines del Campus", "Calle de los Estudiantes 456",
            "Villa Universitaria", "Javier García"
        );
        alojamientos.add(residencias2);

        Alojamiento residencias3 = new Residencias(
            18, false, true, false, 400,
            "Residencia El Bosque", "Calle del Bosque 789",
            "Urbanización Los Álamos", "Laura Torres");
        alojamientos.add(residencias3);

        
    }
    
    // Método para mostrar todos los alojamientos
    public void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos) {
        System.out.println("----- Hoteles-----");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel4Estrellas) {
                  System.out.println(alojamiento);
            }
        }
        System.out.println("");
      
        System.out.println("");
         System.out.println("----- Residencias -----");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencias) {
                  System.out.println(alojamiento);
            }
        }
        System.out.println("");
         System.out.println("----- Camping -----");
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                  System.out.println(alojamiento);
            }
        }
        System.out.println("");
    }
    
}
