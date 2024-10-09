package punto;
import java.util.Arrays;

/**
 *
 * @author david
 */

public class test {
         
         public static void main(String[] args){
                  Punto [][] array1 = {
                           {new Punto(1,2), new Punto(4,5), new Punto(0,3)},
                           {new Punto(8,4)},
                           {new Punto(3,2)}
                  };
                  
                  //Con array unidimensional se puede hacer
                  Punto[] linea1 = {new Punto(1,1), new Punto(2,2), new Punto(3,3)};
                  Punto[] linea2 = {new Punto(0,0), };
                  Punto[] linea3 = {new Punto(-1,-1), new Punto(-2,-2) };

                  //Creamos uno bidimensional con los unidimensionales de antes
                  Punto [][] lineas = {linea1, linea2, linea3};
                  
                  //Con el Array.deepToString para imprimir array bidimensional
                  System.out.println(Arrays.deepToString(array1));
                  System.out.println(" ");
                  
                  //.toString solo para arrays de 1 dimension
                  System.out.println(Arrays.toString(linea1));
                  System.out.println(Arrays.toString(linea2));
                  System.out.println(Arrays.toString(linea3));
                  System.out.println("");
                  
                  //.deepToString
                  System.out.println(Arrays.deepToString(lineas));

         }//Fin main
         
}//Fin class
