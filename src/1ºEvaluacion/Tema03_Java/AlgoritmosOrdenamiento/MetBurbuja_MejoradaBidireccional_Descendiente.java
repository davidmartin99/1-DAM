package AlgoritmosOrdenamiento;

/**
 * Ordenar un Array Descendiente
 *
 * @author David
 */
public class MetBurbuja_MejoradaBidireccional_Descendiente {

    //Funcion Array, con bubblesort
    //Devuelve numbers, que es el array ordenado
    public static int[] bubblesort(int[] numbers) {
        //Variable que me diga si esta ordenado o no
        boolean swapped = true;
        //Recorremos con la longitud de numbers -1 para q no de error y voy restando hasta 0
        for (int i = numbers.length - 1; i > 0 && swapped; i--) {
            swapped = false;
            int temp;
            for (int j = 0; j < i; j++) {
                //Si j es menor que j+1, se intercambian
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j+1];
                    numbers[j+1] = numbers[j];
                    numbers[j] = temp;
                    swapped = true;
                }//fin if
            }//Fin 2º for
        }//Fin 1º for
        //Devuelve el array ordenado
        return numbers;
    }//Fin Funcion de array

    //Funcion de Bubble Mejorada
    public static int[] bubbleSort2(int[] numbers) {
        boolean swapped = true;
        int i = 0;
        int temp;
        int j = numbers.length - 1;

        while (i < j && swapped) {
            swapped = false;
            for (int k = i; k < j; k++) {
                //Solo cambiamos por <
                if (numbers[k] < numbers[k + 1]) {
                    temp = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = temp;
                    swapped = true;
                }//Fin if
            }//Fin 1º for
            j--;
            if (swapped) {
                swapped = false;
                for (int k = j; k > i; k--) {
                    //Solo cambiamos por >
                    if (numbers[k] > numbers[k - 1]) {
                        temp = numbers[k];
                        numbers[k] = numbers[k - 1];
                        numbers[k - 1] = temp;
                        swapped = true;
                    }//fin 2º if
                }//Fin 1º for
            }//fin 1ºif
            i++;
        }//Fin while

        return numbers;
    }//Fin Funcion burbuja mejorada

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
        int[] array2 = {10, 1, 5, 40, 12, 34, 44, 12, 11, 9};
        int longitud = array.length;
        int longitud2 = array2.length;
        //Llamar a la funcion
        bubblesort(array);
        //Imprimir el array ordenado
        imprimirArrayUni(array, longitud);

        System.out.println("\nVersion Mejorada:");
        //Llamar a la funcion mejorada
        bubbleSort2(array2);
        //Imprimir el array ordenado
        imprimirArrayUni(array2, longitud2);

    }//Fin main
}//fin class
