package tema2b;
/**
 *Calcule el salario semanal de un trabajador. Hora ordinaria se paga a 23.25€/hora
 * y las extra a 50€/hora. Su jornada laboral es de 40h/semana, si supera esas horas son extra.
 * Se aplicará una reducción de un 15% de IRPF y un 4,70% de seguridad social
 * 
 * El trabajador introduce las horas trabajadas
 * Se muestra el IRPF y la cuota de la SS y el salario final.
 * 
 * @author David Martin
 */
import java.util.Scanner;

public class Ejercicio08 {
    public static double dinero (double num1){
        double comparacion = (num1<=40)? (num1 * 23.25) : (( (num1 - 40)*50) + (40*23.25));
        double descuento = comparacion * (19.7/100);
        comparacion = comparacion - descuento;
        return comparacion;
    }
    
    public static void main(String[] args){
    double horas;
    Scanner teclado = new Scanner(System.in);
    System.out.print("Escribe las horas que has trabajado esta semana: ");
    horas = teclado.nextDouble();
    System.out.printf("El salario por semana es: %2.f",horas);
    }
}
