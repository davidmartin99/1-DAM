Algoritmo Multiplos_3_Si_Para
	//El usuario no podrá introducir el 0 ni valores negativos 
	//El resultado en una sola linea 
	
	Definir num Como Entero
	Definir multi Como Entero
	
	Escribir "Introduzca cuantos numeros quiere ver que sean multiplos de 3"
	Leer num
	
	Si num>0 Entonces
		Para multi<-1 Hasta num Con Paso 1 Hacer
			Escribir sin saltar  multi*3 " "
		Fin Para
	SiNo
		Escribir "error"
	Fin Si
FinAlgoritmo
