package tema3;
/**
 * Tablas de multiplicar con FOR
 * @author David
 */
import java.util.Scanner;

public class Ejemplo06_For {
    public static void main(String[] args){
        //Declarar variables
        int num;
        int contador;
        int resultado = 0;
        
        //El usuario introduce el numero
        System.out.println("Introduzca el numero para sacar su tabla de multiplicar: ");
        Scanner teclado = new Scanner(System.in);
        num = teclado.nextInt();
        
        //Salida información
        System.out.println("TABLA DE MULTIPLICAR DEL"+num);
        System.out.println("---------------------------------");
        
        //Estructura de repetición
        for (contador=0; contador<=10; contador++){
            resultado= num * contador;
            System.out.println(num+ " x " +contador+ " = " +resultado);
        }
        
    }
    
}
