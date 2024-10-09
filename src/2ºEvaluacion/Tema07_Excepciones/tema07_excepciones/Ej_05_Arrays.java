package tema07_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Ej_05_Arrays {
         public static void main(String[] args) {
                  double n;
                  int posicion;
                  String cadena;
                  boolean repetir;
                  double[] valores = {9.83, 4.5, -3.06, 0.06, 2.52, -11.3, 7.60, 3.00, -30.4, -10.6};
                  Scanner sc = new Scanner(System.in);

                  System.out.println("Contenido del array antes de modicar: ");
                  for (double d : valores) {
                           System.out.printf("%.2f ", d);
                  }

                  //parte 2
                  do {
                           repetir = false;
                           try {
                                    System.out.print("\nIntroduce la posicion del array modificar: ");
                                    cadena = sc.nextLine();
                                    posicion = Integer.parseInt(cadena);
                                    System.out.print("Introduce el nuevo valor de la posicion " + posicion + ": ");
                                    n = sc.nextDouble();
                                    valores[posicion] = n;
                           } catch (InputMismatchException e) {
                                    System.err.println("Valor no valido. ERROR: formato no valido");
                                    repetir = true;
                                    sc.nextLine();
                           } catch (NumberFormatException e) {
                                    System.err.println("Valor no valido. ERROR: No se puede poner punto");
                                    repetir = true;
                           } catch (ArrayIndexOutOfBoundsException e) {
                                    System.err.println("ERROR: posicion no existe en el array");
                                    repetir = true;
                                    sc.nextLine();
                           } catch (Exception e) {
                                    System.err.println(e.toString());
                           }
                  } while (repetir);
                  sc.close();

                  //parte 3 imprimir array modificado
                  for (double d : valores) {
                           System.out.print(d + " ");
                  }

         }
}
