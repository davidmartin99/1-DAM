package Ej_NumNaturales;

/**
 *
 * @author David
 */
public class NumerosNaturales {
    private int inicial, maximo;
    
    public NumerosNaturales(int inicial, int maximo) {
        this.inicial = inicial;
        this.maximo = maximo;
    }//Fin 1º Metodo Constructor 
    
    public NumerosNaturales(){
        this.inicial = 0;
        this.maximo = 0;
    }//Fin 2º Metodo Constructor


    public void setInicial(int inicial) {
        this.inicial = inicial;
    }//Fin setX

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }//Fin setY

    public int getInicial() {
        return inicial;
    }//Fin getX

    public int getMaximo() {
        return maximo;
    }//Fin getY
    
    //Metodo Reiniciar
    public void reset(){ //Es public void porque no calcula nada, ni devuelve resultado
        this.inicial=0;
        this.maximo=0;
    }//Fin reiniciar
    
    //Metodo Imprimir de menor a mayor
    public void imprimirRango(){
        System.out.print("Rango: ");
        for (int i=this.inicial; i<=this.maximo; i++){
            System.out.print(i+" ");
        }//Fin for
    }//Fin imprimir
    
    //Metodo Imprimir Inverso
    public void imprimirRangoInverso(){
        System.out.print("Rango Inverso: ");
        for (int i=this.maximo; i>=this.inicial; i--){
            System.out.print(i+" ");
        }//Fin for
    }//Fin imprimir inverso
    
    
}
