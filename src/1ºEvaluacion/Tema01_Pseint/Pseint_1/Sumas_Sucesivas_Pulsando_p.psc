Algoritmo sumassuccesivas
	Definir num1, suma Como Real;
	Definir num2 Como Caracter;
	
	Escribir "Introduzca numeros";
	Escribir "Para calcular la suma total pulse p";
	
	suma<-0
	
	Repetir
		Leer num2;
		Si num2<>"p" Entonces
			num1<-ConvertirANumero(num2);
			suma<- suma+num1;
		FinSi
	Hasta Que num2="p"

	Escribir "La suma total es: ", suma;
	
FinAlgoritmo
