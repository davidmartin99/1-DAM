
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author david
 */
public class test {
         
         public static void main(String[] args) {
                  //1ºPaso: crear conexion a MYSQL    Conexión segura con SSL
                  String url = "jdbc:mysql://192.168.80.253:3306/prueba?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
                  String user = "david4";
                  String password = "David!1234";
                  
                  try{
                           //2ºpaso: Creo el objeto de conexion
                           Connection conexion = DriverManager.getConnection(url, user, password);
                           
                           //3ºPaso: Me creo un objeto de tipo Statment
                           Statement instruccion = conexion.createStatement();
                           if(conexion!=null){
                                    System.out.println("Conexion establecida!");
                           }//Fin if
                           
                           //4ºPaso: Hacer una consulta , no hace falta poner los ; al final
                           String consulta1 = "SELECT  * FROM personas";
                           //Guardo el resultado
                           ResultSet resultado = instruccion.executeQuery(consulta1);
                           
                           //5ºPaso: procesar el resultado
                           System.out.println("\n--- Datos tabla Personas ---");
                           while(resultado.next()){
                                    // Otra forma de hacerlo: 
                                    // String nombre = resultado.getString("nombre") + " " + 
                                    // String apellidos = resultado.getString("apellidos") + " " +
                                    // String telefono = resultado.getString("telefono")
                                    // System.out.println("Nombre:"+nombre); Imprimir
                                    System.out.println(
                                            resultado.getString("nombre") + " " +
                                            resultado.getString("apellidos") + " " +
                                            resultado.getString("telefono") );
                           }//Fin while
                           
                           //Cerramos 
                           resultado.close();
                           instruccion.close();
                           conexion.close();

                  }catch(SQLException e1){
                           System.out.println("Error: "+e1.getMessage());
                  }//Fin try-catch
                  
         }//Fin main
         
}//Fin class
