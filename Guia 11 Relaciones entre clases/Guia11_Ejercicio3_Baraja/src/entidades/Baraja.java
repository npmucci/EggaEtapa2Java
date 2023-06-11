package entidades;

import java.util.ArrayList;
/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.

 */
public class Baraja {
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> descarte;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> mazo, ArrayList<Carta> descarte) {
        this.mazo = mazo;
        this.descarte = descarte;
    }

    public ArrayList<Carta> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Carta> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Carta> getDescarte() {
        return descarte;
    }

    public void setDescarte(ArrayList<Carta> descarte) {
        this.descarte = descarte;
    }
}
