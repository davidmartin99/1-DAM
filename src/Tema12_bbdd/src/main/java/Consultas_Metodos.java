
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Metodos: 
 * @author david
 */
public class Consultas_Metodos {
         private Connection conexion;
         private Statement sentencia;

         private void conectar() throws SQLException{
                  String url = "jdbc:mysql://192.168.80.253:3306/prueba?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
                  String user = "david4";
                  String password = "David!1234";

                  conexion = DriverManager.getConnection(url, user, password);
         }//Fin conectar
         
         
         private void crearSentencia() throws SQLException{
                  sentencia = conexion.createStatement();
                  if (conexion != null) {
                           System.out.println("Conexion establecida!");
                  }//Fin if
               
         }//Fin crearSentencia
         
         
         private void cerrarConexion() throws SQLException{
                  if (sentencia != null) {
                           sentencia.close();
                  }
                  if (conexion != null) {
                           conexion.close();
                  }
         }//Fin cerrarConexion
         
         
         public void ejecutarConsulta(String consulta) throws SQLException {
                  try {
                           conectar();
                           crearSentencia();

                           ResultSet resultado = sentencia.executeQuery(consulta);

                           // Aquí puedes procesar el resultado como lo necesites.
                           resultado.close();
                  } finally {
                           cerrarConexion();
                  }
         }//Fin ejecutarConsulta
         
         
         public void ejecutarInstruccion(String instruccion) throws SQLException {
                  try {
                           conectar();
                           crearSentencia();

                           int filasAfectadas = sentencia.executeUpdate(instruccion);
                           System.out.println("Filas afectadas: " + filasAfectadas);
                  } finally {
                           cerrarConexion();
                  }
         }//Fin ejecutarInstruccion
         
         
         public static void main(String[] args) {
                  Consultas_Metodos consultas = new Consultas_Metodos();

                  // Ejemplo de consulta SELECT
                  try {
                           consultas.ejecutarConsulta("SELECT * FROM personas");
                  } catch (SQLException e) {
                           System.out.println("Error al ejecutar consulta: " + e.getMessage());
                  }

                  // Ejemplo de instrucción INSERT
                  try {
                           consultas.ejecutarInstruccion("INSERT INTO personas VALUES ('Manu', 'Parra', '679606122')");
                  } catch (SQLException e) {
                           System.out.println("Error al ejecutar instrucción: " + e.getMessage());
                  }

                  // Ejemplo de instrucción UPDATE
                  try {
                           consultas.ejecutarInstruccion("UPDATE personas SET nombre = 'Marcos' WHERE nombre = 'Juan'");
                  } catch (SQLException e) {
                           System.out.println("Error al ejecutar instrucción: " + e.getMessage());
                  }

                  // Ejemplo de instrucción DELETE
                  try {
                           consultas.ejecutarInstruccion("DELETE FROM personas WHERE nombre = 'Manu'");
                  } catch (SQLException e) {
                           System.out.println("Error al ejecutar instrucción: " + e.getMessage());
                  }
         }//Fin main
         
}//Fin class
