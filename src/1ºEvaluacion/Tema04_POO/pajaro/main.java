package pajaro;

/**
 *
 * @author David
 */
public class main {
    public static void main(String[] args){
        //Creacion de Objetos
        Pajaro aguila = new Pajaro ("Juan", 50, 50);
        Pajaro loro = new Pajaro ("Lucy", 10,10);
        
        double distancia = aguila.volar(10, 10);
        
        System.out.println("El desplazamiento del aguila "+aguila.getNombre()+" ha sido: "+distancia);
        
        Pajaro paloma = new Pajaro();
        paloma.setNombre("Helen");
        paloma.setPosX(5);
        paloma.setPosY(1);
        
        double distancia2 = aguila.volar(paloma.getPosX(), paloma.getPosY());
        System.out.println("El desplazamiento del aguila "+aguila.getNombre()+" para cazar a la paloma ha sido: "+distancia2);
    }
}
