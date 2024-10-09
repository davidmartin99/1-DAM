package Ej_Punto;

/**
 *
 * @author David
 */

public class Punto {
    private int x,y;
    //Definir una variable sin crear metodo constructor con STATIC
    public static final double PI = 3.1415;
    
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }//Fin metodo Constructor 1º
    
    public Punto(){
        this.x = 0;
        this.y = 0;
    }//Fin metodo Constructor 2º
    
    public void setX(int x){
        this.x = x;
    }//Fin setX
    
    public void setY(int y){
        this.y = y;
    }//Fin setY
    
    public int getX(){
        return x;
    }//Fin getX
    
    public int getY(){
        return y;
    }//Fin getY
    
    //Formula de un modulo -> raíz de x2 + y2 
    public double modulo(){
        return Math.sqrt(this.x*this.x + this.y*this.y);
    }//Fin modulo
    
    public double fase(){
        double fase= (double)(this.y)/(this.x);
        return Math.atan(fase); //tangente 
    }//Fin fase
    
}//Fin class
