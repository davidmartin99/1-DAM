package ActividadesTema03;

/**
 *Crear una pequeña aplicación Java que permita calcular el mayor de tres números A, B, C.
 * @author David
 */
import java.util.Scanner;
public class Ejercicio01_MayorDe3numeros {
    public static String Mayor(int num1, int  num2, int num3){
        String numMayor="";
         if(num1>num2 && num1>num3){
            numMayor = "El mayor es: "+num1;
        }
        if(num2>num1 && num2>num3){
            numMayor = "El mayor es: "+num2;
        }
        if(num3>num1 && num3>num2){
            numMayor = "El mayor es: "+num3;
        }
        return numMayor;
    }
            
    public static void main(String[] args){
        //Declarar e incializar variables
        int num1, num2, num3;
        String numMayor="";
        //Entrada de datos
        Scanner teclado = new Scanner(System.in);
        System.out.println("Vamos a calcular el MAYOR de 3 numeros");
        System.out.println("Introduce el 1 numero: ");
        num1 = teclado.nextInt();
        System.out.println("Introduce el 2 numero: ");
        num2 = teclado.nextInt();
        System.out.println("Introduce el 3 numero: ");
        num3 = teclado.nextInt();
        
       //Llamar a la funcion
       numMayor = Mayor(num1,num2,num3);
       
       //Imprimir el resultado
       System.out.println(numMayor);
       
        
    }//Fin main
    
}//Fin class
