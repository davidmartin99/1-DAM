package ActividadesTema03;

/**
 *
 * @author alumn
 */
import java.util.Scanner;

public class Actividad05_SumarHastaPulsarS_A {
    public static void main(String[] args){
        //definir variables
        String letra;
        char s='s';
        char S='S';
        int suma=0;
        boolean estado = true;
        Scanner teclado = new Scanner(System.in);

        //Realizar bucle
        do{
            System.out.println("Introduzca los numeros; (Pulse 'S' o 's' para salir)");
            letra = teclado.nextLine();
            
            if(letra.charAt(0)==S || letra.charAt(0)==s){
                System.out.println("Salir");
                estado=false;
            }
            else{
                int numero = Integer.parseInt(letra);
                suma += numero;
            }
        }while(estado);
       
        System.out.println("\nEl resultado de la suma es: "+suma);
    }//Fin MAIN
    
}//Fin CLASS
