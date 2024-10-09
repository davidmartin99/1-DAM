package CuentaCorriente;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.print("Introduce el DNI: ");
      String dni = teclado.nextLine();
      System.out.print("Introduzca el nombre: ");
      String nombre = teclado.nextLine();
      CuentaCorriente cuenta1 = new CuentaCorriente(dni, nombre);

      int opcion;
      do {
         System.out.println("1.Ingresar Dinero\n2.Retirar Dinero\n3.Mostrar Saldo\n4.Salir\n");
         opcion = teclado.nextInt();
         double dinero;
         switch(opcion) {
         case 1:
            System.out.println("Ingrese el dinero: ");
            dinero = teclado.nextDouble();
            cuenta1.ingresarDinero(dinero);
            break;
         case 2:
            System.out.println("Retire el dinero: ");
            dinero = teclado.nextDouble();
            cuenta1.retirarDinero(dinero);
            break;
         case 3:
            cuenta1.mostrarDatos();
         case 4:
            System.out.println("--- Exit... ---");
            break;
         default:
            System.out.println("Opcion no valida");
         }
      } while(opcion != 4);

   }
}
