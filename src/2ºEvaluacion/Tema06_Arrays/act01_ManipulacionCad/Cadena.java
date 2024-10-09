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

public class Cadena {
          //Atributos
         private String cadena;
         private int tamaño;

          /**
           * Constructor de la clase Cadena. 
           * Muestra una pantalla donde el usuario introduce la cadena,
           * la cual tiene que ser de 100 caracteres minimo
           */
         public Cadena() {
                  Component frame= null;
                  this.cadena = "";
                  //bucle while para que cuando la cadena tenga mas de 100 caracteres, el bucle se detenga
                    while (cadena.length() < 100) {
                              cadena = JOptionPane.showInputDialog(frame, "Introduce la cadena (minimo 100 caracteres):", "Manipulacion de Cadenas", 1);
                              //Si tiene menos de 100 caracteres mostrara un aviso
                              if (cadena.length() < 100) {
                                        JOptionPane.showMessageDialog(frame, "Aviso: la cadena tiene que tener 100 caracteres. Introduce la cadena:", "Warning!", 2);
                              }//Fin if
                    }//Fin while
                    this.cadena = cadena;
          
                    this.tamaño = cadena.length(); 
         }//Fin Constructor
         
         
          /**
           * Obtiene la cadena almacenada en el objeto.
           *
           * @return cadena
           */
         public String escribirCadena() {
                  return cadena;
         }//Fin getCadena
         
          /**
           * Retorna el numero de caracteres que contiene la cadena.
           *
           * @return tamaño
           */
          public int longitud() {
                  return tamaño;
         }//Fin getTamaño
         
          /**
           * Copia la cadena en otra cadena.
           *
           * @return copia de la cadena original.
           */
          public String copiar(){
                    //Copia el valor de la cadena desde el primer caracter con SUBSTRING
                    return this.cadena.substring(0);
          }//Fin copiar
        
          /**
           * Indica el numero de vocales que contiene,
           * independientemente si son mayusculas, minusculas o acentuadas.
           *
           * @return contador, que es el numero de vocales de la cadena
           */
         //Indica el numero de vocales que contiene, independiente si son mayusculas, minusculas o acentuadas.
         public int numeroVocales(){
                   int contador = 0;
                   String vocales = "aáeéiíoóuú";
                   
                   //Convertimos a mayusculas o minusculas para compararlo 
                   String cadenaMinus = this.cadena.toLowerCase();
                   
                   //Vamos recorriendo la cadena
                   for(int i =0; i<cadenaMinus.length(); i++){
                             char letra  = cadenaMinus.charAt(i);
                             //indexOf devuelve el indice donde se encuentra un caracter
                             //Si devuelve -1 es que no lo ha encontrado.
                             if(vocales.indexOf(letra) !=-1){
                                       contador++;
                             }//Fin if
                   }//Fin for
                   return contador;
         }//Fin numeroVocales
          
         
          /**
           * Verifica si la cadena contiene alguna vocal.
           *
           * @return true si la cadena contiene al menos una vocal,
           *                 en caso contrario false.
           */
         public boolean contieneVocal(){
                   String vocales = "aáeéiíoóuú";
                   
                   //Convertimos a mayusculas o minusculas para compararlo 
                   String cadenaMinus = this.cadena.toLowerCase();
                   
                   //Si da diferente a -1 significa que ha encontrado una vocal
                   if(vocales.indexOf(cadenaMinus) != -1){
                             return true;
                   } else {
                             return false;
                   }//Fin if-else
         }//Fin contieneVocal
         
         
          /**
           * Verifica si la cadena contiene otra cadena dada.
           *
           * @param cadenaContenida la subcadena que queremos comprobar 
           * si esta incluida en la cadena 
           * 
           * @return true si la subcadena contiene la cadena dada, false
           *                             en caso contrario.
           */
         public boolean contieneCadena(String cadenaContenida){
                   //retorna true o false
                   return this.cadena.contains(cadenaContenida);
         }//Fin contieneCadena
         
         
          /**
           * Convierte la cadena a mayusculas.
           *
           * @return cadena en mayusculas
           */
         //Convierte a mayusculas la cadena.
         public String convertirMayusculas(){
                   return this.cadena.toUpperCase();
         }//Fin convertirMayusculas
         
         
         //Elimina las vocales de la cadena, moviendo los caracteres siguientes una posicion por atras
         public void eliminarVocales(){
                   //Creamos un StringBuilder para que al borrar las vocales queden espacios en blanco
                   StringBuilder sinVocales = new StringBuilder();
                   for( int i = 0; i<this.cadena.length(); i++){
                             //Comparamos el caracter de la posicion i de la cadena, uno a uno
                             char letra = this.cadena.charAt(i);
                             //Si no es vocal, la letra se va añadiendo
                             if(!esVocal(letra)){
                                       sinVocales.append(letra);
                             }//Fin if
                   }//Fin 
                   //Imprimimos la cadena sin vocales
                   this.cadena = sinVocales.toString();
         }//Fin eliminarVocales
         
          //Metodo auxiliar para eliminarVocales
         private boolean esVocal(char letra){
                   String vocales="AaÁáEeÉéIiÍíOoÓóUuÚú";
                   //Devuelve true si es vocal.
                   return vocales.indexOf(letra) !=-1;
         }//Fin esVocal
       
}//Fin class


