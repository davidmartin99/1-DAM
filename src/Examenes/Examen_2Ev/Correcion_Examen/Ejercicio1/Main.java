package Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author David Martin Pulgar
 * @version 1.0
 * @date 04/03/2024
 */

public class Main {
         public static void main(String[] args) {
                  //Inicializamos los atributos
                  double real = 0.0;
                  double imag = 0.0;
                  
                  //Creamos el objeto Complejo1 llamado a y b
                  Complejo1 a = new Complejo1();
                  Complejo1 b = new Complejo1(real, imag);
                  
                  Scanner teclado = new Scanner(System.in);
                  
                  //parte real a
                 boolean datosCorrectos;
                 do {
                          try{
                                   System.out.println("Parte real a: ");
                                   a.cambiaReal(teclado.nextDouble());
                                   //No repetir
                                   datosCorrectos = true;
                          }catch (InputMismatchException e1){
                                   System.out.println("Introduce un numero entero: ");
                                   teclado.next();
                                   datosCorrectos = false;
                          }//Fin try-catch
                 }while(!datosCorrectos);
                 
                 //parte imaginaria a
                 datosCorrectos = false;
                  do {
                          try{
                                   System.out.println("Parte imaginaria a: ");
                                   a.cambiaImaginario(teclado.nextDouble());
                                   //No repetir
                                   datosCorrectos = true;
                          }catch (InputMismatchException e1){
                                   System.out.println("Introduce un numero entero: ");
                                   teclado.next();
                                   datosCorrectos = false;
                          }//Fin try-catch
                 }while(!datosCorrectos);
                 
                  //parte real b
                  datosCorrectos = false;
                 do {
                          try{
                                   System.out.println("Parte real b: ");
                                   b.cambiaReal(teclado.nextDouble());
                                   //No repetir
                                   datosCorrectos = true;
                          }catch (InputMismatchException e1){
                                   System.out.println("Introduce un numero entero: ");
                                   teclado.next();
                                   datosCorrectos = false;
                          }//Fin try-catch
                 }while(!datosCorrectos);
                 
                 //parte imaginaria b
                 datosCorrectos = false;
                  do {
                          try{
                                   System.out.println("Parte imaginaria b: ");
                                   b.cambiaImaginario(teclado.nextDouble());
                                   //No repetir
                                   datosCorrectos = true;
                          }catch (InputMismatchException e1){
                                   System.out.println("Introduce un numero entero: ");
                                   teclado.next();
                                   datosCorrectos = false;
                          }//Fin try-catch
                 }while(!datosCorrectos);
   
                  
                  //Mostrar por pantalla
                  System.out.println("\n"+a);
                  System.out.println("\n"+b);
                  // Mostrar por pantalla
                  Complejo1 resultado = Complejo1.sumar(a, b);
                  System.out.println("\nResultado de la suma: " + resultado);

         }//Fin main
         
}//Fin class
