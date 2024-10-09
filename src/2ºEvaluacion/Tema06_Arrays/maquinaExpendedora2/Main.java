package maquinaExpendedora2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author david
 */

public class Main {
         public static void main(String[] args) {
             // Declarar el array bidimensional maquinaExpendedora

             // Inicializar el array con productos
             //Bebidas
             Producto[] bebidas = {
                     new Producto("Cocacola", 1.0, 5, 101),
                     new Producto("Zumo de naranja", 0.75, 5, 102),
                     new Producto("Zumo de piña", 0.70, 5, 103),
                     new Producto("Agua mineral con gas", 0.60, 5, 104),
                     new Producto("Agua mineral sin gas", 0.60, 5, 105)
             };

             //Sandwiches
             Producto[] sandwiches = {
                     new Producto("Vegetal", 2.10, 5, 106),
                     new Producto("de Pollo", 2.10, 5, 107)
             };

             //Dulces
             Producto[] dulces = {
                       new Producto("cookie", 0.35, 5, 108),
                       new Producto("Croissant", 0.80, 5, 109),
                       new Producto("Napolitana", 1.25, 5, 110)
             };
                     
             
             //Declaramos el array BIDIMENSIONAL 
             Producto[][] maquinaExpendedora = {bebidas, sandwiches, dulces};
             
             //Array que va recorriendo los tipos de productos
             String[] tipoProducto = {"Bebidas", "Sandwiches", "Dulces"};

             int opcion;
             Scanner scanner = new Scanner(System.in);

             // Menú de opciones
             do {
                 System.out.println("***************************************************************");
                 System.out.println("          MAQUINA EXPENDEDORA          ");
                 System.out.println("1- Mostrar los productos y sus precios.");
                 System.out.println("2- Mostrar productos y cantidades que quedan.");
                 System.out.println("3- Comprar un producto.");
                 System.out.println("4- Reponer un producto.");
                 System.out.println("5- Salir.");
                 System.out.println("***************************************************************");
                 System.out.print("Ingrese su opción: ");
                 opcion = scanner.nextInt();
                  System.out.println(" ");

                 switch (opcion) {
                     case 1:
                         mostrarProductosYPrecios(maquinaExpendedora, tipoProducto);
                         break;
                     case 2:
                         mostrarProductosYCantidades(maquinaExpendedora, tipoProducto);
                         break;
                     case 3:
                         comprarProducto(maquinaExpendedora);
                         break;
                     case 4:
                         reponerProducto(maquinaExpendedora);
                         break;
                     case 5:
                         System.out.println("Saliendo... ");
                         break;
                     default:
                         System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                 }
             } while (opcion != 5);
             
         }//Fin MAIN
         
         //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                  // Método para mostrar los productos y sus precios agrupados por tipo
                  public static void mostrarProductosYPrecios(Producto[][] maquinaExpendedora, String[] tipoProducto) {
                      System.out.println("Productos y sus Precios: ");
                      for (int i = 0; i < maquinaExpendedora.length; i++) {
                          System.out.println(tipoProducto[i] + ":");
                          for (Producto producto : maquinaExpendedora[i]) {
                              System.out.println(producto.getNombre() + " (" + producto.getPrecio() + " euros)");
                          }
                               System.out.println(" ");
                      }
                           System.out.println("");
                  }//Fin mostrarProductosYPrecios

                  // Método para mostrar los productos y sus cantidades agrupados por tipo
                  public static void mostrarProductosYCantidades(Producto[][] maquinaExpendedora, String[] tipoProducto) {
                      System.out.println("Productos y sus Cantidades: ");
                      for (int i = 0; i < maquinaExpendedora.length; i++) {
                          System.out.println(tipoProducto[i] + ":");
                          for (Producto producto : maquinaExpendedora[i]) {
                              System.out.println(producto.getNombre() + " (stock: " + producto.getCantidad() + ")");
                          }
                               System.out.println(" ");
                      }
                  }//Fin mostrarProductosYCantidades

                  
                 
                  // Método para comprar un producto
                  public static void comprarProducto(Producto[][] maquinaExpendedora) {
                            System.out.println(Arrays.deepToString(maquinaExpendedora)+"\n");
                           Scanner scanner = new Scanner(System.in);
                           System.out.println("Ingrese el codigo del producto que desea comprar: ");
                           int codigoProducto = scanner.nextInt();

                           boolean encontrado = false;
                           for (int i = 0; i < maquinaExpendedora.length; i++) {
                                    for (int j = 0; j < maquinaExpendedora[i].length; j++) {
                                             if (codigoProducto == (maquinaExpendedora[i][j].getCodigo())) {
                                                      encontrado = true;
                                                      if (maquinaExpendedora[i][j].getCantidad() > 0) {
                                                               System.out.println("Introduzca el dinero: ");
                                                               double dinero = scanner.nextDouble();
                                                               if (dinero >= maquinaExpendedora[i][j].getPrecio()) {
                                                                        maquinaExpendedora[i][j].setCantidad(maquinaExpendedora[i][j].getCantidad() - 1);
                                                                        System.out.println("Gracias por su compra");
                                                                        double cambio = dinero - maquinaExpendedora[i][j].getPrecio();
                                                                        System.out.println("Su cambio es: " + cambio);
                                                               } else {
                                                                        System.out.println("Error: Dinero insuficiente");
                                                               }
                                                      } else {
                                                               System.out.println("Lo siento, no hay stock del producto");
                                                      }
                                                      break;
                                             }
                                    }
                                    if (encontrado) {
                                             break;
                                    }
                           }
                           if (!encontrado) {
                                    System.out.println("Producto no encontrado.");
                           }
                  }//Fin comprarProducto

                  
                  // Método para reponer un producto
                  public static void reponerProducto(Producto[][] maquinaExpendedora) {
                            Scanner scanner = new Scanner(System.in);
                            System.out.println("Ingrese el nombre del producto a reponer: ");
                            String productoBuscado = scanner.nextLine();

                            boolean encontrado = false;
                            for (int i = 0; i < maquinaExpendedora.length; i++) {
                                      for (int j = 0; j < maquinaExpendedora[i].length; j++){
                                                if (productoBuscado.equalsIgnoreCase(maquinaExpendedora[i][j].getNombre())) {
                                                encontrado = true;
                                                if (maquinaExpendedora[i][j].getCantidad() < 5) {
                                                          // Si hay menos de 5 se repone
                                                          maquinaExpendedora[i][j].setCantidad(5);
                                                          System.out.println("se ha repuesto " + maquinaExpendedora[i][j].getNombre() + ",  (stock ahora" + maquinaExpendedora[i][j].getCantidad() + ")");
                                                } else {
                                                          System.out.println("Ya hay stock suficiente.");
                                                          break;
                                                }//Fin if - else
                                               }//Fin 1º if
                                      }//Fin 2º for
                            }//Fin 1º for

                  }//Fin reponerProducto

                  
}//Fin class
                  
                  
