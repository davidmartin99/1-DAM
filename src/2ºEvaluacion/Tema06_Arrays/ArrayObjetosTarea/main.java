package ArrayObjetosTarea;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class main {
          public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    Aspirante[] aspirantes = new Aspirante[0];

                    int opcion;
                    do {
                              System.out.println("Menú:");
                              System.out.println("1. Introducir un aspirante");
                              System.out.println("2. Ver los aspirantes");
                              System.out.println("3. Ver los aspirantes ordenados por número");
                              System.out.println("4. Ver los aspirantes ordenados por nombre");
                              System.out.println("5. Ver los aspirantes ordenados por nivel de estudios");
                              System.out.println("0. Salir");
                              System.out.print("Seleccione una opción: ");
                              opcion = scanner.nextInt();
                              scanner.nextLine(); // Consumir el salto de línea después de nextInt()

                              switch (opcion) {
                                        case 1:
                                                  aspirantes = insertarAspirante(scanner, aspirantes);
                                                  break;
                                        case 2:
                                                  System.out.println("Aspirantes:");
                                                  imprimirAspirantes(aspirantes);
                                                  break;
                                        case 3:
                                                  ordenarPorNumeroYMostrar(aspirantes);
                                                  break;
                                        case 4:
                                                  ordenarPorNombreYMostrar(aspirantes);
                                                  break;
                                        case 5:
                                                  ordenarPorNivelEstudiosYMostrar(aspirantes);
                                                  break;
                                        case 0:
                                                  System.out.println("Saliendo del programa...");
                                                  break;
                                        default:
                                                  System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                              }
                    } while (opcion != 0);

                    scanner.close();
          }

          public static Aspirante[] insertarAspirante(Scanner scanner, Aspirante[] aspirantes) {
                    Aspirante[] nuevoArray = Arrays.copyOf(aspirantes, aspirantes.length + 1);
                    nuevoArray[aspirantes.length] = obtenerDatosAspirante(scanner);
                    return nuevoArray;
          }

          public static Aspirante obtenerDatosAspirante(Scanner scanner) {
                    System.out.println("Ingrese los datos del aspirante:");
                    System.out.print("Número: ");
                    int number = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    System.out.print("Nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String secondName = scanner.nextLine();
                    System.out.print("Nivel de estudios (PreSchool, ElementarySchool, MiddleSchool, HighSchool, College, Graduate): ");
                    String levelStr = scanner.nextLine(); // No es necesario convertir a mayúsculas ni minúsculas
                    Aspirante.levelStudies level = null;
                    try {
                              level = Aspirante.levelStudies.valueOf(levelStr);
                    } catch (IllegalArgumentException e) {
                              System.out.println("Nivel de estudios no válido");
                              return null;
                    }
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Teléfono: ");
                    int phone = scanner.nextInt();

                    return new Aspirante(number, name, secondName, level, email, phone);
          }

          public static void imprimirAspirantes(Aspirante[] aspirantes) {
                    if (aspirantes.length == 0) {
                              System.out.println("No hay aspirantes para mostrar.");
                    } else {
                              for (Aspirante aspirante : aspirantes) {
                                        System.out.println(aspirante.toString());
                              }
                    }
          }

          public static void ordenarPorNumeroYMostrar(Aspirante[] aspirantes) {
                    Aspirante.ordenarPorNumero(aspirantes);
                    System.out.println("Aspirantes ordenados por número:");
                    imprimirAspirantes(aspirantes);
          }

          public static void ordenarPorNombreYMostrar(Aspirante[] aspirantes) {
                    Aspirante.ordenarPorNombre(aspirantes);
                    System.out.println("Aspirantes ordenados por nombre:");
                    imprimirAspirantes(aspirantes);
          }

          public static void ordenarPorNivelEstudiosYMostrar(Aspirante[] aspirantes) {
                    Aspirante.ordenarPorNivelEstudios(aspirantes);
                    System.out.println("Aspirantes ordenados por nivel de estudios:");
                    imprimirAspirantes(aspirantes);
          }
                    
                  
}//Fin class
