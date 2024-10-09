package rectangulo;

public class Rectangulo {
   double base;
   double altura;

   public Rectangulo() {
      this.base = 0.0D;
      this.altura = 0.0D;
   }

   public Rectangulo(double base, double altura) {
      this.base = base;
      this.altura = altura;
   }

   public double getBase() {
      return this.base;
   }

   public double getAltura() {
      return this.altura;
   }

   public void setBase(double base) {
      this.base = base;
   }

   public void setAltura(double altura) {
      this.altura = altura;
   }

   public double getArea() {
      return this.base * this.altura;
   }

   public double getPerimetro() {
      return 2.0D * (this.base + this.altura);
   }
}
