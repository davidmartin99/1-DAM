package alumnos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author david
 */
public class ListaAlumnos {
         public static void main(String[] args) {
                  // Creo el ArrayList con el tipo de dato objeto Alumnos
                  ArrayList<Alumnos> alumnoDAM = new ArrayList<Alumnos>();
                  
                  // Añado alumnos
                  Alumnos alumno1 = new Alumnos("Juan","Torres",1);
                  alumnoDAM.add(alumno1); //Lo añadimos al ArrayList
                  
                  Alumnos alumno2 = new Alumnos("Sara", "Gonzalez", 2);
                  alumnoDAM.add(alumno2); //Lo añadimos al ArrayList
                  
                  Alumnos alumno3 = new Alumnos("Elena","Esteban",3);
                  alumnoDAM.add(alumno3); //Lo añadimos al ArrayList
                  
                  Alumnos alumno4 = new Alumnos("Pepe", "Blanco", 4);
                  alumnoDAM.add(alumno4); //Lo añadimos al ArrayList
                  
                  Alumnos alumno5 = new Alumnos("Miguel", "Perez", 5);
                  alumnoDAM.add(alumno5); //Lo añadimos al ArrayList
                  
                  // Imprimir elementos, uso un ITERATOR
                  // Cuantos alumnos hay con .size()
                  System.out.println("Alumnos de 1º de DAM: "+alumnoDAM.size());
                  
                  //Declaramos el ITERATOR
                  Iterator<Alumnos> itAlumnos = alumnoDAM.iterator();
                  System.out.println("------------------------------------------------------------------------------------");
                  System.out.println("numero   "+"nombre              "+"apellidos");
                  //Recorremos el ITERATOR con un while
                  while(itAlumnos.hasNext()){ // Comprueba si quedan elementos en el ITERATOR
                           Alumnos alumnosTemp = itAlumnos.next();  // Se declara el objeto del ArrayList para ir asignando valores
                           System.out.println(alumnosTemp.getNumero()+"         "+alumnosTemp.getNombre()+"              "+alumnosTemp.getApellidos());
                  }//Fin while
                  
                  ////////////////////////////////////////////////////////////////
                  
                  /////////////////////////// Lista ordenada por Nombres
                  // Cuando son objetos el Collections.sort() no funciona
                  // Hay que ponerlo con un nuevo Comparator => new Comparator<Alumnos>() {}
                  Collections.sort(alumnoDAM, new Comparator<Alumnos>(){
                           @Override
                           public int compare(Alumnos a1, Alumnos a2){
                                    // Devuelve la comparacion de a1 y a2 
                                    return a1.getNombre().compareTo(a2.getNombre());
                           }//Fin compare
                  }//Fin Iterator
                  );//Fin Collections.sort
                  
                  // Lista ya ordenada por Nombres
                  //Declaramos el ITERATOR
                  Iterator<Alumnos> itAlumnos2 = alumnoDAM.iterator();
                  System.out.println("\n----------------------ordenado por Nombres------------------------------------");
                  System.out.println("numero   " + "nombre              " + "apellidos");
                  //Recorremos el ITERATOR con un while
                  while (itAlumnos2.hasNext()) { // Comprueba si quedan elementos en el ITERATOR
                           Alumnos alumnosTemp = itAlumnos2.next();  // Se declara el objeto del ArrayList para ir asignando valores
                           System.out.println(alumnosTemp.getNumero() + "         " + alumnosTemp.getNombre() + "              " + alumnosTemp.getApellidos());
                  }//Fin while
                 
                  
                  ////////////////////////////// Lista ordenada por Apellidos
                  Collections.sort(alumnoDAM, new Comparator<Alumnos>() {
                           @Override
                           public int compare(Alumnos a1, Alumnos a2) {
                                    // Devuelve la comparacion de a1 y a2 
                                    return a1.getApellidos().compareTo(a2.getApellidos());
                           }//Fin compare
                  }//Fin Iterator
                  );//Fin Collections.sort

                  // Lista ya ordenada por Apellidos
                  // IMPRIMIMOS CON UN FOR EACH 
                  System.out.println("\n----------------------ordenado por Apellidos------------------------------------");
                  for (Alumnos alumnoTemp : alumnoDAM){
                           System.out.print(alumnoTemp.getApellidos()+",");
                           System.out.print(alumnoTemp.getNombre()+".\n");
                  }//Fin forEach para imprimirlo

                  
         }//Fin main
         
}//Fin class
