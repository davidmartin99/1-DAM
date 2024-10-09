package Ejercicio1;

/**
 * @author David Martin Pulgar
 * @version 1.0
 * @date 04/03/2024
 */

public class Complejo1 {
         //Atributos
         private double real;
         private double imag;
         
         //Constructor vacío
         public Complejo1(){};
         
         //Constructor
         public Complejo1(double real, double imag){
                  this.real = real;
                  this.imag = imag;
         }//Fin Constructor
         
         //Metodos SET y GET
         //SET
         public void cambiaReal(double real) {
                  this.real = real;
         }
         public void cambiaImaginario(double imag) {
                  this.imag = imag;
         }

         //GET
         public double consultaReal() {
                  return real;
         }
         public double consultaImaginario() {
                  return imag;
         }
         
         //Imprimir el objeto
         @Override
         public String toString(){
                  //Si el imaginario es negativo (<0) que se multiplique por -1 para que sea positivo 
                  if (consultaImaginario()<0){
                           return "Número complejo: "+ consultaReal() + " + "+ (consultaImaginario()*-1) + "i";
                  }else{
                           return "Número complejo: "+ consultaReal() + " + "+ (consultaImaginario()) + "i";
                  }//Fin if-else
                  
         }//Fin to String
         
         // Método para sumar dos números complejos
         public static Complejo1 sumar(Complejo1 complejoA, Complejo1 complejoB) {
                  // Calculamos las sumas
                  double sumaReal = complejoA.consultaReal() + complejoB.consultaReal();
                  double sumaImag = complejoA.consultaImaginario() + complejoB.consultaImaginario();

                  // Devolvemos la solución
                  Complejo1 resultado = new Complejo1(sumaReal, sumaImag);

                  return resultado;
         }// Fin sumar

        
}//Fin class
