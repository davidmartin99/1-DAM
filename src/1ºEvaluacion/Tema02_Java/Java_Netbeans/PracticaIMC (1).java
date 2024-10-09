package tema02tareas;
/**
 *Programa donde el usuario introduce:
 * nombre y apellidos, 
 * el peso(Kg) y la altura(m),
 * calcula el IMC (IMC= Kg / (m)^2),
 * y nos muestra si es un peso saludable o no.
 * @author David Martin Pulgar
 * Version 1.0
 */

//Importamos el Scanner para que el usuario introduzca datos
import java.util.Scanner;

public class PracticaIMC {
    
    //Un proceso de presentación del programa.
    public static void Presentacion(){
        System.out.println(""" 
                           ****************************************
                             Programa: Calculadora de IMC.
                             Author: David Martin Pulgar
                             Version 1.0
                           ****************************************
                           """);
    }
    
    //Creamos una función para calcular el IMC (Las funciones empiezan en mayúscula)
    public static double CalcularIMC(double peso, double altura){
        double imc = peso / Math.pow(altura, 2);  //Math.pow para calcular la potencia 
        return imc;
    }
    
    //Una función para ver si el usuario tiene un peso saludable o no
    public static String Saludable(double resultadoIMC){
        String cadena = (resultadoIMC<18.5) || (resultadoIMC>24.9)? "no saludable" : "saludable";
        return cadena;
    }
                
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //Definimos las variables
        String nombre;
        double peso, altura;
        
        Presentacion(); //LLamamos al proceso de presentación
        //El usuario introduce los datos
        System.out.println("""
                           BIENVENIDO. Porfavor introduzca sus datos.
                           Nombre y Apellidos: """);
        nombre = teclado.nextLine();
        System.out.println("\nPeso en Kg: ");
        peso = teclado.nextDouble();
        System.out.println("\nAltura en metros: ");
        altura = teclado.nextDouble();
        
        //Llamamos a la funcion CalcularIMC y mostrarmos el resultado
        double resultadoIMC = CalcularIMC (peso, altura);
        System.out.printf("\n%s ,su IMC es de: %.2f\n",nombre,resultadoIMC);
        
        //Llamamos a la función Saludable 
        String pesoSalud = Saludable (resultadoIMC);
        System.out.printf("Por lo tanto se encuentra dentro de un peso %s\n",pesoSalud);
    }
}
