package AlgoritmosOrdenamiento;

/**
 * Ordenar un Array Descendiente
 *
 * @author David
 */
public class MetodoBurbuja_ArrayDescendiente {

    //Funcion Array, con bubblesort
    //Devuelve numbers, que es el array ordenado
    public static int[] bubblesortDescendiente(int[] numbers) {
        //Variable que me diga si esta ordenado o no
        boolean swapped = true;
        //Recorremos con la longitud de numbers -1 para q no de error y voy restando hasta 0
        for (int i = numbers.length - 1; i > 0 && swapped; i--) {
            swapped = false;
            int temp;
            for (int j = 0; j < i; j++) {
                //Si j es menor que j+1, se intercambian
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }//fin if
            }//Fin 2º for
        }//Fin 1º for
        //Devuelve el array ordenado
        return numbers;
    }//Fin Funcion de array

    static void imprimirArrayUni(int a[], int length) {
        System.out.print("El resultado del array es:[");
        for (int i = 0; i < length; i++) {
            System.out.print(a[i]);
            //Si i menor que la longitud-1 imprimir coma
            if (i < length - 1) {
                System.out.print(", ");
            }//Fin if
        }//Fin 1º for
        System.out.print("]");
    }//Fin Procedimiento de imprimir el array

    public static void main(String[] args) {
        int[] array = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};
        int longitud = array.length;
        //Llamar a la funcion
        bubblesortDescendiente(array);

        //Imprimir el array ordenado
        imprimirArrayUni(array, longitud);
    }//Fin main
}//fin class

