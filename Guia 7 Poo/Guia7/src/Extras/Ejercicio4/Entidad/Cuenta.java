package Extras.Ejercicio4.Entidad;

import java.util.Scanner;

/*
. Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
public class Cuenta {
    private int saldo;
    private String titular;

    //Constructor vacio
    public Cuenta() {
    }

    //constructor parametrizado

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    // getters y setters

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void retirarDinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dinero a retirar");
        int retiro = leer.nextInt();

        if (retiro>this.saldo){
            do {
                System.out.println("El saldo es insuficiente para realizar la operación, ingrese un monto menor");
                retiro = leer.nextInt();
            }while(retiro>this.saldo);
        }
        System.out.println("El saldo disponible es: "+ (this.saldo-retiro));
    }
}
