package entidades;

import enumeradores.Palo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private List<Carta> cartas;
    private List<Carta> monton;

    public Baraja() {
        cartas = new ArrayList<>();
        monton = new ArrayList<>();
        inicializarBaraja();
    }

    private void inicializarBaraja() {
        for (Palo palo : Palo.values()) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(numero, palo));
                }
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta siguienteCarta() {
        if (!cartas.isEmpty()) {
            Carta carta = cartas.remove(0);
            monton.add(carta);
            return carta;
        } else {
            System.out.println("No hay más cartas en la baraja.");
            return null;
        }
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public List<Carta> darCartas(int cantidad) {
        if (cantidad <= cartas.size()) {
            List<Carta> cartasRepartidas = new ArrayList<>();
            for (int i = 0; i < cantidad; i++) {
                Carta carta = siguienteCarta();
                cartasRepartidas.add(carta);
            }
            return cartasRepartidas;
        } else {
            System.out.println("No hay mas castas em la baraja ");
            return null;
        }
    }

    public void cartasMonton() {
        if (monton.isEmpty()) {
            System.out.println("No salio ninguna carta del monton.");
        } else {
            System.out.println("Cartas que qeudaron en el monton:");
            for (Carta carta : monton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        System.out.println("Cartas que quedan en la baraja:");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }

}
