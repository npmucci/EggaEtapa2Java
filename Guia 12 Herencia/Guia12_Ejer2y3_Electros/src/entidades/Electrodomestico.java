package entidades;

public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char categoriaConsumo;
    protected int peso;

    public Electrodomestico() {
        this.color="blanco";
        this.categoriaConsumo='F';
        this.precio =100;
        this.peso= 0;

    }

    public Electrodomestico(double precio, String color, char categoriaConsumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.categoriaConsumo = categoriaConsumo;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getCategoriaConsumo() {
        return categoriaConsumo;
    }

    public void setCategoriaConsumo(char categoriaConsumo) {
        this.categoriaConsumo = categoriaConsumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }


    /*
    
     */
}
