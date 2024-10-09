package CopiarCadenaTarea;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Cadena {

          private int tamaño;
          private String cadena;

          // Constructor que pide al teclado introducir una cadena de caracteres
          public Cadena() {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Introduzca una cadena de caracteres: ");
                    this.cadena = scanner.nextLine();
                    this.tamaño = this.cadena.length();
          }

          // Método para escribir la cadena en el monitor
          public void escribirCadena() {
                    System.out.println("Contenido de la cadena: " + this.cadena);
          }

          // Método para obtener la longitud de la cadena
          public int longitud() {
                    return this.tamaño;
          }

          // Método para copiar la cadena en otra cadena
          public String copiar() {
                    return new String(this.cadena);
          }

          // Método para contar el número de vocales en la cadena
          public int numeroVocales() {
                    int contador = 0;
                    for (int i = 0; i < this.tamaño; i++) {
                              char c = Character.toLowerCase(this.cadena.charAt(i));
                              if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                                        contador++;
                              }
                    }
                    return contador;
          }

          // Método para verificar si la cadena contiene una vocal específica
          public boolean contieneVocal(char vocal) {
                    vocal = Character.toLowerCase(vocal);
                    for (int i = 0; i < this.tamaño; i++) {
                              char c = Character.toLowerCase(this.cadena.charAt(i));
                              if (c == vocal) {
                                        return true;
                              }
                    }
                    return false;
          }

          // Método para verificar si la cadena contiene una subcadena específica
          public boolean contieneCadena(String subcadena) {
                    return this.cadena.contains(subcadena);
          }

          // Método para convertir la cadena a mayúsculas
          public void convertirMayusculas() {
                    this.cadena = this.cadena.toUpperCase();
          }

          // Método para eliminar las vocales de la cadena
          public void eliminarVocales() {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < this.tamaño; i++) {
                              char c = Character.toLowerCase(this.cadena.charAt(i));
                              if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                                        sb.append(this.cadena.charAt(i));
                              }
                    }
                    this.cadena = sb.toString();
                    this.tamaño = this.cadena.length();
          }

          // Método para verificar si la cadena es un palíndromo
          public boolean esPalindromo() {
                    String cadenaSinEspacios = this.cadena.replaceAll("\\s+", "").toLowerCase();
                    int longitud = cadenaSinEspacios.length();
                    for (int i = 0; i < longitud / 2; i++) {
                              if (cadenaSinEspacios.charAt(i) != cadenaSinEspacios.charAt(longitud - 1 - i)) {
                                        return false;
                              }
                    }
                    return true;
          }
}
