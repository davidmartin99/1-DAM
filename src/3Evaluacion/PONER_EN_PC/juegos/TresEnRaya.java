package juegos;

/**
 *
 * @author david
 */

import java.util.Scanner;

public class TresEnRaya {

          private static final int TAMANIO = 7;
          private static char[][] tablero;
          private static char jugadorActual;

          public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    tablero = new char[TAMANIO][TAMANIO];
                    jugadorActual = 'X';
                    inicializarTablero();

                    while (true) {
                              mostrarTablero();
                              jugadorMovimiento(scanner);
                              if (esGanador()) {
                                        mostrarTablero();
                                        System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                                        break;
                              }
                              if (esEmpate()) {
                                        mostrarTablero();
                                        System.out.println("¡Es un empate!");
                                        break;
                              }
                              cambiarJugador();
                    }

                    scanner.close();
          }

          public static void inicializarTablero() {
                    for (int i = 0; i < TAMANIO; i++) {
                              for (int j = 0; j < TAMANIO; j++) {
                                        tablero[i][j] = '-';
                              }
                    }
          }

          public static void mostrarTablero() {
                    System.out.println("  a b c d e f g");
                    for (int i = 0; i < TAMANIO; i++) {
                              System.out.print((i + 1) + " ");
                              for (int j = 0; j < TAMANIO; j++) {
                                        System.out.print(tablero[i][j] + " ");
                              }
                              System.out.println();
                    }
          }

          public static void jugadorMovimiento(Scanner scanner) {
                    int fila = -1;
                    int columna = -1;
                    while (true) {
                              try {
                                        System.out.println("Jugador " + jugadorActual + ", ingresa tu movimiento (ej. 2c): ");
                                        String entrada = scanner.nextLine();
                                        if (entrada.length() != 2 && entrada.length() != 3) {
                                                  throw new IllegalArgumentException("Entrada inválida. Debe tener el formato 2c.");
                                        }

                                        fila = Character.getNumericValue(entrada.charAt(0)) - 1;
                                        columna = entrada.charAt(1) - 'a';

                                        if (fila < 0 || fila >= TAMANIO || columna < 0 || columna >= TAMANIO) {
                                                  throw new IllegalArgumentException("Movimiento fuera de los límites del tablero.");
                                        }

                                        if (tablero[fila][columna] != '-') {
                                                  throw new IllegalArgumentException("Esta posición ya está ocupada.");
                                        }

                                        tablero[fila][columna] = jugadorActual;
                                        break;
                              } catch (IllegalArgumentException e) {
                                        System.out.println("Error: " + e.getMessage());
                              }
                    }
          }

          public static boolean esGanador() {
                    // Verificar filas y columnas
                    for (int i = 0; i < TAMANIO; i++) {
                              if (verificarLinea(tablero[i]) || verificarLinea(obtenerColumna(i))) {
                                        return true;
                              }
                    }
                    // Verificar diagonales
                    return verificarDiagonales();
          }

          public static boolean verificarLinea(char[] linea) {
                    int contador = 0;
                    for (char c : linea) {
                              if (c == jugadorActual) {
                                        contador++;
                                        if (contador == 4) {
                                                  return true;
                                        }
                              } else {
                                        contador = 0;
                              }
                    }
                    return false;
          }

          public static char[] obtenerColumna(int indice) {
                    char[] columna = new char[TAMANIO];
                    for (int i = 0; i < TAMANIO; i++) {
                              columna[i] = tablero[i][indice];
                    }
                    return columna;
          }

          public static boolean verificarDiagonales() {
                    // Diagonales de izquierda a derecha
                    for (int i = 0; i < TAMANIO - 3; i++) {
                              for (int j = 0; j < TAMANIO - 3; j++) {
                                        if (tablero[i][j] == jugadorActual && tablero[i + 1][j + 1] == jugadorActual
                                                && tablero[i + 2][j + 2] == jugadorActual && tablero[i + 3][j + 3] == jugadorActual) {
                                                  return true;
                                        }
                              }
                    }
                    // Diagonales de derecha a izquierda
                    for (int i = 0; i < TAMANIO - 3; i++) {
                              for (int j = 3; j < TAMANIO; j++) {
                                        if (tablero[i][j] == jugadorActual && tablero[i + 1][j - 1] == jugadorActual
                                                && tablero[i + 2][j - 2] == jugadorActual && tablero[i + 3][j - 3] == jugadorActual) {
                                                  return true;
                                        }
                              }
                    }
                    return false;
          }

          public static boolean esEmpate() {
                    for (int i = 0; i < TAMANIO; i++) {
                              for (int j = 0; j < TAMANIO; j++) {
                                        if (tablero[i][j] == '-') {
                                                  return false;
                                        }
                              }
                    }
                    return true;
          }

          public static void cambiarJugador() {
                    jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
          }
}
