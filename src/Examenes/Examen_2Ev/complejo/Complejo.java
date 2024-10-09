package complejo;

/**
 * @author David Martin Pulgar
 * @version 1.0
 * @date 04/03/2024
 */

public class Complejo {

         //Atributos numero real y numero imaginario
         public double real, imag;

         //1º Metodo Constructor inicalizados a 0
         public Complejo() {
                  this.real = 0;
                  this.imag = 0;
         }//Fin 1º Metodo Constructor 

         //2º Metodo Constructor
         public Complejo(double real, double imag) {
                  this.real = real;
                  this.imag = imag;
         }//Fin 2º Metodo Constructor 

         public double consultaReal() {
                  return real;
         }//Fin consultaReal

         public double consultaImag() {
                  return imag;
         }//Fin consultaImag

         public void cambiaReal(double real) {
                  this.real = real;
         }//Fin cambiaReal

         public void cambiaImag(double imag) {
                  this.imag = imag;
         }//Fin cambiaImag

         //Metodo toString
         //Metodo para sobreescribir un metodo ya creado
         @Override
         public String toString() {
                  return (this.real + " +  " + this.imag + "i");
         }//Fin toString


         //Metodo para sumar dos numeros complejos
         public void sumar(double realA, double imagA, double realB, double imagB) {
                  //Calculamos las sumas
                  double sumaReal = realA + realB;
                  double sumaImag = imagA + imagB;
                  
                  //Devolvemos la solucion
                  System.out.println("Suma a + b : "+sumaReal+ " + "+sumaImag+"i");
         }//Fin sumar

}//Fin class Complejo

