package main;

import servicios.ServiciosArrays;

/*
3. Crear en el main.Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales.
En el main.Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B
 */
public class Main {
    public static void main(String[] args) {
        float [] arregloA = new float[50];
        float [] arregloB = new float[50];
        ServiciosArrays sc = new ServiciosArrays();
        sc.inicializarA(arregloA);
        System.out.println("Arreglo A original");
        sc.mostrar(arregloA);
        System.out.println("");
        System.out.println("Arreglo A ordenado");
        sc.ordenar(arregloA);
        System.out.println("");
        System.out.println("Arreglo B");
        sc.inicializarB(arregloA,arregloB);


    }
}