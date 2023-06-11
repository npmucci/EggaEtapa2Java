package entidades;
/*
Implemente un programa para una Librería haciendo uso de un HashSet para evitar datos repetidos.
Para ello, se debe crear una clase llamada Libro que guarde la información de cada uno de los
libros de una Biblioteca. La clase Libro debe guardar el título del libro, autor, número de ejemplares
y número de ejemplares prestados. También se creará en el main un HashSet de tipo Libro que guardará
todos los libros creados. En el main tendremos un bucle que crea un objeto Libro pidiéndole al usuario
todos sus datos y los seteandolos en el Libro. Después, ese Libro se guarda en el conjunto y se le pregunta
al usuario si quiere crear otro Libro o no. La clase Librería contendrá además los siguientes métodos:
• Constructor por defecto. • Constructor con parámetros. • Métodos Setters/getters
• Método préstamo(): El usuario ingresa el título del libro que quiere prestar y se lo busca en el conjunto.
Si está en el conjunto, se llama con ese objeto Libro al método. El método se incrementa de a uno, como un
carrito de compras, el atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá cada
vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares
 disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
 • Método devolucion(): El usuario ingresa el título del libro que quiere devolver y se lo busca en el conjunto.
 Si está en el conjunto, se llama con ese objeto al método. El método decrementa de a uno, como un carrito
 de compras, el atributo ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
 vez que se produzca la devolución de un libro. No se podrán devolver libros donde que no tengan ejemplares
 prestados. Devuelve true si se ha podido realizar la operación y false en caso contrario.
 • Método toString para mostrar los datos de los libros.
 */
public class Libro {
    private String titulo;
    private String autor;
    private Integer cantEjemplares;
    private Integer ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer cantEjemplares, Integer ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantEjemplares = cantEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getCantEjemplares() {
        return cantEjemplares;
    }

    public void setCantEjemplares(Integer cantEjemplares) {
        this.cantEjemplares = cantEjemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", cantEjemplares=" + cantEjemplares +
                ", ejemplaresPrestados=" + ejemplaresPrestados +
                '}';
    }
}
