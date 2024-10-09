    
package ActividadesTema03;

/**
 * El programa debe mostrar por pantalla un arbol de Navidad.
 * El usuario introduce el simbolo y la altura de la copa. 
 * El tronco debe ser 1/3 de alto y ancho, de la altura de la copa. 
 * Debe tener un menu para que el usuario dibuje arboles,
 * hasta que pulse la opcion de "Salir".
 *
 * @author: David Martin Pulgar
 * @version: 1.0
 */

import java.util.Scanner;

public class Practica03_ArbolNavidad_DavidMP {

    /**
     * Creamos un menu de Bienvenida
     */
    public static void menuBienvenida() {
        System.out.println("""
                           ººººººººººººººººººººººººººººººººººººººººººººº
                           ºº BIENVENIDO A DIBUJA UN ARBOL DE NAVIDAD ºº
                           ºº autor: David Martin                     ºº
                           ºº version: 1.0                            ºº
                           ººººººººººººººººººººººººººººººººººººººººººººº
                           """);
    }//Fin menuBienvenida

    /**
     * Creamos un menu de Opcion
     */
    public static void menuOpcion() {
        System.out.println("""
                           ---------------------------------------------
                           -----   Seleccione una opcion:          -----
                           -----    1. Dibujar Arbol de Navidad    -----
                           -----    0. Salir                       -----
                           ---------------------------------------------
                           """);
    }//Fin menuOpcion

    /**
     * Creamos un proceso que imprima la copa en la pantalla
     *
     * @param simbolo
     * @param alturaCopa
     */
    public static void mostrarCopa(String simbolo, int alturaCopa) {
        //Declaramos e inicializamos las variables y constantes
        int anchoPantalla = 80;

        // Dibujar copa del arbol
        for (int i = 1; i <= alturaCopa; i++) { //i empieza en 1, mientras i sea menor o igual a la altura de la copa, i va recorriendo el for
            //Calculamos los espacios para que quede central el arbol
            int espacioCopa = anchoPantalla / 2 - i; //Muestra el arbol centrado
            //Mostramos los espacios 
            for (int j = 0; j < espacioCopa; j++) {
                System.out.print(" ");
            }//Fin 2º for
            //Mostramos el simbolo
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(simbolo);
            }//Fin 3º for
            System.out.println();
        }//Fin 1º for
    }//Fin mostrarCopa

    /**
     * Creamos un Proceso que imprima el tronco en la pantalla
     *
     * @param simbolo
     * @param alturaCopa
     */
    public static void mostrarTronco(String simbolo, int alturaCopa) {
        //Declaramos e inicializamos las variables y constantes
        int anchoPantalla = 80; //Muestra el arbol centrado
        int alturaTronco = (int) Math.ceil((double) alturaCopa / 3); //Muestra 1/3 de la anchura y altura de la copa
        //anchoTronco es igual a la altura de la copa *2-1 y eso entre 3 ya que es 1/3 de la altura
        int anchoTronco = (2 * alturaCopa - 1) / 3;
        //Si el ancho del tronco entre 3 da resto diferente a 0 y la altura de la copa no es 3, que su anchura sea una mas para centrarlo
        if (anchoTronco % 3 != 0 && alturaCopa != 3) {
            anchoTronco++;
        }//Fin if

        // Dibujar tronco
        double espaciosTronco = (anchoPantalla - anchoTronco) / 2;
        for (int i = 1; i <= alturaTronco; i++) {
            for (int j = 0; j < espaciosTronco; j++) {
                System.out.print(" ");
            }//Fin 2º for

            for (int j = 0; j < anchoTronco; j++) {
                System.out.print(simbolo);
            }//Fin 3ºfor

            System.out.println();
        }//Fin 1º for
    }//Fin mostrarTronco

    /**
     * Creamos un Proceso que imprima el Arbol de Navidad
     *
     * @param simbolo
     * @param alturaCopa
     */
    public static void mostrarArbol(String simbolo, int alturaCopa) {
        //La altura de la copa debe ser minimo 3 y maximo 40
        if (alturaCopa < 3) {
            System.out.println("\nAltura minima 3, intentelo de nuevo...");
            return;
        }//Fin if
        if (alturaCopa >40){
            System.out.println("\nAltura maxima 40, intentelo de nuevo...");
            return;
        }//Fin if
        //Llamamos a los procesos que dibujan la copa y el tronco
        mostrarCopa(simbolo, alturaCopa);
        mostrarTronco(simbolo, alturaCopa);
    }//Fin mostrarArbol

    /**
     * Este método se encarga de iniciar el programa
     *
     * @param args hace referencia al arreglo con los parámetros que introduzca
     * por consola
     * @return void
     */
    //FUNCION MAIN
    public static void main(String[] args) {
        //Crear un Scanner para introducir los datos.
        Scanner teclado = new Scanner(System.in);

        //Mostramos el menú de presentación
        menuBienvenida();

        //Declaramos la variable opcion
        //Hay que declararla fuera del bucle do-while
        int opcion;

        //Usamos un do-while, que es un bucle infinito hasta que no pulse "Salir"
        do {
            //Mostramos el menú de opcion
            menuOpcion();
            opcion = teclado.nextInt();

            //El programa ejecutará la opcion elegida con un SWITCH
            switch (opcion) {
                case 1:
                    //Entrada de datos por el usuario
                    System.out.print("Introduzca el simbolo: ");
                    String simbolo = teclado.next();
                    System.out.print("Introduzca la altura de la copa del arbol: ");
                    int alturaCopa = teclado.nextInt();
                    //Llamamos al proceso que muestra por pantalla el arbol
                    mostrarArbol(simbolo, alturaCopa);
                    break;
                case 0:
                    System.out.println("\nSaliendo... ¡Hasta luego!");
                    break;
                default:
                    System.out.println("\nOpción no válida. Intentelo de nuevo.");
            }//Fin switch

        } while (opcion != 0); // Fin do-while

    }//Fin main

}//Fin class

