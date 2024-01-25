
package Servicios;

import DAO.AutorDao;
import Entidades.Autor;
import java.util.List;
import java.util.Scanner;


public class AutorServicio {
    // agregando una intancia del dao de la entidad en el servicio logramos relacionar las clases
    public final AutorDao autorDao;
      Scanner leer= new Scanner(System.in).useDelimiter("\n");
    public AutorServicio() {
        //cuando se instancie un objeto del tipo Autor servicio, se va a 
        //instanciar un objeto del tipo AutorDao y por lo tanto se crea la conección a la base de datos
        this.autorDao = new AutorDao();
    }
 //creamos un autor vacio, pedimos quese ingrese el nombre, buscamos el nombre en la base de datos
 //si no se encuentra el nombre en la base, se le setea el nombre al autor y se lo pasamos al metodo 
//guardar para que lo guarde en la tabla .Lo retornamos para el caso que lo necesitemos setearselo a un libro
      public Autor crearAutor() throws Exception{
        Autor autor = new Autor();
        System.out.println("Ingrese nombre del Autor");
        String nombre = leer.next();
        List<Autor> autores = autorDao.buscarAutoresNombre(nombre);
          if (autores.isEmpty()) {
             autor.setNombre(nombre);
             autorDao.guardar(autor);
              System.out.println("El autor se cargo de forma exitosa");
          } else{
              System.out.println("El autor ya esta creado");
          }
          return autor;
    }
//le pedimos al usuario el mombre del autor que quiere buscar y retronamos una
//lista con todos los nombres de autroes que coincidan
    public List<Autor> buscarAutorNombre() throws Exception{
        System.out.println("Ingrese el nombre del autor");
        String nombre = leer.next();
        List<Autor> autores= autorDao.buscarAutoresNombre(nombre);
      return autores;
    }
    
    
    /*metodo para buscar el autor que se le va a asignar al libro
    primero mostramos la lista de los autores disponibles
    despues le pedimos que ingrese la opcion, si la opcion es cero llamamos al metodo
    crear autor, para que se ingrese el dato del autor
    sino, buscamos el autor por id. Por ultimo, retornamos el autor para setearlo en el libro*/
    
    public Autor asignarAutor() throws Exception{
        System.out.println("Ingrese el Id del autor, si el autor no se"
                + " encuentra en el listado ingrese 0(cero)");
        List<Autor> listaAutores = autorDao.listarAutores();
        System.out.println("Listado de autores");
        for (Autor autores: listaAutores) {
            System.out.println("Nombre = " + autores.getNombre() + " ID " + autores.getId());
        }
        Integer id = leer.nextInt();
        Autor autor = null;
        if (id==0) {
           autor = crearAutor();
        } else{
          autor = autorDao.buscarAutorId(id);
        }
        return autor;
    }
    
    //Le pido que ingrese el id del  autor, busco el autor por ID
    //lo retorno, lo modifico y se lo paso al metodo modificar del dao para que haga el merge
    public void modificarAutor () throws Exception{
      System.out.println("Ingrese el Id del autor a modificar");
        Integer id = leer.nextInt();
        Autor autorModificar = autorDao.buscarAutorId(id);
        System.out.println("Ingrese el nuevo nombre del Autor");
        autorModificar.setNombre(leer.next());
        autorDao.editar(autorModificar);
    }
    
     //Le pido que ingrese el id del  autor, busco el autor por ID
    //lo retorno,  y se lo paso al metodo eliminarAutor del dao para que lo inactive o la borre.
    public void eliminarAutor() throws Exception{
        System.out.println("Ingrese el Id del autor a eliminar");
        Integer id = leer.nextInt();
        Autor autorEliminar = autorDao.buscarAutorId(id);
        autorDao.eliminarAutor(autorEliminar);
      
    }
    
}