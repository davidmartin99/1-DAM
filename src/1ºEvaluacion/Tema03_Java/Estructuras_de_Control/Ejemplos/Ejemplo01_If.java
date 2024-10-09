package tema3;
/**
 * Al introducir la nota te dice si esta aprobado o suspenso
 * @author David Martin
 */
import java.util.Scanner; 
public class Ejemplo01_If {
    public static void main(String[] args) {
    //zona de variables
    int nota;
    String resultado;
    
    //Zona de iniciación de datos
    Scanner teclado = new Scanner(System.in);
    System.out.print("Escriba la nota: ");
    nota = teclado.nextInt();
    
    //Zona de procesamiento
    if(nota>=5){
        resultado="APROBADO";
    }else {
        resultado="SUSPENSO";
    }
    
    //Zona de salida
    System.out.println("El resultado es: "+resultado);
    }
    
}
