package CopiarCadenaTarea;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class main {

          public static void main(String[] args) {
                    Scanner scanner = new Scanner(System.in);
                    Cadena cadena = new Cadena();
                    int opcion;

                    do {
                              System.out.println("\nMenú:");
                              System.out.println("1. Escribir cadena");
                              System.out.println("2. Longitud de la cadena");
                              System.out.println("3. Copiar la cadena");
                              System.out.println("4. Número de vocales");
                              System.out.println("5. Verificar si contiene una vocal específica");
                              System.out.println("6. Verificar si contiene una subcadena específica");
                              System.out.println("7. Convertir a mayúsculas");
                              System.out.println("8. Eliminar vocales");
                              System.out.println("9. Verificar si es un palíndromo");
                              System.out.println("0. Salir");
                              System.out.print("Seleccione una opción: ");
                              opcion = scanner.nextInt();
                              scanner.nextLine(); // Consumir el salto de línea

                              switch (opcion) {
                                        case 1:
                                                  cadena.escribirCadena();
                                                  break;
                                        case 2:
                                                  System.out.println("Longitud de la cadena: " + cadena.longitud());
                                                  break;
                                        case 3:
                                                  String copia = cadena.copiar();
                                                  System.out.println("Copia de la cadena: " + copia);
                                                  break;
                                        case 4:
                                                  System.out.println("Número de vocales: " + cadena.numeroVocales());
                                                  break;
                                        case 5:
                                                  System.out.print("Introduzca una vocal para buscar: ");
                                                  char vocal = scanner.next().charAt(0);
                                                  if (cadena.contieneVocal(vocal)) {
                                                            System.out.println("La cadena contiene la vocal " + vocal);
                                                  } else {
                                                            System.out.println("La cadena no contiene la vocal " + vocal);
                                                  }
                                                  break;
                                        case 6:
                                                  System.out.print("Introduzca una subcadena para buscar: ");
                                                  String subcadena = scanner.nextLine();
                                                  if (cadena.contieneCadena(subcadena)) {
                                                            System.out.println("La cadena contiene la subcadena " + subcadena);
                                                  } else {
                                                            System.out.println("La cadena no contiene la subcadena " + subcadena);
                                                  }
                                                  break;
                                        case 7:
                                                  cadena.convertirMayusculas();
                                                  System.out.println("Cadena convertida a mayúsculas: " + cadena);
                                                  break;
                                        case 8:
                                                  cadena.eliminarVocales();
                                                  System.out.println("Cadena sin vocales: " + cadena);
                                                  break;
                                        case 9:
                                                  if (cadena.esPalindromo()) {
                                                            System.out.println("La cadena es un palíndromo");
                                                  } else {
                                                            System.out.println("La cadena no es un palíndromo");
                                                  }
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
}
