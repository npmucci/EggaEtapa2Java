package entidad;

import java.util.Random;

public class Juego {

    Random rand = new Random();
    private String[] meses = {
            "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio",
            "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    private String mesSecreto = meses[rand.nextInt(12)];

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "Meses{" + "meses=" + meses + ", mesSecreto=" + mesSecreto + '}';
    }


}
