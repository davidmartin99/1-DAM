package radioDigital;

/**
 * Clase main.
 * Se pide crear una clase RadioDigital y,
 * Una clase Radio con el nombre de la emisora y frecuencia. 
 * Se creará un Array ordenado por frecuencia con las 6 emisoras escogidas.
 * Cada vez que se encienda la radio se mostrará la emisora favorita (nombre de la emisora y frecuencia)
 *
 * El programa tendrá un menú con las siguientes opciones:
 * (1) < bajar frecuencia (si llega al principio comenzará por el final)
 * (2) > subir frecuencia (subirá a la frecuencia siguiente de la emisora. Si
 * llega al final comenzará pro el principio
 * (3) salir
 *
 * Cada vez que se baje o se suba la frecuencia se mostrará el nombre y la
 * frecuencia de la siguiente emisora.
 * 
 * @author David Martin Pulgar
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        System.out.println("""
                           *********************************
                           ***********   RADIO   ***********
                           *** autor: David Martin Pulgar **
                           *** version: 1.0  ***************
                           *********************************
                           """);

        //Creamos el objeto RadioDigital
        RadioDigital radio1 = new RadioDigital();
        
        //Llamamos al Metodo específico para mostrar la emisora favorita
        radio1.mostrarEmisoraFavorita();
        
        //Creamos un objeto menuPrincipal para llamar a la clase Menu
        Menu menuPrincipal = new Menu();
        Scanner teclado = new Scanner(System.in); //Creamos un Scanner teclado
        int opcion; //Declaramos la variable opcion 
        
        //Con un bucle do-while haremos que el programa se ejecute hasta que el usuario decida
        do {
            menuPrincipal.Menu(); //Mostramos el menu
            opcion = teclado.nextInt(); //El usuario introduce la opcion por teclado
            switch (opcion) {
                case 1:
                    radio1.subirFrecuencia(); //Metodo específico para subir la frecuencia
                    break;
                case 2:
                    radio1.bajarFrecuencia();//Metodo específico para bajar la frecuencia
                    break;
                case 3:
                    System.out.println("--- Exit... ---"); //Muestra por pantalla que el programa ha terminado
                    break;
                default: //Si la opcion no está entre los casos, se mostrará el mensaje de opción no válida
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }//Fin switch 
        } while (opcion != 3); //Mientras la opción sea diferente a 3 se ejecuta el programa

    }//Fin main
    
}//Fin class main
