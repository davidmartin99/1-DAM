/* Operadores aritmeticos
* @author David Martin
*/

public class Ejemplo06{
	
	public static void main(String[] args){
		short x = 7;
		int y = 5;
		float f1 = 13.5f;
		float f2 = 8f;
		
		System.out.println("El resultado de sumar x+y es: "+(x+y));
		System.out.println("El resultado de restar y-x es: "+(y-x));
		System.out.printf("%s \n%s%s\n","Division entera:","x/y=",(x/y)); //División entera la primera %s hace referecia a Division entera, la segunda a x/y= y la ultima a (x/y)
		System.out.println("Resto division x % y= "+(x%y));
		
		//Operaciones decimales 
		System.out.println("El resultado de sumar f1+f2 es: "+(f1+f2));
		System.out.println("El resultado de restar f1-f2 es: "+(f1-f2));
		System.out.printf("%s \n%s%s\n","Division entera:","f1/f2=",(f1/f2));
		System.out.println("Resto division f1 % f2= "+(f1%f2));
		
	}
}