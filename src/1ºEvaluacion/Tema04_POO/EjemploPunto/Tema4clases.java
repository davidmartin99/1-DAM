package Ej_Punto;

/**
 *
 * @author David
 */

public class Tema4clases {
    public static void main(String[] args){
        Punto punto1 = new Punto(); //"new Punto()" es lo mismo que "null"
        Punto punto2 = new Punto();
        Punto punto3 = new Punto();
        Punto punto4 = new Punto(3,4); //1º Metodo Constructor 
        punto1 = punto4;
        //2º Metodo Constructor
        punto2.setX(1);
        punto2.setY(3);
        
        //Obtener valores del objeto
        int valorX, valorY;
        valorX = punto4.getX(); //Accedo a los valores de X 
        valorY = punto4.getY(); //Accedo a los valores de Y
        
        //Aplicar metodos propios
        double moduloP4 = punto4.modulo();
        
        System.out.println("Punto 4: valor de x: "+valorX+" valor de y: "+valorY);
        System.out.println("Modulo: "+moduloP4);
        System.out.println("Fase: "+punto4.fase());
        
        System.out.println("Valor de PI: "+Punto.PI);
    }
}//Fin class
