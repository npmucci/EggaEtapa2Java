package servicios;

import java.sql.Array;
import java.util.Arrays;

/*
Clase Arrays
 Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

 */
public class ServiciosArrays {

    public void inicializarA(float[] arregloA){
        for (int i= 0; i< arregloA.length;i++){
            arregloA[i] = (float) (Math.random()*1000);
        }
    }

   public void mostrar(float[] arregloA){
       for (int i= 0; i< arregloA.length;i++){
           System.out.print("[" +arregloA[i] + "]");
       }
   }

    public void ordenar(float[] arregloA){
        Arrays.sort(arregloA);
        for (int i= 0; i< arregloA.length;i++){
            System.out.print("[" +arregloA[i] + "]");
        }
    }

    public void inicializarB (float [] arregloA, float[] arregloB){
       System.arraycopy(arregloA,0,arregloB,0,40); //llena de la posicion 0 a la 39
        Arrays.fill(arregloB,40,50, 0.5F); // llena de la posciion 40 a la 49 porque array fill excluye el ultimo valor
        Arrays.fill(arregloB,arregloB.length-1,50, 0.5F); // lleno el ultimo valor

        for (int i= 0; i< arregloA.length;i++){
            System.out.print("[" +arregloB[i] + "]");
        }
    }
}
