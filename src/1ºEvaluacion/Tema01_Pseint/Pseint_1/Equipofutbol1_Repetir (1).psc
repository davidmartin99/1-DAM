Algoritmo Equipofutbol1
	
	Definir equipo Como Caracter
	
	Repetir
		Escribir "Escoge un equipo de fútbol: Atletico de Madrid, Real Madrid, Barcelona o Pozuelo"
		Escribir "Para Salir pulse 1"
		Leer equipo
		Borrar Pantalla
		
		Segun equipo Hacer
			"Atletico de Madrid" :
				Escribir "Es el mejor equipo"
			"Real Madrid":
				Escribir "Es el segundo mejor equipo"
			"Barcelona":
				Escribir "Va a segunda"
			"Pozuelo":
				Escribir "Va a primera"
			"1":
				Escribir "Adios"
			De Otro Modo:
				Escribir "Equipo no válido"
		Fin Segun
	Hasta Que equipo= "1"
	
FinAlgoritmo
