package entidades;

public class Curso {
    private String nombreClase;
    private int cantidadHorasPorDia;
     private int cantidadDiasPorSemana;
     private String turno;

     private int precioPorHora;

     private String[] alummos;


    public Curso() {
    }

    public Curso(String nombreClase, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioPorHora, String[] alummos) {
        this.nombreClase = nombreClase;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alummos = alummos;
    }

    public String getNombreClase() {
        return nombreClase;
    }

    public void setNombreClase(String nombreClase) {
        this.nombreClase = nombreClase;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlummos() {
        return alummos;
    }

    public void setAlummos(String[] alummos) {
        this.alummos = alummos;
    }
}
