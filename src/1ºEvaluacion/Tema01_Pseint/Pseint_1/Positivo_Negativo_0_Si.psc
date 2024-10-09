Algoritmo Positivo_Negativo_0_Si
	Definir num Como Real
	
	Escribir "Introduzca un numero"
	Leer num
	
	Si num<0 Entonces
		Escribir "Negativo"
	SiNo
		Si num>0 Entonces
			Escribir "Positivo"
		SiNo
			Si num=0 Entonces
				Escribir "0"
			SiNo
				Escribir "Error"
			Fin Si
		Fin Si
	Fin Si
	
FinAlgoritmo