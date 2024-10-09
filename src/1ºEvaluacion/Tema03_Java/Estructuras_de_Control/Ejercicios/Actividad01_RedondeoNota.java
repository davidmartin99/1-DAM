package ActividadesTema03;
/**
 * Crear un array con los nombres de tres alumnos de clase, y además, se
 * guardarán sus notas del examen de programación. La nota será un valor entre 0
 * y 10 con dos posiciones decimales introducidos por teclado.
 *
 * El programa mostrará las notas de cada alumno redondeadas, y además indicará:
 *
 * Media de clase. Nº de alumnos suspensos Nº de aprobados El alumno con mayor
 * nota Nota 1: si la nota está entre 4 y 4,9 se mostrará un 4. Nota 2:
 * reutiliza o crea funciones y procedimientos previos.
 *
 * @author David Martin
 */
import java.util.Scanner;

public class Actividad01_RedondeoNota {
    //Función de Redondear las Notas

    public static double[] redondearNotas(double[] notasAlumnos) {
        double[] notasRedondeadas = new double[3];
        for (int i = 0; i < notasAlumnos.length; i++) {
            if (notasAlumnos[i] >= 4 && notasAlumnos[i] <5) {
                notasRedondeadas[i] = (double) Math.floor(notasAlumnos[i]);
            } else {
                notasRedondeadas[i] = (double) Math.round(notasAlumnos[i]);
            }//Fin if
        }//Fin for
        return notasRedondeadas;
    }//Fin funcion

    public static double calcularMedia(double[] notasRedondeadas) {
        double mediaNotas = 0;
        double mediaFinal;
        for (int i = 0; i < notasRedondeadas.length; i++) {
            mediaNotas += notasRedondeadas[i];
        }//Fin for
        mediaFinal = mediaNotas / notasRedondeadas.length;
        return mediaFinal;
    }//Fin funcion
    
    public static int contarAprobados ( double[] notasRedondeadas){
        int aprobados = 0;
        for (int i = 0; i<notasRedondeadas.length; i++){
            if(notasRedondeadas[i]>=5){
                aprobados ++;
            }
        }
        return aprobados;
    }//Fin funcion
    
    public static void calcularMaxima (double[]notasRedondeadas, String[] nombresAlumnos){
        double maxNota = 0;
        String alumnoMaxNota = "";
        for (int i=0; i<notasRedondeadas.length; i++){
            if (notasRedondeadas[i] > maxNota) {
                maxNota = notasRedondeadas[i];
                alumnoMaxNota = nombresAlumnos[i];
            }//Fin if
        }//Fin for
        System.out.println("Alumno con mayor nota: "+alumnoMaxNota+" ("+maxNota+") ");
    }//Fin subproceso
    
    
    public static void main(String[] args) {
        //Declarar e inicializar los arrays
        String[] nombresAlumnos = new String[3];
        double[] notasAlumnos = new double[3];

        //Entrada de datos
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Introduce el NOMBRE del alumno: ");
            nombresAlumnos[i] = teclado.nextLine();
            //La nota tiene que estar entre 0-10 asi que hacer pedir nota hasta q nota esta entre 0 y 10
            do{
                System.out.println("Introduce su NOTA:  ");
                notasAlumnos[i] = teclado.nextDouble();
           }while(notasAlumnos[i] <0 || notasAlumnos[i]> 10);
            teclado.nextLine();
        }//Fin for

        //Llamar a las funciones y salida de datos
        double[] notasFinales = redondearNotas(notasAlumnos);
        for (int i = 0; i < notasAlumnos.length; i++) {
            System.out.printf("%s : %.2f\n", nombresAlumnos[i], notasFinales[i]);
        }//fin for
        
        //Llamar a la funcion calcularMedia
        double promedio = calcularMedia(notasFinales);
        System.out.printf("Promedio: %.2f\n", promedio);
        
        //Llamar a la funcion contarAprobados
        int totalAprobados = contarAprobados(notasFinales);
        System.out.printf("Aprobados: %d\n", totalAprobados);
        //calculamos los suspensos restando los aprobados.
        int totalSuspensos = (nombresAlumnos.length - totalAprobados ); 
        System.out.printf("Suspensos: %d\n", totalSuspensos);
        
        //Llamamos al subproceso MaxNota
        calcularMaxima (notasFinales, nombresAlumnos);

        
    }//Fin main

}//Fin class
