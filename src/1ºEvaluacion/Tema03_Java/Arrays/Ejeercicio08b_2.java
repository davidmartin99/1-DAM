package tema2b;

/**
 *
 * @author David
 */
import java.util.Scanner;

public class Ejeercicio08b_2 {
     //Declaramos VARIABLES GLOBALES
    public static final double ORDINARIAS = 23.25;
    public static final double EXTRA = 50;
    public static final double IRPF = 0.15;
    public static final double SS = 0.047;
    
    public static double calcularSalarioBruto(double horas){
        //Comparamos si las horas son mas de 40 se hace (1) y si son mas (2)
        double salarioBruto = (horas<=40)? (horas*ORDINARIAS) : (( (horas-40)*EXTRA) + (40*ORDINARIAS));
        return salarioBruto;
    }
    
    public static double calcularIRPF(double salarioBruto){
        double retencionIRPF = salarioBruto * IRPF;
        return retencionIRPF;
    }
    
    public static double calcularSS(double salarioBruto){
        double retencionSS = salarioBruto * SS;
        return retencionSS;
    }
    
    public static double calcularSalarioNeto(double salarioBruto, double irpf, double ss){
        double salarioNeto = salarioBruto - (irpf + ss);
        return salarioNeto;
    }
    
    ///////////////////////////////////////////////////////////////////
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        
        //Declaramos el array
        double[] arraySemana = new double[4];
        double salarioTotalDelMes = 0.0;

        for (int i=0; i<4; i++){ //i empieza en 0, mientras i sea menor que 4 hacer con paso 1.
            System.out.print("Escribe las horas que has trabajado en la semana "+(i+1) + ": "); //trabajdo en la semana (1 o 2o 3o 4) 
            double horas = teclado.nextDouble();
            
            //Calculamos las funciones
            double salarioBruto = calcularSalarioBruto(horas);
            double irpf = calcularIRPF(salarioBruto);
            double ss = calcularSS(salarioBruto);
            double salarioNeto = calcularSalarioNeto(salarioBruto, irpf, ss);
            
            //Imprimir valores
            System.out.printf("Semana %d, Salario Bruto: %.2f \n",i+1,salarioBruto); //le decimos con i+1 semana 1, luego semana 2, etc
            System.out.printf("IRPF: %.2f\n", irpf);
            System.out.printf("Seguridad social %.2f\n",ss);
            System.out.printf("Por %.2f horas, tu salario neto es: %.2f\n\n", horas, salarioNeto);
            
           
            arraySemana[i] = salarioNeto;
            salarioTotalDelMes += salarioNeto;
        }
        System.out.println("Resumen del mes (4 semanas): ");
        
        for(int i=0; i<4; i++){
            System.out.printf("Salario de la semana %d: %.2f\n", i+1, arraySemana[i]);
        }
        System.out.printf("\nSalario total del mes: %.2f\n",salarioTotalDelMes);
    }
}
