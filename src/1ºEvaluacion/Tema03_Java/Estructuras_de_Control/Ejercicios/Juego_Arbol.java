package ActividadesTema03;

/**
 *
 * @author david
 */
import java.util.Scanner;

public class Juego_Arbol {
    
    
    public static void mostrarArbol1(int filas, String simbolo) {
        for (int i = 1; i <= filas; i++) {
            for (int j = filas; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                //Igual que el triangulo 3 pero añadiendo un espacio delante del simbolo
                System.out.print(" "+simbolo);
            }
            System.out.println();
        }
    }

    public static void mostrarArbol2(int filas, String simbolo) {
        for (int i = 1; i <= filas; i++) {
            for (int e = 1; e < i; e++) {
                System.out.print(" ");
            }
            for (int j = filas; j >= i; j--) {
                //Igual que el triangulo 4 pero añadiendo un espacio delante del simbolo
                System.out.print(" "+simbolo);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int filas;
        String simbolo;

        //Introducir valores por el usuario
        System.out.print("Introduce el simbolo: ");
        simbolo = teclado.nextLine();
        System.out.print("\nIntroduce el numero de filas: ");
        filas = teclado.nextInt();

        //Llamar a los Procesos
 
        mostrarArbol1(filas, simbolo);
        System.out.print("\n");
        mostrarArbol2(filas, simbolo);
        System.out.print("\n");

    }//Fin CLASS 
}
