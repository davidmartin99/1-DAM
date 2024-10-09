/*
* CASTING DE DATOS= correcion de datos
*/

public class Ejemplo11{
	public static void main(String[] args){
		int a = 10;
		int b = 3;
		float resultado;
		
		//Realizar una division para obtener el resultado
		resultado = a/b;
		System.out.println("El resultado sin casting es: "+resultado);
		
		resultado = (float) a/b;  //Para que sea con casting se le pone el (float) o la variable que sea
		System.out.println("El resultado con casting es: "+resultado);
		
		System.out.println("El resultado con casting y double es: "+(double)a/b);
		
	}
}