package tema10_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej4_ArrayList_AlturasAlumnos {
         
         public static void main(String[] args) {
                  ArrayList<Double> alturasAlumnos = new ArrayList<Double>();

         }//Fin main
         
         
         // Metodo para ingresar el numero de Alumnos
         public static int numeroAlumnos(){
                  Scanner teclado = new Scanner(System.in);
                  System.out.println("Introduce el numero de Alumnos: ");
                  int numAlumnos = teclado.nextInt();
                  return numAlumnos;
         }//Fin numeroAlumnos
         
         
         // Metodo para ingresar las Alturas de los alumnos
         public static void leerAlturas(ArrayList<Double> alturasAlumnos, int numAlumnos){
                  Scanner teclado = new Scanner(System.in);
                  
                  // Recorremos el ArrayList ingresando la altura
                  for(int i =0; i < numAlumnos; i++){
                           System.out.println("Introduce la altura del Alumno "+(i+1)+": ");
                           double altura = teclado.nextDouble();
                           alturasAlumnos.add(altura);
                  }//Fin for
         }//Fin leerAlturas
         
         // Metodo para calcular la media
         public static double calcularMedia(ArrayList<Double> alturasAlumnos){
                  // Sumamos todas las alturas
                  double suma = 0;
                  for (Double alturasAlumno : alturasAlumnos) {
                           suma += alturasAlumno;
                  }//Fin for
                  
                  //Calculamos la media 
                  double media=0;
                  media = suma/alturasAlumnos.size();
                  return media;
         }//Fin calcularMedia
                 
         
         // Metodo para mostrar los resultados
         
         
}//Fin class
