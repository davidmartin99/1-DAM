package ActividadesTema03;

/**
 * Programa que te diga cuantos DIPTONGOS hay en una frase
 * Diptongo combinación de vocales en la misma sílaba
 * @author David
 */
import java.util.Scanner;

public class Juego_Diptongo {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String n;
        System.out.print("Escriba una frase: ");
        n = teclado.nextLine();
        
        int diptongos = 0;
        //Recorre toda la frase para comprobar si hay alguna opcion (diptongo)
        for(int i=0; i<n.length(); i++){
            //Ponemos todos los diptongos posibles
            //.indexOf devuelve un numero por lo que,
            //(n.indexOf) es mayor q -1 significa que hay diptongo
            if(n.indexOf("ai")>-1){
                diptongos++;
            }
            else if(n.indexOf("ei")>-1){
                diptongos++;
            }
            else if (n.indexOf("eu") > -1) {
                diptongos++;
            }
            else if (n.indexOf("oi") > -1) {
                diptongos++;
            }
            else if (n.indexOf("ou") > -1) {
                diptongos++;
            }
            else if (n.indexOf("ia") > -1) {
                diptongos++;
            }
            else if (n.indexOf("ie") > -1) {
                diptongos++;
            }
            else if (n.indexOf("io") > -1) {
                diptongos++;
            }
            else if (n.indexOf("iu") > -1) {
                diptongos++;
            }
            else if (n.indexOf("ua") > -1) {
                diptongos++;
            }
            else if (n.indexOf("ue") > -1) {
                diptongos++;
            }
            else if (n.indexOf("ui") > -1) {
                diptongos++;
            }
            else if (n.indexOf("uo") > -1) {
                diptongos++;
            }//Fin if
            
        }//Fin for
        
        //////////////Muestra los diptongos
        if (diptongos > 0) {
            System.out.println("La palabra: " + n + " es un DIPTONGO");
        } else {
            System.out.println("La palabra: " + n + " NO es un diptongo");
        }
        
    }//Fin main
    
}//Fin class
