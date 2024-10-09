package ActividadesTema03;
/**
 *Crear una pequeña aplicación Java que lea un carácter 
 * y nos diga si está o no comprendido entre las letras I y M.
 * @author David
 */
import java.util.Scanner;

public class Ejercicio03_EntreRango {
    //funcion
    public static void EnRango(char letra){
        //Calculamos si está entre I y M
        if(letra>'i' && letra<'m'){ //que letra sea mayor que i y menor que m
            System.out.println("El caracter SI esta entre I - M");
        }else{
            System.out.println("El caracter NO esta entre I - M");
        }//Fin if - else
    }
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);//scanner para introducir datos
        //Declarar e inicializar variables
        char letra;
        
        //Convertimos a minuscula
        
        //Entrada de datos
        System.out.print("Introduce el caracter para ver si esta entre I y M: ");
        //Para introducir un valor char ponemos teclado.next().charAt(0)
        //Para que pase a minuscula siempre se añade toLowerCase(), para mayusculas es toUpperCase
        letra = teclado.next().toLowerCase().charAt(0);
        
        //Llamamos a la funcion
        EnRango(letra);
    }//Fin main
    
}//Fin class
