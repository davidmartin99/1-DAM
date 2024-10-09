package loteria_bbdd;

import static java.lang.Math.random;

/**
 *
 * @author david
 */
public class juegoLoteria3 {
          
          public static void main(String[] args) {
                    int numeroGanador = (int) (random() * 100000); // numero entre 0 y 99999

                    String numeroGanadorFormateado = String.format("%05d", numeroGanador); // Formatear el número con 5 cifras
                    System.out.println("Numero Ganador: " + numeroGanadorFormateado);                    
                    
          }//Fin main
        
}//Fin class
