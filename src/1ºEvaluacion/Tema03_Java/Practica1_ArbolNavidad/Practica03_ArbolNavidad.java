package ActividadesTema03;

/**
 * El programa debe mostrar por pantalla un arbol de Navidad
 * El usuario introduce el simbolo y la altura de la copa.
 * El tronco debe ser 1/3 de la altura y base de la copa.
 * Debe tener un menu para que el usuario dibuje arboles hasta que pulse la opcion de "salir".
 * 
 * @author David Martin Pulgar
 */
 
import java.util.Scanner;

public class Practica03_ArbolNavidad {
    //Creamos un menu de Bienvenida
    public static void menuBienvenida() {
        System.out.println("""
                           ººººººººººººººººººººººººººººººººººººººººººººº
                           ºº BIENVENIDO A DIBUJA UN ARBOL DE NAVIDAD ºº
                           ºº autor: David Martin                     ºº
                           ºº version: 1.0                            ºº
                           ººººººººººººººººººººººººººººººººººººººººººººº
                           """);
    }//Fin menuBienvenida
    
    //Creamos un menu de Opcion
    public static void menuOpcion(){
        System.out.println("""
                           ---------------------------------------------
                           -----   Seleccione una opcion:          -----
                           -----    1. Dibujar Arbol de Navidad    -----
                           -----    0. Salir                       -----
                           ---------------------------------------------
                           """);
    }//Fin menuOpcion
    
    //Creamos un Proceso que imprima la copa en la pantalla
    public static void mostrarCopa(String simbolo, int alturaCopa) {
        //Declaramos e inicializamos las variables y constantes
        int anchoPantalla = 80;

        // Dibujar copa del arbol
        for (int i = 1; i <= alturaCopa; i++) {
            //Calculamos los espacios para que quede central el arbol
            int espacioCopa = anchoPantalla / 2 - i; //Muestra el arbol centrado
            for (int j = 0; j < espacioCopa; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
        
    }//Fin mostrarCopa

    //Creamos un Proceso que imprima el tronco en la pantalla
    public static void mostrarTronco(String simbolo, int alturaCopa) {
        //Declaramos e inicializamos las variables y constantes
        int anchoPantalla = 80; //Muestra el arbol centrado
        int anchoTronco = alturaCopa / 3; //Muestra 1/3 de la anchura y altura de la copa

        // Dibujar tronco
        double espaciosTronco = (anchoPantalla - anchoTronco) / 2;
        for (int i = 0; i < anchoTronco; i++) {
            for (int j = 0; j < espaciosTronco; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= anchoTronco; j++) {
                System.out.print(simbolo);
            }

            System.out.println();
        }
    }//Fin mostrarTronco
    
    //FUNCION MAIN
    public static void main(String[] args) {
        //Crear un Scanner para introducir los datos.
        Scanner teclado = new Scanner(System.in);
        
        //Mostramos el menú de presentación
        menuBienvenida();
        
        //Usamos un do-while, que es un bucle infinito hasta que no pulse "salir"
        do {
            //Mostramos el menú de opcion
            menuOpcion();
            int opcion = teclado.nextInt();
            
            //El programa ejecutará la opcion elegida con un SWITCH
            switch (opcion) {
                case 1:
                    //Entrada de datos por el usuario
                    System.out.println("Introduzca el simbolo: ");
                    String simbolo = teclado.next();
                    System.out.println("Introduzca la altura de la copa del arbol: ");
                    int alturaCopa = teclado.nextInt();
                    // Si la altura es menor que 2, no se puede dibujar el arbol.
                    if (alturaCopa < 2) {
                        System.out.println("Altura minima 2, intentelo de nuevo...");
                        return;
                    }
                    mostrarCopa(simbolo, alturaCopa);
                    mostrarTronco(simbolo, alturaCopa);
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }//Fin switch
            
        } while (true); // Fin do-while
        
    }//Fin main

}//Fin class
