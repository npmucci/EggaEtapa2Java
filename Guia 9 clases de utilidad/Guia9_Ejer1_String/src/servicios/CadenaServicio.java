package servicios;

import entidades.Cadena;

import javax.swing.*;

public class CadenaServicio {

    public Cadena crearCadena(){
        String frase = JOptionPane.showInputDialog("Ingrese una Frase");
        return new Cadena(frase);
    }

   // a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

    public void mostrarVocales(Cadena cadena){
        int vocales =0;

        for (int i =0; i< cadena.getLongitud();i++){
            switch (cadena.getFrase().substring(i, i+1).toLowerCase()){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    vocales++;

            }
        }
        JOptionPane.showMessageDialog(null,"La cantidad de vocales es : " + vocales);
    }

    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.

    public void invertirFrase(Cadena cadena){
        String cadenaNueva = "";
        for (int i = cadena.getLongitud(); i>0; i--){
            cadenaNueva = cadenaNueva + cadena.getFrase().substring(i-1,i);
        }
        JOptionPane.showMessageDialog(null, "La cadena invertida es: "+ cadenaNueva);
    }

    //c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite el carácter en la
    //frase, por ejemplo: Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    public void vecesRepetido(Cadena cadena){
        String letra = JOptionPane.showInputDialog("Ingresa la letra a buscar dentro de la frase");
        int contador=0;
        for (int i =0; i< cadena.getLongitud(); i++){
            if (cadena.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                contador++;
            }
        }
        if (contador>1){
            JOptionPane.showMessageDialog(null, "La letra : [" + letra + "] se repite " + contador + " veces");
        } else if (contador == 1){
            JOptionPane.showMessageDialog(null, "La letra : [" + letra + "] solo esta una vez");
        } else { JOptionPane.showMessageDialog(null, "La letra : [" + letra + "] no se encuentra en la frase");}

    }

    //d) Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con o
    // otra nueva frase ingresada por el usuario.

    public void compararLongitud(Cadena cadena){
        String frase2= JOptionPane.showInputDialog("Ingrese una frase nueva");
        int longitud = cadena.getLongitud() - frase2.length();
        if (longitud>0){
            JOptionPane.showMessageDialog(null, "La frase : '" + cadena.getFrase() +"' es mas larga que la frase '" + frase2 + "'");
    } else if (longitud<0) {
            JOptionPane.showMessageDialog(null, "La frase : '" + cadena.getFrase() +"' es mas corta que la frase '" + frase2 + "'");
        } else{
            JOptionPane.showMessageDialog(null, "La frase : '" + cadena.getFrase() +"' y la frase '" + frase2 + "', tienen la misma longitud");
        }
    }

    //e) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva
    // frase ingresada por el usuario y mostrar la frase resultante.

    public void unirFrases(Cadena cadena){
        String frase2 = JOptionPane.showInputDialog("Ingrese una nueva frase");
        String fraseUnida = cadena.getFrase().concat(" " + frase2);
        JOptionPane.showMessageDialog(null, "Las dos frases unidas son : "+ fraseUnida);
    }

//f) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
// por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

    public void reemplazar(Cadena cadena){
        String caracter = JOptionPane.showInputDialog("Ingrese el caracter por el que quiera reemplazar la letra 'a'");
        String fraseRemplazo = cadena.getFrase().replaceAll("a", caracter);
        JOptionPane.showMessageDialog(null, fraseRemplazo);
    }

    //g) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
    // verdadero si la contiene y falso si no.
    public void contiene(Cadena cadena) {
        String letra = JOptionPane.showInputDialog("Ingrese una letra");
        boolean contiene = cadena.getFrase().contains(letra);
        if (contiene){
            JOptionPane.showMessageDialog(null, "La letra : '" + letra + "', esta en la frase " + cadena.getFrase());
        }else{
            JOptionPane.showMessageDialog(null, "La letra : '" + letra + "', no esta en la frase " + cadena.getFrase());
        }

    }


    }
