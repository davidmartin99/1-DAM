/*Tipos enumerados de java*/
/** @author David Martin*/

public class Ejemplo04{
	public enum Dias{Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};
	
	public static void main(String[] args){
		//codigo de la aplicacion
	Dias diaActual = Dias.Lunes;
	Dias diaSiguiente = Dias.Martes;
	
	System.out.println("Hoy es:" +diaActual);
	System.out.println("Mañana sera:"+diaSiguiente);
	}
}