/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.
 */
package entidades;

import java.util.Comparator;

/**
 *
 * @author User
 */
public abstract class Hotel extends Alojamiento {
    protected Integer cantidadHabitaciones;
    protected Integer numeroCamas;
    protected Integer cantidadPisos;
    protected Double precioHabitaciones;

     public Hotel(Integer cantidadHabitaciones, Integer numeroCamas, Integer cantidadPisos, Double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.numeroCamas = numeroCamas;
        this.cantidadPisos = cantidadPisos;
        this.precioHabitaciones = precioHabitaciones;
    }

    public Integer getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(Integer cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(Integer numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public Integer getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(Integer cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public Double  getPrecioHabitaciones() {
        return precioHabitaciones;
    }

    public void setPrecioHabitaciones(Double  precioHabitaciones) {
        this.precioHabitaciones = precioHabitaciones;
    }
    
    
    public abstract double precioHabitaciones();
    //comparator para ordenar los hoteles por precio
    
    public static Comparator<Hotel> compararPrecio = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel t1, Hotel t2) {
            return  t2.getPrecioHabitaciones().compareTo(t1.getPrecioHabitaciones());
        }
    
    };

    @Override
    public String toString() {
        return super.toString()  + "cantidadHabitaciones=" + cantidadHabitaciones + ", numeroCamas=" + numeroCamas + ", cantidadPisos=" + cantidadPisos + ", precioHabitaciones=" + precioHabitaciones;
    }
    
    
    
    
}
