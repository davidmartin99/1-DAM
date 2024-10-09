Proceso Dibujar_Figuras
	Definir altura, ancho, i, j, margen Como Real;
	
	Escribir "Introduzca la altura";
	Leer altura;
	Escribir "Introduzca el ancho";
	Leer ancho;
	
	margen<- (80 - ancho) / 2;
	
	Para j<-1 Hasta margen Con Paso 1 Hacer
		Para i<-1 Hasta altura Con Paso 1 Hacer
			Escribir Sin Saltar " ";
		FinPara
		
		Para i<-1 Hasta ancho Con Paso 1 Hacer
			Escribir Sin Saltar "*";
		FinPara
		
		Escribir " ";
	FinPara
	
FinProceso
