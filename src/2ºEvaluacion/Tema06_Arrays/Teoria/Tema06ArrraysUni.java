package tema06_arrays;

/**
 *
 * @author david
 */
public class Tema06ArrraysUni {
         public static void main(String[] args){
                  int [] n; //Declarar el array
                  n = new int[5];  //Crear el array reservado en memoria
                  
                  //  int [] m = new int[5]; //Declara y Crear el Array
                  
                  n[0] =1;
                  n[1] =2;
                  n[2] =3;
                  n[3] =4;
                  n[4] =5;
                  
                  int suma = sumaArray(n);
                  System.out.println("La suma es: "+suma);
     
         }
         
         //Funcion 
         static int sumaArray(int[] j){
                  int suma = 0;
                   for (int i =0; i<j.length;i++)
                                    suma = suma +j[i];
                  return suma;
         }
}
