package act01_ManipulacionCad;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
* Actividad 1 - Manipulacion de Cadena de Caracteres
* Clase main
* 
* @version 1.0
 * @author david
 */
public class test {
          
          public static void main(String[] args) {
                    //Entrada de datos por ventana
                    Component frame= null;
                    
                    Cadena cadena = new Cadena();
                    
                   
                    //El numero de vocales
                    int vocales = cadena.numeroVocales();
                    
                    //El numero de consonantes
                    //Restamos a la longitud las vocales.
                    int consonantes = cadena.longitud() - vocales;
                   
                    
                    //Si contiene una palabra introducida por el usuario
                    String palabra = JOptionPane.showInputDialog(frame, "Palabra a buscar: ", "Manipulacion de Cadenas", 3);
                    boolean contienePalabra = cadena.contieneCadena(palabra);

                 
                    //La cadena en mayusculas sin las vocales.
                    cadena.eliminarVocales();
                    cadena.convertirMayusculas();
                    
                    //Mostrarmos por ventana
                    frame =  null;
                    JOptionPane.showMessageDialog(frame,
                                    "Cantidad de vocales: " + vocales +
                                    "\nCantidad de consonantes: " + consonantes + 
                                    "\nLa cadena contiene:  " + palabra + "?: " + contienePalabra + 
                                    "\nCadena en mayúsculas sin vocales:\n" + cadena.escribirCadena());
                    
          }//Fin main
          
}//Fin class
