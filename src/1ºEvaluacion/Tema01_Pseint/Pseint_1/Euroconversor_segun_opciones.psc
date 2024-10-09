Algoritmo Euroconversor_Segun_opciones
	
	Definir Dinero Como Entero
	Definir Cantidad Como Real
	Definir CambioFinal Como Real
	Definir Respuesta Como Caracter
	
	Escribir "Introduzca el tipo de moneda que desea: Euros o Pesetas"
	Escribir "1 Euros a Pesetas"
	Escribir "2 Pesetas a Euros"
	Leer Dinero
	
	Escribir "Introduzca la cantidad que va a cambiar"
	Leer Cantidad
	
	Segun Dinero Hacer
		"1":
			CambioFinal<- Cantidad*166.386
			Escribir "Por " Cantidad " Euros, le corresponden " CambioFinal " Pesetas"
		"2":
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
