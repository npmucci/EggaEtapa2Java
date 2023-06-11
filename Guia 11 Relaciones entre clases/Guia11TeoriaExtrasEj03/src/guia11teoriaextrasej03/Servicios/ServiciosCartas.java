/*
3. Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
? barajar(): cambia de posición todas las cartas aleatoriamente.
? siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
? cartasDisponibles(): indica el número de cartas que aún se puede repartir.
? darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
? cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
? mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package guia11teoriaextrasej03.Servicios;

import guia11teoriaextrasej03.Barajas;
import guia11teoriaextrasej03.Cartas;
import guia11teoriaextrasej03.Palo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ServiciosCartas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Cartas> cartasRepartidas = new ArrayList();
    Barajas b1 = new Barajas();

    public void ejecutar() {
        boolean salir = false;
        inicializarBaraja();
        while (!salir) {
            mostrarMenu();
            int opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    barajar();
                    System.out.println("La baraja mezclada.");
                    break;
                case 2:
                    primerCarta();
                    break;
                case 3:
                    System.out.println("Cartas disponibles: " + cartasDisponibles());
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarBaraja();
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

        leer.close();
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

    public void inicializarBaraja() {

        ArrayList<Cartas> mazo = new ArrayList<>();

        for (Palo palo : Palo.values()) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    mazo.add(new Cartas(numero, palo));

                }
            }
        }
        b1.setBarajaArrayList(mazo);
    }

    public void barajar() {

        Collections.shuffle(b1.getBarajaArrayList());

    }

    public void mostrarBaraja() {
        for (Cartas mostrar : b1.getBarajaArrayList()) {
            System.out.println(mostrar);
        }
    }

    public void primerCarta() {

        if (b1.getBarajaArrayList().isEmpty()) {
            System.out.println("No hay mas cartas en el mazo.");

        } else {
            System.out.println("La carta es: " + b1.getBarajaArrayList().get(0));
            b1.getDescarteArrayList().add(b1.getBarajaArrayList().get(0));
            b1.getBarajaArrayList().remove(0);
        }
//        return b1.getBarajaArrayList().remove(0);
    }

//    cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles() {

        return b1.getBarajaArrayList().size();
    }

//    darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//    debemos indicárselo al usuario.
    public void darCartas() {

        System.out.println("Cuantas cartas quiere: ");
        int cantidadCartasPedidas = leer.nextInt();

        if (cantidadCartasPedidas > b1.getBarajaArrayList().size()) {
            System.out.println("No hay suficientes cartas.");

        } else {
            for (int i = 0; i < cantidadCartasPedidas; i++) {
                primerCarta();
            }
        }

    }

//    cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//    indicárselo al usuario
    public void cartasMonton() {

        if (b1.getDescarteArrayList().isEmpty()) {
            System.out.println("No hay cartas descartadas.");
        } else {
            for (Cartas mostrarCartasMonton : b1.getDescarteArrayList()) {
                System.out.println("Las descartas son: " + mostrarCartasMonton);
            }
        }
    }
}
