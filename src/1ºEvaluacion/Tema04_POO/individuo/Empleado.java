package individuo;

/**
 *
 * @author David
 */
public class Empleado {
    private String nombre;
    private double sueldo;
    
    //Metodos Constructores
    public Empleado(){
    }//Metodo vacio
    
    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        sueldo = salario;
    }//Metodo Constructor 2
    
    //Metodos GET y SET
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setSueldo(double salario){
        sueldo = salario;
    }
    public double getSueldo(){
        return sueldo;
    }
    
    //Metodos especificos de la clase 
    public void subidaSueldo(double porcentaje){
        System.out.println("Ha subido un total de: " + sueldo * porcentaje);
        sueldo = sueldo + (sueldo*porcentaje/100);
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+", suledo: "+sueldo);
    }
}
