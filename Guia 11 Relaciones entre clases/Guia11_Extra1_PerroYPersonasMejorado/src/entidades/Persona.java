package entidades;

public class Persona {
    private String nombrePersona;
    private String apellidoPersona;
    private int edadPersona;
    private int documento;
    private Perro mascota;
    public Persona() {     }
    public Persona(String nombrePersona, String apellidoPersona, int edadPersona, int documento, Perro mascota) {
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.edadPersona = edadPersona;
        this.documento = documento;
        this.mascota = mascota;
    }
    public String getNombrePersona() {
        return nombrePersona;
    }
    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }
    public String getApellidoPersona() {
        return apellidoPersona;
    }
    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }
    public int getEdadPersona() {
        return edadPersona;
    }
    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public Perro getMascota() {
        return mascota;
    }
    public void setMascota(Perro mascota) {
        this.mascota = mascota;
    }
    @Override     public String toString() {
        return "Persona{" + "nombrePersona=" + nombrePersona + ", apellidoPersona=" + apellidoPersona + ", edadPersona=" + edadPersona + ", documento=" + documento + ", mascota=" + mascota + '}';     }
}
