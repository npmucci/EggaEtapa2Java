package entidades;

public class Velero extends Barco{
    private int mastiles;

    public Velero(int msatiles) {
        this.mastiles = msatiles;
    }

    public Velero(int msatiles, String matricula, int slora, int añoFabricacion) {
        super(matricula, slora, añoFabricacion);
        this.mastiles = msatiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    @Override
    public void alquiler() {
        Alquiler alquiler1 = new Alquiler();
        int dias = alquiler1.crearAlquiler();
        double costoAlquiler = dias * (super.modulo()+this.mastiles);
        if (dias==1){
            System.out.println("Alquilar un Barco a Motor por " + dias + " dia, tiene un costo de: $" + costoAlquiler );
        } else{
            System.out.println("Alquilar un Barco a Motor por " + dias + " dias, tiene un costo de: $" + costoAlquiler );
        }

    }
}
