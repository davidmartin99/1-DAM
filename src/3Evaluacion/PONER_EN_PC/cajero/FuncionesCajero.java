package cajero;

import static cajero.MenuCajero.inicializarMenu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class FuncionesCajero {
          
          public static void main(String[] args) {
                    inicializarMenu();
          }//Fin main
          
          public static void registrarCliente() {
                    Scanner scanner = new Scanner(System.in);

                    // Nombre
                    String nuevoNombre;
                    do {
                              try {
                                        System.out.println("Ingrese su Nombre:");
                                        nuevoNombre = scanner.nextLine();
                                        if (!nuevoNombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  throw new Exception("Nombre no válido. Debe contener solo letras y espacios.");
                                        }
                              } catch (Exception e) {
                                        System.err.println("ERROR: " + e.getMessage());
                                        nuevoNombre = ""; // Reiniciar el valor del nombre
                              }
                    } while (nuevoNombre.isEmpty());

                    // Apellidos
                    String nuevoApellidos;
                    do {
                              try {
                                        System.out.println("Ingrese sus Apellidos:");
                                        nuevoApellidos = scanner.nextLine();
                                        if (!nuevoApellidos.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  throw new Exception("Apellidos no válidos. Debe contener solo letras y espacios.");
                                        }
                              } catch (Exception e) {
                                        System.err.println("ERROR: " + e.getMessage());
                                        nuevoApellidos = ""; // Reiniciar el valor del nombre
                              }
                    } while (nuevoApellidos.isEmpty());

                    // Numero de cuenta
                    int nuevoCuenta = 0;
                    do {
                              try {
                                        System.out.println("Ingrese su numero de cuenta: ");
                                        nuevoCuenta = scanner.nextInt();
                                        if (nuevoCuenta <= 0) {
                                                  System.err.println("ERROR: El numero de cuenta debe ser mayor que cero.");
                                        }
                              } catch (Exception e) {
                                        System.err.println("ERROR: El numero de cuenta debe ser un número válido.");
                                        scanner.nextLine(); // Limpiar el buffer del scanner
                              }
                    } while (nuevoCuenta <= 0);
                    ConsultasMetodos3 consultas = new ConsultasMetodos3();

                    // Saldo 
                    // Por defecto será 0
                    double nuevoSaldo = 0;

                    // Consulta SQL para insertar los datos del nuevo cliente
                    String consulta = "INSERT INTO cliente (nombre, apellidos, cuenta, saldo) "
                            + "VALUES ('" + nuevoNombre + "', '" + nuevoApellidos + "', " + nuevoCuenta + ", "
                            + nuevoSaldo + ")";

                    // Ejecutamos la consulta
                    try {
                              consultas.ejecutarInstruccion(consulta);
                              System.out.println("Cliente insertado correctamente en la base de datos.");
                    } catch (SQLException e) {
                              System.err.println("Error al insertar cliente en la base de datos: " + e.getMessage());
                    }
          }//fin registrarCliente
          
          
          
          public static void retirarIngresarSaldo() {
                    boolean clienteEncontrado = false;
                    Scanner scanner = new Scanner(System.in);

                    do {
                              try {
                                        System.out.println("Ingrese su nombre:");
                                        String nombreBuscar = scanner.nextLine();
                                        if (!nombreBuscar.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  throw new IllegalArgumentException("El nombre solo puede contener letras y/o espacios.");
                                        }

                                        System.out.println("Ingrese su apellido:");
                                        String apellidoBuscar = scanner.nextLine();
                                        if (!apellidoBuscar.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  throw new IllegalArgumentException("El apellido solo puede contener letras y/o espacios.");
                                        }

                                        // Instancia de Consultas_Metodos
                                        ConsultasMetodos3 consultas = new ConsultasMetodos3();

                                        // Consulta SQL para buscar el cliente
                                        String consultaBuscar = "SELECT * FROM cliente WHERE nombre = '" + nombreBuscar
                                                + "' AND apellidos = '" + apellidoBuscar + "'";

                                        // Ejecutar la consulta y mostrar el cliente si se encuentra
                                        ResultSet resultado = consultas.ejecutarConsulta(consultaBuscar);

                                        if (resultado.next()) {
                                                  clienteEncontrado = true;

                                                  // Mostrar los detalles del cliente
                                                  System.out.println("Bienvenido:");
                                                  System.out.println("Saldo actual: " + resultado.getDouble("saldo"));

                                                  boolean salir = false;
                                                  do {
                                                            try {
                                                                      System.out.println("Seleccione una opcion:");
                                                                      System.out.println("a) Retirar");
                                                                      System.out.println("b) Ingresar");
                                                                      System.out.println();
                                                                      String opcion = scanner.nextLine().toLowerCase();
                                                                      System.out.println();

                                                                      switch (opcion) {
                                                                                case "a":
                                                                                          // Retirar
                                                                                          System.out.println("Ingrese la cantidad a retirar: ");
                                                                                          double cantidad = scanner.nextDouble();
                                                                                          scanner.nextLine(); // Limpiar el buffer del scanner
                                                                                          String consultaActualizarSaldo = "UPDATE cliente SET saldo = saldo - " + cantidad
                                                                                                  + " WHERE nombre = '" + nombreBuscar + "' AND apellidos = '" + apellidoBuscar + "'";
                                                                                          consultas.ejecutarInstruccion(consultaActualizarSaldo);
                                                                                          salir = true; // Salir del bucle
                                                                                          break;
                                                                                case "b":
                                                                                          // Ingresar
                                                                                          System.out.println("Ingrese la cantidad a ingresar: ");
                                                                                          double cantidad1 = scanner.nextDouble();
                                                                                          scanner.nextLine(); // Limpiar el buffer del scanner
                                                                                          String consultaActualizarSaldo1 = "UPDATE cliente SET saldo = saldo + " + cantidad1
                                                                                                  + " WHERE nombre = '" + nombreBuscar + "' AND apellidos = '" + apellidoBuscar + "'";
                                                                                          consultas.ejecutarInstruccion(consultaActualizarSaldo1);
                                                                                          salir = true; // Salir del bucle
                                                                                          break;
                                                                                default:
                                                                                          throw new IllegalArgumentException("Opción no válida. Introduzca 'a' o 'b'.");
                                                                      }
                                                            } catch (Exception e) {
                                                                      System.out.println("ERROR: " + e.getMessage());
                                                            }
                                                  } while (!salir);
                                        } else {
                                                  System.out.println("Cliente no encontrado.");
                                        }

                                        // Cerrar el ResultSet
                                        resultado.close();
                              } catch (SQLException e) {
                                        System.err.println("ERROR: " + e.getMessage());
                              } catch (Exception e) {
                                        System.err.println("ERROR: " + e.getMessage());
                              }
                    } while (!clienteEncontrado);
          }// Fin retirarIngresarSaldo
          
          
          public static void imprimirClientes() {
                    boolean salir = false;
                    Scanner scanner = new Scanner(System.in);
                    ConsultasMetodos3 consultas = new ConsultasMetodos3(); // Instancia de Consultas_Metodos

                    do {
                              try {
                                        System.out.println("a) Por apellido");
                                        System.out.println("b) Por saldo");
                                        System.out.println("Seleccione la forma de ordenamiento:");
                                        String ordenOpcion = scanner.nextLine().toLowerCase();
                                        System.out.println();

                                        switch (ordenOpcion) {
                                                  case "a":
                                                            // Consulta SQL para ordenar por apellidos
                                                            String consultaAntiguedad = "SELECT * FROM cliente ORDER BY apellidos DESC";
                                                            consultas.imprimirClientes(consultaAntiguedad); // Imprimir empleados ordenados por antigüedad
                                                            salir = true; // Salir del bucle
                                                            break;
                                                  case "b":
                                                            // Consulta SQL para ordenar por saldo
                                                            String consultaSalario = "SELECT * FROM cliente ORDER BY saldo DESC";
                                                            consultas.imprimirClientes(consultaSalario); // Imprimir empleados ordenados por salario
                                                            salir = true; // Salir del bucle
                                                            break;
                                                  default:
                                                            throw new IllegalArgumentException("Opción no válida. Introduzca 'a' o 'b'.");
                                        }
                              } catch (Exception e) {
                                        System.out.println("ERROR: " + e.getMessage());
                              }
                    } while (!salir);
          }//Fin imprimirClientes
          
}//Fin class
