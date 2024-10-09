Algoritmo RangoEdades
	
	Definir edad Como Entero

	Repetir
		Escribir "Introduzca su edad"
		Escribir "Para salir pulse -1"
		Leer edad
		
		Si edad<-1 Entonces
			Escribir "Error"
		SiNo
			Si edad>=0 y edad<=3 Entonces
				Escribir "Eres un bebé"
			SiNo
				Si edad>=4 y edad<=17 Entonces
					Escribir "Eres un jóven"
				SiNo
					Si edad>=18 y edad<=65 Entonces
						Escribir "Eres un adulto"
					SiNo
						Si edad>65 Entonces
							Escribir "Eres un pensionista"
						SiNo
							Escribir "Error"
						Fin Si
					Fin Si
				Fin Si
			Fin Si
		Fin Si
	Hasta Que edad= -1
	
FinAlgoritmo
