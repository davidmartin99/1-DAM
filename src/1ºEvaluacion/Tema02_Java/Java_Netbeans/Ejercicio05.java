
import java.util.Scanner;
/**
 *Área de un círculo definiendo una constante.
Implementa un programa en Java que calcule el área de un círculo cuyo radio lo introduce el usuario. 
*Recuerda que el Área = 𝜋𝑟2 y 𝜋 = 3.1415. 
*Define una variable global para el valor de PI.
La constante deberá quedar definida fuera del programa principal.
 * @author David Martin
 */
public class Ejercicio05 {
    public static final double PI = 3.1415; //VARIABLE GLOBAL QUE VALE PARA TODO

    public static double circulo (double num1){
        double resultado = PI * (num1 * num1);  //CONSTANTES SIEMPRE CON MAYUSCULA

        return resultado;
    }
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        double radio;
        System.out.print("Introduce el radio del circulo\n");
        radio = teclado.nextDouble();
        
        double area = circulo(radio);
        System.out.printf("El area del circulo es: %.2f\n",area);
        
    }
}
