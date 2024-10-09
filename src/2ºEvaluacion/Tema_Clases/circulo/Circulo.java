package circulo;

public class Circulo {
   public double radio;

   public Circulo(double radio) {
      this.radio = radio;
   }

   public Circulo() {
      this.radio = 2.0D;
   }

   public double getRadio() {
      return this.radio;
   }

   public double calcularSuperficie() {
      return 3.141592653589793D * Math.sqrt(this.radio);
   }
}
