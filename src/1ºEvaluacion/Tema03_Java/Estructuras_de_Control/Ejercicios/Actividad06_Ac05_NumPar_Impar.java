package ActividadesTema03;

/**
 * La Actividad05_ SumarHastaPulsarS_A poner que te diga la cantidad de numeros
 * pares e impares introducidos
 *
 * @author David Martin
 */
import java.util.Scanner;

public class Actividad06_Ac05_NumPar_Impar {

    //Proceso contar Par 
    public static boolean contarPar(int numero) {
        //Ejecutar si es par o no
        boolean contadorPar;

        // numero%2==0   el %2 es el esto, es decir, que el numero entre 2 de resto 0
        if (numero % 2 == 0) {
           contadorPar=(true);
        }
        else{
            contadorPar=(false);
        }            
        return contadorPar;
    }//Fin funcion

////////////////PRINCIPAL///////////////
    public static void main(String[] args) {
        //definir variables
        String letra;
        char s = 's';
        char S = 'S';
        int suma = 0;
        boolean estado = true;
        int numPar=0;
        int numImpar=0;
        Scanner teclado = new Scanner(System.in);

        //Realizar bucle
        System.out.println("Introduzca los numeros; (Pulse 'S' o 's' para salir)");

        do {
            letra = teclado.nextLine();

            if (letra.charAt(0) == S || letra.charAt(0) == s) {
                System.out.println("Salir");
                estado = false;

            } else {
                int numero = Integer.parseInt(letra);
                suma += numero;
                if (contarPar(numero)==(true)){
                    numPar++;
                }
                else{
                    numImpar++;
                }
            }
        } while (estado);

        System.out.println("\nEl resultado de la suma es: " + suma);
        System.out.println("\nNumeros PARES: " + numPar);
        System.out.println("\nNumeros IMPARES: " + numImpar);



        //LLAMAR A LA FUNCION contarParImpar
    }//Fin MAIN

}//Fin CLASS
