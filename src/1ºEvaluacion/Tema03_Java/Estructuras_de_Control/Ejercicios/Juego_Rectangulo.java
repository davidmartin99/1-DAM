package ActividadesTema03;

/**
 * Impimir un rectangulo en pantalla
 *
 * @author David
 */
import java.util.Scanner;

public class Juego_Rectangulo {

    public static void mostrarRectangulo1(String simbolo, int base, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(simbolo);
            }
            System.out.println();
        }
    }//Fin proceso
    
    // Método para imprimir el contorno del rectángulo
    public static void mostrarRectangulo2(String simbolo, int base, int altura) {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                // Imprimir el borde superior, inferior y laterales
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print(simbolo);
                } else {
                    // Espacios en el interior del rectángulo
                    System.out.print(" ");
                }
            }
            System.out.println(); // Cambiar de línea después de cada fila
        }
    }//Fin proceso
    
////////Funcion Principal////
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el simbolo:");
        String simbolo = teclado.nextLine();

        System.out.println("Introduce la base :");
        int base = teclado.nextInt();
        System.out.println("Introduce la altura :");
        int altura = teclado.nextInt();

        mostrarRectangulo1(simbolo, base, altura);
        
        System.out.println("\n");
        
        mostrarRectangulo2(simbolo, base, altura);

    }

}
