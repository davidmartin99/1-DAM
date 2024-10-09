Proceso Adivina_num_Version_3
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
	Escribir "Versión 4.0";
	Escribir "ESTE ES EL JUEGO DE ADIVINA EL NUMERO";
	Escribir "El numero está entre el rango que el usuario quiera";
	Escribir " ";
FinSubProceso

Funcion juego
	//el rango debe estar entre los dos numeros introducidos por el usuario
	Definir num1, num2, nummenor, nummayor Como Entero;
	Escribir "Introduzca entre que rango de numeros desea jugar";
	Repetir
		Leer num1, num2;
		Si num1>num2 Entonces
			nummenor<-num2;
			nummayor<-num1;
		SiNo
			Si num2>num1 Entonces
				nummenor<-num1;
				nummayor<-num2;
			SiNo
				Escribir "Para el rango, los números no pueden ser iguales";
			FinSi
		FinSi
	Hasta Que num1>num2 o num2>num1
	//el rango debe estar entre los dos numeros introducidos por el usuario
	
	//Introducir el numero de intentos que quiera el usuario
	Definir contador Como Entero;
	Escribir "¿Cuántos intentos necesita?";
	Leer contador;
	//Introducir el numero de intentos que quiera el usuario

	Definir num, NumSecreto Como Entero;
	numSecreto<-Aleatorio (nummenor, nummayor);
	
	Repetir
		Repetir
			Escribir "ADIVINA!:Introduce el numero";
			Leer num; 
			Si num<nummenor o num>nummayor Entonces
				Escribir "numero no valido, debe ser entre ", nummenor, " y ", nummayor;
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
		Hasta Que num>=nummenor o num<=nummayor
	Hasta Que contador=0 o num=numSecreto;
	Si contador=0 y num<>numSecreto Entonces
		Escribir "Has perdido";
		Escribir "El numero secreto era: ", numSecreto;
	FinSi
FinFuncion
	