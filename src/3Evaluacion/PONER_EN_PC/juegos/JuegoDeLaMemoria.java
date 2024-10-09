package juegos;

/**
 *
 * @author david
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JuegoDeLaMemoria {

          public static void main(String[] args) {
                    ArrayList<String> colores = new ArrayList<>();
                    colores.add("Rojo");
                    colores.add("Azul");
                    colores.add("Verde");
                    colores.add("Amarillo");
                    colores.add("Naranja");
                    colores.add("Morado");

                    Collections.shuffle(colores);
                    ArrayList<String> secuencia = new ArrayList<>(colores.subList(0, 4));

                    System.out.println("Memoriza esta secuencia de colores:");
                    for (String color : secuencia) {
                              System.out.print(color + " ");
                    }
                    System.out.println("\nTienes 5 segundos para memorizar la secuencia...");

                    try {
                              Thread.sleep(5000);
                    } catch (InterruptedException e) {
                              e.printStackTrace();
                    }

                    for (int i = 0; i < 50; i++) {
                              System.out.println();
                    }

                    Scanner scanner = new Scanner(System.in);
                    ArrayList<String> secuenciaUsuario = new ArrayList<>();

                    System.out.println("Introduce la secuencia de colores:");
                    for (int i = 0; i < 4; i++) {
                              secuenciaUsuario.add(scanner.nextLine());
                    }

                    if (secuencia.equals(secuenciaUsuario)) {
                              System.out.println("¡Correcto! Has memorizado la secuencia.");
                    } else {
                              System.out.println("Incorrecto. La secuencia correcta era:");
                              for (String color : secuencia) {
                                        System.out.print(color + " ");
                              }
                    }

                    scanner.close();
          }
}
