package bombilla;

public class Bombilla {
   public static boolean interruptorGeneral = true;
   private boolean interruptor = false;

   public void encender() {
      this.interruptor = true;
   }

   public void apagar() {
      this.interruptor = false;
   }

   public boolean estado() {
      return interruptorGeneral && this.interruptor;
   }

   public String mostrarEstado() {
      return this.estado() ? "Encendida" : "Apagada";
   }
}
