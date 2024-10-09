package Series;

/**
 * Dada la siguiente serie numérica 1 5 3 7 5 9 7 11 9 13 crear un procedimiento
 * donde el usuario introduzca el numero de elementos, y se guarden en una
 * cadena de caracteres. Ejemplo: Indique cuantos números de la serie quiere
 * ver: 5 Serie: 1 5 3 7 5
 *
 * b) Mejorar la actividad con una nueva versión donde se almacene en un array
 * la serie.
 *
 * @author David
 */

import java.util.Scanner;

public class Actividad23_ArraySerie4 {

    public static void valorSerie04b(int num) {
        int [] arraySerie04b = new int [num];
        //inicializar en 1 el array
        arraySerie04b [0] = 1;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                arraySerie04b[i-1]= arraySerie04b[i-2]+4;
            } else {
                arraySerie04b[i-1] = arraySerie04b[i-3]+2;
            }//Fin if
        }//Fin for
        
        //IMRPRIMIR EL ARRAY con foreach
        for(int j:arraySerie04b){
            System.out.print(j+" ");
        }//Fin foreach
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int num = teclado.nextInt();

        valorSerie04b(num);
    }
}
