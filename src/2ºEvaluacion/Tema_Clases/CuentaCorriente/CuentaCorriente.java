package CuentaCorriente;

public class CuentaCorriente {
   String dni;
   String nombre;
   double saldo;

   public CuentaCorriente() {
   }

   public CuentaCorriente(String dni, String nombre) {
      this.dni = dni;
      this.nombre = nombre;
      this.saldo = 0.0D;
   }

   public boolean retirarDinero(double dinero) {
      boolean dineroSuficiente;
      if (this.saldo >= dinero) {
         this.saldo -= dinero;
         dineroSuficiente = true;
      } else {
         System.out.println("No dispone del saldo suficiente");
         dineroSuficiente = false;
      }

      return dineroSuficiente;
   }

   public void ingresarDinero(double dinero) {
      this.saldo += dinero;
   }

   public void mostrarDatos() {
      System.out.println("Sr/a: " + this.nombre + ", con DNI(" + this.dni + ")");
      System.out.println("Su saldo actual es: " + this.saldo + " euros");
   }
}
