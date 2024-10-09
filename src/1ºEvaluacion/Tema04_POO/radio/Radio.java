package radio;

/**
 * Crear un objeto Radio que tenga frecuencia entre 80 y 108, 
 * el usuario introduce la frecuencia y puede subir o bajarla 0,5
 * también puede mostrar la frecuencia y salir
 * @author David
 */

public class Radio {
    private double frecuencia;
    private final int frecuenciaMin = 80;
    private final int frecuenciaMax = 108;
    private final double variacion = 0.5;
    
    //Metodos Constructores
    public Radio(){} //Fin Metodo Constructor 1
    
    public Radio(double frecuencia){
        this.frecuencia = frecuencia;
    }//Fin Metodo Constructor 2
    
    //Metodos SET Y GET
    public void setFrecuencia (double frecuencia){
        if(frecuencia>= frecuenciaMin && frecuencia<= frecuenciaMax){
            this.frecuencia = frecuencia;
        }else{
            this.frecuencia = frecuenciaMin;
        }
    }
    public double getFrecuencia(){
        return frecuencia;
    }

    //Metodos Especificos de la Clase
    public void subirFrecuencia(){
        frecuencia = frecuencia + variacion;
        if (frecuencia > frecuenciaMax){
            frecuencia = frecuenciaMin;
        }
    }
    public void bajarFrecuencia(){
        frecuencia = frecuencia - variacion;
        if (frecuencia < frecuenciaMin){
            frecuencia = frecuenciaMax;
        }
    }
    
    public void mostrarDatos() {
        System.out.println("La frecuencia actual es: "+frecuencia);
    }

}
