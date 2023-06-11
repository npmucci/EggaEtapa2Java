package Main;

/*
1 - Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2 - Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/


//import Entidad.Perro;
import java.util.*;

public class PerroMain {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

//    ArrayList<Perro> perros = new ArrayList();
        ArrayList<String> perros = new ArrayList();

        String x;
        String rope;

        do {
//      Perro perro = new Perro();

            System.out.println("Raza de perro");
            rope = read.next();
//      perro.setRaza(rope);
//      perros.add(perro);

            perros.add(rope);

            do {
                System.out.println("Quiere seguir? S/N");
                x = read.next();
            } while (!x.equalsIgnoreCase("s") && !x.equalsIgnoreCase("n"));

        } while (!x.equalsIgnoreCase("n"));

        perros.forEach((d) -> {
            System.out.println(d);
        });

        System.out.println("Ingrese la raza a buscar: ");
        String raza = read.next();

        //Collections.frequency(y, x) devuelve la cantidad de elementos iguales (int)
        int cantidad = Collections.frequency(perros, raza);

        //se crea el iterator de la colleccion perros.(el largo de la collec)
        Iterator<String> it = perros.iterator();

        if (cantidad > 0) {
            System.out.println("Eliminados: " + cantidad);
            while (it.hasNext()) {

                if (raza.equals(it.next())) {
                    it.remove();
                }
            }
        } else {
            System.out.println("No exit");

            
        }
        System.out.println(perros);
        
        Collections.sort(perros);
    }

}
