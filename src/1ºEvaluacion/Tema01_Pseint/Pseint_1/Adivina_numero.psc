Proceso Adivina_numero
	
	Definir num, numSecreto Como Entero;
	
	Escribir "Adivina el numero del 1 al 100.";
	numSecreto<-Aleatorio (1, 49);
	
	Repetir
		Escribir "Introduce el numero";
		Leer num; 
		Si num <> numSecreto Entonces
			Si num > numSecreto Entonces
				Escribir "El numero es menor";
			SiNo
				Escribir "El numero es mayor";
			Fin Si
		SiNo
			Si num = numSecreto Entonces
				Escribir "HAS ADIVINADO";
			FinSi
		Fin Si
	Hasta Que num = numSecreto;
	
	
	
FinProceso
