Algoritmo Euroconversor_SEGUN1
	
	Definir Dinero Como Caracter
	Definir Cantidad Como Real
	Definir CambioFinal Como Real
	Definir Respuesta Como Caracter
	
	Escribir "Introduzca la cantidad que va a cambiar"
	Leer Cantidad
	
	Escribir "Introduzca el tipo de moneda que desea: Euros o Pesetas"
	Leer Dinero

	Segun Dinero Hacer
		"Euros":
			CambioFinal<- Cantidad*166.386
			Escribir "Por " Cantidad " Euros, le corresponden " CambioFinal " Pesetas"
		"Pesetas":
			CambioFinal<- Cantidad*0.006
			Escribir "Por " Cantidad " Pesetas, le corresponden " CambioFinal " Euros"
		De Otro Modo:
			Escribir "Lo sentimos, no disponemos de ese tipo de cambio" 
	Fin Segun
	
	Escribir "Aceptar o Salir"
	Leer Respuesta 
	Si Respuesta = "Aceptar" Entonces
		Escribir "Introduzca el dinero en la maquina" 
	Sino 
		Si Respuesta= "Salir" Entonces 
			Escribir "Vuelva pronto"
		Sino 
			Escribir "Error"
		FinSi
	FinSi
FinAlgoritmo
