package juegos;

/**
 *
 * @author david
 */
public class Dados {
    public static void main(String[] args) {
        int resultadoDado = (int) (Math.random() * 6) + 1; 
        System.out.println("El dado ha caído en: " + resultadoDado);
    }
}