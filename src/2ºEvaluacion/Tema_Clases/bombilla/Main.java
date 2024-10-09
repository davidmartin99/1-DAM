package bombilla;

public class Main {
   public static void main(String[] args) {
      Bombilla b1 = new Bombilla();
      Bombilla b2 = new Bombilla();
      Bombilla b3 = new Bombilla();
      b1.apagar();
      b2.encender();
      b3.encender();
      System.out.println("Estado inicial de bombillas");
      System.out.println("bombilla 1: " + b1.mostrarEstado());
      System.out.println("bombilla 2: " + b2.mostrarEstado());
      System.out.println("bombilla 3: " + b3.mostrarEstado());
      Bombilla.interruptorGeneral = false;
      System.out.println("Cortamos la luz general");
      System.out.println("bombilla 1: " + b1.mostrarEstado());
      System.out.println("bombilla 2: " + b2.mostrarEstado());
      System.out.println("bombilla 3: " + b3.mostrarEstado());
      Bombilla.interruptorGeneral = true;
      System.out.println("Activamos la luz general");
      System.out.println("bombilla 1: " + b1.mostrarEstado());
      System.out.println("bombilla 2: " + b2.mostrarEstado());
      System.out.println("bombilla 3: " + b3.mostrarEstado());
   }
}
