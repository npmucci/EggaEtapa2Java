package servicios;

import entidades.Persona;

import javax.swing.*;
import java.util.Date;


/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
public class PersonaService {

    public Persona crearPersona(){
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de nacimiento"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el mes de nacimiento"));
        int dia= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dia de nacimiento"));
        Date fecha = new Date(anio-1900, mes-1, dia );

        return new Persona(nombre,fecha);

    }
    public int Edad(Persona persona, Date hoy){
        //calculamos los anios que paaron desde que nacimos a hoy
        int edad= Math.abs((hoy.getYear()-1900)-(persona.getFechaNacimiento().getYear()-1900));
        //tomamos en cuenta que quizas no cumplimos anios aun evaluando el mes
        if(persona.getFechaNacimiento().getMonth()+1>hoy.getMonth()-1){
            edad--;
            //tomamos en cuenta que quizas no cumplimos anios aun evaluando el dia
        }else if(persona.getFechaNacimiento().getMonth()+1==hoy.getMonth()-1 && persona.getFechaNacimiento().getDate()>hoy.getDate()){
            edad--;
        }
        return edad;
    }

    public boolean menorQue(Persona pers, int edad, Date hoy) {

        return Edad(pers, hoy) < edad;
    }

    public String mostrarDatos(Persona persona1){
        return "Nombre: " + persona1.getNombre() + "\nFecha de nacimiento: " + persona1.getFechaNacimiento().getDate()
                + "/" + (persona1.getFechaNacimiento().getMonth()+1) + "/" + (persona1.getFechaNacimiento().getYear());
    }



}
