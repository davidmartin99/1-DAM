package tema2b;
/**
 *Crear un tipo enumerado llamado Planetas que contenga los 8 planetas del Sistema Solar.
 * Muestra el texto relativo al nombre del primer planeta, intenta
mostrar la posición que ocupan en ese listado (método ordinal()) 
* e intenta mostrar también el número de planetas existentes(con .values()  
* sacarás el array de componentes que tiene, y a dicho array 
* le podrás aplicar la propiedad .length para mostrar el tamaño de dicho array).
 * @author David
 */
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //declarar y reservar el array 
        String [] arrayPlaneta = new String[8];
        arrayPlaneta[0]="Mercurio";
        arrayPlaneta[1]="Venus";
        arrayPlaneta[2]="La Tierra";
        arrayPlaneta[3]="Marte";
        arrayPlaneta[4]="Júpiter";
        arrayPlaneta[5]="Saturno";
        arrayPlaneta[6]="Urano";
        arrayPlaneta[7]="Neptuno";
        
        System.out.print("Introduce la posicion del planeta: ");
        int posicion = teclado.nextInt();
        
        System.out.printf("La posicion %d, es el planeta: %s\n", posicion, arrayPlaneta[posicion-1]);
    }
    
}
