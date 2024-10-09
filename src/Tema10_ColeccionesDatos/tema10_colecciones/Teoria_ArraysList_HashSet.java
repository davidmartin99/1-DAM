 package tema10_colecciones;

import java.util.ArrayList;
import java.util.Collection;  
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author david
 */
public class Teoria_ArraysList_HashSet {
         
         //Colecciones 
         static Collection rellenar (Collection c){
                  //Para añadir en Collection con .add
                  c.add("perro");
                  c.add("gato");
                  c.add("perro");
                  c.add("canario");
                  
                  //Imprimir el tamaño de Collection
                  System.out.println(c.size());
                  return c;
         }//Fin Collection
         
         //Mapas
         static Map rellenar (Map m){
                  //Para añadir en Map con .put
                  m.put("perro", "San bernardo");
                  m.put("gato", "montes");
                  m.put("perro","presa canario");
                  
                  //imprimir el tamaño de Map
                  System.out.println(m.size());
                  return m;
         }//Fin Map

         
         //Main Creamos ArrayList
         public static void main(String[] args) {
                  //Collection imprime en [ ]
                  System.out.println("----- Collection -----");
                  //ArrayList devuelve valores en orden inserccion
                  System.out.println("ArrayList:"+rellenar(new ArrayList()));
                  //HashSet no duplica valores
                  System.out.println("HashSet:"+rellenar(new HashSet()));
                  
                  //Map  imprime { =, }
                  System.out.println("\n----- Map -----");
                  //HashMap no duplica valores
                  //Pila con elementos no repetidos 
                  System.out.println("HashMap:"+rellenar(new HashMap()));
         }//Fin main
         
         /* CONCLUSIONES
         * HashSet. contiene un conjunto de objetos que permite determinar más fácil y rápidamente
         *                 si un objeto está en el conjunto o no.
         * HashMap. se imprime entre llaves con el signo igual {clave=valor}
         * ArrayList. se pueden crear elementos duplicados.
         */
         
}//Fin class
