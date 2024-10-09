package fechas;
import java.util.Calendar;
import java.sql.Date;
// import java.util.Date;
import java.time.*;
/**
 *  LocalDate: fechas sin hora
 *  LocalTime: horas sin fecha
 * LocalDateTime: horas y fecha
 * 
 */

public class Fechas {
         public static void main(String[] args) {
                  Calendar today = Calendar.getInstance();
                  // Devuelve la fecha actual
                  System.out.println("Hoy es: "+today.getTime());
                  
                  // Time         con .parse introduces tu la fecha 
                  LocalDate fechaNacimiento  = LocalDate.parse("2009-03-01");
                  System.out.println("Formato Java.Time: "+fechaNacimiento);
                  
                  ////////////////////////////////////////////////////////////////////////////////
                  LocalTime ahora = LocalTime.now();
                  System.out.println("Fecha actual: "+ahora);
                  
                  // formato ("aaaa-mm-ddThora:minuto:segundos.milesimas)
                  LocalDateTime fecha1 = LocalDateTime.parse("2000-02-21T11:54:01.185");
                  System.out.println("Fecha de reunión: "+fecha1);
                  
         }//Fin main
         
}//Fin class
