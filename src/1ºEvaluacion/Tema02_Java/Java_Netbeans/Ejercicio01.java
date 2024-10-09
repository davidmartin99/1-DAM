/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2;
import java.util.Scanner;
import java.lang.Math.*;
/**
 * Cambio euros pesetas
 * @author David
 */
public class Ejercicio01 {
    public static double conversoreuros (double num1){
        double resultado = num1 * 166.386;
        return resultado;
    }
    public static double conversorpesetas (double num1){
        double resultado = num1 / 166.386;
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //Todo code application logic here
        double euros, pesetas;
        System.out.println("Conversor de Euros a Pesetas");
        System.out.println("\nIntroduzca los euros: ");

        //Introduce el dinero
        euros = teclado.nextDouble();
        
        double totalPesetas = conversoreuros(euros);
        System.out.printf("\n%.2f es igual a %.2f pesetas", euros, totalPesetas);
        
        
        //PESETAS
        System.out.println("Conversor de Pesetas a Euros");
        System.out.println("\nIntroduzca las pesetas: ");

        //Introduce el dinero
        pesetas = teclado.nextDouble();
        
        double totalEuros = conversorpesetas(pesetas);
        System.out.printf("\n%.2f es igual a %.2f euros", pesetas, totalEuros);
    }
    
}