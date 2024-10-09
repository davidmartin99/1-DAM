package Ej_NumNaturales;

/**
 *
 * @author David
 */
public class MainNumerosNaturales {
    public static void main(String[] args){
        //1º Metodo Constructor
        NumerosNaturales rango1 = new NumerosNaturales(0,10);
        //2º Metodo Constructor
        NumerosNaturales rango2 = new NumerosNaturales();
        rango2.setInicial(10);
        rango2.setMaximo(20);

        //Obtener valores del objeto
        int valorInicial, valorMaximo;
        valorInicial = rango1.getInicial();
        valorMaximo = rango1.getMaximo();
        
        //Aplicar metodos propios
        rango1.imprimirRango();
        System.out.println("");
        rango1.imprimirRangoInverso();
        
    }//Fin main
}//Fin class
