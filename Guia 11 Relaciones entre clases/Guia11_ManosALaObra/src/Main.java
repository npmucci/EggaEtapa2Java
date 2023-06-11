import entidades.Dni;
import entidades.Equipo;
import entidades.Jugador;
import entidades.Persona;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


                // Manos a la obra persona y Dni

                Persona p1 = new Persona();
                Dni dni1 = new Dni();

                dni1.setSerie('A');
                dni1.setNumero(31607748);

                p1.setNombre("Natalia");
                p1.setApellido("Mucci");
                p1.setDni(dni1);

                System.out.println(p1);

                // Manos a la obra juagador y equipo


                ArrayList <Jugador> listaJugadores = new ArrayList<>();
                Jugador jugador1 = new Jugador("Juan", "De", 5,11);
                Jugador jugador2 = new Jugador("Paco", "La", 10,10);
                Jugador jugador3 = new Jugador("Pedro", "Mar", 1,22);
                listaJugadores.add(jugador1);
                listaJugadores.add(jugador2);
                listaJugadores.add(jugador3);

                Equipo equipo1 = new Equipo();
                equipo1.setListaJugadores(listaJugadores);
                System.out.println(equipo1.toString());

    }
}