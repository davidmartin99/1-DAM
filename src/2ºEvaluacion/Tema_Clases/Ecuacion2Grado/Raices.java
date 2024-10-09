package Ecuacion2Grado;

public class Raices {
   private double a;
   private double b;
   private double c;

   public Raices(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
   }

   private void obtenerRaices() {
      double x1 = (-this.b + Math.sqrt(this.getDiscriminante())) / (2.0D * this.a);
      double x2 = (-this.b - Math.sqrt(this.getDiscriminante())) / (2.0D * this.a);
      System.out.println("Solucion X1:");
      System.out.println(x1);
      System.out.println("Solucion X2:");
      System.out.println(x2);
   }

   private void obtenerRaiz() {
      double x = -this.b / (2.0D * this.a);
      System.out.println(x);
   }

   private double getDiscriminante() {
      return Math.pow(this.b, 2.0D) - 4.0D * this.a * this.c;
   }

   private boolean tieneRaices() {
      return this.getDiscriminante() > 0.0D;
   }

   private boolean tieneRaiz() {
      return this.getDiscriminante() == 0.0D;
   }

   public void calcular() {
      if (this.tieneRaices()) {
         this.obtenerRaices();
      } else if (this.tieneRaiz()) {
         this.obtenerRaiz();
      } else {
         System.out.println("No tiene raiz");
      }

   }
}
