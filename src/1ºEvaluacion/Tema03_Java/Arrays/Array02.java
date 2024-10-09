package tema2b;
/**
 *
 * @author David Martin
 */
import java.util.Scanner;
public class Array02 {
    
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String [] modulo = new String [6];  //Declarar y reservar
        int [] nota = new int [6]; 
        
        //Introducir los valores 6 veces
        System.out.print("\nIntroduzca el nombre del modulo1: ");
        modulo[0] = teclado.nextLine();
        System.out.print("\nIntroduzca la nota del modulo1: ");
        nota[0] = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("\nIntroduzca el nombre del modulo2: ");
        modulo[0] = teclado.nextLine();
        System.out.print("\nIntroduzca la nota del modulo2: ");
        nota[0] = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("\nIntroduzca el nombre del modulo3: ");
        modulo[0] = teclado.nextLine();
        System.out.print("\nIntroduzca la nota del modulo3: ");
        nota[0] = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("\nIntroduzca el nombre del modulo4: ");
        modulo[0] = teclado.nextLine();
        System.out.print("\nIntroduzca la nota del modulo4: ");
        nota[0] = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("\nIntroduzca el nombre del modulo5: ");
        modulo[0] = teclado.nextLine();
        System.out.print("\nIntroduzca la nota del modulo5: ");
        nota[0] = teclado.nextInt();
        teclado.nextLine();
        
        System.out.print("\nIntroduzca el nombre del modulo6: ");
        modulo[0] = teclado.nextLine();
        System.out.print("\nIntroduzca la nota del modulo6: ");
        nota[0] = teclado.nextInt();
        teclado.nextLine();
        
        //Imprimir valores 6 veces
        System.out.printf(modulo[0]," " ,nota[0]);
        System.out.printf(modulo[1]," " ,nota[1]);
        System.out.printf(modulo[2]," " ,nota[2]);
        System.out.printf(modulo[3]," " ,nota[3]);
        System.out.printf(modulo[4]," " ,nota[4]);
        System.out.printf(modulo[5]," " ,nota[5]);

    }
    
}
