package Main;

import Entidades.Persona;
import Servicios.PersonasServicios;



/*
Crear 4 objetos de tipo Persona con distintos valores, a continuación,
llamaremos todos los métodos para cada objeto, deberá comprobar si la
persona está en su peso ideal, tiene sobrepeso o está por debajo de su
peso ideal e indicar para cada objeto si la persona es mayor de edad.
● Por último, guardaremos los resultados de los métodos calcularIMC y
esMayorDeEdad en distintas variables(arrays), para después calcular un
porcentaje de esas 4 personas cuantas están por debajo de su peso,
cuantas en su peso ideal y cuantos, por encima, y también calcularemos
un porcentaje de cuantos son mayores de edad y cuantos menores. Para
esto, podemos crear unos métodos adicionales.
 */
public class Main {
    public static void main(String[] args) {
        PersonasServicios servicio = new PersonasServicios();
        //CREO LAS 4 PERSONAS DE FORMA MANUAL
        //Persona p1 = servicio.crearPersona();
       // Persona p2 = servicio.crearPersona();
       // Persona p3 = servicio.crearPersona();
        //Persona p4 = servicio.crearPersona();

        //GUARDO LOS RETURNS DE AMBOS METODOS EN VECTORES DE FORMA MANUAL
      // int[] imc={servicio.calcularIMC(p1),servicio.calcularIMC(p2),servicio.calcularIMC(p3),servicio.calcularIMC(p4)};
        // boolean[] edad={servicio.esMayor(p1),servicio.esMayor(p2),servicio.esMayor(p3),servicio.esMayor(p4)};

        // EN EL MISMO BUCLE FOR,  LE ASIGNO LOS DATOS A LOS TRES VECTORES, PERSONAS, IMC Y EDAD
        Persona[] persona = new Persona[4]; // array para guardar objetos del tipo persona
        int[] imc = new int[4];
        boolean[] edad = new boolean[4];

        for (int i=0; i<4;i++){
            persona[i]=servicio.crearPersona();
            imc[i]= servicio.calcularIMC(persona[i]);
            edad[i]=servicio.esMayor(persona[i]);
        }


        //LLAMOS A LOS METODOS PARA OBTENER LOS PORCENTAJES
       servicio.porcetajeImc(imc);
       servicio.porcentajeMayores(edad);

    }
}