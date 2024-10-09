Algoritmo deposito_coche1
	Definir TipoDeCombustible Como Caracter
	Definir Litros Como Real
	Definir PrecioTotal Como Real
	
	Escribir "Cantidad de litros que desea "
	Leer Litros
	
	Escribir "Seleccione una: Diesel o Super95" 
	Leer TipoDeCombustible
	
	Si TipoDeCombustible = "Diesel" Entonces
		PrecioLitro<-1.717
		
		Sino 
			Si TipoDeCombustible = "Super95" Entonces
				PrecioLitro<-1.783 
			Sino 
				Escribir "No disponemos de ese combustible"
		
		FinSi
	FinSi
	
	PrecioTotal<- PrecioLitro*Litros
	
	Escribir "El precio total es de " PrecioTotal " euros "
	
FinAlgoritmo
