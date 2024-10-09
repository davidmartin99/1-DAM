package act03_OrdenarDatos;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * Actividad 3 - Ordenar Datos
 *  Clase main 
 * 
 * @version 1.0
 * @author david
 */

public class main {
         
         public static void main(String[] args) {
                  //Creamos el objeto array llamando a la clase Biblioteca
                  Alumno[] listaAlumnos = new Alumno[30];
                  listaAlumnos[0] = new Alumno("Juan", 6);
                  listaAlumnos[1] = new Alumno("Pepe",3);
                  listaAlumnos[2] = new Alumno("Sara", 8);
                  listaAlumnos[3] = new Alumno("Elena", 4);
                  listaAlumnos[4] = new Alumno("Alejandro",9);
                  
                  //Menu de opciones
                  int opcion;
                  //Menu dentro de un bucle para que se repita hasta que el usuario pulse "5"
                  //Bucle do-while, hasta que no sea 4 no sale.
                  do {
                            //Mostramos el menu
                           System.out.println(" ");
                           System.out.println("""
                                                ******************************************************************
                                                *****    1. Lista Ordenada de Alumnos
                                                *****    2. Lista Ordenada de Notas
                                                *****    3. Añadir nuevo Alumno
                                                *****    4. Salir
                                                ******************************************************************
                                                """);
                           
                           Scanner teclado = new Scanner(System.in);
                           //Introduce la opcion por teclado
                           opcion = teclado.nextInt();
                           
                           //Un switch, se ejecuta un metodo, dependiendo de la opcion elegida
                           switch (opcion) {
                                    case 1:
                                              Alumno.nombreBurbuja(listaAlumnos);
                                             break;
                                    case 2:
                                              Alumno.notaBurbuja(listaAlumnos);
                                             break;
                                    case 3:
                                              nuevoAlumno(listaAlumnos);
                                             break;
                                    case 4:
                                             System.out.println("Saliendo... ");
                                             System.exit(0);
                                             break;
                                    default:
                                             System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                           }//Fin switch
                  } while (opcion != 4);
                  
         }//Fin main
         
         
          /**
           * Creamos un metodo nuevoAlumno para almacenarlos en el array de objetos
           * Llamos al metodo agregarAlumno de la clase Alumno
           *
           * @param listaAlumnos array de objetos Alumno.
           */
          public static void nuevoAlumno(Alumno[] listaAlumnos) {
                    //Buscamos la posicion null
                    int indice = 0;
                    //Un bucle que cuando se cumpla que se agrega a un alumno pare
                    while (indice < listaAlumnos.length) {
                              if (listaAlumnos[indice] == null) {
                                        listaAlumnos[indice] = Alumno.agregarAlumno();
                                        JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente.");
                                        break; //Para salir del bucle
                              }//Fin if
                              indice++;
                    }//Fin while

                    // Cuando no encontramos un null, el array esta lleno
                    if (indice == listaAlumnos.length) {
                              JOptionPane.showMessageDialog(null, "Lo sentimos... La clase esta completa", "Advertencia", 2);
                    }//Fin if
          }//Fin nuevoAlumno
                  
          
}//Fin class
