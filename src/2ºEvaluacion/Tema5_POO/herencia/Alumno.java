package herencia;

/**
 *
 * @author david
 */

//Ponemos extends y la clase que queramos heredar
public class Alumno extends Persona{
    //Atributos
    private int NIA;
    
    //Constructores
    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, int NIA) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.NIA = NIA;
    }
    
    //SET Y GET
    public void setNIA(int NIA) {
        this.NIA = NIA;
    }
    
    public int getNIA() {
        return NIA;
    }
    
    //Metodos propios
    public void imprimirCabecera() {
        System.out.println("--------------------------------");
        System.out.println("|  ALUMNO     |   EDAD |         NIA      |");
        System.out.println("--------------------------------");
    }

    public void imprimirAlumno() {
        System.out.println("| " + Alumno.super.getNombre() + " " + Alumno.super.getApellido() + "      " + Alumno.super.getEdad() + "      " + Alumno.this.NIA);
        //Ponemos .super. porq está heredado 
    }
    
    @Override
    public String toString(){
        return "Informacion del Alumno: \n"+"Nombre y Apellidos: "+super.getNombre()+" "+super.getApellido()+"\nEdad: "+super.getEdad()+"\nNIA: "+this.getNIA();
    }
    
    
    

    
}//Fin subclase Alumno
