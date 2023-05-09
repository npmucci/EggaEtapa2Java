package servicio;

import javax.swing.*;
import java.util.Date;

/*
4. Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
 */
public class FechaService {
    //metodo para crear la fecha como objeto "Date"
    public Date fechaNacimiento(){
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu año de nacimiento")) ;
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu mes de nacimiento"));
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu día de nacimiento"));
        return new Date(anio-1900,mes-1,dia);
    }
    //metodo para conseguir la fecha actual
    public Date fechaActual(){
        Date fecha = new Date();
        return fecha;
    }
    //metodo que nos devuelve la edad del usuario
    public int Edad(Date nacimiento, Date hoy){
        //calculamos los anios que pasaron desde que nacimos a hoy
        int edad= Math.abs((hoy.getYear()-1900)-(nacimiento.getYear()-1900));
        //tomamos en cuenta que quizas no cumplimos anios aun evaluando el mes
        if(nacimiento.getMonth()+1>hoy.getMonth()-1){
            edad--;
            //tomamos en cuenta que quizas no cumplimos anios aun evaluando el dia
        }else if((nacimiento.getMonth()+1==hoy.getMonth()-1) && (nacimiento.getDate()>hoy.getDate())){
            edad--;
        }
        return edad;
    }
}

