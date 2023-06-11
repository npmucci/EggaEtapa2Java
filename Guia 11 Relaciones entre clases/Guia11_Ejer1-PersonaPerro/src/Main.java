import entidades.Perro;
import entidades.Persona;

/*
1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        Perro pr1 = new Perro("Tom", "Pastor Aleman", 4, "Grande");
        Perro pr2 = new Perro("Rocco", "Boxer", 5,"Mediano");

       p1.setNombre("Martina");
       p1.setApellido("Mordcovici");
       p1.setEdad(11);
       p1.setDni("52011911");
       p1.setMascota(pr1);

        p2.setNombre("Natalia");
        p2.setApellido("Mucci");
        p2.setEdad(38);
        p2.setDni("31607748");
        p2.setMascota(pr2);

        System.out.println(p1);
        System.out.println("------------------");
        System.out.println(p2);


    }
}