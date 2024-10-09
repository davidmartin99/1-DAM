package loteria_bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author david
 */
public class ConsultasMetodos6 {
          private Connection conexion;
          private Statement sentencia;

          private void conectar() throws SQLException {
                    String url = "jdbc:mysql://192.168.56.102:3306/loteria?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
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
          }//Fin ejecutarInstruccion

          public void imprimirApuesta(String consultaBuscar) throws SQLException {
                    ResultSet resultadoDatos = null;

                    // Definir las longitudes máximas de las columnas para un centrado adecuado
                    int fechaWidth = 10;
                    int dniWidth = 10;
                    int nombreWidth = 10;
                    int aciertosWidth = 10;
                    int categoriaWidth = 14;
                    int premioWidth = 10;

                    try {
                              conectar();
                              crearSentencia();

                              resultadoDatos = sentencia.executeQuery(consultaBuscar);

                              // Imprimir la cabecera de la tabla con columnas centradas
                              System.out.printf(" | %-" + fechaWidth + "s | %-" + + dniWidth + "s | %-" + nombreWidth + "s | %-" + aciertosWidth 
                                      + "s | %-" + categoriaWidth + "s | %-" + premioWidth + "s |\n",
                                      "FECHA","DNI.", "NOMBRE", "ACIERTOS", "CATEGORIA","PREMIO");
                              System.out.println("------------------------------------------------------------------------------------");

                              if (resultadoDatos.next()) {
                                        int num = 1;
                                        do {
                                                  String fecha = resultadoDatos.getString("fecha");
                                                  String dni = resultadoDatos.getString("dni");
                                                  String nombre = resultadoDatos.getString("nombre");
                                                  int aciertos = resultadoDatos.getInt("aciertos");
                                                  String categoria = resultadoDatos.getString("categoria");
                                                  int premio = resultadoDatos.getInt("premio");


                                                  // Imprimir detalles del jugador con columnas centradas
                                                  System.out.printf(" | %-" + fechaWidth + "s | %-" +dniWidth + "s | %-" + nombreWidth + "s | %-" + aciertosWidth 
                                                          + "d | %-" + categoriaWidth + "s | %-" + premioWidth+ "d |\n",
                                                          fecha,dni, nombre, aciertos, categoria, premio);
                                        } while (resultadoDatos.next());
                              } else {
                                        System.out.println("Apuesta no encontrada");
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
          }//Fin imprimirJugador

}//Fin class
