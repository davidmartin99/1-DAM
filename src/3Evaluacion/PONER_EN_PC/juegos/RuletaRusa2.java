package juegos;

/**
 *
 * @author david
 */
import java.util.Random;
import java.util.Scanner;

public class RuletaRusa2 {

          public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    Random random = new Random();

                    // Generar la posición aleatoria de la bala (1-6)
                    int posicionBala = random.nextInt(6) + 1;
                    int intentos = 0;
                    boolean jugadorPerdio = false;

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
                                        jugadorPerdio = true;
                              } else {
                                        System.out.println("Click. No hay bala en esta posición.");
                                        System.out.println("Llevas " + intentos + " intento(s).");
                              }
                    }

                    if (!jugadorPerdio) {
                              System.out.println("¡Felicidades! Has sobrevivido a la ruleta rusa.");
                    }

                    scanner.close();
          }
}
