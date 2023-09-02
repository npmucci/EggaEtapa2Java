/*
Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package entidades;

import java.util.Scanner;


public class EdificioOficinas extends Edificio {
    Scanner leer  = new Scanner(System.in);
    private int numeroOficinas;
    private int personasPorOficina;
    private int numeroPisos;

    public EdificioOficinas() {
    }

    public EdificioOficinas(int numeroOficinas, int personasPorOficina, int numeroPisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.numeroPisos = numeroPisos;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getNumeroPisos() {
        return numeroPisos;
    }

    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }



    @Override
    public double calcularSuperficie() {
        return 2 * (this.ancho * this.largo + this.ancho * this.alto + this.largo * this.alto);
    }

    @Override
    public double calcularVolumen() {
        return this.alto * this.ancho + this.largo;
    }

    public void crearEdificioOficinas(){
        System.out.println("Ingrese la cantidad de personas por oficina");
        personasPorOficina = leer.nextInt();
        System.out.println("Ingrese la cantidad de  oficinas");
        numeroOficinas = leer.nextInt();
        System.out.println("Ingrese la cantidad pisos");
        numeroPisos = leer.nextInt();

    }

    public void crearPersonas(){
        int personasPorPiso = personasPorOficina * numeroOficinas;
        int personasPorEdificio =  personasPorPiso * numeroPisos;

        System.out.println("Por oficina entran: " + personasPorPiso + " personas");
        System.out.println("En el edificio entran: " + personasPorEdificio + " personas");
    }

}

