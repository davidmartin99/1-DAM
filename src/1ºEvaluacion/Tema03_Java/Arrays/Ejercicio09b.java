package tema2b;
/**
 *Crear un tipo enumerado llamado Planetas que contenga los 8 planetas del Sistema Solar.
 * Muestra el texto relativo al nombre del primer planeta, intenta
mostrar la posición que ocupan en ese listado (método ordinal()) 
* e intenta mostrar también el número de planetas existentes(con .values()  
* sacarás el array de componentes que tiene, y a dicho array 
* le podrás aplicar la propiedad .length para mostrar el tamaño de dicho array).
 * @author David
 */

public class Ejercicio09b {
    //Enum para enumerar los planetas
    enum Planetas {MERCURIO, VENUS, TIERRA, MARTE, JUPITER, SATURNO, URANO, NEPTUNO}
    
    public static void main(String[] args){
        Planetas[] vectorPlanetas = Planetas.values();
        
        System.out.println("El primer planeta es "+vectorPlanetas[0]);
        
        Planetas p;
        p= Planetas.JUPITER;
        System.out.println("JUPITER ocupa la posicion "+(p.ordinal()+1)+" del listado"); 
        //Le ponemos p.ordinal()+1 porq el array empieza en 0 
        
        
        System.out.println("El numero total de planetas es "+vectorPlanetas.length);
        //Nos dice cuantos planetas hay. 
    }
    
}
