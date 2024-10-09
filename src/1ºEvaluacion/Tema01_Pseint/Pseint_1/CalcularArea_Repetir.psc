Algoritmo CalcularArea
	
	Definir respuesta Como Caracter
	Definir resultado Como Real
	Definir medida Como Real
	Definir alto Como Real
	Definir ancho Como Real 
	Definir radio Como Real
	
	Repetir
	
	Escribir "Seleccione si va a calcular el área de: Cuadrado, Rectangulo o Circulo"
	Escribir "1 Cuadrado"
	Escribir "2 Rectangulo"
	Escribir "3 Circulo"
	Escribir "4 Salir"
	Leer respuesta 
	Segun respuesta Hacer
		"1":
			Escribir "Introduzca la medida del lado"
			Leer medida
			resultado<-medida*medida
			Escribir "El area del cuadrado es: " resultado
			
		"2":
			Escribir "Introduzca la medida del alto"
			Leer alto
			Escribir "Introduzca el ancho"
			Leer ancho
			resultado<- ancho*alto
			Escribir "El area del rectangulo es: " resultado 
			
		"3":
			Escribir "Introduzca el radio"
			Leer radio
			resultado<- 3.1416*radio^2 
			Escribir "El area del ciruclo es: " resultado
		"4":
			Borrar Pantalla
	      
		De Otro Modo:
			Escribir "Error"
			
	Fin Segun
	
    Hasta Que respuesta= "4"
	Esperar 10 segundos;
	Borrar Pantalla
    

FinAlgoritmo
