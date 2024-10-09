Algoritmo ValorAbsoluto 
	Definir Num1 Como Real
	Definir resultado Como Real
	Escribir "Introduzca el número"
	Leer Num1
	
	Si Num1 < 0 Entonces
		resultado <- -Num1 
	Sino 
		resultado <- Num1
    Fin Si
	
	Escribir "El valor absoluto de " Num1  " es " resultado
FinAlgoritmo
