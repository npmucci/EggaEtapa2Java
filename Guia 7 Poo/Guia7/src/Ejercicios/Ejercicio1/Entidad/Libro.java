package Ejercicios.Ejercicio1.Entidad;
import java.util.Scanner;
public class Libro {

        public int isbn;
        public String titulo;
        public String autor;
        public int numPaginas;

        public Libro() {
        }

        public Libro(int isbn, String titulo, String autor, int numPaginas) {
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.numPaginas = numPaginas;
        }

        public void cargarLibro() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el número de ISBN: ");
            isbn = sc.nextInt();
            System.out.print("Ingrese el título del libro: ");
            titulo = sc.nextLine();
            System.out.print("Ingrese el nombre del autor: ");
            autor = sc.nextLine();
            System.out.print("Ingrese el número de páginas: ");
            numPaginas = sc.nextInt();
        }
        public void informarLibro() {
            System.out.println("ISBN: " + isbn);
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Número de páginas: " + numPaginas);
        }
    }


