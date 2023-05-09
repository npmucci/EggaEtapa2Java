package servicio;

import entidades.ParDeNumeros;

import javax.swing.*;

/*
Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
public class ParDeNumerosServicio {

    public void mostrarValores(ParDeNumeros numeros){
        JOptionPane.showMessageDialog(null ,"Los valores son :\n"
                + numeros.getNumero1() + "\n" + numeros.getNumero2());
    }

    public double devolverMayor(ParDeNumeros numeros){
        return Math.max(numeros.getNumero1(), numeros.getNumero2());
    }

    public void calcularPotencia(ParDeNumeros numeros){
        int numero1= (int) numeros.getNumero1();
        int numero2 = (int) numeros.getNumero2();
        double potencia = Math.pow(Math.max(numero1,numero2), Math.min(numero1,numero2));
        JOptionPane.showMessageDialog(null, Math.max(numero1,numero2)+ " elevado a "
                + Math.min(numero1,numero2) + " es igual a " + potencia );

    }

    public void calcularRaiz(ParDeNumeros numeros){
        double numero1= Math.abs(numeros.getNumero1());
        double numero2= Math.abs(numeros.getNumero2());
        double raiz = Math.sqrt(Math.min(numero1,numero2));
        JOptionPane.showMessageDialog(null, "La raiz cuadrada de "
                + Math.min(numero1,numero2) + " es " + raiz);


    }
}
