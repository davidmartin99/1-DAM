package examen3Ev;

import static examen3Ev.MenuJuego.inicializarMenu;
import static java.lang.Math.random;
import static java.lang.Math.round;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class FuncionesJuego {
          
          public static void main(String[] args) {
                    inicializarMenu();
          }//Fin main

          public static void empezarPartida(DateTimeFormatter formatter) {
                    Scanner scanner = new Scanner(System.in);

                    // DNI 
                    String nuevoDNI;
                    do {
                              try {
                                        System.out.println("Ingrese su DNI:");
                                        nuevoDNI = scanner.nextLine();
                                        
                              } catch (Exception e) {
                                        System.err.println("ERROR: " + e.getMessage());
                                        nuevoDNI = ""; 
                              }
                    } while (nuevoDNI.isEmpty());
                    

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
           

                    // Instancia de Consultas_Metodos
                    ConsultasMetodos2 consultas = new ConsultasMetodos2();

      
                    // Fecha
                    LocalDate nuevoFecha = LocalDate.now();

                    // Intentos
                    int nuevoIntentos = 2;

                    // Pasamos a int el numeror porque random da un double
                    int num = (int) (Math.random() * 500) + 1;

                    int intentos = 0;

                    System.out.println("Intenta adivinar un número entre 1 y 500:");

                    while (true) {
                              intentos++;
                              int numUsuario;
                              try {
                                        numUsuario = Integer.parseInt(scanner.nextLine());
                              } catch (NumberFormatException e) {
                                        System.out.println("Por favor, ingresa un número válido.");
                                        continue;
                              }

                              if (numUsuario < 1 || numUsuario > 500) {
                                        System.out.println("Por favor, ingresa un número entre 1 y 500.");
                                        continue;
                              }

                              if (numUsuario == num) {
                                        System.out.println("Enhorabuena, has adivinado en " + intentos + " intentos.");

                                        break;
                              } else if (numUsuario < num) {
                                        System.out.println("El número es mayor.");
                              } else {
                                        System.out.println("El número es menor.");
                              }
                    }//Fin while
                    
                    // PUNTUACION
                    double nuevoPuntuacion;
                    
                    if (nuevoIntentos > 5) {
                              nuevoPuntuacion = 2 - (nuevoIntentos * 0.02);
                    } else {
                              nuevoPuntuacion = 10 - ((nuevoIntentos * 2) - 2);
                    }
                    
                    // Consulta SQL para insertar los datos del nuevo jugador
                    String consulta= "INSERT INTO jugador (dni, nombre, fecha, puntuacion, intentos) "
                            + "VALUES ('" + nuevoDNI + "', '" + nuevoNombre + "', '" + nuevoFecha + "', "
                            + nuevoPuntuacion + ", " + nuevoIntentos + ")";

                    
                    // Ejecutamos la consulta
                    try {
                              consultas.ejecutarInstruccion(consulta);
                              System.out.println("Jugador insertado correctamente en la base de datos.");
                    } catch (SQLException e) {
                              System.err.println("Error al insertar jugador en la base de datos: " + e.getMessage());
                    }

          }//fin agregarEmpleado
          
          
          public static void mostrarRecords() throws SQLException {
                    ConsultasMetodos2 consultas = new ConsultasMetodos2();
                    String consultaRecords = "SELECT DISTINCT dni, nombre, fecha, puntuacion, intentos "
                                                                      + "FROM jugador "
                                                                      + "ORDER BY puntuacion DESC "
                                                                      + "LIMIT 10";
                    consultas.mostrarRecords(consultaRecords);
          }//Fin mostrarEmpleadosAntiguos
          
          
          public static int adivinarNumero() {
                    // Pasamos a int el numeror porque random da un double
                    int num = (int) (Math.random() * 500) + 1;
                    Scanner scanner = new Scanner(System.in);

                    int intentos = 0;
                    double puntuacion = 0;

                    System.out.println("Intenta adivinar un número entre 1 y 500:");

                    while (true) {
                              intentos++;
                              int numUsuario;
                              try {
                                        numUsuario = Integer.parseInt(scanner.nextLine());
                              } catch (NumberFormatException e) {
                                        System.out.println("Por favor, ingresa un número válido.");
                                        continue;
                              }

                              if (numUsuario < 1 || numUsuario > 500) {
                                        System.out.println("Por favor, ingresa un número entre 1 y 500.");
                                        continue;
                              }

                              if (numUsuario == num) {
                                        System.out.println("Enhorabuena, has adivinado en " + intentos + " intentos.");

                                        break;
                              } else if (numUsuario < num) {
                                        System.out.println("El número es mayor.");
                              } else {
                                        System.out.println("El número es menor.");
                              }
                    }//Fin while
                 return intentos;
          }//Fin adivinarNumero
          
          
}//Fin class
