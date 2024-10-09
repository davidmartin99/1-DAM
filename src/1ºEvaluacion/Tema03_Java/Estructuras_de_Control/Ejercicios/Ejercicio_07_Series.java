
package Series;

/**
 *
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio_07_Series {
    
    public static void valorSerie01(int num){
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
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el numero: ");
        int num = teclado.nextInt();
       
        valorSerie01(num);
    }
}
