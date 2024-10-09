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
	Escribir "Versión 2.0";
	Escribir "ESTE ES EL JUEGO DE ADIVINA EL NUMERO";
	Escribir "El numero está entre el 10 y 20";
FinSubProceso

Funcion juego
	Definir num, contador, NumSecreto Como Entero;
	numSecreto<-Aleatorio (10, 20);
	contador<-3;
	Repetir
		Repetir
			Escribir "Introduce el numero";
			Leer num; 
			Si num<10 o num>20 Entonces
				Escribir "numero no valido, debe ser entre 10 y 20";
			SiNo
				Si num <> numSecreto Entonces
					Si num > numSecreto Entonces
						Escribir "El numero es menor";
					SiNo
						Escribir "El numero es mayor";
					Fin Si
					contador<-contador-1;
					Escribir "Te quedan: ", contador, " intentos";
				SiNo
					Si num = numSecreto Entonces
						Escribir "HAS ADIVINADO";
					FinSi
				Fin Si
			FinSi
		Hasta Que num>=10 o num<=20
	Hasta Que contador=0 o num=numSecreto;
	Si contador=0 y num<>numSecreto Entonces
		Escribir "Has perdido";
		Escribir "El numero secreto era: ", numSecreto;
	FinSi
FinFuncion
	