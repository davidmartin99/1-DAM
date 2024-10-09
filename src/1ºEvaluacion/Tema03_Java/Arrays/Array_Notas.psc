Algoritmo Array_Notas
	Definir variable Como Entero;
	Definir i Como Entero;
    DIMENSION variable[6]; //de 0 a 5 porque es estricto
	
	Definir cadena Como Caracter;
	DIMENSION cadena1[6];
	
	
	
	Para i<-0 Hasta 5 Con Paso 1 Hacer
		Escribir "nombre de asignatura ", i;
		Leer cadena1[i];
		Escribir "Escriba la nota ",i;
		Leer variable[i];
	Fin Para
	
	Para i<-0 Hasta 5 Con Paso 1 Hacer  //Lo introduce el usuario 
		Escribir cadena1[i], " ", variable[i];
	FinPara
	
	
FinAlgoritmo
