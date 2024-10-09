package tema10_colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class ListasBidimensionales {
         
         public static void main(String[] args) {
                  // Me creo un array en 2 dimensiones
                  ArrayList<ArrayList<Integer>> lista01 = new ArrayList<>();
                  System.out.println("Lista en 2D: "+lista01);
                  
                  // Añadir elementos a la lista
                  int numberOfLists = 3;
                  for (int i = 0; i < numberOfLists; i++) {
                           lista01.add(new ArrayList<>());
                  }// Fin for
                 
                  System.out.println("Lista 2D inicializada: "+lista01);
                  
                  // Añado los elementos. El primero a la primera lista
                  // con .get() indico en que fila estoy del array bidimensional y luego .add() para añadir el elemento
                  lista01.get(0).add(5);
                  lista01.get(1).add(2);
                  lista01.get(2).add(4);
                  lista01.get(2).add(8);
                  lista01.get(2).add(1,3);
                  System.out.println("Lista 2D: "+lista01);
                  
                  // IMPRIMIR SIN CORCHETES 
                  // con un for
                  System.out.print("Lista ordenada con for: ");
                  for(ArrayList<Integer> list:lista01){
                           for (Integer i1: list) {
                                    System.out.printf("%s ", i1); //Con printf
                           }//Fin 2º for
                  }//Fin 1º for
                  System.out.println(" ");
                  
         }//Fin main
         
}//Fin class
