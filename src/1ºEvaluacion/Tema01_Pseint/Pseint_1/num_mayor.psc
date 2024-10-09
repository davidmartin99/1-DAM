Algoritmo num_mayor
	Definir Num1 Como Real
	Definir Num2 Como Real
	Definir Num3 Como Real
	
	Escribir "Introduzca el 1ºnum"
	Leer Num1
	
	Escribir "Introduzca el 2ºnum"
	Leer Num2
	
	Escribir "Introduzca el 3ºnum"
	Leer Num3
	
	Si Num1>Num2 y Num1>Num3 Entonces
		Escribir "El numero mayor es " Num1
	SiNo
		Si Num2>Num3 Entonces
			Escribir "El numero mayor es " Num2
		SiNo
			Escribir "El numero mayor es " Num3
		Fin Si
	Fin Si
	
FinAlgoritmo
