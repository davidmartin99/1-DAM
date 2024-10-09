package practica_empleados;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Clase principal donde se encuentra inicializado el menú y sus métodos
 * 
 * @version 1.0
 * @author david
 */
public class ListaEmpleados {
          
          public static void main(String[] args) {
                    MenuEmpleados.inicializarMenu();
          }//Fin main
          
          /**
           * Método para ir agregando nuevos empleados
           * 
           * @param empleadosEmpresa
           * @param formatter
           * @param teclado 
           */
          public static void agregarEmpleado(ArrayList<Empleados> empleadosEmpresa, DateTimeFormatter formatter, Scanner teclado) {
                    // boolean para comprobar que los datos introducidos sean válidos
                    boolean datosCorrectos = false;
                    do {
                              try {
                                        System.out.print("Ingrese los datos del empleado: ");
                                        System.out.print("\nNombre: ");
                                        String nombreNuevo = teclado.nextLine();
                                        // Comprobar que el nombre son letras o espacios en blanco
                                        if (!nombreNuevo.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  // Creamos una excepcion
                                                  throw new IllegalArgumentException("El nombre solo puede contener letras y/o espacios.");
                                        }//Fin if

                                        // Igual para el apellido
                                        System.out.print("Apellido: ");
                                        String apellidoNuevo = teclado.nextLine();
                                        if (!apellidoNuevo.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  // Creamos una excepcion
                                                  throw new IllegalArgumentException("El apellido solo puede contener letras y/o espacios.");
                                        }//Fin if

                                        System.out.print("Fecha de nacimiento (dd-MM-yyyy): ");
                                        LocalDate fechaNacimientoNuevo = LocalDate.parse(teclado.nextLine(), formatter);

                                        System.out.print("Fecha de ingreso (dd-MM-yyyy): ");
                                        LocalDate fechaIngresoNuevo = LocalDate.parse(teclado.nextLine(), formatter);

                                        // Comprobar que la fecha de ingreso es posterior a la de nacimiento
                                        if (fechaNacimientoNuevo.isAfter(LocalDate.now()) || fechaIngresoNuevo.isAfter(LocalDate.now()) || fechaNacimientoNuevo.isAfter(fechaIngresoNuevo)) {
                                                  // Creamos una excepcion
                                                  throw new IllegalArgumentException("Fecha no válida. La fecha de nacimiento no puede ser mayor que la de ingreso y ambas fechas deben estar en el pasado.");
                                        }//Fin if

                                        System.out.print("Puesto: ");
                                        String puestoNuevo = teclado.nextLine();
                                        System.out.print("Salario: ");
                                        double salarioNuevo = teclado.nextDouble();

                                        // Comprobamos que el salario no sea negativo
                                        if (salarioNuevo <= 0) {
                                                  // Creamos una excepcion
                                                  throw new IllegalArgumentException("El salario debe ser un valor positivo.");
                                        }//Fin if

                                        // Creamos un nuevo empleado con los datos introducidos
                                        Empleados nuevoEmpleado = new Empleados(nombreNuevo, apellidoNuevo, fechaNacimientoNuevo, fechaIngresoNuevo, puestoNuevo, salarioNuevo);

                                        // Lo añadimos al ArrayList
                                        empleadosEmpresa.add(nuevoEmpleado);
                                        System.out.println("Empleado añadido correctamente.");
                                        datosCorrectos = true;
                                        //Fin try
                              } catch (InputMismatchException e1) {
                                        System.err.println("ERROR: el salario son números");
                                        teclado.nextLine();
                              } catch (DateTimeParseException e2) {
                                        System.err.println("ERROR: Fecha no válida, ingrese la fecha en el formato correcto (dd-MM-yyyy)");
                              } catch (IllegalArgumentException e3) {
                                        System.err.println("ERROR: " + e3.getMessage());
                              } catch (Exception e4) {
                                        System.err.println("ERROR: " + e4.toString());
                                        teclado.nextLine();
                              }//Fin try-catch
                              
                    } while (!datosCorrectos);
          }//Fin agregarEmpleado

          
          /**
           * Método para eliminar un empleado
           * @param empleadosEmpresa
           * @param teclado 
           */
          public static void eliminarEmpleado(ArrayList<Empleados> empleadosEmpresa, Scanner teclado) {
                    // boolean para comprobar que los datos introducidos sean válidos
                    boolean empleadoEncontrado = false;
                    do {
                              try {
                                        System.out.print("Ingrese el nombre del empleado a borrar: ");
                                        String nombreBorrar = teclado.nextLine();
                                        // Comprobar que el nombre son letras o espacios en blanco
                                        if (!nombreBorrar.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  // Creamos una excepcion
                                                  throw new IllegalArgumentException("El nombre solo puede contener letras y/o espacios.");
                                        }//Fin if

                                        System.out.print("Ingrese el apellido del empleado a borrar: ");
                                        String apellidoBorrar = teclado.nextLine();
                                        // Comprobar que el apellido son letras o espacios en blanco
                                        if (!apellidoBorrar.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  // Creamos una excepcion
                                                  throw new IllegalArgumentException("El apellido solo puede contener letras y/o espacios.");
                                        }//Fin if

                                        // Recorremos el ArrayList buscando los datos (nombre y apellido)
                                        for (int i = 0; i < empleadosEmpresa.size(); i++) {
                                                  Empleados empleado = empleadosEmpresa.get(i);

                                                  // Si lo encuentra 
                                                  if (empleado.getNombre().equalsIgnoreCase(nombreBorrar) && empleado.getApellidos().equalsIgnoreCase(apellidoBorrar)) {
                                                            empleadosEmpresa.remove(i);
                                                            empleadoEncontrado = true;
                                                            System.out.println("Se ha borrado el empleado.");
                                                            break;
                                                  }//Fin if
                                        }//Fin for

                                        // Si no lo encuentra
                                        if (!empleadoEncontrado) {
                                                  System.out.println("No se encontró el empleado.");
                                        }//Fin if
                              } catch (InputMismatchException e1) {
                                        System.err.println("ERROR: Debe ingresar letras.");
                                        teclado.nextLine(); 
                              } catch (IllegalArgumentException e2) {
                                        System.err.println("ERROR: " + e2.getMessage());
                              } catch (Exception e3) {
                                        System.err.println("ERROR: " + e3.toString());
                              }//Fin try-catch
                    } while (!empleadoEncontrado);
          }//Fin eliminarEmpleado

          
          /**
           * Método para encontrar a un empleado 
           * @param empleadosEmpresa
           * @param teclado 
           */
          public static void buscarEmpleado(ArrayList<Empleados> empleadosEmpresa, Scanner teclado) {
                    // boolean para comprobar que los datos introducidos sean válidos
                    boolean empleadoEncontrado = false;
                    do {
                              try {
                                        System.out.print("Ingrese el nombre del empleado a buscar: ");
                                        String nombreBuscar = teclado.nextLine();
                                        // Comprobar que el nombre son letras o espacios en blanco
                                        if (!nombreBuscar.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  // Creamos una excepcion
                                                  throw new IllegalArgumentException("El nombre solo puede contener letras y/o espacios.");
                                        }//Fin if

                                        System.out.print("Ingrese el apellido del empleado a buscar: ");
                                        String apellidoBuscar = teclado.nextLine();
                                        // Comprobar que el apellido son letras o espacios en blanco
                                        if (!apellidoBuscar.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  // Creamos una excepcion
                                                  throw new IllegalArgumentException("El apellido solo puede contener letras y/o espacios.");
                                        }//Fin if

                                        for (Empleados empleado : empleadosEmpresa) {
                                                  // Si encuentra al empleado, imprime sus datos
                                                  if (empleado.getNombre().equalsIgnoreCase(nombreBuscar) && empleado.getApellidos().equalsIgnoreCase(apellidoBuscar)) {
                                                            System.out.println("Empleado encontrado:");
                                                            System.out.println(empleado);
                                                            empleadoEncontrado = true;
                                                            break;
                                                  }//Fin if
                                        }//Fin for

                                        // Si no lo encuentra
                                        if (!empleadoEncontrado) {
                                                  System.out.println("Empleado no encontrado.");
                                        }//Fin if
                              } catch (InputMismatchException e1) {
                                        System.err.println("ERROR: Debe ingresar letras.");
                                        teclado.nextLine(); 
                              } catch (IllegalArgumentException e2) {
                                        System.err.println("ERROR: " + e2.getMessage());
                              } catch (Exception e3) {
                                        System.err.println("ERROR: " + e3.toString());
                              }//Fin try-catch
                    } while (!empleadoEncontrado);
          }//Fin buscarEmpleado
          

          /**
           * Método para ordenar los empleados
           *
           * @param empleadosEmpresa
           * @param teclado
           */
          public static void ordenarEmpleados(ArrayList<Empleados> empleadosEmpresa, Scanner teclado) {
                    boolean salir = false;
                    do {
                              // Mostramos las opciones al usuario
                              System.out.println("Seleccione la forma de ordenamiento: ");
                              System.out.println("a) Por antigüedad");
                              System.out.println("b) Por salario");
                              System.out.println("c) Por apellido");
                              
                              try{
                                        String ordenOpcion = teclado.nextLine();

                                        // Pasamos a minúscula directamente 
                                        ordenOpcion.toLowerCase();

                                        // Cuando son objetos, el Collections.sort() no funciona
                                        // Hay que ponerlo con un nuevo Comparator
                                        Comparator<Empleados> comparador = null;

                                        switch (ordenOpcion) {
                                                  case "a":
                                                            comparador = Comparator.comparing(Empleados::getFechaIngreso);
                                                            break;
                                                  case "b":
                                                            comparador = Comparator.comparingDouble(Empleados::getSalario);
                                                            break;
                                                  case "c":
                                                            comparador = Comparator.comparing(Empleados::getApellidos);
                                                            break;
                                                  default:
                                                            System.err.println("Opción no válida. Introduzca 'a', 'b' o 'c'.");
                                                            break;
                                        }//Fin switch

                                        if (comparador != null) {
                                                  Collections.sort(empleadosEmpresa, comparador);
                                                  System.out.println("\nEmpleados ordenados:");

                                                  // Usamos un Iterator para recorrer la lista de empleados ordenados
                                                  Iterator<Empleados> iteratorEmpleados = empleadosEmpresa.iterator();
                                                  int i = 1;
                                                  while (iteratorEmpleados.hasNext()) {
                                                            Empleados empleado = iteratorEmpleados.next();
                                                            System.out.println(i + ". " + empleado);
                                                            i++;
                                                  }//Fin while

                                                  salir = true; // Ya se ha seleccionado una opcion buena, salimos del do-while
                                        }//Fin if
                                        
                              } catch (IllegalArgumentException e1) {  //Excepcion del default
                                        System.err.println("ERROR: " + e1.getMessage());
                                        teclado.nextLine();
                              } catch (Exception e2) {
                                        System.err.println("ERROR: " + e2.toString());
                                        teclado.nextLine();
                              }//Fin try-catch
                    } while (!salir);
          }//Fin ordenarEmpleados
          
        
          /**
           * Método para calcular el gasto total de los empleados 
           * @param empleadosEmpresa
           * @return sumaSalarios
           */
          public static double gastoTotalSalarios (ArrayList<Empleados> empleadosEmpresa) {
                    // Sumamos todos los salarios
                    double sumaSalarios = 0;
                    // For para ir recorriendo los salarios de los empresarios y sumarlos
                    for (Empleados empEmpresa : empleadosEmpresa) {
                              sumaSalarios += empEmpresa.getSalario();
                    }//Fin for
                    // Devolvemos la suma total de los salarios de los empleados
                    return sumaSalarios;
          }//Fin gastoTotalSalarios
          
}//Fin class
