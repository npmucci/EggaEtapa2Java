package servicios;

import entidades.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
public class AlumnosServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        ArrayList<Integer> cargarnotas = new ArrayList<>();
        String respuesta = "";
        System.out.println("Ingrese el nommbre del alumno");
        String nombre = leer.next();
        System.out.println("Ingrese las tres notas");
        cargarnotas.add(leer.nextInt());
        cargarnotas.add(leer.nextInt());
        cargarnotas.add(leer.nextInt());

        return new Alumno(nombre, cargarnotas);
    }

    public ArrayList<Alumno> curso() {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        String respuesta = "";

        do {
            listaAlumnos.add(crearAlumno());
            System.out.println("Desea seguir cargando alumnos?");
            respuesta = leer.next();
        } while (!respuesta.equalsIgnoreCase("no"));
        return listaAlumnos;
    }

    public double notaFinal(ArrayList<Integer> notas) {
        double nota = 0;
        for (Integer x : notas) {
            nota += x;
        }
        return nota / 3;
    }
}


