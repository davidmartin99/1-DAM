Algoritmo TablaMultiplicar_Para
	Definir num Como Entero
	Definir multiplicador Como Entero
	Definir resultado Como Entero
	
	Escribir "Introduzca el número para calcular la tabla de multiplicar"
	Leer num
	
	Para multiplicador<-1 Hasta 10 Con Paso 1 Hacer
		resultado= num* multiplicador 
		Escribir num " x " multiplicador " = " resultado
	Fin Para
	
FinAlgoritmo
