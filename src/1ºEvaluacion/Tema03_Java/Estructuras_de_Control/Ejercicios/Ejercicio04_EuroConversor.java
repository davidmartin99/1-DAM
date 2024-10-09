package ActividadesTema03;

/**
 *EuroConversor 
 *  Una aplicación que ofrezca al usuario la posibilidad de elegir en la 
 * conversión, de euros a pesetas, o de pesetas a euros, 
 * de forma que pueda darnos el cambio de una cantidad que se pedirá, 
 * acorde a la selección previa.
 * @author David
 */
import java.util.Scanner;

public class Ejercicio04_EuroConversor {
    //Proceso de presentacion
    public static void Menu(){
        System.out.println("""
                           --------------------------------
                           --  Conversor Euro-Pesetas    --
                           --                            --
                           --  Seleccione su opcion:     --
                           --  1. Euros a Pesetas        --
                           --  2. Pesetas a euros        --
                           --  3. Exit                   --
                           --------------------------------
                           """);
    }//Fin Proceso
    
    //Funcion 1 de euros a pesetas
    public static double EurosToPesetas (double moneda){
        double resultado = moneda * 166.386;
        return resultado;
    }
    
    //Funcion 2 de pesetas a euros
    public static double PesetasToEuros (double moneda){
        double resultado = moneda / 166.386;
        return resultado;
    }
    
    
    public static void main(String[] args){
        //declarar e inicializar variables
        double moneda=0;
        int opcion = 0;
        
        //hacemos Do-While porque queremos que haga un bucle mientras opcion sea 1 o 2
        do{ 
            //Mostramos el Menu
            Menu();
            
            //Introducir datos
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();
            
            //LLamamos a las funciones segun la opcion elegida
            switch (opcion) {
                case 1:
                    System.out.println("Introduce la cantidad: ");
                    moneda = teclado.nextDouble();
                    double resultadoPesetas = EurosToPesetas(moneda);
                    System.out.printf("%.2f euros son %.2f PESETAS\n", moneda, resultadoPesetas);
                    break;
                case 2:
                    System.out.println("Introduce la cantidad: ");
                    moneda = teclado.nextDouble();
                    double resultadoEuros = PesetasToEuros(moneda);
                    System.out.printf("%.2f pesetas son %.2f EUROS\n", moneda, resultadoEuros);
                    break;
                case 3: 
                    System.out.println("SALIR");
                    System.exit(0);//Ponemos System.exit(0) para detener el programa
                default:
                    System.out.println("Opcion no valida, intentelo de nuevo");
            }//Fin Switch
            
        }while (opcion!= 3);  //Hasta que opcion sea diferente de 3. Salir
        //opcion != 3 Significa distinto (!=)
        
    }//Fin main
    
}//Fin class
