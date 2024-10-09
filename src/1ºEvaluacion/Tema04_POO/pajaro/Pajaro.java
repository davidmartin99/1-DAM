package pajaro;

/**
 *
 * @author David
 */
public class Pajaro {
    String nombre;
    int posX, posY;
    public Pajaro(){} //Metodo Constructor 1
    
    public Pajaro(String nombre, int posX, int posY){
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;
    }//Metodo Constructor 2
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPosX(int posX){
        this.posX = posX;
    }
    public void setPosY(int posY){
        this.posY = posY;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getPosX(){
        return posX;
    }
    public int getPosY(){
        return posY;
    }
    
    double volar(int posX, int posY){
        double desplazamiento = Math.sqrt (Math.pow((posX-this.posX),2)  + Math.pow((posY-this.posY),2)); //Crear variable
        this.posX = posX;
        this.posY = posY;
        
        return desplazamiento;
    }//Fin metodo volar
}
