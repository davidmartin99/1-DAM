package dni;

/**
 *
 * @author david
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    
    //Hay que añadir throws Exception porq en el metodo establecer se ha puesto
    public static void main(String[] args) throws Exception{ 
       
        //Mostrar por ventana
        //DNI SIN LETRA
        DNI lucia = new DNI();
        String nifSinLetra = JOptionPane.showInputDialog("Introduce el DNI sin letra: ");
        int nifSinLetra2 = Integer.parseInt(nifSinLetra);
        lucia.establecer(nifSinLetra2);
        System.out.println("El nif con letra es: "+ lucia.obtenerNIF());
        
        //DNI CON LETRA
        DNI yassin = new DNI();
        String nifConLetra = JOptionPane.showInputDialog("Introduce el DNI con letra: ");
        yassin.establecer(nifConLetra);
        System.out.println("El nif con letra es: " + yassin.obtenerNIF());
   
        
        //Objetos
        //DNI con letra
        DNI juan = new DNI();
        juan.establecer("53996628B"); //Si pongo el DNI con T da error 
        System.out.println("El NIF es: "+juan.obtenerNIF());
        
        //Introdcuri DNI con letra
        DNI david = new DNI();
        System.out.print("Introduzca el DNI completo: ");
        Scanner teclado = new Scanner(System.in);
        String dniLetra = teclado.nextLine();
        david.establecer(dniLetra); //Si pongo el DNI con T da error 
        System.out.println("El NIF es: " + david.obtenerNIF());
        
        //DNI sin letra
        DNI sara = new DNI();
        sara.establecer(51537035);
        String NIF = sara.obtenerNIF(); //Saca la letra del DNI 
        System.out.println("El NIF obtenido es: "+NIF);
        
        //Introducir DNI sin letra
        DNI marcos = new DNI();
        System.out.println("Introduce el DNI sin letra: ");
        int dni = teclado.nextInt();
        marcos.establecer(dni);
        System.out.println("El NIF es: "+marcos.obtenerNIF());
        
        
    }//Fin main
    
}//Fin clas Main
