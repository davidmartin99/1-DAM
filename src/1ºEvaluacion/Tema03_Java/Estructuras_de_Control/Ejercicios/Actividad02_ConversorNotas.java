package ActividadesTema03;

/**
 * Crear una aplicación donde el usuario introduce las calificaciones con las
 * letras I,F,B,N,S y las convierte a numeros: I: 4 F: 5 B: 6 N: 8 S: 9
 *
 * Requisitos: no se puede usar la función Scanner para introducir los datos, y
 * en su lugar se usará una excepción. El usuario puede introducir las notas en
 * mayusculas o minusculas.
 *
 * @author David Martin
 */

import java.io.*;

public class Actividad02_ConversorNotas {

    public static void main(String[] args) throws IOException { //throws para excepcion
        //Declaracion de variables
        int nota = 0;
        char calificacion;
        boolean noValida;

        System.out.println("Introduce la calificación (I,F,B,N,S): ");
        calificacion = (char) System.in.read();
        
        //Pasamos el char a MAYUSCULA 
        calificacion = Character.toUpperCase(calificacion);

        switch (calificacion) {
            case 'I':
                nota = 4;
                break;

            case 'F':
                nota = 5;
                break;

            case 'B':
                nota = 6;
                break;

            case 'N':
                nota = 8;
                break;

            case 'S':
                nota = 9;
                break;
        }

        System.out.println("Tu nota es: " + nota);
    }

}
