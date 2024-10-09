Algoritmo CalcularArea
	
	Definir respuesta Como Caracter
	Definir resultado Como Real
	Definir medida Como Real
	Definir alto Como Real
	Definir ancho Como Real 
	Definir radio Como Real
	
	Escribir "Seleccione si va a calcular el área de: Cuadrado, Rectangulo o Circulo"
	Leer respuesta 
	
	Segun respuesta Hacer
		"Cuadrado":
			Escribir "Introduzca la medida del lado"
			Leer medida
			resultado<-medida*medida
			Escribir "El area del cuadrado es: " resultado
			
		"Rectangulo":
			Escribir "Introduzca la medida del alto"
			Leer alto
			Escribir "Introduzca el ancho"
			Leer ancho
			resultado<- ancho*alto
			Escribir "El area del rectangulo es: " resultado 
			
		"Circulo":
			Escribir "Introduzca el radio"
			Leer radio
			resultado<- 3.1416*radio^2 
			Escribir "El area del ciruclo es: " resultado
		De Otro Modo:
			Escribir "Error"
	Fin Segun
FinAlgoritmo
