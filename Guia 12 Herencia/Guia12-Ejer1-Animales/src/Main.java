import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

public class Main {
    public static void main(String[] args) {

        Animal perro1  = new Perro("Stich","carne",7, "callejero");
        perro1.alimentarse();
        Animal perro2  = new Perro("Lilo","carne",10, "Dogo");
        perro2.alimentarse();
        Animal gato1  = new Gato("Lulu","pescado",3, "siames");
        gato1.alimentarse();
        Animal caballo1 = new Caballo("Chirola","pasto",15, "overa");
        caballo1.alimentarse();
    }
}