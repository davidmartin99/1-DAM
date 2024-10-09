package tema2b;

/**
 *
 * @author David Martin
 */
public class Arrays {
    
    public static void main(String[] args){
        int [] array1; //Declarar el array
        array1 = new int[6]; //Reserva en la memoria
        
        int [] array2 = new int [6];  //Declarar y reservar en una sola linea
        
        array1[0]=6;
        array1[1]=8;
        array1[2]=4;
        array1[3]=5;
        array1[4]=3;
        array1[5]=9;
        
        System.out.println("Posicion 0 cero del array es: "+array1[0]);
        
        array2[0]=array1[0];
        System.out.println("Posicion 0 cero del array es: "+array2[0]);

    }
    
}
