package practica_Interfaces;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase que sirve para crear la conexión, crear Statement y ejecutar la
 * consulta así cómo devolver el resultado
 */
public class Consultas_Metodos {

         private Connection conexion;
         private Statement sentencia;

         private void conectar() throws SQLException {
                  // Insertamos nuestros datos correspondientes
                  String url = "jdbc:mysql://192.168.80.253:3306/empresa?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
                  String user = "david4";
                  String password = "David!1234";

                  try {
                           conexion = DriverManager.getConnection(url, user, password);
                  } catch (SQLException e) {
                           System.err.println("Num Error: " + e.getErrorCode());
                           System.err.println("Error en la conexión: " + e.getMessage());
                  }
         }
         

         private void crearSentencia() throws SQLException {
                  sentencia = conexion.createStatement();
         }

         
         private void cerrarConexion() throws SQLException {
                  if (sentencia != null) {
                           sentencia.close();
                  }
                  if (conexion != null) {
                           conexion.close();
                  }
         }

         
         public ResultSet ejecutarConsulta(String consulta) throws SQLException {
                  ResultSet resultado = null;
                  try {
                           conectar();
                           crearSentencia();
                           resultado = sentencia.executeQuery(consulta);
                  } catch (SQLException e) {
                           System.err.println("Num Error: " + e.getErrorCode());
                           System.err.println("Error al ejecutar la consulta: " + e.getMessage());
                  }
                  return resultado;
         }

         
         public int ejecutarInstruccion(String instruccion) throws SQLException {
                  int filasAfectadas = 0;
                  try {
                           conectar();
                           crearSentencia();
                           filasAfectadas = sentencia.executeUpdate(instruccion);
                  } catch (SQLException e) {
                           System.err.println("Num Error: " + e.getErrorCode());
                           System.err.println("Error al ejecutar sentencia: " + e.getMessage());
                  } finally {
                           cerrarConexion();
                  }
                  return filasAfectadas;
         }

         
         public String imprimirEmpleado(String consultaBuscar) throws SQLException {
                  ResultSet resultadoDatos = null;
                  StringBuilder resultado = new StringBuilder();
                  try {
                           conectar();
                           crearSentencia();
                           resultadoDatos = sentencia.executeQuery(consultaBuscar);

                           if (resultadoDatos.next()) {
                                    int num = 1;
                                    do {
                                             String nombre = resultadoDatos.getString("nombre");
                                             String apellidos = resultadoDatos.getString("apellidos");
                                             String fechaNacimiento = resultadoDatos.getString("fechaNacimiento");
                                             String fechaIngreso = resultadoDatos.getString("fechaIngreso");
                                             String puesto = resultadoDatos.getString("puesto");
                                             double salario = resultadoDatos.getDouble("salario");

                                             resultado.append(num).append(".\n");
                                             resultado.append("Nombre: ").append(nombre).append("\n");
                                             resultado.append("Apellidos: ").append(apellidos).append("\n");
                                             resultado.append("Fecha de Nacimiento: ").append(fechaNacimiento).append("\n");
                                             resultado.append("Fecha de Ingreso: ").append(fechaIngreso).append("\n");
                                             resultado.append("Puesto: ").append(puesto).append("\n");
                                             resultado.append("Salario: ").append(salario).append("\n\n");

                                             num++;
                                    } while (resultadoDatos.next());
                           } else {
                                    resultado.append("Empleado no encontrado");
                           }
                  } catch (SQLException e) {
                           System.err.println("Num Error: " + e.getErrorCode());
                           System.err.println("Error al ejecutar la consulta: " + e.getMessage());
                  } finally {
                           if (resultadoDatos != null) {
                                    try {
                                             resultadoDatos.close();
                                    } catch (SQLException ex) {
                                             System.err.println("Error al cerrar el ResultSet: " + ex.getMessage());
                                    }
                           }
                           cerrarConexion();
                  }
                  return resultado.toString();
         }
         
         
         public String imprimirEmpleadosAntiguos(String consulta2) throws SQLException {
                  ResultSet resultadoDatos = null;
                  StringBuilder resultado1 = new StringBuilder();
                  try {
                           conectar();
                           crearSentencia();
                           resultadoDatos = sentencia.executeQuery(consulta2);

                           if (resultadoDatos.next()) {
                                    int num = 1;
                                    do {
                                             String nombre = resultadoDatos.getString("nombre");
                                             String apellidos = resultadoDatos.getString("apellidos");
                                             String fechaNacimiento = resultadoDatos.getString("fechaNacimiento");
                                             String fechaIngreso = resultadoDatos.getString("fechaIngreso");
                                             String fechaFinalizacion = resultadoDatos.getString("fechaFinalizacion");

                                             resultado1.append(num).append(".\n");
                                             resultado1.append("Nombre: ").append(nombre).append("\n");
                                             resultado1.append("Apellidos: ").append(apellidos).append("\n");
                                             resultado1.append("Fecha de Nacimiento: ").append(fechaNacimiento).append("\n");
                                             resultado1.append("Fecha de Ingreso: ").append(fechaIngreso).append("\n");
                                             resultado1.append("Fecha de Finalización: ").append(fechaFinalizacion).append("\n\n");

                                             num++;
                                    } while (resultadoDatos.next());
                           } else {
                                    resultado1.append("No se encontraron empleados antiguos.");
                           }
                  } catch (SQLException e) {
                           System.err.println("Num Error: " + e.getErrorCode());
                           System.err.println("Error al ejecutar la consulta: " + e.getMessage());
                  } finally {
                           if (resultadoDatos != null) {
                                    try {
                                             resultadoDatos.close();
                                    } catch (SQLException ex) {
                                             System.err.println("Error al cerrar el ResultSet: " + ex.getMessage());
                                    }
                           }
                           cerrarConexion();
                  }
                  return resultado1.toString();
         }

         
}//Fin class 
