Algoritmo Media_numeros
	
	Definir num, suma, contador, media Como Real;
	
	Escribir "Introduzca los n�meros, para calcular la media introduzca 0";
	
	suma<-0;
	contador<-0;
	
	Repetir
		Leer num;
		Si num <> 0 Entonces
			suma<- suma+num;
			contador<- contador+1;
		Fin Si
	Hasta Que num=0
	
	Si contador > 0 Entonces
		media<- suma/contador;
		Escribir "La media aritm�tica es: " media;
	Sino 
		Escribir "Introduzca n�meros";
	FinSi
	
FinAlgoritmo
