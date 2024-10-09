
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author david
 */
public class Consultas {
         public static void main(String[] args) {
                  //1ºPaso: crear conexion a MYSQL    Conexión segura con SSL
                  String url = "jdbc:mysql://192.168.80.253:3306/prueba?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
                  String user = "david4";
                  String password = "David!1234";

                  try {
                           //2ºpaso: Creo el objeto de conexion
                           Connection miConexion = DriverManager.getConnection(url, user, password);

                           //3ºPaso: Me creo un objeto de tipo Statment
                           Statement miStatement = miConexion.createStatement();
                           if (miConexion != null) {
                                    System.out.println("Conexion establecida!");
                           }//Fin if

                           //4ºPaso: Hacer una consulta , no hace falta poner los ; al final
                           String consulta1 = "SELECT  * FROM personas";
                           //Guardo el resultado
                           // objeto ResultSet = .execute  .executeUpdate  .executeQuery
                           ResultSet resultado = miStatement.executeQuery(consulta1);

                           //5ºPaso: procesar el resultado
                           // INSERTAR DATOS
                           String instruccionSQL_Insert = "INSERT INTO personas VALUES ('Manu', 'Parra', '679606122');";
                           miStatement.executeUpdate(instruccionSQL_Insert);
                           System.out.println("Datos insertados correctamente");
                           
                           // ACTUALIZAR DATOS
                           String instruccionSQL_Update = "UPDATE  personas SET nombre = 'Marcos' where nombre = 'Juan'; ";
                           miStatement.executeUpdate(instruccionSQL_Update);
                           System.out.println("Datos actualizados correctamente");
                         
                           // BORRAR DATOS
                           String instruccionSQL_Delete = "DELETE FROM  personas where nombre = 'Manu'; " ;
                           miStatement.executeUpdate(instruccionSQL_Delete);
                           System.out.println("Datos borrados correctamente");
                           
                           
                           //Cerramos 
                           resultado.close();
                           miStatement.close();
                           miConexion.close();
                 
                  } catch (SQLException e1) {
                           System.out.println("Error: " + e1.getMessage());
                  }//Fin try-catch
                  

         }//Fin main
}//Fin class
