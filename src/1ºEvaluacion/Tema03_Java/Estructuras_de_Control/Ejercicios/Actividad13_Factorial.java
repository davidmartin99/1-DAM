package ActividadesTema03;

/**
 * El cálculo del factorial de un número natural básicamente consiste el producto 
 * sucesivo de los números enteros que vandesde el 1 hasta el propio número. 
 * 
 * Por ejemplo, el factorial de 5 (serepresenta como "5!") es: 1*2*3*4*5. 
 * Este tipo de cálculo, si se quiere hacer eficientemente y adaptable a cualquier número, 
 * requiere del uso de alguna  estructura repetitiva (bucle) para hacerlo.
 * 
 * @author David 
 */
import java.util.Scanner;

public class Actividad13_Factorial {
    public static void calcularFactorial(int num){
        int factorial = 1;
        //si por ejemplo num=5, i=5; mientras que 5> menor que 1; que recorra 5-1=4 luego 4-1=3 etc...
        for( int i=num; i>1; i--){
            factorial=factorial*i;
        }
        System.out.println("El factorial es: "+factorial);
    }
    
///////////////Funcion Principal    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero para calcular el Factorial: ");
        int num = teclado.nextInt();
        
        calcularFactorial(num);
    }//Fin main
}//Fin class
