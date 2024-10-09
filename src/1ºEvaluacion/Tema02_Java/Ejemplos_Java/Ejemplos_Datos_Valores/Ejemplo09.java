/**
* Ejemplos relacionales. Clase Scanner
*/
import java.util.Scanner;  

public class Ejemplo09{
	public static void main(String[] args){
    	Scanner teclado = new Scanner(System.in); //se introducen datos x el objeto teclado y mediante System.in
    	int x,y;
    	String cadena;
    	boolean resultado;
    	
    	System.out.print("Introduzca el primer numero: ");
    	x = teclado.nextInt(); //Se asigna a la variable x el valor introducido por el usuario
		
		System.out.print("Introduzca el segundo numero: ");
		y = teclado.nextInt(); //asigna el segundo valor
		
		//REALIZACION DE COMPARACIONES
		cadena=(x==y)?"iguales":"distintos"; //Para comparar si son los numeros iguales X==Y COMPARAR IGUALES 
		System.out.printf("Los numeros %d y %d son: %s \n",x,y,cadena);
		
		//USO VARIABLES BOOLEANAS
		resultado= (x!=y);    //Para comparar si son distintos 
		System.out.println("Es x!=y // es " +resultado);
		
		resultado= (x>y);  //si es mayor
		System.out.println("Es x>y // es "+resultado);
		
		resultado= (x<y);  //si es menor
		System.out.println("Es x<y // es "+resultado);
		
		resultado= (x>=y);  //si es mayor o igual
		System.out.println("Es x>=y // es "+resultado);
		
		
	}
}