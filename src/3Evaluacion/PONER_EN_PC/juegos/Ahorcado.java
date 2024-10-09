package juegos;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ahorcado {

          public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);

                    String palabra = frase(); // Use the random phrase method to get the phrase
                    char[] palabraGuiones = guionesFromPalabra(palabra);
                    boolean juegoTerminado = false;
                    int intentos = 7;
                    int intentosRealizados = 0; // Contador de intentos realizados


                    // Convertir palabra a minúsculas para comparación
                    String palabraMinusculas = palabra.toLowerCase();

                    do {
                              impresion(intentos);
                              System.out.println("\nTe quedan " + intentos + " intentos");
                              System.out.println(String.valueOf(palabraGuiones));
                              System.out.println("\nIntroduce una letra: ");

                              char letra = ' ';
                              boolean entradaValida = false;

                              while (!entradaValida) {
                                        try {
                                                  String entrada = sc.next().toLowerCase();
                                                  if (entrada.length() != 1 || !Character.isLetter(entrada.charAt(0))) {
                                                            throw new IllegalArgumentException("Por favor, introduce una sola letra.");
                                                  }
                                                  letra = entrada.charAt(0);
                                                  entradaValida = true;
                                        } catch (IllegalArgumentException e) {
                                                  System.err.println("Entrada inválida. " + e.getMessage());
                                                  System.err.println("Introduce una letra: ");
                                        }
                              }

                              boolean letraAcertada = false;
                              for (int i = 0; i < palabra.length(); i++) {
                                        if (palabraMinusculas.charAt(i) == letra) {
                                                  palabraGuiones[i] = palabra.charAt(i); // Mantener la letra en su caso original
                                                  letraAcertada = true;
                                        }
                              }

                              if (!letraAcertada) {
                                        System.out.println("No has acertado ninguna letra");
                                        --intentos;
                                        if (intentos <= 0) {
                                                  System.out.println("\nGAME OVER has perdido, ya no tienes más intentos");
                                                  System.out.println("    -----   ");
                                                  System.out.println("    |   |   ");
                                                  System.out.println("    |   |   ");
                                                  System.out.println("    |   0   ");
                                                  System.out.println("    |  /|\\ ");
                                                  System.out.println("    |   |   ");
                                                  System.out.println("    |  / \\ ");
                                                  System.out.println("    |       ");
                                                  System.out.println("    |       ");
                                                  System.out.println("    |       ");
                                                  System.out.println("    |       ");
                                                  System.out.println("------------");
                                                  juegoTerminado = true;
                                        }
                              } else {
                                        intentosRealizados++; // Incrementar el contador de intentos realizados
                                        boolean juegoGanado = !hayGuiones(palabraGuiones);
                                        if (juegoGanado) {
                                                  System.out.println("Enhorabuena!! Has ganado el juego");
                                                  System.out.println("La frase era: " + palabra);
                                                  System.out.println("Has necesitado " + intentosRealizados + " intentos para adivinar la frase.");
                                                  juegoTerminado = true;
                                        }
                              }
                    } while (!juegoTerminado);
          }

          static char[] guionesFromPalabra(String palabra) {
                    int letrasPalabra = palabra.length();
                    char[] palabraGuiones = new char[letrasPalabra];

                    for (int i = 0; i < palabraGuiones.length; i++) {
                              if (palabra.charAt(i) == ' ') {
                                        palabraGuiones[i] = ' ';
                              } else {
                                        palabraGuiones[i] = '_';
                              }
                    }
                    return palabraGuiones;
          }

          static boolean hayGuiones(char[] array) {
                    for (char l : array) {
                              if (l == '_') {
                                        return true;
                              }
                    }
                    return false;
          }

          static void impresion(int intentos) {
                    switch (intentos) {
                              case 7:
                                        System.out.println("");
                                        System.out.println("    -----   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("------------");
                                        break;
                              case 6:
                                        System.out.println("    -----   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   0   ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("------------");
                                        break;
                              case 5:
                                        System.out.println("    -----   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   0   ");
                                        System.out.println("    |  /    ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("------------");
                                        break;
                              case 4:
                                        System.out.println("    -----   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   0   ");
                                        System.out.println("    |  /|   ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("------------");
                                        break;
                              case 3:
                                        System.out.println("    -----   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   0   ");
                                        System.out.println("    |  /|\\ ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("------------");
                                        break;
                              case 2:
                                        System.out.println("    -----   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   0   ");
                                        System.out.println("    |  /|\\ ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("------------");
                                        break;
                              case 1:
                                        System.out.println("    -----   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   0   ");
                                        System.out.println("    |  /|\\ ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |  /    ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("------------");
                                        break;
                              case 0:
                                        System.out.println("    -----   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |   0   ");
                                        System.out.println("    |  /|\\ ");
                                        System.out.println("    |   |   ");
                                        System.out.println("    |  / \\ ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("    |       ");
                                        System.out.println("------------");
                                        break;
                    }
          }
          
          
          public static String frase() {
        String[] frasesMotivacionales = {
                  "Hola que tal",
                  "Estoy bien y tu",
                  "Muy bien tambien"
        };

        int indiceAleatorio = (int) (Math.random() * frasesMotivacionales.length);

        System.out.println("Se ha elegido una frase aleatoria");
        return frasesMotivacionales[indiceAleatorio];
    }
          
          
          
}



/*
             "El único modo de hacer un gran trabajo es amar lo que haces. - Steve Jobs",
            "La oportunidad no llega, se crea. - Chris Grosser",
            "No esperes. El tiempo nunca será justo. - Napoleon Hill",
            "Siempre parece imposible hasta que se hace. - Nelson Mandela",
            "No hay sustituto para el trabajo duro. - Thomas Edison",
            "La vida es lo que pasa mientras estás ocupado haciendo otros planes. - John Lennon",
            "No importa qué tan lento vayas mientras no te detengas. - Confucio",
            "La persistencia puede cambiar el fracaso en un extraordinario logro. - Matt Biondi",
            "La mejor forma de predecir el futuro es crearlo. - Peter Drucker",
            "La vida es un 10% lo que me ocurre y 90% cómo reacciono a ello. - Charles R. Swindoll"
*/