package tema06_arrays;

/**
 * Ejemplo en el que se muestra la conversión de varias cadenas de
 * texto, que contienen números, a números.
 *
 * @author david
 */
import javax.swing.JOptionPane;

public class EjemplosConversionStringANumero {

          private boolean operacionCancelada;

          public EjemplosConversionStringANumero() {
                    setOperacionCancelada(false);
          }

          public boolean isOperacionCancelada() {
                    return operacionCancelada;
          }

          private void setOperacionCancelada(boolean operacionCancelada) {
                    this.operacionCancelada = operacionCancelada;
          }

          public double pedirNumeroDouble(String titulo, String mensaje) {
                    double d = 0;
                    setOperacionCancelada(false);
                    boolean numeroValido = false;
                    do {
                              String s = (String) JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
                              if (s != null) {
                                        try {
                                                  d = Double.parseDouble(s);
                                                  numeroValido = true;
                                        } catch (NumberFormatException e) {
                                                  JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                                        }
                              } else {
                                        numeroValido = true; // Cancelado
                                        setOperacionCancelada(true);
                              }
                    } while (!numeroValido);
                    return d;
          }

          public float pedirNumeroFloat(String titulo, String mensaje) {
                    float d = 0;
                    setOperacionCancelada(false);
                    boolean numeroValido = false;
                    do {
                              String s = (String) JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
                              if (s != null) {
                                        try {
                                                  d = Float.parseFloat(s);
                                                  numeroValido = true;
                                        } catch (NumberFormatException e) {
                                                  JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                                        }
                              } else {
                                        numeroValido = true; // Cancelado
                                        setOperacionCancelada(true);
                              }
                    } while (!numeroValido);
                    return d;
          }

          public int pedirNumeroInteger(String titulo, String mensaje) {
                    int d = 0;
                    setOperacionCancelada(false);
                    boolean numeroValido = false;
                    boolean NumeroValido = false;
                    do {
                              String s = (String) JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, null, "");
                              if (s != null) {
                                        try {
                                                  d = Integer.parseInt(s);
                                                  numeroValido = true;
                                        } catch (NumberFormatException e) {
                                                  JOptionPane.showMessageDialog(null, "El número introducido no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
                                        }
                              } else {
                                        NumeroValido = true; // Cancelado
                                        setOperacionCancelada(true);
                              }
                    } while (!NumeroValido);
                    return d;
          }
}
