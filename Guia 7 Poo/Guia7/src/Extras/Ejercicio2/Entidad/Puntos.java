package Extras.Ejercicio2.Entidad;

import java.util.Scanner;



public class Puntos {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    //constructor vacio
    public Puntos() {
    }

    //constructor con parametros
    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    //getters y setters
    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    //metodos propios de la clase
    public void crearPuntos(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese las coordenadas del primer punto (x1  y y1) ");
        x1 = leer.nextDouble();
        y1 = leer.nextDouble();
        System.out.println("Ingrese las coordenadas del segundo punto (x2  y y2) ");
        x2 = leer.nextDouble();
        y2 = leer.nextDouble();
    }

    public double distancia(){
        return  Math.sqrt((Math.pow((x2-x1),2)) + (Math.pow((y2-y1),2)));
    }



}
