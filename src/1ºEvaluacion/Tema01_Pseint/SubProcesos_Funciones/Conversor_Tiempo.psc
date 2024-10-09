Proceso Conversor_Tiempo
	Definir opcion Como Entero;
	Repetir
		menu; 
		Leer opcion;
		
		Segun opcion Hacer
			1:
				horas;
			2:
				minutos;
			3:
				segundos;
			4:
				salir;
			De Otro Modo:
				Escribir "Error, seleccione las opciones dadas";
		FinSegun
	Hasta Que opcion=4;
FinProceso


SubProceso menu
	Escribir " ";
	Escribir "Elige la conversión que deseas realizar:";
	Escribir "1. Horas";
	Escribir "2. Minutos";
	Escribir "3. Segundos";
	Escribir "4. Salir";
FinSubProceso

Funcion horas
	Definir hora, min, seg Como Entero;
	Repetir                                //Usamos repetir para que los numeros sean siempre positivos.
		Escribir "Introduce las horas";
		Leer hora;
	Hasta Que hora>=0
	Repetir 
		Escribir "Introduce los minutos";
		Leer min;
	Hasta Que min>=0
	Repetir
		Escribir "Introduce los segundos";
		Leer seg;
	Hasta Que seg>=0

	Definir totalhoras Como Real;
	totalhoras<- (hora)+(min/60)+(seg/3600);
	Escribir "En total son: ", totalhoras, " Horas";
FinFuncion
//---------------------------------------------------------//
Funcion minutos
	Definir hora, min, seg Como Entero;
	Repetir                                
		Escribir "Introduce las horas";
		Leer hora;
	Hasta Que hora>=0
	Repetir 
		Escribir "Introduce los minutos";
		Leer min;
	Hasta Que min>=0
	Repetir
		Escribir "Introduce los segundos";
		Leer seg;
	Hasta Que seg>=0

	Definir totalminutos Como Real;
	totalminutos<- (hora*60)+(min)+(seg/60);
	Escribir "En total son: ", totalminutos, " Minutos";
FinFuncion
//---------------------------------------------------------//
Funcion segundos
	Definir hora, min, seg Como Entero;
	Repetir                                
		Escribir "Introduce las horas";
		Leer hora;
	Hasta Que hora>=0
	Repetir 
		Escribir "Introduce los minutos";
		Leer min;
	Hasta Que min>=0
	Repetir
		Escribir "Introduce los segundos";
		Leer seg;
	Hasta Que seg>=0
	
	Definir totalsegundos Como Real;
	totalsegundos<- (hora*3600)+(min*60)+(seg);
	Escribir "En total son: ", totalsegundos, " Segundos";
FinFuncion
//-------------------------------------------------------------//
SubProceso salir
	Escribir "---EXIT---";
FinSubProceso
	