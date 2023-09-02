package entidades;

import interfaces.AreaPerimetro;

public class Circulo implements AreaPerimetro {

    private double diametro;
    private double radio;

    public Circulo(double diametro, double radio) {
        this.diametro = diametro;
        this.radio = radio;
    }



    @Override
    public void calcularPerimetro() {

        double perimetro = pi * diametro;
        System.out.println("El perimetro del circulo es :" + perimetro);
    }

    @Override
    public void calcularArea() {
        double area = pi * Math.pow(radio,2);
        System.out.println("El area del circulo es :" + area);


    }
}
