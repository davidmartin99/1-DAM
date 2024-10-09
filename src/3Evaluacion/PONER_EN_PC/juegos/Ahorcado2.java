package juegos;

/**
 *
 * @author david
 */
import java.util.Scanner;

public class Ahorcado2 {

          private static final String[] PALABRAS = {"gato", "perro", "elefante", "jirafa", "leon"};
          private static final int MAX_INTENTOS = 6;

          public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    String palabraSecreta = elegirPalabra();
                    char[] letrasAdivinadas = new char[palabraSecreta.length()];
                    int intentosRestantes = MAX_INTENTOS;

                    while (intentosRestantes > 0 && !esGanador(letrasAdivinadas)) {
                              System.out.println("Adivina la palabra:");
                              mostrarPalabra(letrasAdivinadas);
                              System.out.println("Intentos restantes: " + intentosRestantes);
                              char letra = scanner.nextLine().charAt(0);

                              if (!adivinar(letra, palabraSecreta, letrasAdivinadas)) {
                                        intentosRestantes--;
                              }
                    }

                    if (esGanador(letrasAdivinadas)) {
                              System.out.println("¡Felicidades, has ganado!");
                    } else {
                              System.out.println("¡Has perdido! La palabra era: " + palabraSecreta);
                    }
          }

          private static String elegirPalabra() {
                    return PALABRAS[(int) (Math.random() * PALABRAS.length)];
          }

          private static boolean adivinar(char letra, String palabraSecreta, char[] letrasAdivinadas) {
                    boolean letraEncontrada = false;
                    for (int i = 0; i < palabraSecreta.length(); i++) {
                              if (palabraSecreta.charAt(i) == letra) {
                                        letrasAdivinadas[i] = letra;
                                        letraEncontrada = true;
                              }
                    }
                    return letraEncontrada;
          }

          private static boolean esGanador(char[] letrasAdivinadas) {
                    for (char letra : letrasAdivinadas) {
                              if (letra == '\0') {
                                        return false;
                              }
                    }
                    return true;
          }

          private static void mostrarPalabra(char[] letrasAdivinadas) {
                    for (char letra : letrasAdivinadas) {
                              System.out.print(letra == '\0' ? '_' : letra);
                    }
                    System.out.println();
          }
}
