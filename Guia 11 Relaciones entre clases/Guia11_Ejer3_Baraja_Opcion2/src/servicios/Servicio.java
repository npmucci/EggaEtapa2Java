package servicios;

import entidades.Baraja;
import entidades.Carta;

import java.util.List;
import java.util.Scanner;

public class Servicio {
    private Scanner read;
    private Baraja baraja;

    public Servicio() {
        read = new Scanner(System.in);
        baraja = new Baraja();
    }

    public void ejecutar() {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = read.nextInt();
            read.nextLine();

            switch (opcion) {
                case 1:
                    baraja.barajar();
                    System.out.println("La baraja mezclada.");
                    break;
                case 2:
                    Carta siguienteCarta = baraja.siguienteCarta();
                    if (siguienteCarta != null) {
                        System.out.println("Siguiente carta : " + siguienteCarta);
                    }
                    break;
                case 3:
                    System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
                    break;
                case 4:
                    System.out.print("cuantas cartas quiere repartir: ");
                    int cantidadCartas = read.nextInt();
                    read.nextLine();

                    List<Carta> cartasRepartidas = baraja.darCartas(cantidadCartas);
                    if (cartasRepartidas != null) {
                        System.out.println("Se han repartido " + cantidadCartas + " cartas:");
                        for (Carta carta : cartasRepartidas) {
                            System.out.println(carta);
                        }
                    }
                    break;
                case 5:
                    baraja.cartasMonton();
                    break;
                case 6:
                    baraja.mostrarBaraja();
                    break;
                case 7:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
            }

            System.out.println();
        }

    }

    private void mostrarMenu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Barajar");
        System.out.println("2. Mostrar siguiente carta");
        System.out.println("3. Mostrar cartas disponibles");
        System.out.println("4. Dar cartas");
        System.out.println("5. Mostrar cartas del montón");
        System.out.println("6. Mostrar baraja");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opción: ");
    }
}
