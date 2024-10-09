Proceso Media_Pulsando_p
	Definir val1 Como Caracter;
	Definir val2 Como Entero;
	Definir resultado Como Entero;
	Definir contador Como Entero;
	
	resultado<-0;
	contador<-0;
	
	Escribir "Introduce los numeros y pulse p para calcular";
	
	Repetir
		Leer val1;
		Si val1<>"p" Entonces
			val2<- ConvertirANumero(val1); //El val2 es igual a val1 convertido a numero
			resultado<-resultado+val2;
			contador<-contador+1;
		Fin Si
	Hasta Que val1="p";
	
	Escribir "La media es: ", resultado/contador;
	
FinProceso
