package ahorcado_bbdd;


import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class MenuAhorcado {
          public static void inicializarMenu() {
                    // Formateo la fecha para que el patron sea día-mes-año.
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                    // Menú
                    boolean salir = false;
                    Scanner scanner = new Scanner(System.in);

                    do {
                              System.out.println();
                              System.out.println("---------------------- Menú ----------------------");
                              System.out.println("--- 1. Empezar Partida");
                              System.out.println("--- 2. Mostrar Records");
                              System.out.println("--- 3. Salir");
                              System.out.println("--------------------------------------------------");
                              System.out.print("Ingrese su opción: ");

                              try {
                                        int opcion = scanner.nextInt();
                                        System.out.println();

                                        switch (opcion) {
                                                  case 1:
                                                            FuncionesAhorcado.empezarPartida();
                                                            break;
                                                  case 2:
                                                            FuncionesAhorcado.mostrarRecords();
                                                            break;
                                                  case 3:
                                                            System.out.println("Exit ...");
                                                            salir = true;
                                                            break;
                                                  default:
                                                            throw new IllegalArgumentException("Opción no válida. Debe ser una opción disponible (1 - 3).");
                                        }//Fin switch

                              } catch (InputMismatchException e1) {
                                        System.err.println("Debe introducir un número válido.");
                                        scanner.nextLine(); // Limpiar el buffer del scanner
                              } catch (IllegalArgumentException e2) {  //Excepcion del default
                                        System.err.println(e2.getMessage());
                              } catch (Exception e3) {
                                        System.err.println("Error: " + e3.toString());
                              }//Fin try-catch

                    } while (!salir);

                    System.out.println();
                    scanner.close(); // Cerramos el scanner

          }//Fin inicializarMenu
          
}//Fin class
