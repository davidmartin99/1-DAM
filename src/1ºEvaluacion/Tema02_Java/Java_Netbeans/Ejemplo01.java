/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;

/**
 *Funcion y subfuncion
 * @author David
 */
public class Ejemplo01 {
          //codigo de la funcion
    public static int sumar(int numero1, int numero2){
        int resultado = numero1+numero2;
        return resultado;
    
    }
    public static int restar(int numero1, int numero2){
        int resultado = numero1-numero2;
        return resultado;
    }
   
    public static void main(String[] args){
       //Todo code application logic here
       int variable1 = sumar(2,3);
       System.out.println("La suma de dos numeros es: "+variable1);
       
       int variable2 = restar(2,3);
       System.out.println("\nLa resta de los dos numeros es: "+variable2);
   
    }
    
}
