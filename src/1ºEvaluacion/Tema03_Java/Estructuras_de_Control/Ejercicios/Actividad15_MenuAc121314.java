package ActividadesTema03;

/**
 * Crea un menú con los ejercicios 12, 13 y 14, de forma que tenga las opciones:
 *    Determinar si un año es bisiesto.
 *    Factorial de un numero.
 *    Si es primo o no.
 *    Salir del programa.
 * @author david
 */
import java.util.Scanner;

public class Actividad15_MenuAc121314 {
    //Proceso de Mostrar Menu
    public static void menu(){
        System.out.println("""
                           ---------------------------
                           -- SELECCIONE UNA OPCION --
                           -- 1.Calcular Bisiesto   --
                           -- 2.Calcular Factorial  --
                           -- 3.Calcular Primo      --
                           -- 4.SALIR               --
                           ---------------------------
                           """);
    }
    
    //Proceso para calcular si el año es bisiesto o no
    public static void calcularBisiesto(int year) {
        //year %4==0 signifca si dividir year/4 y el resto da 0
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                System.out.println("No Bisiesto");
            } else {
                System.out.println("Bisiesto");
            }//Fin if 
        } else {
            System.out.println("No Bisiesto");
        }//Fin if
    }//Fin Proceso
    
    //Proceso calcular el Factorial
    public static void calcularFactorial(int num) {
        int factorial = 1;
        //si por ejemplo num=5, i=5; mientras que 5> menor que 1; que recorra 5-1=4 luego 4-1=3 etc...
        for (int i = num; i > 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial es: " + factorial);
    }//Fin proceso 
    
    //Proceso calcular el Primo
    public static void esPrimo(int numf) {
        //El 1 nunca es primo
        if (numf <= 1) {
            System.out.println(numf+" No es Primo");;
        }
        //Si el numero 
        for (int i = 2; i <= numf / 2; i++) {
            if (numf % i == 0) {
                System.out.println(numf+" No es Primo");
            }
        }
        System.out.println(numf+" es Primo");
    }//Fin Proceso
    
 ///////////FUNCION PRINCIPAL/////////////////////
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int opcion;
        teclado.nextLine();

        do {
            menu(); //Muestra menu
            opcion = teclado.nextInt(); //Usuario elige opcion

            switch (opcion) {
                case 1:
                    System.out.println("Escriba el año: ");
                    int year = teclado.nextInt();
                    calcularBisiesto(year);
                    break;
                case 2:
                    System.out.println("Introduzca el numero: ");
                    int num = teclado.nextInt();
                    calcularFactorial(num);
                    break;
                case 3:
                    System.out.println("Introduzca el numero: ");
                    int numf = teclado.nextInt();
                    esPrimo(numf);
                    break;
                case 4:
                    System.out.println("---Exit... ---");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }//Fin SWITCH

        }while (opcion !=4);

    }//Fin main
    
}//Fin class
