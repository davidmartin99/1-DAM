package act02_ArraysObjetos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Actividad 2 - Arrays de objetos
 *  Clase main
 * 
 * @version 1.0
 * @author david
 */
public class main {
          
          public static void main(String[] args) {
                    //Inicializamos el objeto Temperatura
                    Temperatura[][] temperaturas= new Temperatura[12][];
                    
                    //Temperaturas de ENERO
                    temperaturas[0] = new Temperatura[31]; 

                    temperaturas[0][0] = new Temperatura(2, 10);
                    temperaturas[0][1] = new Temperatura(2, 9);
                    temperaturas[0][2] = new Temperatura(8, 12);
                    temperaturas[0][3] = new Temperatura(8, 10);
                    temperaturas[0][4] = new Temperatura(4, 9);
                    temperaturas[0][5] = new Temperatura(3, 8);
                    temperaturas[0][6] = new Temperatura(-1, 9);
                    temperaturas[0][7] = new Temperatura(-3, 7);
                    temperaturas[0][8] = new Temperatura(4, 7);
                    temperaturas[0][9] = new Temperatura(4, 7);
                    temperaturas[0][10] = new Temperatura(1, 8);
                    temperaturas[0][11] = new Temperatura(0, 7);
                    temperaturas[0][12] = new Temperatura(2, 9);
                    temperaturas[0][13] = new Temperatura(5, 10);
                    temperaturas[0][14] = new Temperatura(10, 13);
                    temperaturas[0][15] = new Temperatura(11, 14);
                    temperaturas[0][16] = new Temperatura(10, 12);
                    temperaturas[0][17] = new Temperatura(10, 13);
                    temperaturas[0][18] = new Temperatura(4, 10);
                    temperaturas[0][19] = new Temperatura(1, 10);
                    temperaturas[0][20] = new Temperatura(3, 11);
                    temperaturas[0][21] = new Temperatura(1, 11);
                    temperaturas[0][22] = new Temperatura(3, 16);
                    temperaturas[0][23] = new Temperatura(6, 18);
                    temperaturas[0][24] = new Temperatura(5, 18);
                    temperaturas[0][25] = new Temperatura(6, 20);
                    temperaturas[0][26] = new Temperatura(8, 18);
                    temperaturas[0][27] = new Temperatura(5, 17);
                    temperaturas[0][28] = new Temperatura(6, 14);
                    temperaturas[0][29] = new Temperatura(5, 13);
                    temperaturas[0][30] = new Temperatura(4, 11);
                    
                    //Temperaturas de FEBRERO
                    temperaturas[1] = new Temperatura[29];
                    for (int i = 0; i < 29; i++) {
                              temperaturas[1][i] = new Temperatura(0, 0); 
                    }//fin for
                    
                    //Resto de meses los declaramos a (0, 0)
                    //empezamos en i = 2 porque ENERO y FEBRERO ya estan declarados
                    // i = mes y j = dias
                    for (int i = 2; i < 12; i++) {
                              if (i == 3 || i == 5 || i == 8 || i == 10) {
                                        temperaturas[i] = new Temperatura[30]; // Si el mes tiene 30 dias
                              } else {
                                        temperaturas[i] = new Temperatura[31]; // Si el mes tiene 31 dias
                              }//Fin if-else

                              for (int j = 0; j < temperaturas[i].length; j++) {
                                        if ((i == 3 || i == 5 || i == 8 || i == 10) && j == 30) {
                                                  temperaturas[i][j] = new Temperatura(0, 0); //Asignamos la temperatura a los meses con 30 dias
                                        } else {
                                                  temperaturas[i][j] = new Temperatura(0, 0); //Temperatura para el resto de meses
                                        }//Fin if-else
                              }//Fin 2ºfor
                    }//Fin 1ºfor
                    
                    //Aray de meses
                    String[] mes = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO",
                              "JULIO", "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

                    
                   
                    //Menu de opciones
                    int opcion;
                   Scanner teclado = new Scanner(System.in);

                   //Menu dentro de un bucle para que se repita hasta que pulsemos 2
                   boolean salir = false;

                  do {
                           System.out.println("""
                            ******************************************************************
                            *****    1. Elegir mes y mostrar temperaturas
                            *****    2. Salir
                            ******************************************************************
                            """);

                           try {
                                    opcion = teclado.nextInt();
                                    teclado.nextLine(); 

                                    switch (opcion) {
                                             case 1:
                                                      temperaturasMes(temperaturas, mes);
                                                      break;
                                             case 2:
                                                      System.out.println("Saliendo... ");
                                                      salir = true;
                                                      break;
                                             default:
                                                      System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                                    }//fin switch
                           } catch (InputMismatchException e) {
                                    System.err.println("ERROR: Debe introducir un número.");
                                    teclado.nextLine(); 
                           } catch (Exception e) {
                                    System.err.println("ERROR: " + e.toString());
                                    teclado.nextLine();
                           }//Fin try-catch
                  } while (!salir);

                  teclado.close();

 
          }//Fin main

          
          /**
           * Metodo para elegir un mes y mostrar las temperaturas
           *
           * @param temperaturas array bidimensional de las temperaturas por mes.
           * @param mes array de los meses.
           */
          public static void temperaturasMes(Temperatura[][] temperaturas, String[] mes){
                    Scanner teclado = new Scanner(System.in);
                    int numMes = 0;
                    boolean repetir;
                    int intentos = 0;
                    
                    do {
                            repetir = false;
                            try {
                                     System.out.print("\nIntroduce el numero de mes: ");
                                     numMes = teclado.nextInt();

                                     //Comprobamos que el numero de mes esta entre el rango valido
                                     //Creamos la excepcion 
                                     if (numMes < 1 || numMes > 12) {
                                              throw new ArrayIndexOutOfBoundsException();
                                     }//Fin if
                            } catch (InputMismatchException e) {
                                     //err.println imprime en formato error (rojo)
                                     System.err.println("ERROR: Valor no valido. Debe ser un numero.");
                                     repetir = true;
                                     teclado.nextLine(); // Limpiar el buffer del teclado
                            } catch (ArrayIndexOutOfBoundsException e) {
                                     System.err.println("ERROR: El mes debe estar entre 1 y 12.");
                                     repetir = true;
                                     teclado.nextLine(); // Limpiar el buffer del teclado
                                     //Exception sirve para captar cualquier excepcion no prevista
                            } catch (Exception e) {
                                     System.err.println("ERROR: " + e.toString());
                                     repetir = true;
                                     teclado.nextLine(); // Limpiar el buffer del teclado
                            }finally {
                                    //Cuenta los intentos
                                    intentos++;
                            }   
                   } while (repetir);
                    
              
                    //Imprimimos el mes segun el elegido
                    System.out.println("Mes: " + mes[numMes - 1]); 
                    
                    //Temperatura maxima y minima del mes
                   double temperaturaMaxima = temperaturaMaxima(temperaturas, numMes);
                   double temperaturaMinima = temperaturaMinima(temperaturas, numMes);
                   //Imprimimos la temperatura maxima y minima del mes
                   System.out.println("Temperatura maxima del mes: " + temperaturaMaxima);
                   System.out.println("Temperatura minima del mes: " + temperaturaMinima);
                   
                   //Temperaturas Medias 
                   double mediaMax = temperaturaMaxMedia(temperaturas, numMes);
                   double mediaMin = temperaturaMinMedia(temperaturas, numMes);
                   double mediaTotal = (mediaMax+mediaMin)/2;
                   //Imprimir las temperaturas medias
                   System.out.println("Maxima de media: "+ String.format("%.1f", mediaMax));
                   System.out.println("Minima de media: " + String.format("%.1f", mediaMin));
                   System.out.println("Media de "+mes[numMes-1]+": "+ String.format("%.1f", mediaTotal));
                   
                    //recorremos el array para ir imprimiendo los dias y sus temperaturas
                    for (int j = 0; j < temperaturas[numMes - 1].length; j++) {
                              System.out.println("Día " + (j + 1) + ": " + temperaturas[numMes - 1][j].toString());
                    }//Fin for
                    
                    //Muestra los intentos.
                    System.out.println("Numero de intentos: " + intentos);
                    
          }//Fin temperaturasMes
          
          
          /**
          * Metodo para encontrar la temperatura maxima del mes
          *
          * @param temperaturas array bidimensional de las temperaturas por mes
          * @param numMes numero del mes 
          * @return temperatura maxima del mes
          */
         public static double temperaturaMaxima(Temperatura[][] temperaturas, int numMes) {
                  //Declaramos una variable y le asignamos el valor de la temperatura maxima del primer dia
                  double temperaturaMaxima = temperaturas[numMes - 1][0].getMax(); // Tomamos la primera temperatura del mes como máxima inicial

                  //Recorremos las temperaturas del mes
                  for (int i = 1; i < temperaturas[numMes - 1].length; i++) {
                           //Variable que empieza en el 2º dia del mes, para compararlo con el primero
                           double tempMaxDia = temperaturas[numMes - 1][i].getMax();
                           //Vamos comparando las dos temperaturas, siempre quedandonos con la mayor
                           if (tempMaxDia > temperaturaMaxima) {
                                    temperaturaMaxima = tempMaxDia;
                           }//Fin if
                  }//Fin for

                  return temperaturaMaxima;
         }//Fin temperaturaMaxima

         
         /**
          * Metodo para encontrar la temperatura minima del mes
          *
          * @param temperaturas array bidimensional de las temperaturas por mes
          * @param numMes numero del mes 
          * @return temperatura minima del mes
          */
         public static double temperaturaMinima(Temperatura[][] temperaturas, int numMes) {
                  //Declaramos una variable y le asignamos el valor de la temperatura minima del primer dia
                  double temperaturaMinima = temperaturas[numMes - 1][0].getMin();

                  // Recorremos las temperaturas del mes
                  for (int i = 1; i < temperaturas[numMes - 1].length; i++) {
                           //Variable que empieza en el 2º dia del mes, para compararlo con el primero
                           double tempMinDia = temperaturas[numMes - 1][i].getMin();
                           //Vamos comparando las dos temperaturas, siempre quedandonos con la menor
                           if (tempMinDia < temperaturaMinima) {
                                    temperaturaMinima = tempMinDia;
                           }//Fin if
                  }//Fin for

                  return temperaturaMinima;
         }//Fin temperaturaMinima
      
         
         /**
          * Metodo para calcular la temperatura maxima media
          *
          * @param temperaturas array bidimensional de las temperaturas por mes
          * @param numMes numero del mes
          * @return temperatura media maxima del mes
          */
         public static double temperaturaMaxMedia(Temperatura[][] temperaturas, int numMes) {
                  //Declaramos una variable inicializada en 0
                  double sumarTemperaturas = 0;
                  
                  //Recorremos el array que sume las temperaturas maximas hasta la longitud del mes
                  for(int i = 0; i< temperaturas[numMes-1].length; i++){
                           sumarTemperaturas += temperaturas[numMes-1][i].getMax();
                  }//Fin for
                  
                  //Dividimos la suma de las temperaturas maximas entre los dias que tenga el mes
                  double temperaturaMaxMedia = sumarTemperaturas / temperaturas[numMes -1].length;
                  
                  return temperaturaMaxMedia;
         }//Fin temperaturaMedia
         
         
         /**
          * Metodo para calcular la temperatura minima media
          *
          * @param temperaturas array bidimensional de las temperaturas por mes
          * @param numMes numero del mes
          * @return temperatura media minima del mes
          */
         public static double temperaturaMinMedia(Temperatura[][] temperaturas, int numMes) {
                  //Declaramos una variable inicializada en 0
                  double sumarTemperaturas = 0;

                  //Recorremos el array que sume las temperaturas minimas hasta la longitud del mes
                  for (int i = 0; i < temperaturas[numMes - 1].length; i++) {
                           sumarTemperaturas += temperaturas[numMes - 1][i].getMin();
                  }//Fin for

                  //Dividimos la suma de las temperaturas minimas entre los dias que tenga el mes
                  double temperaturaMinMedia = sumarTemperaturas / temperaturas[numMes - 1].length;

                  return temperaturaMinMedia;
         }//Fin temperaturaMedia
         
         
}//Fin class

