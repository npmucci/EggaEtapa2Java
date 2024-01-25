
package Servicios;

import DAO.EditorialDao;
import Entidades.Editorial;
import java.util.List;
import java.util.Scanner;


public class EditorialServicio {
    // agregando una intancia del dao de la entidad en el servicio logramos relacionar las clases
    private final EditorialDao editorialDao;
        Scanner leer= new Scanner(System.in).useDelimiter("\n");
    
    
        public EditorialServicio(){
         //cuando se instancie un objeto del tipo Editorial servicio, se va a 
        //instanciar un objeto del tipo EditorialDao y por lo tanto se crea la conección a la base de datos
        this.editorialDao = new EditorialDao();
    }
        
        
  //creamos un autor vacio, pedimos quese ingrese el nombre, buscamos el nombre en la base de datos
 //si no se encuentra el nombre en la base, se le setea el nombre al autor y se lo pasamos al metodo 
//guardar para que lo guarde en la tabla .Lo retornamos para el caso que lo necesitemos setearselo a un libro
     public Editorial crearEditorial() throws Exception {
        Editorial editorial = new Editorial ();
        System.out.println("Ingrese el nombre de la Editorial");
        String nombre = leer.next();
        List<Editorial> listaEditoriales = editorialDao.buscarEditorialNombre(nombre);
         if (listaEditoriales.isEmpty()) {
             editorial.setNombre(nombre);
              editorialDao.guardar(editorial);
         }
        return editorial;
    }
     /*metodo para buscar la editorial que se le va a asignar al libro
    primero mostramos la lista de editoriales disponibles
    despues le pedimos que ingrese la opcion, si la opcion es cero llamamos al metodo
    crear editorial, para que se ingrese el dato de la editorial
    sino, buscamos la editoral por id. Por ultimo, retornamos la editorial para setearla en el libro*/
    
    public Editorial asignarEditorial() throws Exception{
        System.out.println("Ingrese el Id de la Editorial, si la Editoral no se"
                + " encuentra en el listado ingrese 0(cero)");
        List<Editorial> listaEditoriales = editorialDao.listarEditorial();
        System.out.println("Listado de Editoriales");
        for (Editorial editoriales: listaEditoriales) {
            System.out.println("Nombre = " + editoriales.getNombre() + " ID " + editoriales.getId());
        }
        Integer id = leer.nextInt();
        Editorial editorial = null;
        if (id==0) {
           editorial = crearEditorial();
        } else{
          editorial = editorialDao.buscarEditorialId(id);
        }
        return editorial;
    }

      //Le pido que ingrese el id de la editorial y la busco por ID
    //la retorno, la modifico y se la paso al metodo modificar del dao para que haga el merge
    public void modificarEditorial() throws Exception{
      System.out.println("Seleccione un Id de la Editorial a modificar");
        Integer id = leer.nextInt();
        Editorial editorialModificar = editorialDao.buscarEditorialId(id);
        System.out.println("Ingrese el nuevo nombre de la Editorial");
        editorialModificar.setNombre(leer.next());
        editorialDao.editar(editorialModificar);
    }
    
     //Le pido que ingrese el id de la editorial, la busco
    //la retorno,  y se lo paso al metodo eliminarEditorial del dao para que la inactive o la borre
    public void eliminarEditorial() throws Exception{
        System.out.println("Ingrese Id de la Editorial a eliminar");
        Integer id = leer.nextInt();
        Editorial editorialEliminar = editorialDao.buscarEditorialId(id);
        editorialDao.eliminarEditorial(editorialEliminar);
    }
}
