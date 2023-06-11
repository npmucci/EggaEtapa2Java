package entidades;
/*
 Luego, de las películas nos interesa saber
el título, duración, edad mínima y director.
 */
public class Pelicula {
    private String titulo;
    private double duracion;
    private int edadMinima;
    private String director;
    private Double precioEntrada;

    public Pelicula() {
    }

    public Pelicula(String titulo, double duracion, int edadMinima, String director, Double precioEntrada) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
        this.precioEntrada = precioEntrada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                ", edadMinima=" + edadMinima +
                ", director='" + director + '\'' +
                ", precioEntrada=" + precioEntrada +
                '}';
    }
}

