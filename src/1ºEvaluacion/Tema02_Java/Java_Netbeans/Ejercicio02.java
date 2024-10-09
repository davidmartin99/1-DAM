/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;
import java.util.Scanner;
/**
 *Realizar un programa que te indique lo que cuesta llenar un depósito de gasolina, 
 * donde el usuario introduce el precio de la gasolina y los litros a llenar. 
 * El resultado  deberá mostrar 3 decimales.
 * @author david
 */
public class Ejercicio02 {
    public static double deposito (double num1, double num2){
        double resultado = num1 * num2;
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double precio, litros;
        System.out.print("Bienvenido a la gasolinera\n");
        System.out.print("Introduzca el precio de la gasolina (precio/litro)\n");
        precio = teclado.nextDouble();
        System.out.print("Introduzca los litros que desea depositar\n");
        litros = teclado.nextDouble();
        
        double totalDeposito = deposito (precio, litros);
        System.out.printf("\nLlenar %.2f le costaría: %.2f euros ",litros,totalDeposito);
    }
   
}
