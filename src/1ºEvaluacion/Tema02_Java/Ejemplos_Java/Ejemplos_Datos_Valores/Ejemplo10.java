/**
* Lectura de datos
*/
import java.util.Scanner;

public class Ejemplo10{
	public static void main(String [] args){  //Declarar variables
	    //Objeto teclado y lo guarda en un buffer en la memoria 
		Scanner teclado = new Scanner(System.in);
		
		boolean cierto;
		String frase;
		char letra;
		byte mes;
		int metros2;
		float interes;
		double promedio;
		
		//Entrada datos tipo Boolean
		System.out.print("\nEs cierto? ");
		cierto =teclado.nextBoolean(); //el usuario le asigna un valor a la variables es nextboolean xq son letras
		teclado.nextLine();  //para que el salto de linea no cuente como cadena introducida
		
		
		//Entrada de datos tipo Cadena
		System.out.print("\nIntroduzca la frase: ");
		frase = teclado.nextLine();  //es nextLine xq es una cadena
		
		//Entrada datos tipo Caracter
		System.out.println("\nIntroduzca una letra");
		letra = teclado.next().charAt(0);
		
		//Entrada datos tipo Byte
		System.out.print("\nIntroduzca el mes en numero: ");
		mes = teclado.nextByte();
		
		//Entrada datos tipo Numerico INT
		System.out.print("\nIntroduzca los metros cuadrados: ");
		metros2 = teclado.nextInt();
		
		//Entrada datos tipo decimal Float
		System.out.print("\nIntroduzca el interes(decimal con coma): ");
		interes = teclado.nextFloat();  //los decimales se introduce con coma,
		
		//Entrada datos tipo decimal Double
		System.out.print("\nIntroduzca el promedio(decimal con coma): ");
		promedio = teclado.nextDouble();  //los decimales se introducen con coma,
		
		
		//IMPRIMIR VALORES
		System.out.println("Es cierto? "+cierto); //boolean
		System.out.println("Cadena introducida: "+frase); //cadena
		System.out.println("El caracter introducido es: "+letra); //caracter letra
		System.out.println("El mes introducido es: "+mes); //Byte
		System.out.println("Los metros cuadrados introducidos son: "+metros2);  //Int
		System.out.println("El interes introducido es: "+interes);  //Float
		System.out.println("El promedio introducido es: "+promedio); //Double
		
		
	}
}