package practicaEvaluable2;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Clase principal 
 * Podremos introducir y mostrar información de los profesores y alumnos
 * @author David Martin
 */
public class mainPersona {
      
         public static void main(String[] args) throws Exception {
                   //Creamos unas listas de arrays para que se vayan guardando los datos de Alumno y Profesor
                  List<Profesor> listaProfesores = new ArrayList<>();
                  List<Alumno> listaAlumnos = new ArrayList<>();
                  Component frame = null;

                  int opcion;
                  //Menu dentro de un bucle para que se repita hasta que el usuario pulse "5"
                  do {
                            //Con JOptionPane. vamos a ir mostrando ventanas con las que el usuario interactua
                            opcion = Integer.parseInt(JOptionPane.showInputDialog(frame,"""
                                               1. Introducir Profesor
                                               2. Introducir Alumno
                                               3. Imprimir Profesores
                                               4. Imprimir Alumnos
                                               5. Salir
                                               Seleccione una opción:
                                              """, 2));

                           switch (opcion) {
                                    case 1:
                                             introducirProfesor(listaProfesores);
                                             break;
                                    case 2:
                                             introducirAlumno(listaAlumnos);
                                             break;
                                    case 3:
                                             imprimirProfesores(listaProfesores);
                                             break;
                                    case 4:
                                             imprimirAlumnos(listaAlumnos);
                                             break;
                                    case 5:
                                             JOptionPane.showMessageDialog(frame, "Hasta luego!", "EXIT", 2);
                                             break;
                                    default:
                                             JOptionPane.showMessageDialog(frame, "Opción no válida. Por favor, seleccione una opción válida.", "ERROR", 0);
                           }//Fin switch

                  } while (opcion != 5);
         }

         //Metodo que instancia el objeto Alumno y lo guarda en la lista Alumnos
         private static void introducirAlumno(List<Alumno>listaAlumnos) throws Exception {
                  Component frame = null;

                  String nombre1 = JOptionPane.showInputDialog(frame, "Nombre: ", "ALUMNO", 3);
                  String apellido1 = JOptionPane.showInputDialog(frame, "Apellido: ", "ALUMNO", 3);
                  
                  System.out.print("DNI: ");
                  String dniNumero = JOptionPane.showInputDialog(frame, "DNI: ", "ALUMNO", 3);
                  DNI dni1 = new DNI();
                  dni1.establecer(dniNumero);

                  int dia = Integer.parseInt( JOptionPane.showInputDialog(frame, "Fecha de Nacimiento"+"   dia: ", "ALUMNO", 3));
                  int mes = Integer.parseInt(JOptionPane.showInputDialog(frame, "Fecha de Nacimiento"+"   mes: ", "ALUMNO", 3));
                  int año = Integer.parseInt(JOptionPane.showInputDialog(frame, "Fecha de Nacimiento"+"   año: ", "ALUMNO", 3));
                  Fecha fechaNacimiento1 = new Fecha(dia, mes, año);
                  
                  Alumno alumno = new Alumno(nombre1, apellido1, fechaNacimiento1, dni1);
                  listaAlumnos.add(alumno);
         }//Fin introducirAlumno
         
         //Metodo para imprimir la lista guardada de Alumnos
         private static void imprimirAlumnos(List<Alumno>listaAlumnos) {
                  Component frame = null;

                  if (listaAlumnos.isEmpty()) {
                           JOptionPane.showMessageDialog(frame, "No hay Alumnos para imprimir", "Error",  2);
                  } else {
                           for (Alumno alumno : listaAlumnos) {
                                    JOptionPane.showConfirmDialog(frame, alumno, "Informacion Alumnos:", 1);
                           }
                  }//Fin if-else
         }//Fin imprimirAlumnos
         
          //Metodo que instancia el objeto Profesor y lo guarda en la lista Profesores
         private static void introducirProfesor(List<Profesor>listaProfesores) throws Exception {
                  Component frame = null;

                  String nombre1 = JOptionPane.showInputDialog(frame, "Nombre: ", "PROFESOR", 3);
                  String apellido1 = JOptionPane.showInputDialog(frame, "Apellido: ", "PROFESOR", 3);

                  String dniNumero = JOptionPane.showInputDialog(frame, "DNI: ", "PROFESOR", 3);
                  DNI dni1 = new DNI();
                  dni1.establecer(dniNumero);

                  int dia = Integer.parseInt(JOptionPane.showInputDialog(frame, "Fecha de Nacimiento" + "    dia: ", "PROFESOR", 3));
                  int mes = Integer.parseInt(JOptionPane.showInputDialog(frame, "Fecha de Nacimiento" + "   mes: ", "PROFESOR", 3));
                  int año = Integer.parseInt(JOptionPane.showInputDialog(frame, "Fecha de Nacimiento" + "   año: ", "PROFESOR", 3));
                  Fecha fechaNacimiento1 = new Fecha(dia, mes, año);
                  
                  String cuenta1 = JOptionPane.showInputDialog(frame, "Cuenta Corriente: ", "PROFESOR", 3);
                  
                  double nomina1 = Double.parseDouble (JOptionPane.showInputDialog(frame, "Nomina: ", "PROFESOR", 3));

                  Profesor profesor = new Profesor (nombre1, apellido1, fechaNacimiento1, dni1, cuenta1, nomina1);
                  listaProfesores.add(profesor);
         }//Fin introducirProfesor

          //Metodo para imprimir la lista guardada de Profesores
         private static void imprimirProfesores(List<Profesor> listaProfesores) {
                  Component frame = null;
                  
                  if (listaProfesores.isEmpty()) {
                           JOptionPane.showMessageDialog(frame, "No hay Profesores para imprimir", "Error", 2);
                  } else {
                           for (Profesor profesor : listaProfesores) {
                                    JOptionPane.showConfirmDialog(frame, profesor, "Informacion Profesor:", 1);
                           }
                  }//Fin if-else
         }//Fin imprimirProfesores
         
}//Fin clase Main
