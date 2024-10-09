package loteria_bbdd;

import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * el Complementario fuera del ArrayyList, como una variable 
 * @author david
 */
public class juegoLoteria2 {
         public static void main(String[] args) {
                  ArrayList<Integer> numerosLoteria = new ArrayList<>();
                  int numeroComplementario = 0;

                  // Hacer numeros de la Loteria
                  do {
                           int num = (int) (random() * 49) + 1;
                           // Si contiene ya el numero, lo borra, si no lo guarda. Para que no haya numeros repetidos
                           if (!numerosLoteria.contains(num)) {
                                    numerosLoteria.add(num);
                           }//Fin if
                  } while (numerosLoteria.size() < 6);
                  
                  // Hacer el complementario
                  do{
                           numeroComplementario= (int) (random() * 49) + 1;
                  } while (numerosLoteria.contains(numeroComplementario));
        
                  // Hacer el reintegro
                  int numeroReintegro = (int) (random() * 10);

                   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
                   
                    // El usuario introduce su apuesta
                   Scanner scanner = new Scanner(System.in);
                   ArrayList<Integer> apuestaUsuario = new ArrayList<>();
                   int reintegroUsuario = -1;

                   // Introducir la Apuesta
                   System.out.println("Introduce tus 6 numeros de la lotería (del 1 al 49): ");
                   while (apuestaUsuario.size() < 6) {
                             try {
                                       int numero = Integer.parseInt(scanner.nextLine());
                                       if (numero < 1 || numero > 49) {
                                                 throw new IllegalArgumentException("Número fuera de rango. Inténtalo de nuevo.");
                                       }
                                       if (apuestaUsuario.contains(numero)) {
                                                 throw new IllegalArgumentException("Número repetido. Inténtalo de nuevo.");
                                       }
                                       apuestaUsuario.add(numero);
                             } catch (NumberFormatException e) {
                                       System.err.println("Entrada inválida. Introduce un número válido.");
                             } catch (IllegalArgumentException e) {
                                       System.err.println(e.getMessage());
                             }
                   }

                   // Introducir el Reintegro
                   System.out.println("Introduce tu numero de reintegro (del 0 al 9):");
                   while (reintegroUsuario < 0 || reintegroUsuario > 9) {
                             try {
                                       reintegroUsuario = Integer.parseInt(scanner.nextLine());
                                       if (reintegroUsuario < 0 || reintegroUsuario > 9) {
                                                 throw new IllegalArgumentException("Número de reintegro fuera de rango. Inténtalo de nuevo.");
                                       }
                             } catch (NumberFormatException e) {
                                       System.out.println("Entrada inválida. Introduce un número válido.");
                             } catch (IllegalArgumentException e) {
                                       System.out.println(e.getMessage());
                             }
                   }

                   // Imprimir apuesta del usuario
                   System.out.print("Tu apuesta: ");
                   Collections.sort(apuestaUsuario);
                   for (int i = 0; i < apuestaUsuario.size(); i++) {
                             System.out.print(apuestaUsuario.get(i));
                             if (i < apuestaUsuario.size() - 1) {
                                       System.out.print(", ");
                             }
                   }
                   System.out.println("\nTu reintegro: " + reintegroUsuario);
                   
                   ///////////////////////////////////////////////////////////////////////////////////////////////////////////
                   // MOSTRAR NUMEROS GANADORES
                   // Los ordenamos
                   Collections.sort(numerosLoteria);

                   System.out.print("Numeros Ganadores: ");
                   for (int i = 0; i < numerosLoteria.size(); i++) {
                             System.out.print(numerosLoteria.get(i));
                             // Que impra ", " en todos menos en el último
                             if (i < numerosLoteria.size() - 1) {
                                       System.out.print(", ");
                             }//Fin if
                   }//Fin for

                   // IMPRIMIR COMPLEMENTARIO
                   System.out.println("\nComplementario: " + numeroComplementario);

                   // IMPRIMIR EL REINTEGRO
                   System.out.println("Reintegro: " + numeroReintegro);
                   
                   ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                   // COMPROBAR EL PREMIO
                   // Comparar los números ganadores con los introducidos
                   int aciertos = 0;
                   for (int num : apuestaUsuario) {
                             if (numerosLoteria.contains(num)) {
                                       aciertos++;
                             }
                   }//Fin for

                   // Determinar el premio
                   int premio = 0;
                   if (aciertos == 6 && reintegroUsuario == numeroReintegro) {
                             premio = 10000; // Acierta los 6 números y el reintegro
                   } else if (aciertos == 6) {
                             premio = 5000; // Acierta los 6 números
                   } else if (aciertos == 5 && apuestaUsuario.contains(numeroComplementario)) {
                             premio = 2000; // Acierta 5 números y el complementario
                   } else if (aciertos == 5) {
                             premio = 1000; // Acierta 5 números
                   } else if (aciertos == 4) {
                             premio = 500; // Acierta 4 números
                   } else if (aciertos == 3) {
                             premio = 200; // Acierta 3 números
                   } else if (reintegroUsuario == numeroReintegro) {
                             premio = 10; // Acierta solo el reintegro
                   }

                   // Imprimir el premio
                   if (premio > 0) {
                             System.out.println("¡Felicidades! Has ganado " + premio + "€.");
                   } else {
                             System.out.println("No has ganado ningún premio.");
                   }//Fin if-else
                            
                   
         }//Fin main
         
}//Fin class
