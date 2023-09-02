/*
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
 */
package entidades;

/**
 *
 * @author User
 */
public class Hotel4Estrellas extends Hotel {
    
    protected String gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    public Hotel4Estrellas(String gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, Double  precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }
    
    @Override
    public double precioHabitaciones() {
    double valorRestaurante = 0;
    double valorGimnasio = 0;

    // Calcular valor agregado por el restaurante
    if (capacidadRestaurante < 30) {
        valorRestaurante = 10;
    } else if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
        valorRestaurante = 30;
    } else {
        valorRestaurante = 50;
    }

    // Calcular valor agregado por el gimnasio
    if (gimnasio.equals("A")) {
        valorGimnasio = 50;
    } else if (gimnasio.equals("B")) {
        valorGimnasio = 30;
    }

    // Calcular precio de las habitaciones
    this.precioHabitaciones = 50 + (1 * cantidadHabitaciones) + valorRestaurante + valorGimnasio;

    return this.precioHabitaciones;
}

    @Override
    public String toString() {
        return super.toString()+ "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante;
    }

    
    
}
