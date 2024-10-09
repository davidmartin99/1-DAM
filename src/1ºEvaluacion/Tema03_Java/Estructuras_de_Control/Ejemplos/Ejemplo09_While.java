package tema3;

/**
 *Tabla multiplicar While
 * @author David
 */
import java.util.Scanner;

public class Ejemplo09_While {
    public static void main(String[] args){
        //Declarar e inicializar variables
        int numero;
        int contador=0;
        int resultado=0; 
        
        //El usuario introduce el numero
        System.out.println("Introduzca el numero para sacar su tabla de multiplicar: ");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();
                
        //Salida información
        System.out.println("TABLA DE MULTIPLICAR DEL"+numero);
        System.out.println("---------------------------------");
        
        //Ejecucion del programa con WHILE
        while(contador<=10){
            resultado= contador*numero;
            System.out.println(numero+" x "+contador+" = "+resultado);
            contador++;
        }//Fin while 
        
    }//Fin main 
    
}//Fin class
