Algoritmo Calculadora_2
	Definir respuesta Como Entero;
	
	Repetir
		menu;
		Leer respuesta;
		Segun respuesta Hacer
			1:
				sumar;
			2:
				restar;
			3:
				multiplicar;
			4:
				dividir;
			5:
				cuadrado;
			6:
				raizcuadrada;
			7:
				cambiomoneda;
			8:
				salir;
				
			De Otro Modo:
				Escribir "Opción no válida";
		FinSegun
		
	Hasta Que respuesta=8;
	
FinAlgoritmo

SubProceso menu
	Escribir " ";
	Escribir "Introduzca que operación desea realizar";
	Escribir "1- Sumar";
	Escribir "2- Restar";
	Escribir "3- Multiplicar";
	Escribir "4- Dividir";
	Escribir "5- Cuadrado"; 
	Escribir "6- Raiz cuadrada";
	Escribir "7- Cambio moneda";
	Escribir "8- Salir";
FinSubProceso


SubProceso sumar
	Definir num1, num2, resultado Como Real;
    Escribir "Introduzca los numeros";
    Leer num1;
	Leer num2;
	resultado<- num1+num2;
	Escribir "La suma de los dos numeros es: ", resultado;
FinSubProceso

SubProceso restar
	Definir num1, num2, resultado Como Real;
    Escribir "Introduzca los numeros";
    Leer num1;
	Leer num2;
	resultado<- num1-num2;
	Escribir "La resta de los dos numeros es: ", resultado;
FinSubProceso

SubProceso multiplicar
	Definir num1, num2, resultado Como Real;
    Escribir "Introduzca los numeros";
    Leer num1;
	Leer num2;
	resultado<- num1*num2;
	Escribir "La multiplicación de los dos numeros es: ", resultado;
FinSubProceso

SubProceso dividir
	Definir num1, num2, resultado Como Real;
    Escribir "Introduzca los numeros";
    Leer num1;
	Leer num2;
	resultado<- num1/num2;
	Escribir "La división de los dos numeros es: ", resultado;
FinSubProceso

SubProceso cuadrado
	Definir num Como Real;
	Escribir "Introduzca el numero";
	Leer num;
	Escribir "El cuadrado es; ", num*num;
FinSubProceso 

SubProceso raizcuadrada
	Definir num, resultado Como Real;
	Escribir "Introduzca el numero";
	Leer num;
	Si num>=1 Entonces
		Escribir "La raiz cuadrada es: ", raiz(num);
	Sino 
		Escribir "ERROR, inserte numeros positivos";
	FinSi
FinSubProceso

SubProceso cambiomoneda
	Definir Dinero Como Entero;
	Escribir "Introduzca el tipo de moneda que desea: Euros o Pesetas";
	Escribir "1 Euros a Pesetas";
	Escribir "2 Pesetas a Euros";
	Leer Dinero;
	Segun Dinero Hacer
		1:
			EurosPesetas;
		2:
			PesetasEuros;
		De Otro Modo:
			Escribir "Lo sentimos, no disponemos de ese tipo de cambio";
	Fin Segun
FinSubProceso

SubProceso EurosPesetas
	Definir Cantidad Como Real;
	Definir CambioFinal Como Real;
	Escribir "Introduzca la cantidad de Euros";
	Leer Cantidad;
	CambioFinal<- Cantidad*166.386;
	Escribir "Por ", Cantidad," Euros, le corresponden ", CambioFinal, " Pesetas";
FinSubProceso

SubProceso PesetasEuros
	Definir Cantidad Como Real;
	Definir CambioFinal Como Real;
	Escribir "Introduzca la cantidad de Pesetas";
	Leer Cantidad;
	CambioFinal<- Cantidad*0.006; 
	Escribir "Por ", Cantidad, " Pesetas, le corresponden ", CambioFinal, " Euros";
FinSubProceso

SubProceso salir
	Escribir "EXIT";
FinSubProceso
	