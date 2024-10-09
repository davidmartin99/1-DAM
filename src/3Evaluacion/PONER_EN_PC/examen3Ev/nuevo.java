package examen3Ev;

import static java.lang.Math.round;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class nuevo {
          public static void main(String[] args) {
                    // Pasamos a int el numeror porque random da un double
                    int num = (int) (Math.random() * 500) + 1;
                    Scanner scanner = new Scanner(System.in);

                    int intentos = 0;
                    double puntuacion = 0;

                    System.out.println("Intenta adivinar un número entre 1 y 500:");

                    while (true) {
                              intentos++;
                              int numUsuario;
                              try {
                                        numUsuario = Integer.parseInt(scanner.nextLine());
                              } catch (NumberFormatException e) {
                                        System.out.println("Por favor, ingresa un número válido.");
                                        continue;
                              }

                              if (numUsuario < 1 || numUsuario > 500) {
                                        System.out.println("Por favor, ingresa un número entre 1 y 500.");
                                        continue;
                              }

                              if (numUsuario == num) {
                                        System.out.println("Enhorabuena, has adivinado en " + intentos + " intentos.");
                                        
                                        break;
                              } else if (numUsuario < num) {
                                        System.out.println("El número es mayor.");
                              } else {
                                        System.out.println("El número es menor.");
                              }
                    }//Fin while
                    
                    if(intentos >5){
                              puntuacion= 2 - (intentos*0.02);
                    }else{
                              puntuacion = 10 *( (intentos*2) -2);
                    }
                    System.out.println("Puntuacion: "+puntuacion);
                    scanner.close();
          }
          
}
