package juegos;

/**
 *
 * @author david
 */
import java.util.Scanner;

public class TicTacToe {

          public static void main(String[] args) {
                    char[][] tablero = {
                              {' ', ' ', ' '},
                              {' ', ' ', ' '},
                              {' ', ' ', ' '}
                    };
                    char jugadorActual = 'X';
                    boolean juegoTerminado = false;
                    Scanner scanner = new Scanner(System.in);

                    while (!juegoTerminado) {
                              imprimirTablero(tablero);
                              System.out.println("Jugador " + jugadorActual + ", introduce tu movimiento (fila y columna): ");
                              int fila = scanner.nextInt();
                              int columna = scanner.nextInt();

                              if (tablero[fila][columna] == ' ') {
                                        tablero[fila][columna] = jugadorActual;
                                        juegoTerminado = verificarGanador(tablero, jugadorActual);

                                        if (juegoTerminado) {
                                                  imprimirTablero(tablero);
                                                  System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                                        } else if (tableroLleno(tablero)) {
                                                  imprimirTablero(tablero);
                                                  System.out.println("¡Es un empate!");
                                                  juegoTerminado = true;
                                        } else {
                                                  jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
                                        }
                              } else {
                                        System.out.println("Movimiento inválido, intenta de nuevo.");
                              }
                    }

                    scanner.close();
          }

          private static void imprimirTablero(char[][] tablero) {
                    for (int i = 0; i < tablero.length; i++) {
                              for (int j = 0; j < tablero[i].length; j++) {
                                        System.out.print(tablero[i][j]);
                                        if (j < tablero[i].length - 1) {
                                                  System.out.print("|");
                                        }
                              }
                              System.out.println();
                              if (i < tablero.length - 1) {
                                        System.out.println("-----");
                              }
                    }
          }

          private static boolean verificarGanador(char[][] tablero, char jugador) {
                    for (int i = 0; i < 3; i++) {
                              if (tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) {
                                        return true;
                              }
                              if (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador) {
                                        return true;
                              }
                    }
                    if (tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) {
                              return true;
                    }
                    if (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador) {
                              return true;
                    }
                    return false;
          }

          private static boolean tableroLleno(char[][] tablero) {
                    for (int i = 0; i < 3; i++) {
                              for (int j = 0; j < 3; j++) {
                                        if (tablero[i][j] == ' ') {
                                                  return false;
                                        }
                              }
                    }
                    return true;
          }
}
