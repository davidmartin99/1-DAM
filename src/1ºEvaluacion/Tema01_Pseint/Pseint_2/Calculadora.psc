Proceso Calculadora
	Definir respuesta Como Entero;
	
	Escribir "Seleccione una opción";
	Escribir "1- Sumar";
	Escribir "2- Restar";
	Escribir "3- Multiplicar";
	Escribir "4- Dividir";
	Escribir "5- Cuadrado";
	Escribir "6- Raiz Cuadrada";
	Escribir "7- Cambio de moneda";
	
	Leer respuesta;
	
	Segun respuesta Hacer
		1:
			Definir num Como Real;
			Definir sum Como Real;
			Definir val1 Como Caracter;
			Escribir "Introduzca los numeros";
			Escribir "Pulse p para mostrar resultados";
			sum=0;
			Repetir
				Leer val1;
				Si val1<>"p" Entonces
					num<- ConvertirANumero (val1);
					sum= num+sum;
				Fin Si
			Hasta Que val1="p";
			Escribir "La suma es: " sum;
			
		2:	
			Definir num Como Real;
			Definir rest Como Real;
			Definir val1 Como Caracter;
			Escribir "Introduzca los numeros";
			Escribir "Pulse p para mostrar resultados";
			rest=0;
			Repetir
				Leer val1;
				Si val1<>"p" Entonces
					num<- ConvertirANumero (val1);
					rest= num-rest;
				Fin Si
			Hasta Que val1="p";
			Si rest>=0 Entonces
				Escribir "La resta es: " rest;
			SiNo
				Escribir "La esta es: -" rest;
			Fin Si
			
		
	Fin Segun
	
FinProceso
