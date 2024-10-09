package tema3;
/**
 *Usando if-else-if anidado
 * introduces nota y te dice suspenso suficiente bien notable sobresaliente.
 * @author David
 */
import java.util.Scanner;

public class Ejemplo01_If_aninado { 
     public static void main(String[] args) {
    //zona de variables
    int nota;
    String resultado="Nota no valida ";
    
    //Zona de iniciación de datos
    Scanner teclado = new Scanner(System.in);
    System.out.print("Escriba la nota: ");
    nota = teclado.nextInt();
    
    //Zona de procesamiento
    if(nota<5){
        resultado="SUSPENSO";
    }
    if(nota==5){
        resultado="APROBADO";
    }
    if(nota==6){
        resultado="BIEN";
    }
    if(nota==7 || nota==8){
        resultado="NOTABLE";
    }
    if(nota==9 || nota==10){
        resultado="SOBRESALIENTE";
    }
  
    //Zona de salida
    System.out.println("El resultado es: "+resultado);
    }
    
}
