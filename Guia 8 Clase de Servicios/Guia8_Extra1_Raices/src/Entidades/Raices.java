package Entidades;
/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de
una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, llamémosles
a, b y c. Hay que insertar estos 3 valores para construir el objeto a través de un método constructor.
 */9
public class Raices {
    private int coeficienteA;
    private int coeficienteB;
    private int coeficienteC;

    public Raices() {
    }

    public Raices(int coeficienteA, int coeficienteB, int coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }

    public int getCoeficienteA() {
        return coeficienteA;
    }

    public void setCoeficienteA(int coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public int getCoeficienteB() {
        return coeficienteB;
    }

    public void setCoeficienteB(int coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public int getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteC(int coeficienteC) {
        this.coeficienteC = coeficienteC;
    }

    @Override
    public String toString() {
        return "Raices{" + "coeficienteA=" + coeficienteA + ", coeficienteB=" + coeficienteB + ", coeficienteC=" + coeficienteC + '}';
    }
}
