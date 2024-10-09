package circulo;

import java.io.PrintStream;

public class mainCirculo {
   public static void main(String[] args) {
      Circulo c1 = new Circulo(10.0D);
      Circulo c2 = new Circulo();
      PrintStream var10000 = System.out;
      double var10001 = c1.getRadio();
      var10000.println("Área del círculo1 (radio: " + var10001 + "): " + c1.calcularSuperficie());
      System.out.println("Área del círculo2 (radio por defecto): " + c2.calcularSuperficie());
   }
}
