package ActividadesTema03;

/**
 * Crea una aplicación donde el usuario introducirá numeros enteros y calculará
 * la suma total de todos los números. Para salir podrá pulsar las letras "s" o
 * "S".
 *
 * @author David Martin
 */
import java.util.Scanner;

public class Actividad05_SumarHastaPulsarS {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        String letra;
        
        System.out.println("Introduzca los números; (Pulse 'S' o 's' para salir)");
        
        do { //Introduce datos
            letra = teclado.nextLine();
            
            //Verificar si el usuario introduce "s" para salir
            //Si letra !(distinta) de "s" transformar a numero para sumarlo
            if(!letra.equalsIgnoreCase("s")) {
                //Convertir cadena a numero entero
                numero = Integer.parseInt(letra);
                suma += numero;
            }
        // hacer mientras !(distinto) letra distinta "s". IgnoreCase para que de igual si es "S" o "s"
        }while(!letra.equalsIgnoreCase("s")); 
        
        System.out.print("La suma total es: \n"+suma);

    }

}
