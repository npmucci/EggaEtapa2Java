package entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Alquiler {
    private String nombre;
    private String dni;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;

    public Alquiler() {
    }

    public Alquiler(String nombre, String dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
    }


    public int crearAlquiler(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el nombre");
        this.nombre=leer.next();
        System.out.println("Ingrese el dni");
        this.dni = leer.next();
        fechaAlquiler = LocalDate.now();

        System.out.println("Ingrese la fecha de devolucion en formato número: día, mes, año");
        int dia=leer.nextInt();
        int mes= leer.nextInt();
        int anio = leer.nextInt();
        fechaDevolucion = LocalDate.of(anio, mes, dia);
        //CrhonoUnit  Te permite obtener la diferencia entre dos puntos temporales en unidades específicas,
        //como días, meses o años.
        int diasAlquilados = (int) ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion);
        return diasAlquilados;
    }
}
