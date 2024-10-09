package ActividadesTema03;

/**
 *Realiza un programa que lea un número entero e indique si es par.
 * @author David
 */
import java.util.Scanner;

public class Ejercicio00_EsPar {
    public static String CalcularMayor(int numero){
    //Ejecutar si es par o no
    // numero%2==0   el %2 es el esto, es decir, que el numero entre 2 de resto 0
    String numerop = "";
    if (numero%2==0){
        numerop="PAR";
    }else {
        numerop="IMPAR";
    }//Fin if - else
    return numerop;
    }//Fin funcion

    public static void main(String[] args){
        int numero;
        String numerop="";
        //Introducir los datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el numero: ");
        numero = teclado.nextInt();
        
        numerop= CalcularMayor(numero);
        
        System.out.println(numerop);
        
    }//Fin main
    
}//Fin class
