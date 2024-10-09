package act03_OrdenarDatos;

import javax.swing.JOptionPane;

/**
 * Actividad 3 - Ordenar Datos
 * Clase Alumno, contiene los atributos nombre y nota.
 * 
 * @version 1.0
 * @author david
 */
public class Alumno {
          //Atributos
         private String nombre;
         private double nota;

          /**
           * Constructor de la clase Alumno
           *
           * @param nombre 
           * @param nota de programacion
           */
         public Alumno(String nombre, double nota) {
                  this.nombre = nombre;
                  this.nota = nota;
         }//Fin Constructor
         
         //GET y SET
         public String getNombre() {
                  return nombre;
         }
         public double getNota() {
                  return nota;
         }

         public void setNombre(String nombre) {
                  this.nombre = nombre;
         }
         public void setNota(int nota) {
                  this.nota = nota;
         }
         
         //Metodos propios
         
         
          /**
           * Ordenamos los alumnos por nombre 
           * usamos el metodo de la burbuja.
           *
           * @param listaAlumnos 
           */
         public static void nombreBurbuja(Alumno[] listaAlumnos) {
                    for (int i = 0; i < listaAlumnos.length - 1; i++) {
                              for (int j = 0; j < listaAlumnos.length - i - 1; j++) {
                                        //Comparamos los valores, comprobando antes que ambos son distintos a null
                                        if (listaAlumnos[j] != null && listaAlumnos[j + 1] != null
                                                && listaAlumnos[j].getNombre().compareTo(listaAlumnos[j + 1].getNombre()) > 0) {
                                                  //Intercambiamos los nombres, si al comparar da valor positivo significa que el alumno[j] va antes que el alumno[j+1]
                                                  Alumno temp = listaAlumnos[j];
                                                  listaAlumnos[j] = listaAlumnos[j + 1];
                                                  listaAlumnos[j + 1] = temp;
                                        }//Fin if
                              }//Fin 2ºfor
                    }//Fin 1ºfor
                    
                    //Imprimimos los nombres de los Alumnos
                    System.out.print("Alumnos: ");
                    for (int i = 0; i < listaAlumnos.length; i++) {
                             if (listaAlumnos[i] != null) {
                                       System.out.print(listaAlumnos[i].getNombre());
                                       if (i < listaAlumnos.length - 1 && listaAlumnos[i + 1] != null) {
                                                 System.out.print(", ");
                                       }//Fin 2ºif
                             }//Fin 1ºif
                   }//fin for
          }//Fin nombreBurbuja

         
         
          /**
           * Ordenamos los alumnos por nota de mayor a menor
           * usamos el metodo de la burbuja.
           *
           * @param listaAlumnos
           */ 
          public static void notaBurbuja(Alumno[] listaAlumnos) {
                    for (int i = 0; i < listaAlumnos.length - 1; i++) {
                              for (int j = 0; j < listaAlumnos.length - i - 1; j++) {
                                        //Comparamos los valores, comprobando antes que ambos son distintos a null
                                        if (listaAlumnos[j] != null && listaAlumnos[j + 1] != null
                                                && listaAlumnos[j].getNota() < listaAlumnos[j + 1].getNota()) {
                                                  //Intercambiamos las notas, si al comparar da valor positivo significa que el alumno[j] va antes que el alumno[j+1]
                                                  Alumno temp = listaAlumnos[j];
                                                  listaAlumnos[j] = listaAlumnos[j + 1];
                                                  listaAlumnos[j + 1] = temp;
                                        }//Fin if
                              }//Fin 2ºfor
                    }//Fin 1ºfor
                    
                    // Imprimir la lista ordenada por nota
                    System.out.println("Alumnos ordenados por nota: ");
                    for (Alumno alumno : listaAlumnos) {
                              if (alumno != null) {
                                        //Llamamos al metodo toString creado
                                        System.out.println(alumno.toString());
                              }//Fin if
                    }//Fin for
          }//Fin notaBurbuja
          
          
          //Metodo toString para imprimir el objeto
          @Override
          public String toString() {
                    return "Nombre: " + nombre + "   -    Nota en Programacion: " + nota;
          }//Fin del toString

          
          /**
           * Agregamos un nuevo alumno solicitando el nombre y la nota
           * usaremos la intefaz grafica de JOptionPane.
           *
           * @return El objeto Alumno creado.
           */
          public static Alumno agregarAlumno() {
                    //Introducimos el nombre por pantalla con una interfaz grafica
                    String nombre = JOptionPane.showInputDialog(null, "Nombre: ", "Nuevo Alumno", 1);
                    //Introducir la nota igual que el nombre
                    double nota;
                    //Bucle do-while, no para hasta que la nota este entre 0 y 10
                    do {
                              String notaString = JOptionPane.showInputDialog(null, "Nota en Programacion: ", "Nuevo Alumno", 1);
                              //Usamos un try-catch para intentar hacer algo, y capturar las excepciones, pudiendo manejarlas
                              try {
                                        //Convertimos String notaString a un tipo double nota
                                        nota = Double.parseDouble(notaString);
                                        //Si la nota esta fuera del rango 0-10, lanza el siguiente mensaje
                                        if (nota < 0 || nota > 10) {
                                                  JOptionPane.showMessageDialog(null, "La nota debe estar entre 0 y 10.");
                                        }//Fin if
                              } catch (NumberFormatException e) {
                                        JOptionPane.showMessageDialog(null, "Ingrese una nota válida.");
                                        nota = -1; // Asignamos un valor no válido para que continúe el bucle
                              }//Fin try-catch
                    } while (nota < 0 || nota > 10); 
                    //Devolvemos los valores de nombre y nota
                    return new Alumno(nombre, nota);
          }//Fin agregarAlumno

}//Fin class
