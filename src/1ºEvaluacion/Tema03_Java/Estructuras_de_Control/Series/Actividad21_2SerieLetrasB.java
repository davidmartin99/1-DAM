package Series;

/**
 * Actividad 21. Serie 2ª. Crear la misma serie con letras del abecedario a) El
 * usuario introduce el numero de elementos finales de la serie. Ejemplo:
 * Introduce el numero de elementos: 5 a;b,b;c,c,c;d,d,d,d;e,e,e,e,e
 *
 * b) Realizar una versión mejorada con la opción del usuario de ponerla con
 * mayúsculas o minúsculas. Introduce el numero de elementos: 5 Indica si
 * prefieres mayúsculas(M) o minúsculas(m): M A;B,B;C,C,C;D,D,D,D;E,E,E,E,E
 *
 * @author david
 */
import java.util.Scanner;

public class Actividad21_2SerieLetrasB {
    public static void minusMayuscula(int num, Scanner teclado){
        char letra;
        teclado.nextLine();
        System.out.print("(M)Mayuscula o (m)minuscula: ");
        String opcion = teclado.nextLine();
        //Compara la opcion si es igual a "M" imprime en mayusculas y si es igual a "m" en minusculas
        if("M".equals(opcion)){
            letra=65;
            mostrarSerie02b(num, letra);
        }
        else if("m".equals(opcion)){
            letra=97;
            mostrarSerie02b(num, letra);
        }
        else{
            System.out.println("Opcion no valida");
        }//Fin if
    }//Fin proceso

    public static void mostrarSerie02b(int num, char letra) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(letra);
                if (j < i) {
                    System.out.print(",");
                }//Fin if
            }//Fin for
            if (i < letra) {
                System.out.print("; ");
            }//Fin if
            letra++;
        }//Fin for
    }//Fin proceso

    public static void main(String[] args) {
        //Entrada de Datos
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introuce un numero: ");
        int num = teclado.nextInt();

        minusMayuscula(num, teclado);

        //Int
    }//Fin MAIN
}
