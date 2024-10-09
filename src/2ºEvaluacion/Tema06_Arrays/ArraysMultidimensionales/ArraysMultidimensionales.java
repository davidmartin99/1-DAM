package ArraysMultidimensionales;

/**
 *
 * @author david
 */

public class ArraysMultidimensionales {
         
         public static void main(String[] args){
                  //Declarar el arrya MULTIDIMENSIONAL
                  int[][][] array1  =  {
                  {{1, -9,3}, {2,7,4}},                   //Matriz bidimensional de 2x3
                  {{-45, 5,6,75}, {88}, {29,30}}   //Matriz tridimensional de 3x irregular
                  };
                  
                  //Recorremos el array
                  for(int[][] arr1: array1){
                           for(int[] a: arr1){
                                    for(int finalArray1: a){
                                             System.out.print(finalArray1+" ");
                                    }//Fin 3ºfor
                                    System.out.println("");
                           }//Fin 2ºfor
                  }//Fin 1ºfor
    
                  //Elemento de posicion [0][0][0] = 1
                  System.out.println("Elemento 0-0-0"+array1[0][0][0]);
                  
         }//Fin main
         
}//Fin class
