package tema2b;
/**
 * POTENCIA
 *Realizar un programa que visualice en pantalla la potencia de un una base elevada a un exponente.
 * Ambos datos se pedirán a través de teclado. 
Nota: Como sucederá frecuentemente, este ejercicio se podrá resolver de muchas formas alternativas. 
* Una forma habitual será a través de la utilización de estructuras repetitivas, 
* puesto que tengo que hacer un determinado número de veces una determinada operación. 
* Como aún es un poco pronto (trataremos este tema más adelante),
* vamos a utilizar un método específico que me proporciona la clase Math.
* Investiga en Internet para ver cómo funciona dicho método y probarlo.
 * @author David
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static double funcionPotencia(double base, double exponente){
        double resultadoPotencia = Math.pow(base, exponente);
        return resultadoPotencia;
    }
    
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //Solicitamos que introduzca la base y el exponente
        System.out.print("Introduce la base: ");
        double base = teclado.nextDouble();
        System.out.print("Introduce el exponente: ");
        double exponente = teclado.nextDouble();
        
        //Calcular la potencia con Math.pow
        double potencia = funcionPotencia(base,exponente);

        //Mostrar resultado
        System.out.printf("El resultado es: %.2f",potencia);
        
    }
}
