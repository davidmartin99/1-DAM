package maquinaExpendedora;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Main {
         
         public static void main(String[] args){
                  //Declarar el array maquinaExpendedora 
                  Producto[] maquinaExpendedora = new Producto[10];
                  maquinaExpendedora[0] = new Producto ("Cocacola", 1.0, 5, "Bebida");
                  maquinaExpendedora[1] = new Producto("Zumo de naranja", 0.75, 5, "Bebida");
                  maquinaExpendedora[2] = new Producto("Zumo de piña", 0.70, 5, "Bebida");
                  maquinaExpendedora[3] = new Producto("Agua mineral con gas", 0.60, 5, "Bebida");
                  maquinaExpendedora[4] = new Producto("Agua mineral sin gas", 0.60, 5, "Bebida");
                  maquinaExpendedora[5] = new Producto("Vegetal", 2.10, 5, "Sandwich");
                  maquinaExpendedora[6] = new Producto("de Pollo", 2.10, 5, "Sandwich");
                  maquinaExpendedora[7] = new Producto("Cookies de chocolate", 0.35, 5, "Dulce");
                  maquinaExpendedora[8] = new Producto("Croissant", 0.80, 5, "Dulce");
                  maquinaExpendedora[9] = new Producto("Napolitana", 1.25, 5, "Dulce");
                  
                  int opcion;
                  //Menu de opciones
                  do {
                           System.out.println("");
                           System.out.println("""
                                                *****************************************************************************
                                                __________MAQUINA EXPENDEDORA________________
                                                1- Mostrar los productos y sus precios.
                                                2- Mostrar  productos y cantidades que quedan.
                                                3- Comprar un producto.
                                                4- Reponer un producto.
                                                5- Salir.
                                                ******************************************************************************
                                                """);
                           Scanner teclado = new Scanner(System.in);
                           opcion = teclado.nextInt();
                           teclado.nextLine();

                           switch (opcion) {
                                    case 1:
                                             System.out.println("Productos y sus Precios:  ");
                                             for (int i = 0; i < maquinaExpendedora.length; i++) {
                                                               System.out.print(maquinaExpendedora[i].getNombre()+" ("+maquinaExpendedora[i].getPrecio()+" euros)" );
                                                               System.out.println("");
                                             }//Fin 1 for
                                             break;
                                    case 2:
                                             System.out.println("Productos y sus Cantidades:  ");
                                             for (int i = 0; i < maquinaExpendedora.length; i++) {
                                                      System.out.print(maquinaExpendedora[i].getNombre() + " (stock: " + maquinaExpendedora[i].getCantidad() + ")");
                                                      System.out.println("");
                                             }//Fin 1 for
                                             break;
                                    case 3:
                                             comprarProducto(maquinaExpendedora);
                                             break;
                                    case 4:
                                             reponerProducto(maquinaExpendedora);
                                             break;         
                                    case 5:
                                             System.out.println("Saliendo... ");
                                             System.exit(0);
                                             break;
                                    default:
                                             System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                           }//Fin switch

                  } while (opcion != 5);
                  
         }//Fin MAIN
         
         //Metodo para Comprar un producto
         public static void comprarProducto(Producto maquinaExpendedora[]){
                  Scanner scanner = new Scanner(System.in);
                  System.out.println("Ingrese el nombre del producto que desea comprar: ");
                  String productoBuscado = scanner.nextLine();
                  
                  boolean encontrado = false;
                  for(int i = 0; i <maquinaExpendedora.length; i++){
                           if(productoBuscado.equalsIgnoreCase(maquinaExpendedora[i].getNombre())){
                                    encontrado = true;
                                    if (maquinaExpendedora[i].getCantidad() > 0) {
                                             System.out.println("Introduzca el dinero: ");
                                             double dinero = scanner.nextDouble();
                                             if (dinero >= maquinaExpendedora[i].getPrecio()) {
                                                      maquinaExpendedora[i].setCantidad(maquinaExpendedora[i].getCantidad() - 1);
                                                      System.out.println("Gracias por su compra");
                                                      double cambio = (maquinaExpendedora[i].getPrecio() - dinero)*(-1);
                                                       System.out.println("Su cambio es: "+cambio);
                                             }
                                             else{
                                                       System.out.println("error: Dinero insuficiente");
                                             }
                                    } else {
                                             System.out.println("Lo siento, no hay stock del producto");
                                    }//Fin if - else
                                    break;
                           }//Fin 1º if
                  }//Fin for
                   if (!encontrado) {
                             System.out.println("Producto no encontrado.");
                   }
         }//Fin comprarProducto
         
         //Metodo para Reponer un producto
         public static void reponerProducto(Producto maquinaExpendedora[]) {
                  Scanner scanner = new Scanner(System.in);
                  System.out.println("Ingrese el nombre del producto a reponer: ");
                  String productoBuscado = scanner.nextLine();

                  boolean encontrado = false;
                  for (int i = 0; i < maquinaExpendedora.length; i++) {
                           if (productoBuscado.equalsIgnoreCase(maquinaExpendedora[i].getNombre())){
                                     encontrado = true;
                                     if (maquinaExpendedora[i].getCantidad() < 5) {
                                               // Si hay menos de 5 se repone
                                               maquinaExpendedora[i].setCantidad(5);
                                               System.out.println("se ha repuesto" + maquinaExpendedora[i].getNombre() + ",  (stock ahora" + maquinaExpendedora[i].getCantidad() + ")");
                                     } else {
                                               System.out.println("Ya hay stock suficiente.");
                                               break;
                                     }//Fin if - else
                           }
                  }//Fin for
         }//Fin comprarProducto
         
}//Fin CLASS
