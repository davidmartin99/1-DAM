package practica_empleados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Menú dónde muestra las opciones a elegir y ejecuta los métodos elegidos
 * 
 * @version 1.0
 * @author david
 */
public class MenuEmpleados {
          public static void inicializarMenu() {
                    // Creo el ArrayList con el tipo de dato objeto Alumnos
                    ArrayList<Empleados> empleadosEmpresa = new ArrayList<Empleados>();

                    // Formateo la fecha para que el patron sea día-mes-año.
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                    // Añado los empleados
                    Empleados empleado1 = new Empleados("Juan", "Torres", LocalDate.parse("01-01-1960", formatter), LocalDate.parse("24-05-1980", formatter), "Jefe", 60000);
                    empleadosEmpresa.add(empleado1); //Lo añadimos al ArrayList

                    Empleados empleado2 = new Empleados("Sara", "Gonzalez", LocalDate.parse("02-05-1980", formatter), LocalDate.parse("03-06-1999", formatter), "Secretaria", 25000);
                    empleadosEmpresa.add(empleado2); //Lo añadimos al ArrayList

                    Empleados empleado3 = new Empleados("Elena", "Sanchez", LocalDate.parse("03-09-1990", formatter), LocalDate.parse("02-11-2010", formatter), "TecnicoFP", 30000);
                    empleadosEmpresa.add(empleado3); //Lo añadimos al ArrayList

                    Empleados empleado4 = new Empleados("Pepe", "Uriel", LocalDate.parse("04-10-1991", formatter), LocalDate.parse("01-10-2015", formatter), "Administrativo", 24000);
                    empleadosEmpresa.add(empleado4); //Lo añadimos al ArrayList

                    Empleados empleado5 = new Empleados("David", "Martin", LocalDate.parse("17-04-1999", formatter), LocalDate.parse("04-03-2025", formatter), "Programador", 50000);
                    empleadosEmpresa.add(empleado5); //Lo añadimos al ArrayList

                    // Menú
                    Scanner teclado = new Scanner(System.in);
                    boolean salir = false;

                    do {
                              System.out.println("\n----- Menú -----");
                              System.out.println("1. Añadir empleado");
                              System.out.println("2. Eliminar empleado");
                              System.out.println("3. Buscar empleado");
                              System.out.println("4. Imprimir empleados ordenados por: ");
                              System.out.println("5. Calcular el gasto total de los empleados. ");
                              System.out.println("6. Salir");

                              try {
                                        int opcion = teclado.nextInt();
                                        teclado.nextLine();

                                        switch (opcion) {
                                                  case 1:
                                                            ListaEmpleados.agregarEmpleado(empleadosEmpresa,formatter, teclado);
                                                            break;
                                                  case 2:
                                                            ListaEmpleados.eliminarEmpleado(empleadosEmpresa, teclado);
                                                            break;
                                                  case 3:
                                                            ListaEmpleados.buscarEmpleado(empleadosEmpresa, teclado);
                                                            break;
                                                  case 4:
                                                            ListaEmpleados.ordenarEmpleados(empleadosEmpresa, teclado);
                                                            break;
                                                  case 5:
                                                            System.out.println("El gasto total de los empleados es: " + ListaEmpleados.gastoTotalSalarios(empleadosEmpresa));
                                                            break;
                                                  case 6:
                                                            salir = true;
                                                            System.out.println("¡Hasta luego!");
                                                            break;
                                                  default:
                                                            //Creamos la excepción 
                                                            throw new IllegalArgumentException("Opción no válida. Debe ser una opción disponible (1 - 6).");
                                        }//Fin switch 

                              } catch (InputMismatchException e1) {
                                        System.err.println("ERROR: Debe introducir un número.");
                                        teclado.nextLine();
                              } catch (IllegalArgumentException e2) {  //Excepcion del default
                                        System.err.println("ERROR: " + e2.getMessage());
                              } catch (Exception e3) {
                                        System.err.println("ERROR: " + e3.toString());
                                        teclado.nextLine();
                              }//Fin try-catch

                    } while (!salir);

                    teclado.close();
          }//Fin main

}//Fin class
