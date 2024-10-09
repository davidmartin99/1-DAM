package juegos;

/**
 *
 * @author david
 */
import java.util.Random;
import java.util.Scanner;

public class BuscaMinas {

          private static final int TAMANO_TABLERO = 5;
          private static final int NUMERO_MINAS = 5;
          private static final char CELDA_OCULTA = '-';
          private static final char CELDA_MINA = '*';

          public static void main(String[] args) {
                    char[][] tablero = new char[TAMANO_TABLERO][TAMANO_TABLERO];
                    inicializarTablero(tablero);
                    colocarMinas(tablero);

                    Scanner scanner = new Scanner(System.in);

                    while (true) {
                              imprimirTablero(tablero);

                              System.out.println("Ingrese la fila y columna (ejemplo: 1 2): ");
                              int fila = scanner.nextInt();
                              int columna = scanner.nextInt();

                              if (tablero[fila][columna] == CELDA_MINA) {
                                        System.out.println("¡Has perdido! Has encontrado una mina.");
                                        break;
                              } else {
                                        descubrirCelda(tablero, fila, columna);
                              }

                              if (haGanado(tablero)) {
                                        System.out.println("¡Felicidades, has ganado!");
                                        break;
                              }
                    }
          }

          private static void inicializarTablero(char[][] tablero) {
                    for (int i = 0; i < TAMANO_TABLERO; i++) {
                              for (int j = 0; j < TAMANO_TABLERO; j++) {
                                        tablero[i][j] = CELDA_OCULTA;
                              }
                    }
          }

          private static void colocarMinas(char[][] tablero) {
                    Random random = new Random();
                    for (int i = 0; i < NUMERO_MINAS; i++) {
                              int fila = random.nextInt(TAMANO_TABLERO);
                              int columna = random.nextInt(TAMANO_TABLERO);
                              tablero[fila][columna] = CELDA_MINA;
                    }
          }

          private static void imprimirTablero(char[][] tablero) {
                    for (int i = 0; i < TAMANO_TABLERO; i++) {
                              for (int j = 0; j < TAMANO_TABLERO; j++) {
                                        System.out.print(tablero[i][j] + " ");
                              }
                              System.out.println();
                    }
          }

          private static void descubrirCelda(char[][] tablero, int fila, int columna) {
                    if (fila < 0 || fila >= TAMANO_TABLERO || columna < 0 || columna >= TAMANO_TABLERO || tablero[fila][columna] != CELDA_OCULTA) {
                              return;
                    }

                    int minasCercanas = 0;
                    for (int i = fila - 1; i <= fila + 1; i++) {
                              for (int j = columna - 1; j <= columna + 1; j++) {
                                        if (i >= 0 && i < TAMANO_TABLERO && j >= 0 && j < TAMANO_TABLERO && tablero[i][j] == CELDA_MINA) {
                                                  minasCercanas++;
                                        }
                              }
                    }

                    tablero[fila][columna] = Character.forDigit(minasCercanas, 10);
          }

          private static boolean haGanado(char[][] tablero) {
                    for (int i = 0; i < TAMANO_TABLERO; i++) {
                              for (int j = 0; j < TAMANO_TABLERO; j++) {
                                        if (tablero[i][j] == CELDA_OCULTA) {
                                                  return false;
                                        }
                              }
                    }
                    return true;
          }
}
