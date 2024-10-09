package tema10_colecciones;

import java.util.ArrayList;

/**
 * ArrayList = 13, 22, 4, 56, 12
 *  Queremos que lo ordene y quede así:
 * ArrayList = 12, 13, 22, 4, 56
 * @author david
 */
public class Ej3_ArrayList_Posiciones {
         // Metodo
         public static void desplazar(ArrayList<Integer> lis){
                  lis.add(0,lis.remove(lis.size()-1));
         }//Fin desplazar
         
         public static void main(String[] args) {
                  // Declara el ArrayList
                  ArrayList<Integer> numeros = new ArrayList<>();
                  
                  // Añadir los numeros al ArrayList
                  numeros.add(13);
                  numeros.add(22);
                  numeros.add(4);
                  numeros.add(56);
                  numeros.add(12);
                  
                  // Quitamos el último número del ArrayList
                  int ultimoNumero=numeros.remove(numeros.size()-1);
                  // Añadimos último número a la posición 0 del ArrayList
                  numeros.add(0,ultimoNumero);
                  
                  // Imprimimos con un for each
                  for (Integer numero : numeros) {
                           System.out.print(numero+" ");
                  }//Fin 

         }//Fin main
         
}//Fin class
