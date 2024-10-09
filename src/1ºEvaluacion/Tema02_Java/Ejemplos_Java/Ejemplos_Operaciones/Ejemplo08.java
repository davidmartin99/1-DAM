/**
* Operadores lógicos
*/
public class Ejemplo08{
	public static void main(String[] args){
		System.out.println("Operadores lógicos");
		System.out.println("Negacion:\n ! false es : "+(! false)); //! se usa para decir q false es true y viceversa
		System.out.println("! true es : "+(!true));
		
		System.out.println("OPERADOR AND(&):\n");
		System.out.println("false & false es: "+(false&false));
		System.out.println("false & true es: "+(false&true));
		System.out.println("true & false es: "+(true&false));
		System.out.println("true & true es: "+(true&true)); //solo da true cuando los dos son true
		
		System.out.println("\nOPERADOR OR(|):");
		System.out.println("false | false es: "+(false|false)); //solo da false cuando los dos son false
		System.out.println("false | true es: "+(false|true));
		System.out.println("true | false es: "+(true|false));
		System.out.println("true | true es: "+(true|true));
		
		System.out.println("\nOPERADOR OR EXCLUSIVO(^)");
		System.out.println("false ^ false es: "+(false^false)); //cuando los dos son iguales (true^true o false^false) da false
		System.out.println("false ^ true es: "+(false^true));
		System.out.println("true ^ false es: "+(true^false));
		System.out.println("true ^ true es: "+(true^true));
		
		//SI SON DOBLES (&&) O (||) SON MÁS RÁPIDOS
		System.out.println("\nOPERADOR AND(&&):");
		System.out.println("false && false es: "+(false&&false));
		System.out.println("false && true es: "+(false&&true));
		System.out.println("true && false es: "+(true&&false));
		System.out.println("true && true es: "+(true&&true));
		
		System.out.println("\nOPERADOR OR (||):");
		System.out.println("false || false es: "+(false||false)); 
		System.out.println("false || true es: "+(false||true));
		System.out.println("true || false es: "+(true||false));
		System.out.println("true || true es: "+(true||true));
	
	}
}