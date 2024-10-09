package Tarea02_Matrices;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ac3_ArraysCaracteres {
          public static void main(String[] args) {
                    Scanner teclado = new Scanner(System.in);

                    //El usuario introduce cuantos alumnos hay
                    //No puede tener 0 o negativo alumnos
                    int numAlumnos = 0;
                    do {
                              System.out.println("Introduce el número de alumnos en clase:");
                              if (numAlumnos < 0) {
                                        System.out.println("Por favor, introduce un número válido:");
                                        teclado.next();
                              }//Fin if
                              numAlumnos = teclado.nextInt();
                    } while (numAlumnos < 0);

                    //Creamos el array string nombresAlumnos
                    String[] nombresAlumnos = new String[numAlumnos];
                    teclado.nextLine(); // Limpiar el buffer después de leer un entero

                    //El usuario introduce los nombres de los alumnos
                    System.out.println("Introduce los nombres de los alumnos (CTRL + Z para terminar):");
                    for (int i = 0; i < numAlumnos; i++) {
                              System.out.print(i+1+"º Alumno: ");
                              nombresAlumnos[i] = teclado.nextLine();
                    }//Fin 1º for

                    //Declaramos la variable opcion
                    char opcion;
                    do {
                              System.out.println("¿Deseas ver los nombres introducidos? (s/n):");
                              opcion = teclado.next().charAt(0);
                    } while (opcion != 's' && opcion != 'n');

                    if (opcion == 's') {
                              System.out.println("Nombres introducidos:");
                              for (String nombre : nombresAlumnos) {
                                        if (nombre != null) {
                                                  System.out.println(nombre);
                                        }//Fin 2º if
                              }//Fin for
                    } else {
                              System.out.println("No se mostraron los nombres introducidos.");
                    }//Fin 1º if
                    
                    
          }//Fin main

}//Fin class
