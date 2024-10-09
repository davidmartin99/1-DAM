
package cajero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class DatabaseTest {
          public static void main(String[] args) {
                    String url = "jdbc:mysql://192.168.56.102:3306/cajero?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
                    String user = "david4";
                    String password = "David!1234";

                    try (Connection con = DriverManager.getConnection(url, user, password)) {
                              System.err.println("Conexión exitosa");
                    } catch (SQLException e) {
                              System.err.println("Error en la conexión: " + e.getMessage());
                    }

          }
}
