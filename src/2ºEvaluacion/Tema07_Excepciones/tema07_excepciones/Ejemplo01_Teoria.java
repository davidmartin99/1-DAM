package tema07_excepciones;

import java.io.*;
/**
 *
 * Ejercicio resuelto sobre manejo de excepciones. El programa solicita que el
 * usuario introduzca por teclado un numero entre 0 y 100, debiendo gestionarse
 * la entrada por medio de excepciones.
 * 
 * @author david
 */

public class Ejemplo01_Teoria {
         
         public static void main(String[] args) {
                  int numero = -1;
                  int intentos = 0;
                  String linea;
                  BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
                  //Ejecuta el programa hasta que el usuario introduzca un numero entre 0 y 100.
                  do {
                           try {
                                    System.out.print("Introduzca un n�mero entre 0 y 100: ");
                                    linea = teclado.readLine();
                                    numero = Integer.parseInt(linea);
                           } catch (IOException e) {
                                    System.out.println("Error al leer del teclado.");
                           } catch (NumberFormatException e) {
                                    System.out.println("Debe introducir un n�mero entre 0 y 100.");
                           } finally {
                                    //Cuenta los intentos
                                    intentos++;
                           }
                  } while (numero < 0 || numero > 100);
                  System.out.println("El n�mero introducido es: " + numero);
                  System.out.println("N�mero de intentos: " + intentos);
         }//Fin main
         
}//Fin class
