Algoritmo bascula
	Definir peso Como Entero
	Definir pesoR Como Real
	Definir codigo Como Caracter
	Definir precioT Como Real
	Definir dineroEntregado Como Real
	Definir dineroDevuelta Como Real
	
	peso <- 500 //medido en g
	pesoR <- 0.5 //medido en kg
	
	Escribir "ESCRIBA EL CÓDIGO"
	Leer codigo 
	precioT <- pesoR*1.80
	
	Escribir "El precio de " codigo " con un peso de " pesoR "kg es " precioT "euros"
	
	Escribir "Introduzca el dinero entregado por el cliente"
	Leer dineroEntregado
	dineroDevuelta <- dineroEntregado - precioT
	Escribir "El dinero entregado es " dineroEntregado
	Escribir "La vuelta es " dineroDevuelta  "Euros"
	
FinAlgoritmo
