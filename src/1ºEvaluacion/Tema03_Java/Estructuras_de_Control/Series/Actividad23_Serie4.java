package Series;
/**
 * Dada la siguiente serie numérica 1 5 3 7 5 9 7 11 9 13  
 * crear un procedimiento donde el usuario introduzca el numero de elementos, y
 * se guarden en una cadena de caracteres.
 * Ejemplo:
 * Indique cuantos números de la serie quiere ver: 5 Serie: 1 5 3 7 5  
 * 
 * b) Mejorar la actividad con una nueva versión donde se almacene en un array
 * la serie.
 * 
 * @author David 
 */

import java.util.Scanner;

public class Actividad23_Serie4 {

    public static void valorSerie04(int num) {
        int valorSerie = 1;
        for (int i = 1; i < num + 1; i++) {
            System.out.print(" " + valorSerie);
            if (i % 2 == 0) {
                valorSerie -= 2;
            } else {
                valorSerie += 4;
            }//Fin if
        }//Fin for
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int num = teclado.nextInt();

        valorSerie04(num);
    }
}

