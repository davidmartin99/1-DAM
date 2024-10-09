Proceso Adivina_num_Version_3.0
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
	Escribir "Versión 3.0";
	Escribir "ESTE ES EL JUEGO DE ADIVINA EL NUMERO";
	Escribir "El numero está entre el rango que el usuario quiera";
	Escribir " ";
FinSubProceso

Funcion juego
	//el rango debe estar entre los dos numeros introducidos por el usuario
	Definir num1, num2 Como Entero;
	Escribir "Introduzca entre que rango de numeros desea jugar";
	Leer num1;
	Repetir
		Leer num2;
		Si num2<=num1 Entonces
			Escribir "NO VALIDO";
			Escribir "El segundo numero debe ser mayor que el primero";
		FinSi
	Hasta Que num2>num1;
	//el rango debe estar entre los dos numeros introducidos por el usuario

	Definir num, contador, NumSecreto Como Entero;
	numSecreto<-Aleatorio (num1, num2);
	contador<-3;
	
	Repetir
		Repetir
			Escribir "ADIVINA!:Introduce el numero";
			Leer num; 
			Si num<num1 o num>num2 Entonces
				Escribir "numero no valido, debe ser entre ", num1, " y ", num2;
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
		Hasta Que num>=num1 o num<=num2
	Hasta Que contador=0 o num=numSecreto;
	Si contador=0 y num<>numSecreto Entonces
		Escribir "Has perdido";
		Escribir "El numero secreto era: ", numSecreto;
	FinSi
FinFuncion
	