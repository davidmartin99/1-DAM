/*
* Operadores de Asignacion
*/

public class Ejemplo07{
	public static void main(String[] args){
		int x,y;
		x = 5; //Operador de asignacion
		y = 3;
		//Operadores de asignacion
		System.out.printf("El valor de x es %d y el valor de y es %d ",x,y);
		
		//Operadores de asignacion combinados
		System.out.printf("\nEl valor de %d += %d es. ",x,y);
		x += y; //Equivale a x=x+y
		System.out.print(x);
		
		System.out.printf("\nEl valor de %d -= %d es: ",x,y);
		x -= y; //Equivale a x=x-y
		System.out.print(x);
		
		System.out.printf("\nEl valor de %d *= %d es: ",x,y);
		x *= y; //Equivale a x=x*y
		System.out.print(x);
		
		System.out.printf("\nEl valor de %d /= %d es: ",x,y);
		x /= y; //Equivale a x=x/y
		System.out.print(x);
		
		System.out.print("\nEl resto del resto de "+x+" %= "+y+" es igual a: "); //No se puede con printf porq % es para asignar valor 
		x %= y;
		System.out.print(x);
	}
}