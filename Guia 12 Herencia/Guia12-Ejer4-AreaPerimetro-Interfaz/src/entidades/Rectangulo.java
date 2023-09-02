package entidades;

import interfaces.AreaPerimetro;

public class Rectangulo implements AreaPerimetro {

    private double base;
    private double altura;

    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.println("El area del rectángulo es: " + area);

    }

    @Override
    public void calcularPerimetro() {
        double perimetro = (base * altura) * 2;

        System.out.println("El  perimetro del rectángulo es: " + perimetro);
    }

}
