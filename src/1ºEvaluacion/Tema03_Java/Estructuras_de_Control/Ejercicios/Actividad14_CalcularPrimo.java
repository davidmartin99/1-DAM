package ActividadesTema03;

/**
 * Calcular numero primo.
 * Un numero primo es aquel que solo es divisible entre sí mismo
 * y entre 1 (Excepto el 1 que no es primo)
 * @author David 
 */
import java.util.Scanner;

public class Actividad14_CalcularPrimo {
    //Funcion boolean ue devuelve si el num es primo(true) o no(false)
    public static boolean esPrimo(int num){
        //El 1 nunca es primo
        if (num <= 1){
            return false;
        }
        //Si el numero 
        for (int i = 2; i <= num / 2; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }//Fin funcion
    
 /////////////Funcion Principal////////
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el numero para calcular si es primo: ");
        int num = teclado.nextInt();
        
        //Mostrar el resultado
        //Si (funcion) es true o false
        if(esPrimo(num)){
            System.out.println(num+" es PRIMO");
        }else{
            System.out.println(num+"NO es PRIMO");
        }
        
    }//Fin main
    
}//Fin class