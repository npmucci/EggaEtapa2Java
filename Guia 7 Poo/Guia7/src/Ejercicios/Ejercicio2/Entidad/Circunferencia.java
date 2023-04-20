package Ejercicios.Ejercicio2.Entidad;


import java.util.Scanner;

public class Circunferencia {
    private float radio;

    public Circunferencia(float radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        radio = leer.nextFloat();
    }
    public void area(){
        float area = (float) (3.14 * radio * radio);
        System.out.println(" El area es : " + area);
    }
    public float perimetro(){
        float perimetro = (float) (2*3.14*radio);
        return perimetro;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
