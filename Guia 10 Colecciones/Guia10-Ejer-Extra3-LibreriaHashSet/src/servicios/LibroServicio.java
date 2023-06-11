package servicios;

import entidades.Libro;

import javax.swing.*;

/*
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
 */
public class LibroServicio {

    public Libro crearLibro(){
        Libro libro = new Libro();
        libro.setTitulo(JOptionPane.showInputDialog("Ingrese el título del libro"));
        libro.setAutor(JOptionPane.showInputDialog("Ingrese el nombre del autor"));
        libro.setCantEjemplares(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ejemplares del libro")));
        libro.setEjemplaresPrestados(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de libros prestados")));
        return libro;
    }
}
