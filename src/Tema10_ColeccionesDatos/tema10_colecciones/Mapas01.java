package tema10_colecciones;

import java.util.Map;

/**
 *
 * @author david
 */

public class Mapas01 {
         
         public static void main(String[] args) {
                  // Creamos un MAPA con el tipo de dato clave= Integer y valor= String
                  Map<Integer, String> mapaDAM1 = Map.of(1,"Teclado", 2, "Monitor", 3, "CPU");
                  // Imprimirlo con .forEach  (lo imprime desordenado)
                  mapaDAM1.forEach((clave,valor) ->System.out.println((clave+":"+valor)));
                  
                  
         }//Fin main
         
}//Fin class
