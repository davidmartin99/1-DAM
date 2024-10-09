/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
import java.lang.Math.*;
/**
 *BASCULA
 * El usuario introduce el peso, nombre del producto y el precio
 * Devuelve el total de lo que el usuario tiene que pagar
 * Recogerá lo que el usuario da y devolverá lo que el propietario tiene
 * @author david
 */
public class Actividad01 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double precio, peso;
        String nombre;
        double totalPagar, dinero, cambio;
        
        //Pedimos que introduzca los datos
        System.out.print("Escribe el nombre de la fruta, peso y precio\n");
        nombre = teclado.nextLine();
        peso = teclado.nextDouble();
        precio = teclado.nextDouble();
        
        //calculamos el total a pagar
        totalPagar = peso * precio;
        System.out.printf("\nDebe introducir %.2f",totalPagar,"Euros");
        
        //Le pedimos que introduzca el dinero
        System.out.println("\nIntroduzca el dinero");
        dinero = teclado.nextDouble();
        
        if (dinero<totalPagar){
            System.out.println("\nEl dinero no es suficiente");
        }else {
            cambio = dinero - totalPagar;
            System.out.println("\nEl cambio es: "+cambio);
        }
        
    }
    
}
