package actividadestema03;

/**
 *Juego donde el usuario introduce el nº filas y el símbolo y el 
 * programa muestra el triangulo en 4 formas diferentes
 * @author David
 */
import java.util.Scanner;

public class Juego_Triangulo {
    
    //Proceso 
    public static void mostrarTriangulo1(int filas, String simbolo){
        for (int i=1; i<=filas; i++){
            for (int j=1; j<=i; j++){
                System.out.print(simbolo);
            } 
            System.out.println();
        }
    }
        
    public static void mostrarTriangulo2(int filas, String simbolo) {
        for (int i = filas; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
    
    public static void mostrarTriangulo3(int filas, String simbolo) {
        for (int i = 1; i <=filas; i++) {
            for (int j = filas; j > i; j--) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
    
    public static void mostrarTriangulo4(int filas, String simbolo) {
        for (int i = 1; i <= filas; i++) {
            for (int e=1; e<i; e++){
                System.out.print(" ");
            }
            for (int j=filas; j>=i; j--) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }
///////////////Principal/////////
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int filas;
        String simbolo;
        
        //Introducir valores por el usuario
        System.out.print("Introduce el simbolo: ");
        simbolo = teclado.nextLine();
        System.out.print("\nIntroduce el numero de filas: ");
        filas = teclado.nextInt();
        
        //Llamar a los Procesos
        mostrarTriangulo1(filas, simbolo);
        System.out.print("\n");
        mostrarTriangulo2(filas, simbolo);
        System.out.print("\n");
        mostrarTriangulo3(filas, simbolo);
        System.out.print("\n");
        mostrarTriangulo4(filas, simbolo);
        
    }//Fin CLASS 
}//Fin MAIN
