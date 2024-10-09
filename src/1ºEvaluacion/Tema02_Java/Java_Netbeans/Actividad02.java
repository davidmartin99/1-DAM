/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.lang.Math.*;
/**
 *Valor absoluto
 * @author david
 */
public class Actividad02 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero, valorAbsoluto;
        
        System.out.print("Introduce el número: ");
        numero = teclado.nextInt();
        
        //calcula el valor absoluto utilizando el operador condicional ternario
        valorAbsoluto = (numero < 0)? -numero : numero;
        
        System.out.println("\nEl valor absoluto es: "+valorAbsoluto);
    }
    
}
