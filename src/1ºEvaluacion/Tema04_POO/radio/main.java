package radio;

/**
 *
 * @author David
 */
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        //Creacion de Objetos
        Radio radioFM = new Radio(80);
        Radio radioAM = new Radio(80);
        Scanner teclado = new Scanner(System.in);
        
        //LLamamos a la clase menu
        Menu menuPrincipal = new Menu();
        
        int opcion;
        
        do{
            menuPrincipal.Menu();
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Introduce una frecuencia: ");
                    double frecuencia = teclado.nextDouble();
                    radioFM.setFrecuencia(frecuencia); //Importante! para que la frecuencia se cambie por la introducida
                    break;
                case 2:
                    radioFM.subirFrecuencia();
                    break;
                case 3: 
                    radioFM.bajarFrecuencia();
                    break;
                case 4:
                    radioFM.mostrarDatos();
                    break;
                case 5:
                    System.out.println("--- Exit... ---");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }while(opcion != 5);

    }
}
