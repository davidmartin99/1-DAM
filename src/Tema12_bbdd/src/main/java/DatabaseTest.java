
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author alumno
 */
public class DatabaseTest {
         public static void main(String[] args) {
                  String url="jdbc:mysql://192.168.80.253:3306/prueba";
                  String user = "david4";
                  String password = "David!1234";
                  
                  try (Connection con = DriverManager.getConnection(url, user, password) ){
                           System.out.println("Conexión exitosa");   
                  }catch(SQLException e) {
                           System.out.println("Error en la conexión: " + e.getMessage());
                  }//Fin try-catch
                        
         }//Fin main
         
}//Fin class

