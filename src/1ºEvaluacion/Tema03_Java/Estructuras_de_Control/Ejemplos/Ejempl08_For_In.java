package tema3;

/**
 *Se usan mucho con Arrays
 * @author David
 */
public class Ejempl08_For_In {
    public static void main(String[] args){
        //declaracion e inicializacion de Variables
        String[] semana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        String[] year = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        for (String dia:semana){
            System.out.println(dia);
        }
        
        //Ahora con meses
        for (String mes:year){
            System.out.println(mes);
        }
        
    }
    
}