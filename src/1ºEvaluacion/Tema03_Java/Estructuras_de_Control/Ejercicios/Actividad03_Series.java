package ActividadesTema03;
/**
 *a) Crear una aplicacion que muestre por pantalla la serie del número 3 hasta
 * el valor 100. Hazlo de tres formas diferentes.
 * 
 * b) Crea una función que muestre la suma de la serie del numero 3 entre los dos valores.
 *    (ejemplo entre 50 y 100)
 * 
 * c) Crea una versión mejorada donde el usuario introduce el numero de la serie y el límite
 * final. Mostrará la serie de números en una línea y la suma de la serie en otra.
 * 
 * @author David Martin
 */
import java.util.Scanner;

public class Actividad03_Series {
   
    //subproceso A1 con FOR
    public static void serieA1(){
        for(int s=3; s<100; s=s+3){
            System.out.print(s);
            if(s<=96){
                System.out.print(", ");
            }
        }
        System.out.print("\n");
    }
    
    //funcion A2 con while
    public static void serieA2(){
        int s=3;
        while(s<=100){
            System.out.print(s+ ", ");
            s += 3;
        }
        System.out.print("\n");
    }
    
    //Funcion A3
    public static void serieA3(){
        int s=3;
        do{
            System.out.print(s+ ", ");
            s += 3;
        }while(s<100);
    }
    
    //Funcion B1
    public static int sumarB1(int rango1, int rango2){
        int maxRango, minRango;
        if (rango1 > rango2){
            maxRango = rango1;
            minRango = rango2;
        } else {
            maxRango = rango2;
            minRango = rango1;
        }
        //Calculamos la suma
        int totalSuma = 0;
        for (int s= minRango; s<=maxRango; s+=3){
            totalSuma += s;
        }
        return totalSuma;
    }
    
    //Proceso C1
    public static void rangoC1(int rangoInicial, int rangoFinal, int numSerie){
        if (rangoFinal < rangoInicial){
            rangoFinal = rangoInicial;
            rangoInicial = rangoFinal;
        }
        int totalSuma = 0;
        for (int s=rangoInicial; s<=rangoFinal; s+=numSerie){
            System.out.print(s+", ");
            totalSuma += s;
        }
        System.out.print("La suma total es: "+totalSuma);
    }
    
    
    //Funcion MAIN
    public static void main(String[] args){
        //Proceso A
        serieA1();
        serieA2();
        serieA3();
        
        
        //Funcion sumarB1
        System.out.print("\nIntroduce entre que rango de numeros deseas sumar (sumara de 3 en 3): \n");
        Scanner teclado = new Scanner(System.in);
        int rango1 = teclado.nextInt();
        int rango2 = teclado.nextInt();
        //Llamar a la funcion y mostrar resultado
        int totalSuma = sumarB1(rango1, rango2);
        System.out.printf("El resultado de sumar +3 entre %d y %d es igual a %d", rango1, rango2, totalSuma);
        
        
        //Proceso rangoC1 
        System.out.print("\nIntroduce el valor inicial, el valor final y el numero de serie: ");
        int rangoInicial = teclado.nextInt();
        int rangoFinal = teclado.nextInt();
        int numSerie = teclado.nextInt();
        //Lamar al procedimiento rangoC1
        rangoC1(rangoInicial, rangoFinal, numSerie);
        
    }//Fin main
    
}//Fin class
