package tema3;
/**
 *Usando if-else-if anidado
 * introduces nota y te dice suspenso suficiente bien notable sobresaliente.
 * @author David
 */
import java.util.Scanner;

public class Ejemplo02_Switch { 
     public static void main(String[] args) {
    //zona de variables
    int nota;
    String resultado=" "; //hay que inicializar la variable
    
    //Zona de iniciación de datos
    Scanner teclado = new Scanner(System.in);
    System.out.print("Escriba la nota: ");
    nota = teclado.nextInt();
    
    //Zona de procesamiento
    switch (nota){ //al poner switch (nota) le decimos en cada caso lo que vale la nota (ej: case 5 esq la nota es 5)
        case 0:
        case 1:
        case 2: 
        case 3:
        case 4: 
            resultado="SUSPENSO";
        break;
        
        case 5: resultado="SUFICIENTE";
        break;
        case 6: resultado="BIEN";
        break;
        case 7: resultado="NOTABLE";
        break;
        case 8: resultado="NOTABLE";
        break;
        case 9: resultado="SOBRESALIENTE";
        break;
        case 10: resultado="SOBRESALIENTE";
        break;
        default: resultado="Nota no valida";

    }
  
    //Zona de salida
    System.out.println("El resultado es: "+resultado);
    }
    
}