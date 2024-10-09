package individuo;

/**
 *
 * @author david
 */
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int dia, mes, año;
        
        //Solicitamos los datos por teclado
        System.out.println("Introduccion de Fecha");
        System.out.print("dia: ");
        dia = teclado.nextInt();
        System.out.print("mes: ");
        mes = teclado.nextInt();
        System.out.print("año: ");
        año = teclado.nextInt();
        
        //Se crea un objeto de tipo Fecha con el parámetro constructor
        Fecha fecha1 = new Fecha(dia, mes, año);
        Fecha fecha2 = new Fecha();
        
        //Comprobar que la fecha es correcta con el metodo creado antes en Fecha
        if (fecha1.fechaCorrecta()){
            System.out.println("Fecha introducida: "+fecha1);
        }
        else{
            System.out.println("Fecha incorrecta");
        }//fin if-else
        
        /////////////////////
        fecha2 = fecha1;
        System.out.println("Fecha segunda: "+fecha2);
        
        fecha1.setDia(15);
        System.out.println("Fecha1: "+fecha1);
        System.out.println("Fecha2: " +fecha2);
        
        //fecha2 = fecha1.clone();

    }//Fin main
    
}//Fin class
