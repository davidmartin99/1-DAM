package herencia;

/**
 *
 * @author david
 */
public class Profesor extends Persona {
    //Atributos 
    //Especialidad solo puede ser informatica, administrativo o finanzas
    enum especialidad{INFORMATICA, ADMINISTRATIVO, FINANZAS};
    private especialidad e1;
    
    //Constructores
    public Profesor() {
    }

    public Profesor(String nombre, String apellido, int edad, especialidad e1) {
        //Asi o todo con this.    ambas son validas
        Profesor.super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
        this.e1 = e1;
    }
   
    //GET Y SET
    public void setEspecialidad(especialidad e1){
        this.e1 = e1;
    }
    public especialidad getEspecialidad(){
        return e1;
    }
    
    
   //Metodos propios
    public void imprimirCabecera() {
        System.out.println("--------------------------------");
        System.out.println("|  PROFESOR     |   EDAD |         ESPECIALIDAD      |");
        System.out.println("--------------------------------");
    }

    public void imprimirProfesor() {
        //Podemos sustituir el "Profesor.super.getNombre()" por "super.getNombre()"
        System.out.println("| " + Profesor.super.getNombre() + " " + Profesor.super.getApellido() + "      " + Profesor.super.getEdad() + "      " + Profesor.this.e1);
        //Ponemos .super. porq está heredado 
    }
    
    
    @Override
    public String toString() {
        return "Informacion del Profesor: \n" + "Nombre y Apellidos: " + super.getNombre() + " " + super.getApellido() + "\nEdad: " + super.getEdad() + "\nEspecialidad:  " + this.e1;
    }
 
}
