package punto;

/**
 *
 * @author david
 */

public class Punto {
         int x = 0, y = 0;

         //Constructor
         public Punto(int x, int y) {
                  this.x = x;
                  this.y = y;
         }

         
         @Override
       public String toString(){
                return"["+x+", "+y+"]";
       }
         
       
}//Fin class
