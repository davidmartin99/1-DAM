package swing;

/**
 *
 * @author david
 */
import javax.swing.JOptionPane;

public class test {
    
    public static void main(String[] args){
        String usuario = JOptionPane.showInputDialog("Introduzca el nombre del usuario");
        String edad = JOptionPane.showInputDialog("Introduzca su edad");
        
        System.out.println("Su nombre es: "+usuario);
        int edad1 = Integer.parseInt(edad); //Devuelve un String por eso se convierte int edad a String
        System.out.println("Su edad es: "+edad1);
        
    }//Fin main
 
}//Fin class
