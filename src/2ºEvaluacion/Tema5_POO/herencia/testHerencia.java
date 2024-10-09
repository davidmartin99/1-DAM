package herencia;

/**
 *
 * @author david
 */
import herencia.Profesor.especialidad;
        
public class testHerencia {
    
    public static void main(String[] args){
        //////ALUMNO
        Alumno juan = new Alumno("Juan", "Torres", 25,11111111);
        //System.out.println(juan.nombre+" "+juan.apellido+" "+juan.edad+" "+juan.getNIA());
        //System.out.println(juan.getNombre()+" "+juan.getApellido());
        
        juan.imprimirCabecera();
        juan.imprimirAlumno();
        
        ///////PROFESOR
        Profesor pepe = new Profesor ("Pepe", "Martin", 40, especialidad.INFORMATICA);
        pepe.imprimirCabecera();
        pepe.imprimirProfesor();
        //String resultado = pepe.toString();
        System.out.println(pepe.toString());
        
    
       
    }
    
    
}
