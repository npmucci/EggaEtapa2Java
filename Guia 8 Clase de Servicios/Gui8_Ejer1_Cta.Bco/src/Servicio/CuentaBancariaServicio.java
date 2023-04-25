package Servicio;
  /*
    Agregar la clase CuentaBancariaServicio en el paquete Servicios que
    contenga:
    a) Método para crear cuenta pidiéndole los datos al usuario.
    b) Método ingresar(double): recibe una cantidad de dinero a ingresar y
    se le sumará al saldo actual.
    c) Método retirar(double): recibe una cantidad de dinero a retirar y se le
    restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
    retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
    Validar que el usuario no saque más del 20%.
    e) Método consultarSaldo: permitirá consultar el saldo disponible en la
    cuenta.
    f) Método consultarDatos:
     */
import Entidades.CuentaBancaria;

import javax.swing.*;
import java.util.Scanner;

public class CuentaBancariaServicio {
    private Scanner leer = new Scanner(System.in); // para que al scanner se acceda solo dessde esta clase

        //metodo para crear una cuenta
        public CuentaBancaria crearCuenta() {
            CuentaBancaria cuenta = new CuentaBancaria();
            //usamos el setter para pedir el dato y directamente cuardarlo en el atributo.
            cuenta.setNumeroCuenta(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de cuenta")));
            cuenta.setDniCliente(Long.parseLong(JOptionPane.showInputDialog("Ingrese el número de DNI")));
            cuenta.setSaldoActual(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo de la cuenta")));
            return cuenta; //devuelve o retorna el objeto ya creado con lo tres parametros
        }
       /*
       Otra forma para crear una cuenta, en vez de crear el objeto

    private CuentaBancaria crearCuenta2(){

        System.out.println("Ingrese el numero de la cuenta bancaria");
        int numeroCuenta = leer.nextInt();
        System.out.println("Ingrese el número de DNI");
        long dniCliente = leer.nextLong();
        System.out.println("Ingrese el saldo de la cuenta");
        double saldoActual = leer.nextDouble();
       return new CuentaBancaria(numeroCuenta,dniCliente,saldoActual); //devuelve o retorna la creacion de un objeto del tipo CuentaBancaria

     } */

  /*
  metodo para ingresar dinero.
  se pasa un objeto por parametro, porque todo objeto se pasa por referencia, entonces se modifica su valor.
  A ese objeto se le puede dar el nombre que uno quiera, ya que el nombre no importa, sino el tipo y la cantidad
  de datos que se ingresan por parametro.
   */

        public void ingresar(CuentaBancaria cuenta){
            int deposito = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a depositar"));
        /*
         al atributo saldo actual le seteo el valor: con el get accedo al valor del saldo actual y
          le sumo el valor que le pido por teclado al usuario
         */
            cuenta.setSaldoActual(deposito + cuenta.getSaldoActual());
        }

        //metodo para retirar dinero
        public void retirar(CuentaBancaria cuenta){
            //guardamos el dato en una variable para poder hacer comprobaciones
            double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a retirar"));
            // comparo lo que quiero retirar con lo que tengo y seteo el nuevo valor de saldo actual.
            if (retiro<cuenta.getNumeroCuenta()){
                cuenta.setSaldoActual((cuenta.getSaldoActual())- retiro);
            } else {
                cuenta.setSaldoActual(0);
            }

        }

        // metodo extraccion rapida

        public void extraccionRapida (CuentaBancaria cuenta) {
            double extraccion = (cuenta.getSaldoActual() * 0.20);
            if (extraccion!=(cuenta.getSaldoActual() * 0.20)){
                JOptionPane.showMessageDialog(null,"La cantidad de dinero que desea retirar no esta permitida, unicamente puede retirar " + (cuenta.getSaldoActual()*0.20));
            } else{
                cuenta.setSaldoActual((cuenta.getSaldoActual() - extraccion));
                JOptionPane.showMessageDialog(null, "Usted acaba de extraer: $" + extraccion);
            }
        }

        public void consultarSaldo(CuentaBancaria cuenta){
            JOptionPane.showMessageDialog(null,"Su saldo actual es: " + cuenta.getSaldoActual());

        }

        public void mostrarDatos (CuentaBancaria cuenta){
            JOptionPane.showMessageDialog(null,cuenta.toString());

        }

    }


