package rectangulo;

import java.util.Scanner;

public class mainRectangulo {
   public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Ingrese la base del rectángulo: ");
      double base = teclado.nextDouble();
      System.out.println("Ingrese la altura del rectángulo: ");
      double altura = teclado.nextDouble();
      Rectangulo r1 = new Rectangulo(base, altura);
      System.out.println("\nInformación del Rectángulo:");
      System.out.println("Base: " + r1.getBase());
      System.out.println("Altura: " + r1.getAltura());
      System.out.println("Área: " + r1.getArea());
      System.out.println("Perímetro: " + r1.getPerimetro());
   }
}
