package servicios;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class PaisesServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet<String> listaPaises = new TreeSet<>();

    public void cargarPaises() {
        String respuesta;
        do {
            System.out.println("Ingrese un país");
            listaPaises.add(leer.next());
            do {
                System.out.println("¿Desea agregar otro país? (si/no)"); //blucle anidado para validar que solo pueda ingresar si o no
                respuesta = leer.next();
            } while (!respuesta.equalsIgnoreCase("si") && !respuesta.equalsIgnoreCase("no"));
        } while (respuesta.equalsIgnoreCase("si"));
    }

    public void mostrarPaises() {

        for (String paises : listaPaises) {
            System.out.println(paises);
        }
        System.out.println("----------------------------");
    }

    public void eliminarPais() {
        boolean encontrado = false;
        System.out.println("Ingrese un pais a eliminar de la lista");
        String pais = leer.next();

        Iterator<String> it = listaPaises.iterator();

        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(pais)){
                it.remove();
                encontrado = true;
            }
        }
        if (encontrado) {
            listaPaises.forEach((paises) -> {
                System.out.println(paises);
            });
        } else {
            System.out.println( pais + " no esta en la lista");
        }
    }
}
