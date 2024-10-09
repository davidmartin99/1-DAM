package complejo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author David Martin Pulgar
 * @version 1.0
 * @date 04/03/2024
 */
public class test {

         public static void main(String[] args) {
                  //Menu de bienvenida al juego de numero complejo
                  System.out.println("""
                                     ***************************************
                                     ***** Numero Complejo    *****
                                     ****  autor: David Martin  *****
                                     **** version: 1.0                *****
                                     ***************************************
                                     """);
                  
                  //Introduccion de datos
                   //Llamamos a la clase Scanner
                  Scanner teclado = new Scanner(System.in);

                  System.out.println("Introduce los numeros complejos para realizar la suma: ");
                  
                  //Complejo a
                  double realA = 0;
                  double imagA = 0;
                  boolean repetir;
                  do {
                           repetir = false;
                           try {
                                    //Introduce el numero complejo a
                                    System.out.println("Numero complejo a: ");
                                    System.out.print("parte real: ");
                                    realA = teclado.nextDouble();
                                    System.out.print(", parte imaginaria:  ");
                                     imagA = teclado.nextDouble();
                           } catch (InputMismatchException e1) {
                                    System.err.println("Valor no valido. ERROR: formato no valido");
                                    repetir = true;
                                    teclado.nextLine();
                           } catch (NumberFormatException e2) {
                                    System.err.println("Valor no valido. ERROR: No se puede poner punto");
                                    repetir = true;
                           } catch (Exception e3) {
                                    System.err.println(teclado.toString());
                           }
                  } while (repetir);//Fin complejo a
                  Complejo a = new Complejo(realA, imagA);

                                           

                  //Complejo b
                  double realB = 0;
                  double imagB = 0;
                  //Llamamos a la clase Scanner
                  boolean repetir1;
                  do {
                           repetir1 = false;
                           try {
                                    //Introduce el numero complejo b
                                    System.out.println("\nNumero complejo b: ");
                                    System.out.print("parte real: ");
                                    realB = teclado.nextDouble();
                                    System.out.print(", parte imaginaria:  ");
                                    imagB = teclado.nextDouble();
                           } catch (InputMismatchException e1) {
                                    System.err.println("Valor no valido. ERROR: formato no valido");
                                    repetir1 = true;
                                    teclado.nextLine();
                           } catch (NumberFormatException e2) {
                                    System.err.println("Valor no valido. ERROR: No se puede poner punto");
                                    repetir1 = true;
                           } catch (Exception e3) {
                                    System.err.println(teclado.toString());
                           }
                  } while (repetir1); //Fin complejo b
                  Complejo b = new Complejo(realB, imagB);
                 
                  
                  //Imprimimos los datos con toString()
                  System.out.println("\n*****Solucion*****");
                  System.out.println(a.toString());
                  System.out.println(b.toString());

                  //Metodo sumar
                  Complejo suma = new Complejo();
                  suma.sumar(realA, imagA, realB, imagB);

  
               
         }//Fin main
         
}//Fin class test
