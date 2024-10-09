package ahorcado_bbdd;

import static ahorcado_bbdd.MenuAhorcado.inicializarMenu;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class FuncionesAhorcado {
          
          public static void main(String[] args) {
                    inicializarMenu();
          }//Fin main
          
          
          public static void empezarPartida() {
                    Scanner scanner = new Scanner(System.in);

                    // Nombre
                    String nuevoNombre;
                    do {
                              try {
                                        System.out.println("Ingrese su Nombre:");
                                        nuevoNombre = scanner.nextLine();
                                        if (!nuevoNombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                                  throw new Exception("Nombre no válido. Debe contener solo letras y espacios.");
                                        }
                              } catch (Exception e) {
                                        System.err.println("ERROR: " + e.getMessage());
                                        nuevoNombre = ""; // Reiniciar el valor del nombre
                              }
                    } while (nuevoNombre.isEmpty());

                    // Llamar al juego del ahorcado y obtener resultados
                    Juego_Ahorcado.Resultado resultado = Juego_Ahorcado.jugarAhorcado();
                    
                    int intentosRestantes = resultado.intentosRestantes;
                    int intentosRealizados = resultado.intentosRealizados;

                    // Calcular la puntuación
                    double nuevoPuntuacion = intentosRestantes * 20;
                    
                    // Instancia de Consultas_Metodos
                    ConsultasMetodos4 consultas = new ConsultasMetodos4();
                    
                    // Consulta SQL para insertar los datos del nuevo jugador
                    String consulta = "INSERT INTO jugador (nombre, intentos, puntuacion) "
                            + "VALUES ('" + nuevoNombre + "', " + intentosRestantes + ", " + nuevoPuntuacion + ")";

                    // Ejecutamos la consulta
                    try {
                              consultas.ejecutarInstruccion(consulta);
                              System.out.println("Jugador insertado correctamente en la base de datos.");
                    } catch (SQLException e) {
                              System.err.println("Error al insertar jugador en la base de datos: " + e.getMessage());
                    }

          }//Fin empezarPartida
          
          
          public static void mostrarRecords() throws SQLException {
                    ConsultasMetodos4 consultas = new ConsultasMetodos4();
                    //Muestra los nombres distintos con la maxima puntuacion
                    String consultaRecords = "SELECT nombre, MAX(intentos) as intentos, MAX(puntuacion) as puntuacion "
                            + "FROM jugador "
                            + "GROUP BY nombre "
                            + "ORDER BY puntuacion DESC "
                            + "LIMIT 10";
                    consultas.imprimirJugador(consultaRecords);
          }//Fin mostrarEmpleadosAntiguos

          
          
          
}//Fin class
