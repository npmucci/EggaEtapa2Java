package servicios;
/*
Definir los siguientes métodos en
AhorcadoService:
● Metodo crearJuego(): le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad.
● Método longitud(): muestra la longitud de la palabra que se debe
encontrar. Nota: buscar como se usa el vector.length.
● Método buscar(letra): este método recibe una letra dada por el
usuario y busca si la letra ingresada es parte de la palabra o no.
También informará si la letra estaba o no.
● Método encontradas(letra): que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades.
● Método intentos(): para mostrar cuántas oportunidades le queda al
jugador.
● Método juego(): el método juego se encargará de llamar todos los
métodos previamente mencionados e informará cuando el usuario
descubra toda la palabra o se quede sin intentos. Este método se
llamará en el main.
 */

import entidades.Ahorcado;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class AhorcadoServicio {
    Ahorcado palabra = new Ahorcado();

    public void crearJuego() {
        String x = JOptionPane.showInputDialog("Ingrese la palabra:");

        palabra.setPalabra(x.toCharArray());

        int jugadasMaximas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de intentos:"));
        palabra.setJugadasMaximas(jugadasMaximas);
    }

    public int longitud() {
        return palabra.getPalabra().length;
    }

    public boolean buscar(char letra) {
        for (int i = 0; i < palabra.getPalabra().length; i++) {
            if (palabra.getPalabra()[i] == letra) {
                JOptionPane.showMessageDialog(null, "La letra pertenece a la palabra");
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "La letra NO pertenece a la palabra");
        return false;
    }

    public boolean encontradas(char letra) {
        boolean encontrada = false;
        char[] palabraActualizada = palabra.getPalabra();

        for (int i = 0; i < palabraActualizada.length; i++) {
            if (letra == palabraActualizada[i]) {
                encontrada = true;
                palabraActualizada[i] = '*';  // Reemplaza la letra encontrada por un asterisco
                palabra.setLetrasEncontradas(palabra.getLetrasEncontradas() + 1);
                JOptionPane.showMessageDialog(null, "La letra '" + letra + "' fue encontrada en la posición " + (i + 1));
            }
        }

        if (encontrada) {
            JOptionPane.showMessageDialog(null, "Número de letras encontradas: " + palabra.getLetrasEncontradas() +
                    "\nNúmero de letras faltantes: " + (palabra.getPalabra().length - palabra.getLetrasEncontradas()));

        } else {
            palabra.setJugadasMaximas(palabra.getJugadasMaximas() - 1);
            JOptionPane.showMessageDialog(null, "Número de letras encontradas: " + palabra.getLetrasEncontradas() +
                    "\nNúmero de letras faltantes: " + (palabra.getPalabra().length - palabra.getLetrasEncontradas()));
        }

        return encontrada;
    }

    public int intentos() {
        return palabra.getJugadasMaximas();
    }

    public void juego() {
        crearJuego();
        longitud();

        char[] palabraOriginal = palabra.getPalabra().clone(); // Hacemos una copia de la palabra original

        char[] palabraActual = new char[palabraOriginal.length];
        Arrays.fill(palabraActual, '*'); // Inicializamos la palabra actual con asteriscos
        do {
           char letra = JOptionPane.showInputDialog("Ingrese la letra:").charAt(0);
            buscar(letra);

            boolean encontrada = encontradas(letra);

            if (encontrada && palabra.getLetrasEncontradas() == palabra.getPalabra().length) {
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has adivinado la palabra correctamente.");
                break;
            }

            intentos();
            if (intentos() == 0) {
                JOptionPane.showMessageDialog(null, "¡Agotaste todos los intentos! La palabra era: " + String.valueOf(palabraOriginal));
                break;
            }

            // Actualizar la palabra actualizada con las letras encontradas
            for (int i = 0; i < palabraOriginal.length; i++) {
                if (palabraOriginal[i] == letra) {
                    palabraActual[i] = letra;
                }
            }
            JOptionPane.showMessageDialog(null, "Palabra: " + String.valueOf(palabraActual));
        } while (palabra.getLetrasEncontradas() != palabra.getPalabra().length && intentos() != 0);


    }

}













