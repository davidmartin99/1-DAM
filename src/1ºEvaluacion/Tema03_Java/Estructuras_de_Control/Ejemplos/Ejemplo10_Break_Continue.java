package tema3;
/**
 * Tablas de multiplicar con FOR
 * @author David
 */
import java.util.Scanner;

public class Ejemplo10_Break_Continue {
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
            //BREAK para parar el contador y el programa => da del 0 al 6
            if(contador==7)
                break;
            
            resultado= num * contador;
            System.out.println(num+ " x " +contador+ " = " +resultado);
        }
        
        //Salida información
        System.out.println("TABLA DE MULTIPLICAR DEL"+num);
        System.out.println("---------------------------------");
        
        for (contador=0; contador<=10; contador++){
            //CONTINUE para saltarse lo q indiquemos en este caso el numx7
            if(contador==7)
                continue;
            
            resultado= num * contador;
            System.out.println(num+ " x " +contador+ " = " +resultado);
        }
        
    }
    
}
