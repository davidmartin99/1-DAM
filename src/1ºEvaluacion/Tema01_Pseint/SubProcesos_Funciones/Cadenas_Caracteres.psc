Algoritmo CadenasCaracteres
	Definir variable1 Como Entero;  //Solo para convertir a numero o texto
	Definir variable2 Como Caracter; //Solo para convertir a numero o texto
	
	Escribir "La longitud es: ", Longitud("En un lugar de la Mancha");
	Escribir "La Subcadena de murcielago es: ", Subcadena("murcielago" 3,6);
	Escribir "El resultado es: ", Concatenar("prueba1 ","prueba2 ");
	Escribir "Mayusculas: ", Mayusculas("juan");
	Escribir "Minusculas: ", Minusculas("SARA");
	
	variable1<-ConvertirANumero("100");
	Escribir "Valor de variable1 es: ", variable1; 
	
	variable2<-Concatenar(ConvertirATexto(190)," unidades");
	Escribir "Valor de variable2 es: ", variable2;
	
	
FinAlgoritmo
