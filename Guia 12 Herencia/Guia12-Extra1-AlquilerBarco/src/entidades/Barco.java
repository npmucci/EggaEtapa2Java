package entidades;
/*
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
 */
public abstract class Barco {
    protected String matricula;
    protected int slora;
    protected int añoFabricacion;
    protected  Alquiler alquiler;

    public Barco() {
    }

    public Barco(String matricula, int slora, int añoFabricacion) {
        this.matricula = matricula;
        this.slora = slora;
        this.añoFabricacion = añoFabricacion;
    }


    public int modulo(){
        return slora*10;
    }
    public abstract void alquiler();


}
