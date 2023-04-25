package Servicios;
/*
En el paquete Servicios crear PersonaServicio con los siguientes 3
métodos:
a) Método esMayorDeEdad(): indica si la persona es mayor de edad. La
función devuelve un booleano.
b) Metodo crearPersona(): el método crear persona, le pide los valores
de los atributos al usuario y después se le asignan a sus respectivos
atributos para llenar el objeto Persona. Además, comprueba que el
sexo introducido sea correcto, es decir, H, M o O. Si no es correcto se
deberá mostrar un mensaje.
c) Método calcularIMC(): calculara si la persona está en su peso ideal
(peso en kg/(altura^2 en mt2)). Si esta fórmula da por resultado un
valor menor que 20, significa que la persona está por debajo de su
peso ideal y la función devuelve un -1. Si la fórmula da por resultado
un número entre 20 y 25 (incluidos), significa que la persona está en
su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */

import Entidades.Persona;

import javax.swing.*;


public class PersonasServicios {

    //metodo crear persona

    public Persona crearPersona(){
    Persona persona = new Persona();
    persona.setNombre(JOptionPane.showInputDialog("Ingrese el nombre la persona"));
    persona.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona")));

        //para no tener que hacer comprobacion, utilizo la caja de mensaje con las tres opciones y que haga clik en al que corresponda
        String[] vector ={"Mujer", "Hombre", "Otro"};
        int sexo = JOptionPane.showOptionDialog(null,"Seleccione el sexo", "Sexo",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,null,vector,null);
        //como la caja devuelve un int de acuerdo a la posicion que tiene en el vector la opcion que elegimos, tengo que hacer un switch para transformar esa opcion en el tipo de sexo y setearlo en el atributo sexo.
        switch (sexo){
            case 0:persona.setSexo("Mujer");
            break;
            case 1: persona.setSexo("Hombre");
            break;
            case 2: persona.setSexo("Otro");
            break;
        }

    persona.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el peso")));
    persona.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura")));
    return persona;
    }
    //metodo es mayor de edad
    public boolean esMayor(Persona persona){
        return persona.getEdad() > 18;
    }
    //metodo calcular IMC
    public int calcularIMC(Persona persona){
        int imc = (int) (persona.getPeso()/(Math.pow(persona.getAltura(),2)));
       if (imc<20){
           return -1;
        }else if (imc>=20 & imc<=25){
           return 0;
       }else{
           return 1;
       }
    }

    public void porcetajeImc(int[] vector){
        int pesoIdeal=0;
        int sobrePeso=0;
        int bajoPeso=0;
        for (int i : vector)
            if (i == -1) {
                bajoPeso++;
            } else if (i == 0) {
                pesoIdeal++;
            } else sobrePeso++;


        System.out.println("El porcentaje de personas con peso ideas es :" + (pesoIdeal*100)/4 + "%");
        System.out.println("El porcentaje de personas con bajo peso es :" + (bajoPeso*100)/4 + "%");
        System.out.println("El porcentaje de personas con sobre peso es: " + (sobrePeso*100)/4 +"%");
    }

    public void porcentajeMayores(boolean[] vector){
        int mayores=0, menores=0;
        for (boolean i : vector) {
            if (i) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("El porcentaje de personas mayores de edad es: " + (mayores*100)/4 + "%");
        System.out.println("El porcentaje de personas menores de edad es: " + (menores*100)/4 + "%");
    }






}
