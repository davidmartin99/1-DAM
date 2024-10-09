package tema10_colecciones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author david
 */
public class Ej2_ArrayList_Fecha {
         
         public static void main(String[] args) {
                  //ArrayList de fechas
                  ArrayList<LocalDate> examenesDAM = new ArrayList<LocalDate>();
                  
                  // Añadir elementos de dos formas
                  LocalDate programacion = LocalDate.parse("2024-05-20");
                  examenesDAM.add(programacion);
                  
                  // Otra forma
                  examenesDAM.add(LocalDate.parse("2024-05-21"));
                  examenesDAM.add(LocalDate.parse("2024-05-19"));
                  
                  // Imprimir las fechas
                  System.out.println("Examenes DAM");
                  System.out.println(examenesDAM);
                  
                  /////////////// Copiar un array examenesDAM ->  a examenesDAW  
                  ArrayList<LocalDate> examenesDAW = new ArrayList<LocalDate>(examenesDAM);
                  // Añadimos un examen más
                  examenesDAW.add(LocalDate.parse("2024-05-18"));

                  // Imprimir las fechas
                  System.out.println("\nExamenes DAW");
                  System.out.println(examenesDAW);
                  
                  
                  //////////////// Ordenados
                  Collections.sort(examenesDAW);
                  System.out.println("\nExamenes DAW ordenados");
                  System.out.println(examenesDAW);
                  
                  ////////////// Orden inverso
                  Comparator<LocalDate> comparador = Collections.reverseOrder();
                  Collections.sort(examenesDAW, comparador);
                  System.out.println("\nExamenes DAW ordenados inverso");
                  System.out.println(examenesDAW);

         }//Fin main
         
}//Fin class
