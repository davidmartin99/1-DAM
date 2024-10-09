package Ejercicio2;

/**
 * @author David Martin Pulgar
 * @version 1.0
 * @date 04/03/2024
 */
public class Numeros {
         //Atributos 
         public int negativo = 0;
         public int positivo= 0;
         
         
         //Constructor        
         public Numeros(int negativo, int positivo) {
                  this.negativo = negativo;
                  this.positivo = positivo;
         }
         
         public Numeros() {
                  this.negativo = 0;
                  this.positivo = 0;
         }

         //GET y SET
         public int getNegativo() {
                  return negativo;
         }
         public int getPositivo() {
                  return positivo;
         }

         public void setNegativo(int negativo) {
                  this.negativo = negativo;
         }
         public void setPositivo(int positivo) {
                  this.positivo = positivo;
         }
         

         //Metodo toString
         @Override
         public String toString() {
                  return "(negativo " + this.negativo + ", positivo " + this.positivo + ")";
         }//Fin toString
         
        
}//Fin class numeros
