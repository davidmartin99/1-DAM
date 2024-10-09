Algoritmo Array
	Definir variable Como Entero;
	DIMENSION variable[6]; //de 0 a 5 porque es estricto
	variable[0]=4;
	variable[1]=5;
	variable[2]=6;
	variable[3]=8;
	variable[4]=9;
	variable[5]=0;
	
	Para i<-0 Hasta 5 Con Paso 1 Hacer
		Escribir variable[i];
	Fin Para
	
	Para i<-0 Hasta 5 Con Paso 1 Hacer  //Lo introduce el usuario 
		Escribir "Introduzca la posicion ",i;
		Leer variable[i];
	FinPara
	
	Escribir variable[0], variable[1], variable[2], variable[3], variable[4], variable[5];
	
FinAlgoritmo
