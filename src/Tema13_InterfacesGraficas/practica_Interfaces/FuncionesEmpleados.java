package practica_Interfaces;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

/**
 * Clase que contiene métodos estáticos para interactuar con la base de datos en relación con los empleados.
 * Estos métodos incluyen agregar, eliminar, buscar y ordenar empleados, así como calcular
 * la suma de los salarios y mostrar los empleados antiguos.
 * 
 * @author david
 */
public class FuncionesEmpleados {

         public static void agregarEmpleado(String nombre, String apellido, LocalDate fechaNacimiento, LocalDate fechaIngreso, String puesto, double salario) throws SQLException {
                  Consultas_Metodos consultas = new Consultas_Metodos();
                  String consultaInsert = "INSERT INTO empleados (nombre, apellidos, fechaNacimiento, fechaIngreso, puesto, salario) "
                          + "VALUES ('" + nombre + "', '" + apellido + "', '" + fechaNacimiento + "', '"
                          + fechaIngreso + "', '" + puesto + "', " + salario + ")";
                  consultas.ejecutarInstruccion(consultaInsert);
         }//Fin agregarEmpleado

         
         public static void eliminarEmpleado(String nombre, String apellido) throws SQLException {
                  Consultas_Metodos consultas = new Consultas_Metodos();
                  LocalDate fechaFinalizacion = LocalDate.now();
                  String consultaAgregarAntiguo = "INSERT INTO empleadosAntiguos (nombre, apellidos, fechaNacimiento, fechaIngreso, fechaFinalizacion) "
                          + "SELECT nombre, apellidos, fechaNacimiento, fechaIngreso, '" + fechaFinalizacion + "' "
                          + "FROM empleados WHERE nombre = '" + nombre + "' AND apellidos = '" + apellido + "'";
                  String consultaEliminar = "DELETE FROM empleados WHERE nombre = '" + nombre + "' AND apellidos = '" + apellido + "'";
                  consultas.ejecutarInstruccion(consultaAgregarAntiguo);
                  int filasAfectadas = consultas.ejecutarInstruccion(consultaEliminar);
                  if (filasAfectadas == 0) {
                           throw new SQLException("Empleado no encontrado.");
                  }
         }//Fin eliminarEmpleado

         
         public static String buscarEmpleado(String nombre, String apellido) throws SQLException {
                  Consultas_Metodos consultas = new Consultas_Metodos();
                  String consultaBuscar = "SELECT * FROM empleados WHERE nombre = '" + nombre + "' AND apellidos = '" + apellido + "'";
                  return consultas.imprimirEmpleado(consultaBuscar);
         }//Fin buscarEmpleado

         
         public static String ordenarEmpleados(String criterio) throws SQLException {
                  Consultas_Metodos consultas = new Consultas_Metodos();
                  String consultaOrden;
                  switch (criterio) {
                           case "antigüedad":
                                    consultaOrden = "SELECT * FROM empleados ORDER BY fechaIngreso";
                                    break;
                           case "salario":
                                    consultaOrden = "SELECT * FROM empleados ORDER BY salario";
                                    break;
                           case "apellido":
                                    consultaOrden = "SELECT * FROM empleados ORDER BY apellidos";
                                    break;
                           default:
                                    throw new IllegalArgumentException("Criterio de ordenamiento no válido.");
                  }
                  return consultas.imprimirEmpleado(consultaOrden);
         }//Fin ordenarEmpleados
         

         public static double calcularSumaSalarios() throws SQLException {
                  Consultas_Metodos consultas = new Consultas_Metodos();
                  String consulta = "SELECT SUM(salario) AS total_salarios FROM empleados";
                  ResultSet resultado = consultas.ejecutarConsulta(consulta);
                  if (resultado.next()) {
                           return resultado.getDouble("total_salarios");
                  } else {
                           throw new SQLException("No se pudo calcular la suma de salarios.");
                  }
         }//Fin calcularSumaSalarios
         
         
         public static String mostrarEmpleadosAntiguos() throws SQLException {
                  Consultas_Metodos consultas = new Consultas_Metodos();
                  String consulta2 = "SELECT * FROM empleadosAntiguos";
                  return consultas.imprimirEmpleadosAntiguos(consulta2);
         }//Fin mostrarEmpleadosAntiguos

         
}//Fin class
