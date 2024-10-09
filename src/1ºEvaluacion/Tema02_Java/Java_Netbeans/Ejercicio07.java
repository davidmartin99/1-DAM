/**
 *Pregunta a cada usuario su equipo favorito de futbol de Madrid,
 * pudiendo ser el ATLETICO (mejor equipo de Madrid) o el REAL MADRID (equipo con más ligas).
 * Se le presentará por pantalla un mensaje según el equipo introducido.
nota: para este ejercicio el usuario es indiferente si introduce el nombre con letras mayúsculas o minúsculas.
 * @author alumno
 */
import java.util.Scanner;

public class Ejercicio07 {
    
    public static String equipo(){
        String equipo;
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Elige un equipo: Atletico o RealMadrid\n");
        equipo = teclado.nextLine();
        equipo = equipo.toLowerCase(); //Para pasar todo a minusculas
        return equipo;
    }
    
    public static void main(String[] args){
        switch(equipo()){
            case "realmadrid":
                System.out.println("\nEquipo con mas ligas");
                break;
            case "atletico":
                System.out.println("Mejor equipo de Madrid");
                break;
            default: 
                System.out.println("Error: equipo no valido");
        }
        
    }
    
}
