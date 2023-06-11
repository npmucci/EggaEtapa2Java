package entidades;


import java.util.ArrayList;

public class Equipo {

        private ArrayList <Jugador> listaJugadores;

        public Equipo() {
        }

        public Equipo(ArrayList<Jugador> listaJugadores) {
            this.listaJugadores = listaJugadores;
        }

        public ArrayList<Jugador> getListaJugadores() {
            return listaJugadores;
        }

        public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
            this.listaJugadores = listaJugadores;
        }

        @Override
        public String toString() {
            return "Equipo{" + "listaJugadores=" + listaJugadores + '}';
        }


}
