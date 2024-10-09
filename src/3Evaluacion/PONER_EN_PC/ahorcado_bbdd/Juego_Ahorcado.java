package ahorcado_bbdd;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Juego_Ahorcado {
          
          public static Resultado jugarAhorcado() {
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
                                        // Tiene 7 intentos - los que haya gastado, ej: gasta 2, pues 7-5 que son los que le quedan = 2
                                        int intentosGastados= 7-intentos;
                                        boolean juegoGanado = !hayGuiones(palabraGuiones);
                                        if (juegoGanado) {
                                                  System.out.println("Enhorabuena!! Has ganado el juego");
                                                  System.out.println("La frase era: " + palabra);
                                                  System.out.println("Has necesitado " + intentosGastados + " intentos para adivinar la frase.");
                                                  juegoTerminado = true;
                                        }
                              }
                    } while (!juegoTerminado);
                    // Devolver resultados del juego
                    return new Resultado (intentosRealizados, intentos, palabra);
          }//Fin main

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
          }//Fin guionesFromPalabra

          static boolean hayGuiones(char[] array) {
                    for (char l : array) {
                              if (l == '_') {
                                        return true;
                              }
                    }
                    return false;
          }//Fin hayGuiones

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
          }//Fin impresion

          public static String frase() {
                    String[] frasesMotivacionales = {
                              "Hola que tal",
                              "Estoy bien y tu",
                              "Muy bien tambien"
                    };

                    int indiceAleatorio = (int) (Math.random() * frasesMotivacionales.length);

                    System.out.println("Se ha elegido una frase aleatoria");
                    return frasesMotivacionales[indiceAleatorio];
          }//Fin frase

          static class Resultado {

                    int intentosRealizados;
                    int intentosRestantes;
                    String palabra;

                    Resultado(int intentosRealizados, int intentosRestantes, String palabra) {
                              this.intentosRealizados = intentosRealizados;
                              this.intentosRestantes = intentosRestantes;
                              this.palabra = palabra;
                    }
          }

          
}//Fin class
