import entidades.Baraja;
import entidades.Carta;
import servicios.BarajaServicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer  = new Scanner(System.in);
        BarajaServicio sc1 = new BarajaServicio();
        Baraja baraja = new Baraja();

        sc1.crearBaraja(baraja);
        System.out.println("Baraja creada:");
        sc1.crearBaraja(baraja);
        sc1.mostrarBaraja(baraja);

        System.out.println("\nBarajando la baraja...");
        sc1.barajar(baraja);
        System.out.println("\nBaraja barajada:");
        sc1.mostrarBaraja(baraja);

        System.out.println("\nSacando una carta...");
        Carta carta =sc1.siguienteCarta(baraja);
        System.out.println("\nSe sacó la carta: " + carta);



            System.out.println("\nIngrese la cantidad de cartas a repartir");
            int cantidad = leer.nextInt();

        if (sc1.darCartas(cantidad, baraja)!=0) {
            System.out.println("\nSe repartieron" + sc1.darCartas(cantidad, baraja) +" cartas:");

            } else {
            System.out.println("La cantidad de cartas es insuficiente,");
        }

        System.out.println("\nCartas descartadas");
        sc1.cartasMonton(baraja);

    }

}