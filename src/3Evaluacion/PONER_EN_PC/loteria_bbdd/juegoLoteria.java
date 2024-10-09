package loteria_bbdd;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Generar 6 numeros aleatorios
 * @author david
 */
public class juegoLoteria {
         public static void main(String[] args) {
                  ArrayList<Integer> numerosLoteria = new ArrayList<>();
                  
                  do{
                           int num = (int)(random() * 49) + 1;
                           // Si contiene ya el numero, lo borra, si no lo guarda. Para que no haya numeros repetidos
                           if (!numerosLoteria.contains(num)) {
                                    numerosLoteria.add(num);
                           }//Fin if
                  }while(numerosLoteria.size() < 7);
                 
              
                  
                  // Ordena los números de menor a mayor
                  // Collections.sort(numerosLoteria);
                  ArrayList<Integer> numerosLoteria6 = new ArrayList<>(numerosLoteria.size()-1);
                  for(int i = 0; i <numerosLoteria.size()-1; i++){
                           numerosLoteria6.add(numerosLoteria.get(i) );
                  }
                   // Ordeno el ArrayList de mayor a menor y lo imprimo
                   System.out.println("\nArrayList ordenado de mayor a menor");
                   Comparator<Integer> comparador = Collections.reverseOrder();
                   Collections.sort(numerosLoteria6, comparador);
                   System.out.println(numerosLoteria6);
                   
                   
                  Collections.sort(numerosLoteria6);
                  
                  // IMPRIMIR NUMEROS
                  System.out.print("Numeros Ganadores:");
                  for (int i = 0; i < numerosLoteria6.size(); i++) {
                           System.out.print(numerosLoteria6.get(i));
                           // Que impra ", " en todos menos en el último
                           if(i < numerosLoteria6.size() - 1){
                                    System.out.print(", ");
                           }//Fin if
                  }//Fin for
                  
                  // IMPRIMIR COMPLEMENTARIO, es el 6ºto numero
                  System.out.println("\nComplementario: " + numerosLoteria.get(6) );

                 
         }//Fin main
         
}//Fin class




// Con  Iterator
/*
                  // Usar Iterator para imprimir los 6 primeros números
                  Iterator<Integer> iterator = numerosLoteria.iterator();

                  System.out.print("Números generados: ");
                  for (int i = 0; i < 6; i++) {
                           if (iterator.hasNext()) {
                                    System.out.print(iterator.next() + " ");
                           }
                  }

                  // Imprime el último número como complementario
                  if (iterator.hasNext()) {
                           System.out.println("\nNúmero complementario: " + iterator.next());
                  }
 */
// Imprime los números y el complementario por separado
// System.out.println("Números generados: " + numerosLoteria);
// System.out.println("Número complementario: " + complementario);                  

