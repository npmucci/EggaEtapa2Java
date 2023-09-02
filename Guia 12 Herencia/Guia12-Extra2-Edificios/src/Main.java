import entidades.Edificio;
import entidades.EdificioOficinas;
import entidades.Polideportivo;

import java.util.ArrayList;

/*
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Edificio> listaEdificios  = new ArrayList<>();

        Edificio poli1 = new Polideportivo("Islas Malvinas", "Techado", 3,2,5);
        Edificio poli2 = new Polideportivo("Marcos Sastre", "Abierto", 2,3,0);
        Edificio oficina1 = new EdificioOficinas(4,10,4,10,10,30);
        Edificio oficina2 = new EdificioOficinas(6,20,8,30,30,50);
        listaEdificios.add(poli1);
        listaEdificios.add(poli2);
        listaEdificios.add(oficina1);
        listaEdificios.add(oficina2);
        int techado = 0;
        for (Edificio edificio: listaEdificios) {
            if (edificio instanceof Polideportivo ){
                System.out.println("La superficie del polideportivo " + ((Polideportivo) edificio).getNombre() +
                " es: " + edificio.calcularSuperficie());
                System.out.println("El volumen del polideportivo " + ((Polideportivo) edificio).getNombre()+
                        " es: " + edificio.calcularVolumen());
                System.out.println("---------------------------------------------------------");
                if (((Polideportivo) edificio).getTipoInstalacion().equalsIgnoreCase("Techado")){
                    techado++;
                }
            }

            if (edificio instanceof EdificioOficinas){
                System.out.println("La superficie del edificio es: " + edificio.calcularSuperficie());
                System.out.println("El volumen del edificio es: " + edificio.calcularVolumen());
                ((EdificioOficinas) edificio).crearPersonas();
                System.out.println("---------------------------------------------------------");
            }

        }
    }
}