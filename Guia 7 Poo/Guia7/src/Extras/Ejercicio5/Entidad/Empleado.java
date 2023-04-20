package Extras.Ejercicio5.Entidad;

import javax.swing.*;

/*
5. Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
public class Empleado {
    private String nombre;
    private int edad;
    private int salario;


    //constructor vacio
    public Empleado() {
    }

    //constructor con parametros
    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    //metodo del ejercicio

    public void calcularAumento(){
        if (this.edad>30){
            this.salario = (int) (this.salario* 1.1);
        }else{
            this.salario =  (int) (this.salario * 1.05);
        }
        JOptionPane.showMessageDialog(null, "De acuerdo a su edad: " + this.edad + " años, su nuevo salario es: " + this.salario);
    }
}
