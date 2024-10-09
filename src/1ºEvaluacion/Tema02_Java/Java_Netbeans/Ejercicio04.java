/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2b;
import java.util.Scanner;
import java.lang.Math.*;
/**
 *Implementar una aplicación en Java que pase los grados Centigrados a grados Farenheit
 * (multiplicar por 9 y dividir el resultado por 5, y por último paso sumarle 32).
  ºF = ºC * (9/5) + 32
 * @author David Martin
 */
public class Ejercicio04 {
    public static double temperatura (double num1){
        double resultado = (num1 * 9/ 5) + 32;
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double centigrados;
        System.out.println("Introduzca los grados Centigrados para pasar a Farenheit: ");
        centigrados = teclado.nextDouble();
        
        double farenheit = temperatura (centigrados);
        System.out.println(" grados Farenheit El resultado es: "+farenheit);
    }
    
}

