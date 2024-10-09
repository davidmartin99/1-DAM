package juegos;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class PalabraSecreta {

          /**
           * @param args the command line arguments
           */
          public static void main(String[] args) {
                    //Objeto para generar aleatorios
                    Random aleatorios = new Random();
                    // array de palabras
                    String[] animales = {"Perro", "Vaca", "Gallina", "Tigre", "Caballo", "Serpiente", "Mono"};
                    //Generamos un numero aleatorio
                    int indiceCorrecto = aleatorios.nextInt(7);
                    //Guardamos el nombre del animal correcto
                    String palabraCorrecta = animales[indiceCorrecto];
                    //Variable para la palabra elegida
                    String palabraElegida = "";
                    // System.out.println(palabraCorrecta);
                    //Pedimos la dificultad
                    String lectura = JOptionPane.showInputDialog(null, "************************\nElegir dificultad:\n1.- Facil"
                            + "\n2.- Normal \n"
                            + "\n************************", "Juego de Palabras", JOptionPane.INFORMATION_MESSAGE);
                    //Recoger una variable por consola
                    int dificultadElegida = Integer.parseInt(lectura);
                    //Seleccionamos la dificultad 
                    switch (dificultadElegida) {
                              //Si selecciona facil, le mostramos por pantalla las posibles palabras a adivinar antes de pedir la elegida
                              case 1:
                                        //Mostramos las palabras
                                        String mensaje = "Posibles palabras: \n ";
                                        for (int i = 0; i < animales.length; i++) {
                                                  mensaje += animales[i] + " \n";
                                        }
                                        JOptionPane.showMessageDialog(null, mensaje);
                                        palabraElegida = JOptionPane.showInputDialog("Adivina la palabra secreta: ");
                                        //Si la palabra elegida es igual a la que tiene la palabra correcta
                                        if (palabraElegida.equals(palabraCorrecta)) {
                                                  JOptionPane.showMessageDialog(null, "CORRECTO!!!");
                                        } else {
                                                  JOptionPane.showMessageDialog(null, "Perdiste, la palabra correcta era: " + palabraCorrecta);

                                        }
                                        break;

                              //Si se selecciona el modo normal, entonces directamente pasamos al juego
                              case 2:
                                        palabraElegida = JOptionPane.showInputDialog("Adivina la palabra secreta: ");
                                        //Si la palabra elegida es igual a la que tiene la palabra correcta
                                        if (palabraElegida.equals(palabraCorrecta)) {
                                                  JOptionPane.showMessageDialog(null, "CORRECTO!!!");
                                        } else {
                                                  JOptionPane.showMessageDialog(null, "Perdiste, la palabra correcta era: " + palabraCorrecta);

                                        }
                                        break;

                              //Si nos ingresa valores incorrectos
                              default:
                                        JOptionPane.showMessageDialog(null, "No se ha seleccionado una dificultad correcta");
                    }
          }

}
