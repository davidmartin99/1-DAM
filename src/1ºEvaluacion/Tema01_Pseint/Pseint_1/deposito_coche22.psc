Algoritmo deposito_coche2
	
	Definir Combustible Como Caracter
	Definir Litros Como Real
	Definir PrecioTotal Como Real
	
	Escribir "Cantidad de litros que desea "
	Leer Litros
	
	Escribir "Seleccione una: Diesel o Super95" 
	Leer Combustible
	
	Si Combustible = "Diesel" Entonces
		PrecioLitro<-1.717
		
	FinSi
	
    Si Combustible = "Super95" Entonces
		PrecioLitro<-1.783 
		
	FinSi
	
	PrecioTotal<- PrecioLitro*Litros
	
	Escribir "El precio total es de " PrecioTotal " euros "
	
FinAlgoritmo
