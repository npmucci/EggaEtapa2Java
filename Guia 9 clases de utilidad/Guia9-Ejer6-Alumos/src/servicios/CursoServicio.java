package servicios;

import entidades.Curso;

import javax.swing.*;

public class CursoServicio {

    public String[] cargarAlumno(){
        String[] alumnos = new String[5];
        for (int i  = 0; i<5; i++){
            alumnos[i] = JOptionPane.showInputDialog("Ingrese el nombre del alumno " + (i+1));
        }
        return alumnos;
    }

    public Curso crearCurso(){
        String nombre= JOptionPane.showInputDialog("Ingrese el nombre del curso");
        int horas= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas por día"));
        int dias= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de días a la semana"));
        String turno = JOptionPane.showInputDialog("Ingrese el turno: mañana o tarde");
        int precio= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio por hora"));
        String[] alumnos = cargarAlumno();
        return new Curso(nombre,horas,dias,turno,precio,alumnos);
    }

    public void calcularGanancia(Curso curso){
        long ganancia = ((curso.getCantidadHorasPorDia()* curso.getPrecioPorHora())*curso.getCantidadDiasPorSemana())*curso.getAlummos().length;

        JOptionPane.showMessageDialog(null,"La ganancia semanal para el curso " + curso.getNombreClase() + " es: $ " + ganancia );
    }
}
