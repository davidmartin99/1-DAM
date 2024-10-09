package tema2;
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

public class Ejercicio08b {
    //Declaramos VARIABLES GLOBALES
    public static final double ORDINARIAS = 23.25;
    public static final double EXTRA = 50;
    public static final double IRPF = 0.15;
    public static final double SS = 0.047;
    
    public static double salario(double horas){
        //Comparamos si las horas son mas de 40 se hace (1) y si son mas (2)
        double salarioNeto = (horas<=40)? (horas*ORDINARIAS) : (( (horas-40)*EXTRA) + (40*ORDINARIAS));
        return salarioNeto;
    }
    
    public static void main(String[] args){
        double horas;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe las horas que has trabajado esta semana: \n");
        horas = teclado.nextDouble();
        
        double salarioNeto = salario(horas);
        System.out.printf("El salario neto es: %.2f\n",salarioNeto);
        
        double retencion1 = salarioNeto * IRPF;
        System.out.printf("la cuota del IRPF es: %.2f\n",retencion1);
        
        double retencion2 = salarioNeto * SS;
        System.out.printf("La couta de la Seguridad Social es: %.2f\n",retencion2);
        
        double salarioFinal = salarioNeto - (retencion1+retencion2);
        System.out.printf("El salario total es: %.2f\n",salarioFinal);
        
        //declaramos el array
        double [] semana = new double [4];
        System.out.print("Escribe el salario de cada semana del mes: \n");
        semana[0] = teclado.nextDouble();
        semana[1] = teclado.nextDouble();
        semana[2] = teclado.nextDouble();
        semana[3] = teclado.nextDouble();
        
        System.out.println("El salario de la semana 1 es: "+semana[0]);
        System.out.println("El salario de la semana 2 es: "+semana[1]);
        System.out.println("El salario de la semana 3 es: "+semana[2]);
        System.out.println("El salario de la semana 4 es: "+semana[3]);

    }
}

