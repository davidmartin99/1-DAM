package ruletaRusa_bbdd;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;
import static ruletaRusa_bbdd.MenuRuletaRusa.inicializarMenu;

/**
 *
 * @author david
 */
public class FuncionesRuletaRusa {
          public static void main(String[] args) {
                    inicializarMenu();
          }//Fin main

          public static void empezarPartida() {
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


                    //Empezar el juego 
                    Random random = new Random();

                    // Generar la posición aleatoria de la bala (1-6)
                    int posicionBala = random.nextInt(6) + 1;
                    int intentos = 0;
                    boolean jugadorPerdio = false;
                    String nuevoFinal = null;

                    System.out.println("¡Bienvenido al juego de la ruleta rusa!");
                    System.out.println("Elige un número entre 1 y 6. Si eliges la posición donde está la bala, perderás.");

                    while (intentos < 5 && !jugadorPerdio) {
                              int eleccionJugador = -1;

                              // Solicitar al jugador que elija un número
                              while (eleccionJugador < 1 || eleccionJugador > 6) {
                                        System.out.print("Elige un número (1-6): ");
                                        try {
                                                  eleccionJugador = Integer.parseInt(scanner.nextLine());
                                                  if (eleccionJugador < 1 || eleccionJugador > 6) {
                                                            throw new IllegalArgumentException("Número fuera de rango. Debes elegir entre 1 y 6.");
                                                  }
                                        } catch (NumberFormatException e) {
                                                  System.out.println("Entrada inválida. Debes ingresar un número.");
                                        } catch (IllegalArgumentException e) {
                                                  System.out.println(e.getMessage());
                                        }
                              }

                              intentos++;

                              if (eleccionJugador == posicionBala) {
                                        System.out.println("¡Bang! Has elegido la posición de la bala. Has perdido.");
                                        nuevoFinal = "Muerto";
                                        jugadorPerdio = true;
                              } else {
                                        System.out.println("Click. No hay bala en esta posición.");
                                        System.out.println("Llevas " + intentos + " intento(s).");
                              }
                    }

                    if (!jugadorPerdio) {
                              System.out.println("¡Felicidades! Has sobrevivido a la ruleta rusa.");
                              nuevoFinal = "Vivo";
                    }

          
                   // Puntuacion      
                    int nuevoPuntuacion = 0;
                    switch(intentos){
                              case 1:
                                        nuevoPuntuacion = 6;
                                        break;
                              case 2:
                                        nuevoPuntuacion = 12;
                                        break;
                              case 3:
                                        nuevoPuntuacion = 25;
                                        break;
                              case 4:
                                        nuevoPuntuacion = 50;
                                        break;
                              default:
                                        nuevoPuntuacion = 100;
                                        break;
                    }
                    
                    // Instancia de Consultas_Metodos
                    ConsultasMetodos5 consultas = new ConsultasMetodos5();

                    // Consulta SQL para insertar los datos del nuevo jugador
                    String consulta = "INSERT INTO jugador2 (nombre, puntuacion, final) "
                            + "VALUES ('"+nuevoNombre+ "', " + nuevoPuntuacion + ", '" + nuevoFinal + "')";

                    // Ejecutamos la consulta
                    try {
                              consultas.ejecutarInstruccion(consulta);
                              System.out.println("Jugador insertado correctamente en la base de datos.");
                    } catch (SQLException e) {
                              System.err.println("Error al insertar jugador en la base de datos: " + e.getMessage());
                    }

          }//Fin empezarPartida

          public static void mostrarRecords() throws SQLException {
                    ConsultasMetodos5 consultas = new ConsultasMetodos5();
                    String consultaRecords = "SELECT nombre, puntuacion, final"
                            + " FROM jugador2"
                            + " ORDER BY puntuacion DESC";
                    consultas.imprimirJugador(consultaRecords);
          }//Fin mostrarRecords

          
          public static void mostrarVivos() throws SQLException {
                    ConsultasMetodos5 consultas = new ConsultasMetodos5();
                    String consultaRecords = "SELECT nombre, puntuacion, final"
                            + " FROM jugador2"
                            + " WHERE final like 'Vivo' "
                            + " ORDER BY puntuacion DESC";
                    consultas.imprimirJugador(consultaRecords);
          }//Fin mostrarVivos
          
          
}//Fin class
