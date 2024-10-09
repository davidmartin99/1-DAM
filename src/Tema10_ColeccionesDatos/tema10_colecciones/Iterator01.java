package tema10_colecciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
/**
 *
 * @author david
 */

public class Iterator01 {
         
         public static void main(String[] args) {
                  // Iterador en una LISTA
                  // Aplicamos POLIMORFISMO
                  Iterable<String> lista01DAM1 = List.of("Alejandro", "David", "Lucia", "Marina");
                  
                  //Metodo forEach para imprimir la lista con :: antes de println 
                  lista01DAM1.forEach(System.out::println);
                  
                  // Crear el objeto a partir de la clase concreta (ArrayList)
                  // A la izquierda el tipo de lista ArrayList
                  ArrayList<Integer> lista02 = new ArrayList<>();
                  
       
                  // Muestra el TIPO DE LISTA que estoy manejando  .getClass()
                  System.out.println("Tipo de lista1"+lista01DAM1.getClass());
                  System.out.println("Tipo de lista2"+lista02.getClass());
                  
                  // Agregamos una 3 lista
                  // Poner una capacidad inicial de 2 no sirve para nada porque puedo añadir más de 2
                  ArrayList<String> lista03 = new ArrayList<>(2);
                  
                  // Añadimos elementos con .add()
                  lista03.add("SARA");
                  lista03.add("JUAN");
                  System.out.println(lista03+", ");
                  lista03.add("Elena");
                  System.out.println(lista03+", ");

                  
                  ////////////// TAMAÑO de ls lista con .size() /////////////
                  // Mostramos el tamaño de la lista
                  System.out.println("Tamaño actual: "+ lista03.size());
                  
                  
                  /////////////////////////////// MODIFICAR CON .set /////////////////////////////////
                  System.out.println();
                  // MODIFICAR LISTAS
                  lista03.set(0, "Sara Gonzalez");
                  lista03.set(1, "Juan Torres");
                  lista03.set(2, "Elena Sanchez");
                  
                  // Añadimos otro para poder modificarlo
                  lista03.add("David");
                  // Modificamos 
                  lista03.set(3, "David Meca");
                  
                  // Imprimir la lista 3 modificada
                  System.out.println("Lista 3 modificada: "+lista03);
                  
                  
                  ///////////////////////////////  OBTENER un elemento con   .get /////////////////
                  System.out.println("Elemento 2 de la lista03: "+lista03.get(2));
                 
                  
                   ///////////////  METODO CONTAINS ///////////////
                  boolean contiene = false;
                  contiene = lista03.contains("Sara Gonzalez");
                  System.out.println("Valor booleano  de contiene: "+contiene);
                  
                  
                  /////////////// ORDENAR COLLECTIONS /////////
                  Collections.sort(lista03);
                  System.out.println("Lista ordenada con Collections sort: "+lista03);
                  
                  // Creamos una lista de enteros
                  ArrayList<Integer> lista04 = new ArrayList<Integer>();
                  lista04.add(5);
                  lista04.add(7);
                  lista04.add(3);
                  
                  // Ordenamos con comparate para ordenarlo
                  Collections.sort(lista04,Integer::compareTo);
                  System.out.println("Lista 4 ordenada con compareTo: "+lista04);
                  
                  // Ordenar en orden inverso  (hay que añadir la libreria Comparator
                  Comparator<Integer> comparador = Collections.reverseOrder();
                  Collections.sort(lista04, comparador);
                  System.out.println("Lista 4 invertida:" +lista04);
                  
                  ArrayList<Integer> lista04b = new ArrayList<>(List.of(5, 7, 3, -1, -5));
                  lista04b.sort(comparador);
                  System.out.println("Lista 4b invertida: "+lista04b);
                  
                  lista04b.sort(Integer::compareTo);
                  System.out.println("Lista 4b ordenada: "+lista04b);
                  
                  
                  //////////////////////// COPIAR VALORES EN UNA LISTA ////////////////
                  // Se hace con List 
                  List<String> lista05 = Collections.nCopies(5, "HOLA");
                  System.out.println("Lista 5 repetida: "+lista05);
                  
                  ///////////////////////// ELIMINAR un elemento con .remove(i) ///////////
                  lista03.remove(1);
                  System.out.println("Lista con un elemento eliminado: "+lista03);
                  
                  // Eliminar segun el valor en lugar del index
                  lista03.remove("David Meca");
                  System.out.println("Lista con dos elementos eliminados: "+lista03);
                  
                  // Eliminar toda la lista con .removeAll
                  lista03.removeAll(lista03);
                  System.out.println("Lista Borrada totalmente: "+lista03);
                  
                  
                  ////////////// ELIMINAR TODOS LOS ELEMENTOS CON .clear() /////////
                  // Mejor usar .clear() que .removeAll()
                  lista03.clear();
                  System.out.println("Lista borrada con clear: "+lista03);
                  
                  // Mostramos el tamaño de la lista
                  System.out.println("Tamaño actual: " + lista03.size());
                  
                  
                
         }//Fin main
         
}//Fin class
