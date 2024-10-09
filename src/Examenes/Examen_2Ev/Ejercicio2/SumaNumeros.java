package Ejercicio2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author David Martin Pulgar
 * @version 1.0
 * @date 04/03/2024
 */

public class SumaNumeros {
         public static void main(String[] args) {
                  
                  //Llamamos a la clase Scanner
                  Scanner teclado = new Scanner(System.in);

                  //Creamos el objeto array con 5 posiciones
                   Numeros[] numero= new Numeros[5];
                    
                           
                    //Menu dentro de un bucle para que se repita hasta que pulsemos 2
                   boolean salir = false;

                  do {
                           //Menu con opciones
                           System.out.println("""
                            ******************************************************************
                            *****    1. Introducir Valores 
                            *****    2. Calcular media
                            *****    3. Calcular suma                  
                            *****    4. Array ordenado
                            *****    2. Salir           
                            ******************************************************************
                            """);

                           try {
                                    int opcion = teclado.nextInt();
                                    teclado.nextLine(); 

                                    switch (opcion) {
                                             case 1:
                                                      // Pedir al usuario que ingrese los números negativos
                                                      for (int i = 0; i < 5; i++) {
                                                               System.out.print("Ingresa el número negativo:  " + (i + 1) + ": ");
                                                               numero[i].setNegativo(teclado.nextInt());
                                                      }

                                                      // Pedir al usuario que ingrese los números positivos
                                                      for (int i = 0; i < 5; i++) {
                                                               System.out.print("Ingresa el número positivo:  " + (i + 1) + ": ");
                                                               numero[i].setPositivo(teclado.nextInt());
                                                      }
                                                      
                                                      //Valores de la matriz   
                                                      //Es una tabla REGULAR (=numero de filas para cada columna)
                                                      System.out.println("Valores de la matriz: ");
                                                       System.out.println( Arrays.toString(numero));

                                                      break;
                                             case 2:
                                                      
                                                      break;
                                             case 3:
                                                      
                                                      break;         
                                             case 4:
                                                       System.out.println(Arrays.deepToString(numero));
                                                      break;         
                                             case 5:
                                                      System.out.println("Saliendo... ");
                                                      salir = true;
                                                      break;
                                             default:
                                                      System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                                    }//fin switch
                           } catch (InputMismatchException e) {
                                    System.err.println("ERROR: Debe introducir un número.");
                                    teclado.nextLine(); 
                           } catch (Exception e) {
                                    System.err.println("ERROR: " + e.toString());
                                    teclado.nextLine();
                           }//Fin try-catch
                  } while (!salir);

         }//Fin main
         
         public static int numeroNoNegativo(){
                  int numeroNegativo = 0;
                  if (numeroNegativo<0)
                           throw new IllegalArgumentException ("El numero debe ser menor a 0");
                  else
                           return numeroNegativo;
         }//Fin 
         
         public static int numeroNoPositivo(){
                  int numeroPositivo = 0;
                  if (numeroPositivo>=0)
                           throw new IllegalArgumentException ("El numero debe ser positivo, o 0");
                  else
                           return numeroPositivo;
         }//Fin 
         
         
}//Fin class
