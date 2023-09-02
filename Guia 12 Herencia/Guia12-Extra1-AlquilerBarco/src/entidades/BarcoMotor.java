package entidades;
/*
Potencia en CV para barcos a motor.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le uma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
 */
public class BarcoMotor extends Barco {
    private int potencia;

    public BarcoMotor(int potencia) {
        this.potencia = potencia;
    }

    public BarcoMotor(int potencia, String matricula, int slora, int añoFabricacion) {
        super(matricula, slora, añoFabricacion);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    @Override
    public void alquiler() {
        Alquiler alquiler1 = new Alquiler();
        int dias = alquiler1.crearAlquiler();
        double costoAlquiler = dias * (super.modulo()+this.potencia);
        if (dias==1){
            System.out.println("Alquilar un Barco a Motor por " + dias + " dia, tiene un costo de: $" + costoAlquiler );
        } else{
            System.out.println("Alquilar un Barco a Motor por " + dias + " dias, tiene un costo de: $" + costoAlquiler );
        }
    }
}
