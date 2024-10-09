package loteria_bbdd;

import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class MenuLoteria {
          public static void inicializarMenu() {
                    // Formateo la fecha para que el patron sea día-mes-año.
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                    // Menú
                    boolean salir = false;
                    Scanner scanner = new Scanner(System.in);

                    do {
                              System.out.println();
                              System.out.println("---------------------- Menú ----------------------");
                              System.out.println("--- 1. Realizar Apuesta");
                              System.out.println("--- 2. Mostrar Ganadores");
                              System.out.println("--- 3. Mostrar Historial");
                              System.out.println("--- 4. Salir");
                              System.out.println("--------------------------------------------------");
                              System.out.print("Ingrese su opción: ");

                              try {
                                        int opcion = scanner.nextInt();
                                        System.out.println();

                                        switch (opcion) {
                                                  case 1:
                                                            FuncionesLoteria.realizarApuesta();
                                                            break;
                                                  case 2:
                                                            FuncionesLoteria.MostrarGanadores();
                                                            break;
                                                  case 3:
                                                            FuncionesLoteria.MostrarHistorial();
                                                            break;
                                                  case 4:
                                                            System.out.println("Exit ...");
                                                            salir = true;
                                                            break;
                                                  default:
                                                            throw new IllegalArgumentException("Opción no válida. Debe ser una opción disponible (1 - 4).");
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
