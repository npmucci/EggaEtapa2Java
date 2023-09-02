/*
Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones
 */
package entidades;

/**
 *
 * @author User
 */
public class Camping extends AlojamientoExraHotelero {
    private Integer capacidadCarpas;
    private Integer cantidadBaños;
    private boolean restaurante;

    public Camping(Integer capacidadCarpas, Integer cantidadBaños, boolean restaurante, boolean privado, Integer metrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBaños = cantidadBaños;
        this.restaurante = restaurante;
    }

   

    public Integer getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(Integer capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public Integer getCantidadBaños() {
        return cantidadBaños;
    }

    public void setCantidadBaños(Integer cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

   
    @Override
public String toString() {
    return String.format("%s, capacidadCarpas=%d, cantidadBaños=%d, restaurante=%b",
        super.toString(), capacidadCarpas, cantidadBaños, restaurante);
}

    
    
    
    
}
