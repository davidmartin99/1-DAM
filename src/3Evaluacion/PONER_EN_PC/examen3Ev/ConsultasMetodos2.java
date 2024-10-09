package examen3Ev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Metodos:
 *
 * @author david
 */
public class ConsultasMetodos2 {

          private Connection conexion;
          private Statement sentencia;

          private void conectar() throws SQLException {
                    String url = "jdbc:mysql://192.168.56.102:3306/juegoNumero?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
                    String user = "david4";
                    String password = "David!1234";

                    conexion = DriverManager.getConnection(url, user, password);
          }//Fin conectar

          private void crearSentencia() throws SQLException {
                    sentencia = conexion.createStatement();
          }//Fin crearSentencia

          private void cerrarConexion() throws SQLException {
                    if (sentencia != null) {
                              sentencia.close();
                    }
                    if (conexion != null) {
                              conexion.close();
                    }
          }//Fin cerrarConexion

          public ResultSet ejecutarConsulta(String consulta) throws SQLException {
                    ResultSet resultado = null;
                    try {
                              conectar();
                              crearSentencia();

                              resultado = sentencia.executeQuery(consulta);
                    } catch (SQLException e) {
                              System.out.println("Error al ejecutar la consulta: " + e.getMessage());
                              // Puedes lanzar la excepción nuevamente si prefieres manejarla en otro lugar
                              throw e;
                    }
                    return resultado;
          }//Fin ejecutarConsulta

          public int ejecutarInstruccion(String instruccion) throws SQLException {
                    int filasAfectadas = 0;
                    try {
                              conectar();
                              crearSentencia();

                              filasAfectadas = sentencia.executeUpdate(instruccion);
                    } finally {
                              cerrarConexion();
                    }
                    return filasAfectadas;
          }

          
          public void mostrarRecords(String consultaBuscar) throws SQLException {
                    ResultSet resultadoDatos = null;

                    try {
                              conectar();
                              crearSentencia();

                              resultadoDatos = sentencia.executeQuery(consultaBuscar);

                              if (resultadoDatos.next()) {
                                        // Si se encuentra un empleado, imprimir los detalles
                                        int num = 1;
                                        do {
                                                  String dni = resultadoDatos.getString("dni");
                                                  String nombre = resultadoDatos.getString("nombre");
                                                  String fecha = resultadoDatos.getString("fecha");
                                                  double puntuacion = resultadoDatos.getDouble("puntuacion");
                                                  int intentos = resultadoDatos.getInt("intentos");

                                                  // Imprimir detalles del empleado
                                                  System.out.println(num + ".");
                                                  System.out.println("DNI: " + dni);
                                                  System.out.println("Nombre: " + nombre);
                                                  System.out.println("Fecha: " + fecha);
                                                  System.out.println("Puntuacion: " + puntuacion);
                                                  System.out.println("Intentos: " + intentos);

                                                  num++;
                                        } while (resultadoDatos.next());
                              } else {
                                        System.out.println("Empleado no encontrado");
                              }
                    } catch (SQLException e) {
                              System.out.println("Error al ejecutar la consulta: " + e.getMessage());
                    } finally {
                              // Cerrar el ResultSet y la conexión
                              if (resultadoDatos != null) {
                                        try {
                                                  resultadoDatos.close();
                                        } catch (SQLException ex) {
                                                  System.out.println("Error al cerrar el ResultSet: " + ex.getMessage());
                                        }
                              }
                              cerrarConexion();
                    }
          }//Fin mostrarRecords

        

}//Fin class
