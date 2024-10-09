Algoritmo Calculadora_Funciones
	menu;
	Leer respuesta
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
			Escribir "Error, opcion no valida";
	Fin Segun
	
FinAlgoritmo

Subproceso menu
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

Función sumar
    Definir num1, num2 Como Real;
    Escribir "Introduzca los numeros";
    Leer num1;
	Leer num2;
	Escribir "La suma de los dos numeros es: ", num1+num2;
FinFuncion

Funcion restar
	Definir num1, num2 Como Real;
    Escribir "Introduzca los numeros";
    Leer num1;
	Leer num2;
	Escribir "La resta de los dos numeros es: ", num1-num2;
FinFuncion

Función multiplicar
	Definir num1, num2 Como Real;
    Escribir "Introduzca los numeros";
	Leer num1;
    Leer num2;
    Escribir "La multiplicacion de los dos numeros es: ", num1*num2;
FinFuncion

Función dividir
    Definir num1, num2 Como Real;
	Escribir "Introduzca los numeros";
    Leer num1;
    Leer num2;
    Escribir "La división de los dos numeros es: ", num1/num2;
FinFuncion

Funcion cuadrado
	Definir num Como Real;
	Escribir "Introduzca el numero";
	Leer num;
	Escribir "El cuadrado es; ", num*num;
FinFuncion

Funcion raizcuadrada
	Definir num, resultado Como Real;
	Escribir "Introduzca el numero";
	Leer num;
	Escribir "La raiz cuadrada es: ", raiz(num);
FinFuncion

Funcion cambiomoneda
	Definir Dinero Como Entero;
	Definir Cantidad Como Real;
	Definir CambioFinal Como Real;
	Escribir "Introduzca el tipo de moneda que desea: Euros o Pesetas";
	Escribir "1 Euros a Pesetas";
	Escribir "2 Pesetas a Euros";
	Leer Dinero;
	Escribir "Introduzca la cantidad que va a cambiar";
	Leer Cantidad;
	Segun Dinero Hacer
		1:
			CambioFinal<- Cantidad*166.386;
			Escribir "Por " Cantidad " Euros, le corresponden ", CambioFinal " Pesetas";
		2:
			CambioFinal<- Cantidad*0.006; 
			Escribir "Por " Cantidad " Pesetas, le corresponden ", CambioFinal " Euros";
		De Otro Modo:
			Escribir "Lo sentimos, no disponemos de ese tipo de cambio";
	Fin Segun
FinFuncion

Funcion salir
	Escribir "----Exit----"
FinFuncion
	