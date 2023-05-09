package Servicios;

import Entidades.Nif;

import javax.swing.*;

/*

b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según
c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469-F).
método que funciona de la siguiente manera: Para calcular la letra se
toma el resto de dividir el número de DNI por 23 (el resultado debe ser
un número entre 0 y 22). El método debe buscar en un array (vector) de
caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente
 */
public class NifServicios {

    public Nif crearNif(){
        Nif nif = new Nif();
        long dni= Long.parseLong(JOptionPane.showInputDialog("Ingrese el DNI"));

        while(dni>100000000 || dni<=0 ){
            dni =Long.parseLong(JOptionPane.showInputDialog("El número ingresado es incorrecto, ingrese nuevamente el dni"));
        }
        nif.setDni(dni);

        nif.setLetra(asignarLetra(nif));
        return nif;
    }

    public String asignarLetra(Nif nif) {
        String[] letra = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","W","L","C","K","E"};
    int resto = (int) (nif.getDni()%23);
    return letra[resto];
    }

   public void mostrarNif(Nif nif){
        String dni = String.valueOf(nif.getDni());
        String aux= "";
        if(dni.length()<8){
            for (int i=0;i<(8-dni.length());i++){
                aux = "0" + aux;
            }
        }

        JOptionPane.showMessageDialog(null,aux + dni + "-" + asignarLetra(nif),"NIF",1) ;
    }


}
