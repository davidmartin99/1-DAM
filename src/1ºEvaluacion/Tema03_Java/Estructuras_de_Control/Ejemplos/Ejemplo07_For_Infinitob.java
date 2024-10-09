package tema3;

/**
 * Muestra tabla ASCII
 * @author David
 */

public class Ejemplo07_For_Infinitob {
    public static void main(String[] args){
        for (char c=0; c<128; c++){
        if (c!=26)
            System.out.println("Valor: "+(int)c+" caracter: " +c); //Convertimos char a int 
        }

    }
    
}