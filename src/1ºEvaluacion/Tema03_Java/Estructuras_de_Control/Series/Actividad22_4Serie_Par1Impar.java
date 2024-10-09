package Series;

/**
 * Crear una serie donde las posiciones pares devuelva un menos uno y las
 * impares un uno, donde el usuario introduce el numero de veces que quiere que
 * salga. 
 * 
 * Ejemplo:
 * Introduce el numero de elementos: 6 
 * -1,1,-1,1,-1,1
 * @author David 
 */
import java.util.Scanner;

public class Actividad22_4Serie_Par1Impar {
    public static void valorSerie03(int elemento){
        for (int i=1; i<=elemento; i++){
            //Si i es par imprime -1 (i%2==0 si i entre 2 da resto 0)
            if(i%2==0){
                System.out.print("-1");
            }
            else{ //Si no es impar por lo que imprime 1
                System.out.print("1");
            }//Fin 1 if
            //Si el elemento es mayor a i que ponga una coma ,
            if(elemento>i){
                System.out.print(", ");
            }//Fin if 2
        }//Fin for
    }//Fin proceso
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //Introducir datos
        System.out.print("Introduce el numero de elementos: ");
        int elemento = teclado.nextInt();
        //Llamamos al proceso
        valorSerie03(elemento);
        
    }//Fin main
    
}//Fin class
