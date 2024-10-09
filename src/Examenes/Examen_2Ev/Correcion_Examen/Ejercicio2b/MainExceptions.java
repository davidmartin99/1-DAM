package Ejercicio2b;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que trata un array bidimensional, con una dimensión de enteros negativos y otra de enteros positivos.
 * @author David Martin 
 * @version 1.0
 */
public class MainExceptions {
    /**
     * Scanner como variable global para su uso en varias funciones y métodos.
     */
    private static final Scanner sc = new Scanner(System.in);

    /** Inicializa el array de enteros de dos dimensiones y 5 índices en cada dimensión.
     * @return Array bidimensional de enteros.
     */
    private static int [][] inicializarArray (){
        int[][] numeros;
        numeros = new int [2][];
        numeros [0] = new int[5];
        numeros [1] = new int[5];
        return numeros;
    }

         /**
          * Permite al usuario introducir los números negativos.
          *
          * @param negativos Array de enteros.
          * @return Array de enteros negativos.
          */
         private static int[] introducirNegativos(int[] negativos) {
                   boolean repetir;
                   int indice = 0; // Índice para seguir almacenando números negativos
                   do {
                             try {
                                       repetir = false;
                                       if (indice < negativos.length) {
                                                 System.out.print("Introduzca un número negativo: ");
                                                 int num = sc.nextInt();
                                                 if (num < 0) {
                                                           negativos[indice] = num;
                                                           indice++; // Incrementar el índice para el siguiente número negativo
                                                 } else {
                                                           throw new IllegalArgumentException("Número no negativo.");
                                                 }
                                       } else {
                                                 break; // Si ya se ingresaron los 5 números negativos, salir del bucle
                                       }
                             } catch (InputMismatchException e) {
                                       System.err.println("Error: Debe introducir un número entero.");
                                       sc.nextLine(); // Limpiar el buffer del scanner
                                       repetir = true;
                             } catch (IllegalArgumentException e) {
                                       System.err.println("Error: " + e.getMessage());
                                       repetir = true;
                             }
                   } while (repetir || indice < negativos.length);

                   return negativos;
         }

         /**
          * Permite al usuario introducir los números positivos.
          *
          * @param positivos Array de enteros.
          * @return Array de enteros positivos.
          */
         private static int[] introducirPositivos(int[] positivos) {
                   boolean repetir;
                   int indice = 0; // Índice para seguir almacenando números positivos
                   do {
                             try {
                                       repetir = false;
                                       if (indice < positivos.length) {
                                                 System.out.print("Introduzca un número positivo: ");
                                                 int num = sc.nextInt();
                                                 if (num >= 0) {
                                                           positivos[indice] = num;
                                                           indice++; // Incrementar el índice para el siguiente número positivo
                                                 } else {
                                                           throw new IllegalArgumentException("Número no positivo.");
                                                 }
                                       } else {
                                                 break; // Si ya se ingresaron los 5 números positivos, salir del bucle
                                       }
                             } catch (InputMismatchException e) {
                                       System.err.println("Error: Debe introducir un número entero.");
                                       sc.nextLine(); // Limpiar el buffer del scanner
                                       repetir = true;
                             } catch (IllegalArgumentException e) {
                                       System.err.println("Error: " + e.getMessage());
                                       repetir = true;
                             }
                   } while (repetir || indice < positivos.length);

                   return positivos;
         }


    /**
     * Suma todos los componentes de un array de enteros.
     * @param sumandos
     * @return Suma del array.
     */
    private static int sumarArray (int[] sumandos) {
        int suma = 0;
        for (int i = 0; i < sumandos.length; i++) {
            suma += sumandos[i];
        }
        return suma;
    }

    /**
     * Menu de opciones para el programa.
     * @param numeros Array bidimensional de enteros.
     */
    private static void menu (int[][] numeros) {
        int opcion = 1;
             //Menu dentro de un bucle para que se repita hasta que pulsemos 2
             boolean salir = false;

             do {
                      System.out.println("\nEste programa permite gestionar un array bidimensional de números negativos y positivos."
                              + "\nOpciones: "
                              + "\n1. Introducir valores en el array."
                              + "\n2. Calcular la media."
                              + "\n3.Calcular la suma."
                              + "\n4. Mostrar el array ordenado de menor a mayor."
                              + "\n0. Salir");

                      try {
                               opcion = sc.nextInt();
                               sc.nextLine();

                               switch (opcion) {
                                        case 1:
                                                 introducirNegativos(numeros[0]);
                                                 introducirPositivos(numeros[1]);
                                                 break;
                                        case 2:
                                                 System.out.println("Media del array de números negativos: " + (double) sumarArray(numeros[0]) / numeros[0].length);
                                                 System.out.println("Media del array de números positivos: " + (double) sumarArray(numeros[1]) / numeros[1].length);
                                                 System.out.println("Media de ambos arrays: " + (double) (sumarArray(numeros[0]) + sumarArray(numeros[1])) / (numeros[0].length + numeros[1].length));
                                                 break;
                                        case 3:
                                                 System.out.println("Suma del array de números negativos: " + sumarArray(numeros[0]));
                                                 System.out.println("Suma del array de números positivos: " + sumarArray(numeros[1]));
                                                 System.out.println("Suma de ambos arrays: " + (sumarArray(numeros[0]) + sumarArray(numeros[1])));
                                                 break;
                                        case 4:
                                                 Arrays.sort(numeros[0]);
                                                 Arrays.sort(numeros[1]);
                                                 System.out.println("Array bidimensional de números negativos y positivos: " + Arrays.deepToString(numeros));
                                                 break;
                                        case 0:
                                                 System.out.println("Saliendo...");
                                                 salir = true;
                                                 break;
                                        default:
                                                 throw new IllegalArgumentException("Opción no disponible.");
                               }//fin switch
                      } catch (InputMismatchException e) { //Si no introduce un número
                               System.err.println("ERROR: Debe introducir un número.");
                               sc.nextLine();
                      } catch (IllegalArgumentException e) { //Si no introduce una opción entre las puestas
                               System.err.println("Error: " + e.getMessage());
                      } catch (Exception e) {
                               System.err.println("ERROR: " + e.toString()); //Otra opcion
                               sc.nextLine();
                      }//Fin try-catch
                      System.out.println("-----------------------------------------------------------------------------------------------");;

             } while (!salir);
             
             sc.close();
    }//Fin menu

    /**
     * Método principal del programa.
     * @param args
     */
    public static void main(String[] args) {
        menu(inicializarArray());
    }
}