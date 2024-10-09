package practica_Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Test de la base de datos para ver que se ha establecido la conexión
 * @author david
 */
public class DataBaseTest {

          public static void main(String[] args) {
                    String url = "jdbc:mysql://192.168.80.253:3306/empresa";
                    String user = "david4";
                    String password = "David!1234";

                    try (Connection con = DriverManager.getConnection(url, user, password)) {
                              System.out.println("Conexión exitosa");
                    } catch (SQLException e) {
                             System.err.println("Num Error: "+ e.getErrorCode());
                              System.err.println("Error en la conexión: " + e.getMessage());
                    }//Fin try-catch

          }//Fin main
          
}//Fin class
