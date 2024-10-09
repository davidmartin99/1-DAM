package act02_ArraysObjetos;

/**
 * Actividad 2 - Arrays de objetos
 * Clase Temperatura, con los atributos min y max
 * 
 *  @version 1.0
 * @author david
 */

public class Temperatura {
          //Atributos minima y maxima temperatura
          private double min;
          private double max;
          
          /**
           * Constructor para crear un objeto de Temperatura con
           * valores de temperatura minima y maxima.
           *
           * @param min La temperatura minima.
           * @param max La temperatura maxima.
           */
          public Temperatura(double min, double max) {
                    this.min = min;
                    this.max = max;
          }//Fin Constructor
          
          
          //GET y SET
          public double getMin() {
                    return min;
          }
          public double getMax() {
                    return max;
          }

          public void setMin(double min) {
                    this.min = min;
          }
          public void setMax(double max) {
                    this.max = max;
          }
          
          //Metodo toString
          @Override
          public String toString(){
                    return "("+min+"º, "+max+"º)";
          }//Fin toString
          
         
          
}//Fin clas
