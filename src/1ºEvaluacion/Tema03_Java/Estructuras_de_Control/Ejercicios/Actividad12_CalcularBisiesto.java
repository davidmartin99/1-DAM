package ActividadesTema03;

/**
 *Se pide: crear un programa que pida por teclado un año y me indique si es
 * bisiesto o no.
 *
 * El criterio de que se considerará año bisiesto aquel que sea divisible por 4
 * pero no por 100 salvo que sea divisible por 400. 
 * Por esto 1900 no es bisiesto, 1904 sí y 2000 también.
 * 
 * @author david
 */
import java.util.Scanner;

public class Actividad12_CalcularBisiesto {
    //Proceso para calcular si el año es bisiesto o no
    public static void calcularBisiesto (int year){
        //year %4==0 signifca si dividir year/4 y el resto da 0
        if(year%4==0){
            if(year%100==0 && year%400!=0){
                System.out.println("No Bisiesto");
            }else{
                System.out.println("Bisiesto");
            }//Fin if 
        }else{
            System.out.println("No Bisiesto");
        }//Fin if
            
    }//Fin Proceso

//////////////Funcion Principal///////////////////
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //Declarar e inicializar variables
        int year;
        
        //Introducir datos
        System.out.println("Year: ");
        year = teclado.nextInt();
        
        //LLamamos al Proceso calcularBisiesto
        calcularBisiesto(year);
        
    }//Fin MAIN
    
}//Fin CLASS
