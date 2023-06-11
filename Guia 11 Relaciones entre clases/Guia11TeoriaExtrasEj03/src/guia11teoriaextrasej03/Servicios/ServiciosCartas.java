/*
3. Realizar una baraja de cartas espa�olas orientada a objetos. Una carta tiene un n�mero entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un m�todo toString() que retorne el n�mero de carta y el palo. La baraja estar�
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podr� realizar la baraja son:
? barajar(): cambia de posici�n todas las cartas aleatoriamente.
? siguienteCarta(): devuelve la siguiente carta que est� en la baraja, cuando no haya m�s o
se haya llegado al final, se indica al usuario que no hay m�s cartas.
? cartasDisponibles(): indica el n�mero de cartas que a�n se puede repartir.
? darCartas(): dado un n�mero de cartas que nos pidan, le devolveremos ese n�mero de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indic�rselo al usuario.
? cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indic�rselo al usuario
? mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al m�todo, este no mostrara esa primera carta.
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
                    System.out.println("�Hasta luego!");
                    break;
                default:
                    System.out.println("Opci�n inv�lida. Por favor, ingrese un n�mero v�lido.");
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
        System.out.println("5. Mostrar cartas del mont�n");
        System.out.println("6. Mostrar baraja");
        System.out.println("7. Salir");
        System.out.print("Seleccione una opci�n: ");
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

//    cartasDisponibles(): indica el n�mero de cartas que a�n se puede repartir.
    public int cartasDisponibles() {

        return b1.getBarajaArrayList().size();
    }

//    darCartas(): dado un n�mero de cartas que nos pidan, le devolveremos ese n�mero de
//    cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//    debemos indic�rselo al usuario.
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
//    indic�rselo al usuario
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
