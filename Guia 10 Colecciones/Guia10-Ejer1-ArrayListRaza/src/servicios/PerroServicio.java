package servicios;
/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

 */
import entidades.Perro;


import java.util.*;

public class PerroServicio {
    Scanner leer = new Scanner(System.in);
    ArrayList<String> lista = new ArrayList<>();

    public void crearPerro() {
        String respuesta = "";
        do {
            System.out.println("Ingrese la raza de perro");
            String raza = leer.nextLine();
            Perro p1 = new Perro(raza);
            lista.add(p1.getRaza());
            System.out.println("¿Desea seguir ingresando perros?");
            respuesta = leer.nextLine();
        } while (!respuesta.equalsIgnoreCase("no"));

        for (String raza : lista) {
            System.out.println(raza);
        }
    }

    /*
    2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
     */

    public void borrarPerro() {
        System.out.println("Ingrese la raza de perro a borrar");
        String raza = leer.nextLine();
        boolean encontrada = false;

        for (String razas: lista){
            if (razas.equalsIgnoreCase(raza)){
                lista.remove(raza);
                encontrada = true;
                break;
            }
        }
        Collections.sort(lista);
        if (encontrada) {
            System.out.println("La raza no se encuentra en la lista");
        }
        for (String razas : lista) {
            System.out.println(razas);

        }
     /*
        Iterator<String> it = lista.iterator();
        boolean encontrada = false;
        while (it.hasNext()) {
            if (it.next().equals(raza)) {
                it.remove();
                encontrada = true;
            }

        }


      */
        }



    }

