package Servicios;
/*
Método getDiscriminante(): devuelve el valor del discriminante (double).
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c

Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
para que esto ocurra, el discriminante debe ser mayor o igual que 0.

Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.

Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.

Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.

Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará
por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(),
según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.

Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
import Entidades.Raices;

import javax.swing.*;

public class RaicesServicios {
//    public static class ServiciosRaices {
//        //metodo para crear raices
     public Raices crearRaices() {
          int A = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor A"));
           int B = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor B"));
           int C = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor C"));
          return new Raices(A, B, C);
       }

        //metodo getDiscriminante

        public double getDiscriminate(Raices raiz) {
            return (Math.pow(raiz.getCoeficienteB(), 2)) - (4 * raiz.getCoeficienteA() * raiz.getCoeficienteC());
        }

        //metodo tieneRaices
        public boolean tieneRaices(Raices raiz) {
            return getDiscriminate(raiz) >= 0;
        }

        //metodo tieneRaiz
        public boolean tieneRaiz(Raices raiz) {
            return getDiscriminate(raiz) == 0;
        }

        //metodo obtenerRaices
        public void obtenerRaices(Raices raiz) {
            //(-b±√((b^2)-(4*a*c)))/(2*a)
            if (tieneRaices(raiz)) {
                double raiz1 = ((-raiz.getCoeficienteB()) + (Math.sqrt(getDiscriminate(raiz)))) / (2 * raiz.getCoeficienteA());
                double raiz2 = ((-raiz.getCoeficienteB()) - (Math.sqrt(getDiscriminate(raiz)))) / (2 * raiz.getCoeficienteA());
            JOptionPane.showMessageDialog(null,"La raiz uno es :" + raiz1 +
                    "\n La raiz 2 es : " + raiz2);
            }

        }
        //metodo obtenerRaiz
        public void obtenerRaiz(Raices raiz){
            //(-b±√((b^2)-(4*a*c)))/(2*a) si tiene una unica raiz es porque el discriminante
            // ( que es la expresion que esta dentro de la raiz cuadrada) es cero,
            // entonces la formula para calcular una unica raiz es : (-b/(2*a)
            if (tieneRaiz(raiz)){
                int raizUnica = -raiz.getCoeficienteB()/(2* raiz.getCoeficienteA());
                JOptionPane.showMessageDialog(null,"La unica raiz es : " + raizUnica);
            }
        }
        //metodo Calcular
        public void calcular(Raices raiz){
            if (tieneRaices(raiz)){
                obtenerRaices(raiz);
            } else if (tieneRaiz(raiz)) {
                obtenerRaiz(raiz);
            }else JOptionPane.showMessageDialog(null,"La ecuación no tiene solución");
        }
    }


