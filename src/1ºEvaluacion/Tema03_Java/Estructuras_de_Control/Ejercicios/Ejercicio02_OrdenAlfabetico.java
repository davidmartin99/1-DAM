package ActividadesTema03;
/**
 * Crear una pequeña aplicación Java que lea dos caracteres y nos diga si están
 * en orden alfabético.
 *
 * @author David
 */
import java.util.Scanner;

public class Ejercicio02_OrdenAlfabetico {
    //Funcion 
    public static void EnOrden(char letra1, char letra2){
         if(letra1==letra2+1 || letra2==letra1+1){
            System.out.println("Los caracteres estan en orden alfabetico");
        } else if(letra2==letra1 || letra1==letra2){
            System.out.println("Los caracteres son iguales");
        }else {
            System.out.println("Los caracteres NO estan en orden alfabetico");
                }//Fin del if
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Declarar e inicializar variables
        char letra1, letra2;

        //Entrada de datos
        System.out.println("Introduzca la primera letra: ");
        letra1 = teclado.next().charAt(0);
        System.out.println("Introduzca la segunda letra: ");
        letra2 = teclado.next().charAt(0);
        
        //Llamamos a la función
        EnOrden(letra1,letra2);
        
    }//Fin main

}//Fin class