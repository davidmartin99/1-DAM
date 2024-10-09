package tema3;
/**
 *
 * @author David
 */
public class Ejemplo07_For_Infinito {
    public static void main(String[] args){
        
        //K va sumando y J restando hasta que J es mayor que K
        for (int k=1, j=10; k<j; k++, j--){
            System.out.println(k+ " x " +j);
        }
        
        for (int k=1, j=10; k<=10&&j>0; k++, j--){
            System.out.println(k+ " x " +j);
        }
                
        
    }
    
}
