Algoritmo SumaNumeros_Desde_Hasta
	
	Definir num1 Como Entero;
	Definir num2 Como Entero;
	Definir suma Como Entero;
	
	Escribir sin saltar "Sumar desde...";
	Leer num1;
	Escribir sin saltar "Hasta...";
	Leer num2;
	
	suma<-0;
	
	Si num1<=num2 Entonces
		Repetir
			suma<- suma+num1;
			num1<- num1+1;
		Hasta Que num1>num2
		Escribir sin saltar "La suma de los numeros desde " num1 " hasta " num2 " es igual a: " suma;
	SiNo
		Repetir
			suma<- suma+num2;
			num2<- num2+1;
		Hasta Que num2>num1
		Escribir sin saltar "La suma de los numeros desde " num2 " hasta " num1 " es igual a: " suma;
	Fin Si
	
	
	
FinAlgoritmo
