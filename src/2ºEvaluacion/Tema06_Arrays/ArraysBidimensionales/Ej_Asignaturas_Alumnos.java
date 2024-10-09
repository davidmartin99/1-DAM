package ArraysBidimensionales;

import java.util.Scanner;

/**
 * Asignaturas de DAM.
 * el 1� alumno tiene todas, el 2�FOL convalidada, 3� BBDD y Programacion.
 * menu de opciones
 * @author david
 */

public class Ej_Asignaturas_Alumnos {
         
         public static void main(String[] args){
                  //Declarar Array para los ALUMNOS
                  String[] alumnos = new String[3];
                  //Damos valores al array alumnos
                  alumnos[0] = "Juan Torres";
                  alumnos[1] = "Sara Gonzalez";
                  alumnos[2] = "Pepe Gomez";
                  
                  /**Entrada de datos por teclado
                  Scanner teclado = new Scanner(System.in);
                  for (int i = 0; i < alumnos.length; i++) {
                           System.out.println("Introduce el nombre del "+i+1+ " alumno: ");
                           alumnos[i] = teclado.nextLine();
                           teclado.nextLine();
                  }//Fin for*/

                  //Array Bidimensioanal Irregular de las Asignaturas
                  String[][] asignaturas = {
                           {"Programacion", "Bases de Datos", "Lenguaje de Marcas", "Entornos de Desarrollo", "Sistemas Informaticos", "FOL"},
                           {"Programacion", "Bases de Datos", "Lenguaje de Marcas", "Entornos de Desarrollo", "Sistemas Informaticos",},
                           {"Programacion", "Bases de Datos"}
                  };
                  
                    //Reutilizamos el menu de opciones
                    int opcion;
                    //Menu dentro de un bucle para que se repita hasta que el usuario pulse "5"
                    do {
                             System.out.println("");
                              System.out.println("""
                                                *******************************************************************************************************************
                                                ****  1- Muestra las asignaturas de cada alumno.
                                                ****  2- Muestra las asignaturas de un alumno en concreto.
                                                ****  3- Mostrar las asignaturas de los repetidores                        
                                                ****  4- Salir.                                                                                                             
                                                ********************************************************************************************************************
                                                """);
                              Scanner teclado = new Scanner (System.in);
                              opcion = teclado.nextInt();
                              teclado.nextLine();

                              switch (opcion) {
                                        case 1:
                                                 System.out.println("Asignaturas de cada alumno:  ");
                                                 for (int i = 0; i < alumnos.length; i++) {
                                                          System.out.print(alumnos[i] + ":   ");
                                                          for (int j = 0; j < asignaturas[i].length; j++) {
                                                                   System.out.print(asignaturas[i][j]);
                                                                   //Si no es el ultimo, imprime una coma ,
                                                                   if (j < asignaturas[i].length - 1) {
                                                                            System.out.print(", ");
                                                                   }//Fin if
                                                          }//Fin 2 for
                                                          System.out.println("");
                                                 }//Fin 1 for
                                                  break;
                                        case 2:
                                                 System.out.print("Seleccione el alumno a consultar: ");
                                                 String alumnoConsultado = teclado.nextLine();
                                                 for (int i = 0; i < alumnos.length; i++) {
                                                          if (alumnoConsultado.equalsIgnoreCase(alumnos[i])) {
                                                                   System.out.print(alumnos[i]+":  ");
                                                                   for (int j = 0; j < asignaturas[i].length; j++){
                                                                            System.out.print(asignaturas[i][j]);
                                                                            //Si no es el ultimo, imprime una coma ,
                                                                            if (j < asignaturas[i].length - 1) {
                                                                                     System.out.print(", ");
                                                                            }//Fin 2� if
                                                                   }//Fin 2�for
                                                                   break;
                                                          }//Fin 1� if
                                                 }//Fin 1 for
                                                 System.out.println();
                                                 break;
                                        case 3:
                                                 esRepetidor( asignaturas, alumnos);
                                                  break;
                                        case 4:
                                                  System.out.println("Saliendo... ");
                                                  System.exit(0);
                                                  break;
                                        default:
                                                  System.out.println("Opci�n no v�lida. Por favor, seleccione una opci�n v�lida.");
                              }//Fin switch

                    } while (opcion != 4);
                   
         }//Fin MAIN
         
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         
         //Metodo que calcula si es repetidor o no.
         //Para ello tendremos que ver si tiene menos de 5 asignaturas 
         public static void esRepetidor (String[][] asignaturas, String[] alumnos) {
                  for (int i = 0; i < 3; i++) {
                           if (asignaturas[i].length < 5) {
                                    System.out.println("\nAlumno: "  + alumnos[i] +  "\n_____" );
                                    for(int j = 0; j < asignaturas[i].length; j++){
                                             System.out.println(asignaturas[i][j]);        
                                    }//Fin 2� for
                           }//Fin if
                  }//Fin 1� for
         }//Fin esRepetidor
         
        
}//Fin CLASS
