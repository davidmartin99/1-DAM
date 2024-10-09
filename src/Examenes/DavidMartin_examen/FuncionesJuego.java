package examen_DavidMartin;

import static examen_DavidMartin.MenuJuego.inicializarMenu;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import examen_DavidMartin.ConsultasMetodos2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;


/**
* No se me ejecuta a partir de introducir el nombre, tengo la estructura pero algo falla
* 
 * @author david
 */

public class FuncionesJuego {
         
         public static void main(String[] args) {
                  inicializarMenu();
         }//Fin main

         public static void buscarJugador() {
                  Scanner scanner = new Scanner(System.in);

                  try {
                           System.out.println("Ingrese el DNI del jugador:");
                           String buscarDNI = scanner.nextLine();

                           System.out.println("Ingrese el Nombre del jugador:");
                           String nombreBuscar = scanner.nextLine();
                          

                           // Instancia de ConsultasMetodos
                           ConsultasMetodos2 consultas = new ConsultasMetodos2();

                           // Consulta SQL para buscar el empleado
                           String consultaBuscar = "SELECT * FROM jugador WHERE DNI = '" + buscarDNI + 
                                   "' AND nombre = '" + nombreBuscar + "'";

                           // Consultar y mostrar empleado
                           consultas.imprimirJugador(consultaBuscar);

                  } catch (Exception e) {
                           System.err.println("ERROR: " + e.getMessage());
                  }//Fin try-catch
                  
         }//Fin buscarJugador
         
         
         public static void agregarJugador(){
                  Scanner scanner = new Scanner(System.in);

                  // DNI
                  String nuevoDNI = null;
                  do {
                           try {
                                    System.out.println("Ingrese su DNI :");
                                    nuevoDNI = scanner.nextLine();
                           } catch (Exception e) {
                                    System.err.println("ERROR:" + e.getMessage());
                           }
                  } while (nuevoDNI.isEmpty());

                  // Nombre
                  String nombreNuevo;
                  do {
                           try {
                                    System.out.println("Ingrese el nombre del nuevo empleado:");
                                    nombreNuevo = scanner.nextLine();
                                    if (!nombreNuevo.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                             throw new Exception("Nombre no válido. Debe contener solo letras y espacios.");
                                    }
                           } catch (Exception e) {
                                    System.err.println("ERROR: " + e.getMessage());
                                    nombreNuevo = ""; // Reiniciar el valor del nombre
                           }
                  } while (nombreNuevo.isEmpty());

                  // Limpiar el buffer del scanner
                  scanner.nextLine();

                  // Instancia de Consultas_Metodos
                  ConsultasMetodos2 consultas = new ConsultasMetodos2();

                  // Consulta SQL para insertar los datos del nuevo empleado
                  String consultaInsert = "INSERT INTO jugador (DNI, nombre) "
                          + "VALUES ('" + nuevoDNI + "', " + nombreNuevo+ ")";
                  //No se me ejecuta a partir de introducir el nombre, tengo la estructura pero algo falla

                  // Ejecutamos la consulta
                  try {
                           consultas.ejecutarInstruccion(consultaInsert);
                           System.out.println("Jugador insertado correctamente en la base de datos.");
                  } catch (SQLException e) {
                           System.err.println("Error al insertar empleado en la base de datos: " + e.getMessage());
                  }

         }//Fin agregarJugador
         
         
         public static void empezarPartida(){
         //1ºPaso: crear conexion a MYSQL    Conexión segura con SSL
                  String url = "jdbc:mysql://192.168.80.253:3306/prueba?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
                  String user = "david4";
                  String password = "David!1234";

                  Scanner scanner = new Scanner(System.in);

                  // DNI
                  String nuevoDNI = null;
                  do {
                           try {
                                    System.out.println("Ingrese su DNI :");
                                    nuevoDNI = scanner.nextLine();
                           } catch (Exception e) {
                                    System.err.println("ERROR:" + e.getMessage());
                           }
                  } while (nuevoDNI.isEmpty());

                  // Nombre
                  String nombreNuevo;
                  try {
                           System.out.println("Ingrese el nombre del nuevo jugador:");
                           nombreNuevo = scanner.nextLine();
                           if (!nombreNuevo.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                                    throw new Exception("Nombre no válido. Debe contener solo letras y espacios.");
                           }
                  } catch (Exception e) {
                           System.err.println("ERROR: " + e.getMessage());
                           nombreNuevo = ""; // Reiniciar el valor del nombre
                  }
                  
                  
                  boolean salir = false;
                  int numIntentos = 0;
                  double puntos = 10;

                  do{
                           try {
                                    int numero = 10;
                                    int intento;

                                    System.out.println("Introduzca un numero para adivinar: ");
                                    intento = scanner.nextInt();
                                    if(intento!=numero){
                                             System.out.println("Ese numero no es... ");
                                             numIntentos++;
                                             if(intento<numero){
                                                      System.out.println("El numero es MAYOR");
                                             }else{
                                                      System.out.println("El numero es MENOR");
                                             }
                                    }else{
                                             System.out.println("Enhorabuena! has adivinado");
                                             salir=true;
                                    };
                           } catch (InputMismatchException e1) {
                                    System.err.println("Debe introducir un número válido.");
                                    scanner.nextLine(); // Limpiar el buffer del scanner
                           } catch (IllegalArgumentException e2) {  //Excepcion del default
                                    System.err.println(e2.getMessage());
                           } catch (Exception e3) {
                                    System.err.println("Error: " + e3.toString());
                           }//Fin try-catch
                  }while(!salir);
                  
                  switch(numIntentos){
                           case 1:
                                    puntos=puntos;
                                    break;
                           case 2,3,4,5:
                                    puntos=(puntos-2);
                                    break;
                           default:
                                    for (int i = 0; i < 10; i++) {
                                             puntos=puntos-0.01;
                                    }//Fin for
                  }//Fin switch
                  
                  try {
                           //2ºpaso: Creo el objeto de conexion
                           Connection miConexion = DriverManager.getConnection(url, user, password);

                           //3ºPaso: Me creo un objeto de tipo Statment
                           Statement miStatement = miConexion.createStatement();
                           if (miConexion != null) {
                                    System.out.println("Conexion establecida!");
                           }//Fin if

                           
                           //5ºPaso: procesar el resultado
                           // INSERTAR DATOS
                         
                           LocalDate fecha = LocalDate.now();
                           String instruccionSQL_Insert = "INSERT INTO puntuacion (DNI, nombreNuevo, fecha, puntuacion, intentos)"
                                   + "VALUES ('" + nuevoDNI + "', '" + nombreNuevo + "', '" + fecha + "', '"
                                   + puntos + "', '"  + numIntentos + "');";
                           miStatement.executeUpdate(instruccionSQL_Insert);
                           System.out.println("Datos insertados correctamente");
                           //Cerramos 
                           miStatement.close();
                           miConexion.close();

                  } catch (SQLException e1) {
                           System.out.println("Error: " + e1.getMessage());
                  }//Fin try-catch

                         
             }//Fin agregarJugador

         
         public static void mostrarRecords(){
                  //1ºPaso: crear conexion a MYSQL    Conexión segura con SSL
                  String url = "jdbc:mysql://192.168.80.253:3306/prueba?allowPublicKeyRetrieval=true&useSSL=false&serverTimeZone=UTC";
                  String user = "david4";
                  String password = "David!1234";

                  try {
                           //2ºpaso: Creo el objeto de conexion
                           Connection conexion = DriverManager.getConnection(url, user, password);

                           //3ºPaso: Me creo un objeto de tipo Statment
                           Statement instruccion = conexion.createStatement();
                           if (conexion != null) {
                                    System.out.println("Conexion establecida!");
                           }//Fin if

                           //4ºPaso: Hacer una consulta , no hace falta poner los ; al final
                           String consulta1 = "SELECT  * FROM puntuacion ORDER BY puntuacion desc";
                           //Guardo el resultado
                           ResultSet resultado = instruccion.executeQuery(consulta1);

                           //5ºPaso: procesar el resultado
                           System.out.println("\n--- Jugador ---");
                           while (resultado.next()) {
                                    // Otra forma de hacerlo: 
                                    // String nombre = resultado.getString("nombre") + " " + 
                                    // String apellidos = resultado.getString("apellidos") + " " +
                                    // String telefono = resultado.getString("telefono")
                                    // System.out.println("Nombre:"+nombre); Imprimir
                                    System.out.println(
                                            resultado.getString("DNI") + " "
                                            + resultado.getString("nombre") + " ");
                           }//Fin while

                           //Cerramos 
                           resultado.close();
                           instruccion.close();
                           conexion.close();

                  } catch (SQLException e1) {
                           System.out.println("Error: " + e1.getMessage());
                  }//Fin try-catch

         }//Fin mostrarRecords
         
         public static void mostrarRecords2() {
                    Scanner scanner = new Scanner(System.in);
                    ConsultasMetodos2 consultas = new ConsultasMetodos2(); // Instancia de ConsultasMetodos

                    try {
                           System.out.println("----Records----");
                           System.out.println();

                             String consultaRecords = "SELECT * FROM puntuacion ORDER BY puntuacion desc";
                             consultas.imprimirJugador(consultaRecords); // Imprimir empleados ordenados por antigüedad
                          
                  } catch (Exception e) {
                           System.out.println("ERROR: " + e.getMessage());
                  }//Fin try-catch
                    // Cerrar el ResultSet
          }//Fin mostrarRecords
        
         
}
