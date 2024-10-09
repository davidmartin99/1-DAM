/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2b;
import java.util.Scanner;
/**
 *3-Aplicación que permite calcular el área de un rectángulo.
 * Incorporar, para mejorar la experiencia de usuario, 
 * la concatenación de texto y números para describir los valores manejados (printf).
 * @author David Martin
 */
public class Ejercicio03 {
    public static double rectangulo (double base, double altura){
        double resultado = base * altura;
        return resultado;
    }
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double base, altura;
        
        System.out.print("Introduzca la base del rectangulo: ");
        base = teclado.nextDouble();
        System.out.print("Introduzca la altura del rectangulo: ");
        altura = teclado.nextDouble();
        
        double area = rectangulo(base,altura);
        System.out.printf("El area del rectangulo es: %.2f", area);
    }
    
}
