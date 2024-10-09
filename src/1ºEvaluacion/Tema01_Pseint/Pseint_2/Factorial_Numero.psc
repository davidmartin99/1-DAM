Proceso Factorial_Numero
	Definir num Como Entero;
	Definir resultado Como Entero;
	
	Escribir "Introduce un numero para calcular el factorial";
	Leer num;
	
	resultado<-1;
	
	Si num>=1 Entonces
		Repetir
			resultado<- num*resultado;
			num<-num-1;
		Hasta Que num<1;
		Escribir "El factorial es: " resultado;
	SiNo
		Si num=0 Entonces
			Escribir "El factorial es: 1";
		SiNo
			Escribir "ERROR";
		Fin Si
	Fin Si
	
FinProceso
