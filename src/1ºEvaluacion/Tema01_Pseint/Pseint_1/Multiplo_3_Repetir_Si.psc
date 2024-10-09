Algoritmo Multiplo_3_Repetir_Si
	//El usuario no podrá introducir el 0 ni valores negativos 
	//El resultado en una sola linea 
	
	Definir num Como Entero
	Definir multi Como Entero
	
	Escribir "Introduzca cuantos numeros quiere ver que sean multiplos de 3"
	Leer num
	
	multi<-3
	contador<- 0
	
	Repetir
		Escribir sin saltar  multi " "
		multi<- multi+3
		contador<- contador+1
		Si contador >= num Entonces
			
		SiNo
			acciones_por_falso
		Fin Si
	Hasta Que contador > num
	
FinAlgoritmo
