Algoritmo Euroconversor_Segun_opciones
	
	Definir OpcionD Como Entero
	Definir Cantidad Como Real
	Definir CambioFinal Como Real
	Definir Respuesta Como Caracter
	
	Repetir
		
		Escribir "Introduzca el tipo de moneda que desea: Euros o Pesetas"
		Escribir "1 Euros a Pesetas"
		Escribir "2 Pesetas a Euros"
		Escribir "3 Salir"
		Leer OpcionD
		Borrar Pantalla
		Segun OpcionD Hacer
			1:
			Escribir "Introduzca la cantidad que va a cambiar"
			Leer Cantidad
			CambioFinal<- Cantidad*166.386
			Escribir "Por " Cantidad " Euros, le corresponden " CambioFinal " Pesetas"
		2:
			Escribir "Introduzca la cantidad que va a cambiar"
			Leer Cantidad
			CambioFinal<- Cantidad*0.006 
			Escribir "Por " Cantidad " Pesetas, le corresponden " CambioFinal " Euros"
		3:
			Escribir "Adios"
		De Otro Modo:
			Escribir "Lo sentimos, no disponemos de ese tipo de cambio" 
		Fin Segun
	Hasta Que OpcionD= 3

FinAlgoritmo
