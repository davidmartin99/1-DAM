
package tema2;

import java.util.Scanner;

/**
 * Crear una pequeña aplicación Java que permita calcular el salario semanal de un trabajador.
 * Se tendrá en cuenta que la hora ordinaria se le paga a 23.25€/hora, y que las horas extraordinarias se le pagan a 50€/hora. 
 * Se considera que su jornada laboral normal es de 40 horas/semana, por lo que las horas trabajadas que superen dicha cantidad, 
 * serán consideradas horas extraordinarias.
 * Se le aplicará una reducción de un 15% de IRPF y un 4,70% de seguridad social al salario final.
 * Aclaraciones: 
 * 1- El trabajador introducirá el número de horas trabajadas.
 * 2- Se mostrará el IRPF obtenido, su cuota a la seguridad social y el salario obtenido al finalizar la semana.
 * Nota: En Estados Unidos se cobra por semana.
 * b) Ampliarlo para guardar lo que gana un trabajador durante 4 semanas, en un array.
 * @author Ruper
 */
public class Ejercicio08b {
    public static double calcularSalarioBruto(double num1){
        double salario = (num1 <=40)? (num1*23.25):(((num1-40)*50)+(40*23.25));
        return salario;
    }
    
    public static double calcularIRPF(double salarioBruto){
        return salarioBruto*0.15;
    }
    
    public static double calcularSeguridadSocial(double salarioBruto){
        return salarioBruto*0.047;
    }
    
    public static double calcularSalarioNeto(double salarioBruto, double irpf, double seguridadSocial){
        return salarioBruto - irpf - seguridadSocial;
    }
    
    
    public static void main(String args []){
        Scanner teclado =  new Scanner(System.in);
        
        double[] array = new double[4];
        double salarioTotalDelMes = 0.0;
        
        for (int i = 0; i < 4 ; i++){
            System.out.print("Escribe las horas que has trabajado en la semana " + (i+1) + ": ");
            double horas = teclado.nextDouble();
        
            double salarioBruto = calcularSalarioBruto(horas);
            double irpf = calcularIRPF(salarioBruto);
            double seguridadSocial = calcularSeguridadSocial(salarioBruto);
            double salarioNeto = calcularSalarioNeto(salarioBruto, irpf, seguridadSocial);
            
            array[i] = salarioNeto;
            salarioTotalDelMes += salarioNeto;

            System.out.printf("Semana %d:\n", i+1);
            System.out.printf("IRPF: %.2f€\n", irpf);
            System.out.printf("Seguridad Social: %.2f€\n", seguridadSocial);
            System.out.printf("Al trabajar %.2f horas tu salario es: %.2f€\n\n", horas, salarioNeto);
        }
        System.out.println("Resumen de 4 semanas:");
        for(int i = 0; i < 4; i++){
            System.out.printf("Salario de la semana %d: %.2f€\n", i+1, array[i]);
        }
        System.out.printf("\nSalario total del mes: %.2f€\n", salarioTotalDelMes);
    }
}
