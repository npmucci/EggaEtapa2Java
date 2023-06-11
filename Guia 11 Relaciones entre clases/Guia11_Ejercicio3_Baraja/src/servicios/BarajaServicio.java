package servicios;
/*
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
import entidades.Baraja;
import entidades.Carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BarajaServicio {

    public Baraja crearBaraja( Baraja baraja) {

       ArrayList<Carta> mazo = new ArrayList<>();
        String[] palos = {"espadas", "bastos", "oros", "copas"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12}; // No se incluyen el 8 y el 9
        //creo el mazo de cartas
        for (String palo : palos) {
            for (int numero : numeros) {
                Carta carta = new Carta(numero, palo);
                mazo.add(carta);
            }
        }
        baraja.setMazo(mazo); //setel el mazo de cartas creado al atributo mazo de la clase baraja
        return baraja; //retorno la baraja creada
    }

    public void barajar(Baraja baraja) {
        Collections.shuffle(baraja.getMazo());
    }

    public Carta siguienteCarta(Baraja baraja) {
        if (baraja.getMazo().isEmpty()) {
            System.out.println("No hay más cartas en la baraja.");
            baraja.getDescarte().add(baraja.getMazo().get(0));
            return null;
        }
        return baraja.getMazo().remove(0);
    }

        public int cartasDisponibles(Baraja baraja) {

        return baraja.getMazo().size();
    }



    public int darCartas(int cantidad, Baraja baraja) {
        if (cantidad > cartasDisponibles(baraja)) {
            return 0;
        } else
            for(int i= 0; i<cantidad;i++){
                siguienteCarta(baraja); // se reparten las cartas y a su vez se remueven del mazo
            }
        return cantidad;
        }



    public void cartasMonton(Baraja baraja) {
        if (baraja.getMazo().size() == 40) {
            System.out.println("No se ha sacado ninguna carta aún.");
        } else {
            for (Carta carta : baraja.getDescarte()) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja(Baraja baraja) {
        for (Carta carta : baraja.getMazo()) {
            System.out.println(carta);
        }
    }

}
