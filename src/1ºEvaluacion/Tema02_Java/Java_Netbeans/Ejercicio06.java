import java.util.Scanner;

/**
 *Crear una aplicación que al introducir los datos de una persona 
 * (nombre y apellidos junto con la edad) 
 * le diga si es joven o Adulto. 
 * Joven menor de 18 y adulto cuando a partir de los 18 años.
 * @author alumno
 */
public class Ejercicio06 {
    public static void edad(){
        Scanner teclado = new Scanner(System.in);
        String nombre, mayor;
        int edad;
        
        System.out.print("Introduce el nombre: ");
        nombre = teclado.nextLine();
        
        System.out.print("Introduce tu edad: ");
        edad = teclado.nextInt();
        
        mayor = (edad<18)? "Es joven":"Es adulto";
        System.out.printf("\n%s %s",nombre, mayor);
    }
    
    public static void main(String[] args){
      edad();
    }
    
}
