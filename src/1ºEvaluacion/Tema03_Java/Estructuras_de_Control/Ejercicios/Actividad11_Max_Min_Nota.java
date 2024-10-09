package ActividadesTema03;

/**
 * Realizar un programa que visualice en pantalla la nota la nota más alta y las
 * más baja de un conjunto de 25 alumnos. La más alta puede ser un 10 y la más
 * baja un 1.
 *
 * Nota 1: Para una mayor rapidez, las notas se introducen automáticamente sin
 * ser solicitadas por el usuario.
 *
 * Nota 2: Para hacer este ejercicio será interesante disponer de una estructura
 * de almacenamiento de tipo array que contenga las notas. Ver Anexo I del
 * tema2: Introducción a los arrays.
 *
 * @author David Martin
 */
public class Actividad11_Max_Min_Nota {

    public static void main(String[] args) {
        //declarar e inicializar los arrays
        double[] arrayNotas = new double[25];

        //Sacar las notas aleatorias
        for (int i = 0; i < arrayNotas.length; i++) {
            //Le digo math.random () *9 +1 porque quiero que la nota este entre 1 y 10
            arrayNotas[i] = (double) (Math.random() * 9)+1; 
            System.out.printf("%.2f\n", arrayNotas[i]);
        }

        //Calculamos la maxima nota
        double maxNota = arrayNotas[0];
        for (int i = 0; i < arrayNotas.length; i++) {
            if (arrayNotas[i] > maxNota) {
                maxNota = arrayNotas[i];
            }//Fin if
        }//Fin for
        System.out.printf("La mayor nota es: %.2f\n", maxNota);

        //Calculamos la minima nota
        double minNota = arrayNotas[0];
        for (int i = 1; i < arrayNotas.length; i++) {
            if (arrayNotas[i] < minNota) {
                minNota = arrayNotas[i];
            }//Fin if
        }//Fin for
        System.out.printf("La menor nota es: %.2f\n", minNota);

    }//Fin main

} //Fin class
