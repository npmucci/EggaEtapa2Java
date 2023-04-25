package Servicios;

import Entidades.Cafetera;

import javax.swing.*;

/*
Crear clase CafeteraServicio en
el paquete Servicios con los siguiente:
a) Método llenarCafetera(): hace que la cantidad actual sea igual a la
capacidad máxima.
b) Método servirTaza(int): se pide el tamaño de una taza vacía, el
método recibe el tamaño de la taza y simula la acción de servir la
taza con la capacidad indicada. Si la cantidad actual de café “no
alcanza” para llenar la taza, se sirve lo que quede. El método le
informará al usuario si se llenó o no la taza, y de no haberse llenado
en cuanto quedó la taza.
c) Método vaciarCafetera(): pone la cantidad de café actual en cero.
d) Método agregarCafe(int): se le pide al usuario una cantidad de café,
el método lo recibe y se añade a la cafetera la cantidad de café
indicada
 */
public class CafeteraServicio {

    //metodo llenar cafetera
    public void llenarCafetera(Cafetera cafetera){
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
    }
    //metodo servir taza
    public void servirTaza(Cafetera cafetera){
        int taza = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantida de mililitros que tiene la tasa"));
    if (taza> cafetera.getCapacidadActual()){
        JOptionPane.showMessageDialog(null,"La cantidad de cafe no alcanzó a llenar la taza\n"
                + "su taza tiene: " + cafetera.getCapacidadActual() + "ml de cafe");
    } else{
        JOptionPane.showMessageDialog(null,"Su taza se lleno por completo");
    }
    }
    //metodo vaciar cafetera
    public void vaciarCafetera(Cafetera cafetera){
        cafetera.setCapacidadActual(0);
    }
    //metodo agregar cafe
    public void agregarCafe(Cafetera cafetera){
        int agregarCafe = Integer.parseInt(JOptionPane.showInputDialog("¿Que cantidad de cafe desea agregar?"));
        cafetera.setCapacidadActual(agregarCafe + cafetera.getCapacidadActual());
    }



}
