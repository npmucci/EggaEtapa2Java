package main;

import entidades.Curso;
import servicios.CursoServicio;

public class Main {
    public static void main(String[] args) {

        CursoServicio sc = new CursoServicio();
        Curso curso1 = sc.crearCurso();
        sc.calcularGanancia(curso1);

    }
}