package ActividadesTema03;

/**
 * Realizar un programa que determine de un conjunto de 10 números enteros,
 * introducidos por teclado, cuántos son menores que 18, cuántos mayores de 65
 * y cuántos están comprendidos entre 18 y 65.  
 * 
 * Nota: Para hacer este ejercicio será realizará directamente sin necesidad de
 * almacenarlos en un array.
 * 
 * @author David Martin 
 */
import java.util.Scanner;

public class Actividad04_Contador {
        
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
        //declarar variables
        int menor18=0,  mayor65=0, entre18y65=0;
        
        //Introducir los 10 numeros enteros
        for(int i=0; i<10; i++){
            System.out.print("Introduce el numero: ");
            int num = teclado.nextInt();
            
            if(num<18){
                menor18 +=1;
            }
            else if (num>65){
                mayor65 +=1;
            }
            else{
                entre18y65 +=1;
            }//Fin if
        }//Fin for
        
        //Imprimir valores
        System.out.print("\nMenores 18: "+menor18);
        System.out.print("\nMayores 65: "+mayor65);
        System.out.print("\nEntre 18 y 65: "+entre18y65\n);

    }//Fin main
    
}//Fin class
