Algoritmo Euroconversor_PesetasEuros
	
	Definir Dinero Como Caracter
	Definir Cantidad Como Real
	Definir CambioFinal Como Real
	Definir Respuesta Como Caracter
	
	Escribir "Introduzca el tipo de moneda que desea: Euros o Pesetas"
	Leer Dinero
	
	Escribir "Introduzca la cantidad que va a cambiar"
	Leer Cantidad
	
	Si Dinero = "Euros" Entonces
		CambioFinal<- Cantidad*166.386
		Escribir "Por " Cantidad " Euros, le corresponden " CambioFinal " pesetas"
		Escribir "Aceptar o Salir"
		Leer Respuesta
		Si Respuesta = "Aceptar" Entonces
			Escribir "Introduzca los Euros en la maquina"
		Sino 
			Si Respuesta = "Salir" Entonces
				Escribir "Gracias"
			Sino
				Escribir "ERROR"
			FinSi
		
		FinSi
	SiNo
		Si Dinero = "Pesetas" Entonces
			CambioFinal<- Cantidad*0.006 
			Escribir "Por " Cantidad " Pesetas, le corresponden " CambioFinal " euros"
			Escribir "Aceptar o Salir"
			Leer Respuesta
			Si Respuesta= "Aceptar" Entonces
				Escribir "Introduzca las Pesetas en la maquina"
			Sino 
				Si Respuesta = "Salir" Entonces
					Escribir "Gracias"
				Sino 
					Escribir "ERROR"
				FinSi
			FinSi
		Sino 
			Escribir "No disponemos de ese tipo de cambio"
		FinSi
	Fin Si
FinAlgoritmo
