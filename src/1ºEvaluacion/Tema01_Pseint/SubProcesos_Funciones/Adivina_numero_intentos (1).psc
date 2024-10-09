Proceso Adivina_numero
	Definir respuesta Como Caracter;
	
	Presentacion;
	Repetir
		juego;
		Escribir " ";
		Escribir "¿Desea volver a jugar?: S/N";
		Leer respuesta;
	Hasta Que respuesta ="n" o respuesta="N";
	
FinProceso

SubProceso Presentacion
	Escribir "Creado por:  David";
	Escribir FechaActual();
	Escribir "Versión 1.0";
	Escribir "ESTE ES EL JUEGO DE ADIVINA EL NUMERO";
FinSubProceso

Funcion juego
	Definir num, contador, NumSecreto Como Entero;
	numSecreto<-Aleatorio (0, 10);
	contador<-3;
	Repetir
		Escribir "Introduce el numero";
		Leer num; 
		contador<-contador-1;
		Si num <> numSecreto Entonces
			Si num > numSecreto Entonces
				Escribir "El numero es menor";
			SiNo
				Escribir "El numero es mayor";
			Fin Si
			Escribir "Te quedan: ", contador, " intentos";
		SiNo
			Si num = numSecreto Entonces
				Escribir "HAS ADIVINADO";
			FinSi
		Fin Si
	Hasta Que contador=0 o num=numSecreto;
	Si contador=0 y num<>numSecreto Entonces
		Escribir "Has perdido";
		Escribir "El numero secreto era: ", numSecreto;
	FinSi
FinFuncion
	