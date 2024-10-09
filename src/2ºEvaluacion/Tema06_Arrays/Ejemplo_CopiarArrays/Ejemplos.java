package Ejemplo_CopiarArrays;

import java.util.Arrays;
import java.util.Collections;
/**
 * COPIAR ARRAYS UNIDIMENSIONALES y BIDIMENSIONALES
 * @author david
 */
public class Ejemplos {
         
         //Metodo para ordenar el array a la INVERSA
         static void arrayReverse(int[] array){
                  for (int i=0; i<array.length/2; i++){
                           int temp = array[i];
                           array[i] =array[array.length-i-1];
                           array[array.length-i-1] = temp;
                  }//Fin for
         }//Fin arrayReverse
         
         public static void main(String[] args){
                  
                  int[] primes = {1,2,3,5,6,9,11};
                  int[] copia = new int[primes.length];
                  //Añadimos otro 
                  int [] copia2;
                  //Otro
                  int[] copiaRango;
                  
                  //con Arraycopy
                  System.arraycopy(primes, 0, copia, 0, primes.length);
                  
                  copia[2]=16; //Se le añade al array copia el numero 16 en la posicion 2
                  System.out.println("Array origen: "+ Arrays.toString(primes));
                  System.out.println("Array copiado: "+ Arrays.toString(copia));
                  
                  
                  //ORDENAR UN ARRAY ASCENDENTE CON *SORT*
                  Arrays.sort(copia);
                  System.out.println("Array ordenado: "+Arrays.toString(copia));
                  
                  arrayReverse(copia);
                  System.out.println("Array ordenado INVERSO: "+Arrays.toString(copia));
                  //De forma INVERSA
                  /**
                  Arrays.sort(copia, Collections.reverseOrder());
                  System.out.println(Arrays.toString(copia));
                  //Arrays.sort(copia,Collections.reverseOrder());
                  */
                  
                  //Collections.reverseOrder(Arrays.asList(copia));
                  
                 
                  //con COPY.OF
                  copia2 = Arrays.copyOf(primes, primes.length);
                  copia2[2] = 13; //se le añade a la posicion 2 el numero 13
                  System.out.println("Array copiado 2: "+Arrays.toString(copia2));
                  
                  //Otro metodo
                  //Copia solo del elemento 1 al 4
                  copiaRango = Arrays.copyOfRange(primes, 1, 4);
                  System.out.println("Array parcial copiado: "+Arrays.toString(copiaRango));
                  
                  ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                  //COPIAR ARRAYS BIDIMENSIONALES
                  int[][] origen = new int[][]{
                           {1,3,5,7,9},
                           {2,4,6},
                           {1,3,5}
                  };//Matriz irregular
                  
                  //Le ponemos origen.length para crear las 3 filas
                  int[][] copiaBi = new int[origen.length][];
                  //Recorremos cada fila con el for
                  for(int i = 0; i < origen.length; i++){
                           //Copiamos el array por filas. 
                           copiaBi[i] = origen[i].clone(); //Se utiliza CLONE()
                  }//Fin 1ºfor
                  
                  //Hacemos un cambio en la copia
                  copiaBi[1][1]=20; //Se cambia la 2º posicion de la 2º fila, ahora sera 20
                  System.out.println("Matriz origina: "+Arrays.deepToString(origen));
                  System.out.println("Matriz copiada: "+Arrays.deepToString(copiaBi));
                  
                  
                  //////////////////////////////////////////////////////////////////
                  System.out.println("/////////////////////////////////////////////////////////////////////");
                  //RELLENAR UNA MATRIZ CON EL VALOR QUE LE DEMOS
                  int[] numeros = new int[5];
                  Arrays.fill(numeros, 50);
                  System.out.println("MATRIZ RELLENA: "+Arrays.toString(numeros));
                        
                  
                  //BUSCAR un ELEMENTO en el array
                  //Si da menor que 0 = no lo ha encontrado, si lo encuentra da la posicion del array
                  int target = 50;
                  int index = Arrays.binarySearch(numeros, target);
                  if (index >= 0){
                           System.out.println("Elemento: "+target+" encontrado, en el indice: "+index);
                  }
                  else{
                           System.out.println("Elemento: "+target+" no encontrado...");
                  }//Fin if-else
                 
                  
                  //COMPARAR MATRICES BIDIMENSIONALES
                  int [ ] [] matriz1 = { {1,1}, {2,2} };
                  int [ ] [] matriz2 = { {1,1}, {2,3} };

                  //con Arrays.deepEquals comparo matrices y devuelve true/false
                  boolean sonIguales = Arrays.deepEquals(matriz1, matriz2);
                  System.out.println("Las matrices son iguales?: "+sonIguales);
                  
                  
         }//Fin main
         
}//Fin class
