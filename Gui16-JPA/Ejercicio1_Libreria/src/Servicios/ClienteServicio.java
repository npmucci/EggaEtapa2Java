/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import DAO.ClienteDao;
import Entidades.Cliente;
import java.util.List;
import java.util.Scanner;

public class ClienteServicio {
      private final ClienteDao clienteDao;
      Scanner leer= new Scanner(System.in).useDelimiter("\n");

    public ClienteServicio() {
        this.clienteDao = new ClienteDao();
    }

    // buscamos el cliente por dni, porque se supone que es un numero unico
     public void crearCliente() throws Exception {
        System.out.println("Ingrese el DNI del cliente:");
        Long dni = leer.nextLong();
                // Buscar cliente por DNI para verificar si ya existe
        List<Cliente> clientes = clienteDao.buscarClientePorDni(dni);
        if (clientes.isEmpty()) {
      // Crear un nuevo objeto Cliente con los datos ingresados
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setDocumento(dni);
         System.out.println("Ingrese el nombre del cliente:");
        nuevoCliente.setNombre(leer.next());
        System.out.println("Ingrese el Apellido del Cliente:");
       nuevoCliente.setApellido(leer.next());
        System.out.println("Ingrese el telefono del cliente:");
       nuevoCliente.setTelefono(leer.next());
       clienteDao.guardarCliente(nuevoCliente);
       System.out.println("Cliente creado exitosamente.");

   
        } else{
            System.out.println("El cliente con DNI " + dni + " ya existe en la base de datos.");
        }
      
    }

    public void modificarCliente(Long id, String nombre, String telefono) throws Exception {
        Cliente cliente = clienteDao.buscarClientePorId(id);
        if (cliente != null) {
            cliente.setNombre(nombre);
            cliente.setTelefono(telefono);
            clienteDao.editar(cliente);
            System.out.println("Cliente modificado correctamente.");
        } else {
            System.out.println("No se encontró un cliente con ese ID.");
        }
    }

    public void eliminarCliente(Long id) throws Exception {
        Cliente cliente = clienteDao.buscarClientePorId(id);
        if (cliente != null) {
            clienteDao.eliminar(cliente);
            System.out.println("Cliente eliminado correctamente.");
        } else {
            System.out.println("No se encontró un cliente con ese ID.");
        }
    }

    public List<Cliente> buscarTodosLosClientes() throws Exception {
        return clienteDao.listarClientes();
    }
    
}
