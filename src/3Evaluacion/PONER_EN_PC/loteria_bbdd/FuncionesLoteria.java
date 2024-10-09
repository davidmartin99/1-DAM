package loteria_bbdd;

import static java.lang.Math.random;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import static loteria_bbdd.MenuLoteria.inicializarMenu;

/**
 *
 * @author david
 */
public class FuncionesLoteria {
          public static void main(String[] args) {
                    inicializarMenu();
          }//Fin main
          
          public static void realizarApuesta() {
                    Scanner scanner = new Scanner(System.in);

                    // FECHA
                    LocalDate nuevoFecha = LocalDate.now();

                    // DNI 
                    String nuevoDNI;
                    do {
                              try {
                                        System.out.println("Ingrese su DNI:");
                                        nuevoDNI = scanner.nextLine();
                                        if (!nuevoDNI.matches("\\d{8}[A-Za-z]")) {
                                                  throw new Exception("DNI no válido. Debe contener 8 números seguidos de una letra.");
                                        }
                              } catch (Exception e) {
                                        System.err.println("ERROR: " + e.getMessage());
                                        nuevoDNI = ""; // Reiniciar el valor del DNI
                              }
                    } while (nuevoDNI.isEmpty());
                    
                    // NOMBRE 
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

                    ///////////////////////// APUESTA //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    ArrayList<Integer> numerosLoteria = new ArrayList<>();
                    int numeroComplementario = 0;

                    // Hacer numeros de la Loteria
                    do {
                              int num = (int) (random() * 49) + 1;
                              // Si contiene ya el numero, lo borra, si no lo guarda. Para que no haya numeros repetidos
                              if (!numerosLoteria.contains(num)) {
                                        numerosLoteria.add(num);
                              }//Fin if
                    } while (numerosLoteria.size() < 6);

                    // Hacer el complementario
                    do {
                              numeroComplementario = (int) (random() * 49) + 1;
                    } while (numerosLoteria.contains(numeroComplementario));

                    // Hacer el reintegro
                    int numeroReintegro = (int) (random() * 10);

                    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    // El usuario introduce su apuesta
                    ArrayList<Integer> apuestaUsuario = new ArrayList<>();
                    int reintegroUsuario = -1;

                    // Introducir la Apuesta
                    System.out.println("Introduce tus 6 numeros de la lotería (del 1 al 49): ");
                    while (apuestaUsuario.size() < 6) {
                              try {
                                        int numero = Integer.parseInt(scanner.nextLine());
                                        if (numero < 1 || numero > 49) {
                                                  throw new IllegalArgumentException("Número fuera de rango. Inténtalo de nuevo.");
                                        }
                                        if (apuestaUsuario.contains(numero)) {
                                                  throw new IllegalArgumentException("Número repetido. Inténtalo de nuevo.");
                                        }
                                        apuestaUsuario.add(numero);
                              } catch (NumberFormatException e) {
                                        System.err.println("Entrada inválida. Introduce un número válido.");
                              } catch (IllegalArgumentException e) {
                                        System.err.println(e.getMessage());
                              }
                    }

                    // Introducir el Reintegro
                    System.out.println("Introduce tu numero de reintegro (del 0 al 9):");
                    while (reintegroUsuario < 0 || reintegroUsuario > 9) {
                              try {
                                        reintegroUsuario = Integer.parseInt(scanner.nextLine());
                                        if (reintegroUsuario < 0 || reintegroUsuario > 9) {
                                                  throw new IllegalArgumentException("Número de reintegro fuera de rango. Inténtalo de nuevo.");
                                        }
                              } catch (NumberFormatException e) {
                                        System.out.println("Entrada inválida. Introduce un número válido.");
                              } catch (IllegalArgumentException e) {
                                        System.out.println(e.getMessage());
                              }
                    }

                    // Imprimir apuesta del usuario
                    System.out.print("Tu apuesta: ");
                    Collections.sort(apuestaUsuario);
                    for (int i = 0; i < apuestaUsuario.size(); i++) {
                              System.out.print(apuestaUsuario.get(i));
                              if (i < apuestaUsuario.size() - 1) {
                                        System.out.print(", ");
                              }
                    }
                    System.out.println("\nTu reintegro: " + reintegroUsuario);

                    ///////////////////////////////////////////////////////////////////////////////////////////////////////////
                    // MOSTRAR NUMEROS GANADORES
                    // Los ordenamos
                    Collections.sort(numerosLoteria);

                    System.out.print("Numeros Ganadores: ");
                    for (int i = 0; i < numerosLoteria.size(); i++) {
                              System.out.print(numerosLoteria.get(i));
                              // Que impra ", " en todos menos en el último
                              if (i < numerosLoteria.size() - 1) {
                                        System.out.print(", ");
                              }//Fin if
                    }//Fin for

                    // IMPRIMIR COMPLEMENTARIO
                    System.out.println("\nComplementario: " + numeroComplementario);

                    // IMPRIMIR EL REINTEGRO
                    System.out.println("Reintegro: " + numeroReintegro);

                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    // COMPROBAR EL PREMIO
                    // Comparar los números ganadores con los introducidos
                    int aciertos = 0;
                    for (int num : apuestaUsuario) {
                              if (numerosLoteria.contains(num)) {
                                        aciertos++;
                              }
                    }//Fin for

                    // Determinar el premio
                    String categoria = "No Premiado";
                    int premio = 0;
                    if (aciertos == 6 && reintegroUsuario == numeroReintegro) {
                              premio = 10000; // Acierta los 6 números y el reintegro
                              categoria = "Especial";
                    } else if (aciertos == 6) {
                              premio = 5000; // Acierta los 6 números
                              categoria = "1";
                    } else if (aciertos == 5 && apuestaUsuario.contains(numeroComplementario)) {
                              premio = 2000; // Acierta 5 números y el complementario
                              categoria = "2";
                    } else if (aciertos == 5) {
                              premio = 1000; // Acierta 5 números
                              categoria = "3";
                    } else if (aciertos == 4) {
                              premio = 500; // Acierta 4 números
                              categoria = "4";
                    } else if (aciertos == 3) {
                              premio = 200; // Acierta 3 números
                              categoria = "5";
                    } else if (reintegroUsuario == numeroReintegro) {
                              premio = 10; // Acierta solo el reintegro
                              categoria = "Reintegro";
                    }

                    // Imprimir el premio
                    if (premio > 0) {
                              System.out.println("¡Felicidades! Has ganado " + premio + "€.");
                    } else {
                              System.out.println("No has ganado ningún premio.");
                    }//Fin if-else

                    
                    //////////////////////// INSERTAR EN LA BBDD //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    // Instancia de Consultas_Metodos
                    ConsultasMetodos6 consultas = new ConsultasMetodos6();

                    // Consulta SQL para insertar los datos del nuevo jugador
                    String consulta = "INSERT INTO apuesta2 (fecha, dni, nombre, aciertos, categoria, premio) "
                            + "VALUES ('" + nuevoFecha+ "', '" +nuevoDNI + "', '" + nuevoNombre + "', '" + aciertos + "','"+ categoria+" ',' "+premio+" ')";

                    // Ejecutamos la consulta
                    try {
                              consultas.ejecutarInstruccion(consulta);
                              System.out.println("Jugador insertado correctamente en la base de datos.");
                    } catch (SQLException e) {
                              System.err.println("Error al insertar jugador en la base de datos: " + e.getMessage());
                    }
          }//Fin realizarApuesta

          
          public static void MostrarGanadores() throws SQLException {
                    ConsultasMetodos6 consultas = new ConsultasMetodos6();
                    String consultaRecords = "SELECT fecha, dni, nombre, aciertos, categoria, premio"
                            + " FROM apuesta2"
                            + " WHERE premio > 0"
                            + " ORDER BY premio DESC";
                    consultas.imprimirApuesta(consultaRecords);
          }//Fin mostrarRecords
          
          public static void MostrarHistorial() throws SQLException {
                    ConsultasMetodos6 consultas = new ConsultasMetodos6();
                    String consultaRecords = "SELECT fecha, dni, nombre, aciertos, categoria, premio"
                            + " FROM apuesta2"
                            + " ORDER BY fecha";
                    consultas.imprimirApuesta(consultaRecords);
          }//Fin mostrarRecords
          
          
          
}//Fin class
