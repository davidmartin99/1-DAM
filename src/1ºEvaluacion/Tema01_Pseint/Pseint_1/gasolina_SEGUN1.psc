Algoritmo gasolina_SEGUN1
	Definir Litros Como Real
	Definir Combustible Como Caracter
	Definir PrecioTotal Como Real
	
	Escribir "Introduzca la cantidad de litros que desea"
	Leer Litros
	
	Escribir "Seleccione Diesel o Super95"
	Leer Combustible 
	
	Segun Combustible  Hacer
		"Diesel":
			PrecioTotal<- 1.717*Litros
		"Super95":
			PrecioTotal<-1.783*Litros
		De Otro Modo:
			Escribir "No disponemos de ese combustible"
	Fin Segun
	
	Escribir "Ingrese la cantidad de: " PrecioTotal "Euros."
FinAlgoritmo
