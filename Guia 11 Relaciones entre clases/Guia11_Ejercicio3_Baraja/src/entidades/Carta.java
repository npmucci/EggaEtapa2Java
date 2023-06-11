package entidades;

public class Carta {
    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public String toString() {
        return numero + " de " + palo;
    }
}
