package individuo;

/**
 * Calcular la poblacion, cada vez que se añade un individuo 
 * añadir altura y calcular edad con el año actual
 * tambien añade 1cm a la altura
 * @author David
 */
public class Individuo {
    private String dni, nombre;
    private int fechaNacimiento;
    private static int poblacion; //static para que pueda ir cambiando 
    private static int añoActual = 2024;
    private int edad;
    private double altura;
    
    public Individuo(){} //Fin Metodo Constructor 1
    
    public Individuo(String dni,String nombre, int fechaNacimiento){
        super(); //Primera linea del metodo constructor que invoque a la clase superior que comparta el mismo tipo de parametrizacion
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        poblacion++; //Se asume que partira de valor 0
    }//Fin Metodo Constructor 2
    
    //Creamos otro metodo constructor igual añadiendo altura
    public Individuo(String dni, String nombre, int fechaNacimiento, double altura) {
        super(); //Primera linea del metodo constructor que invoque a la clase superior que comparta el mismo tipo de parametrizacion
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        edad = añoActual - fechaNacimiento;
        poblacion++; //Se asume que partira de valor 0
    }//Fin Metodo Constructor 2
    
    //Metodos GET y SET
    public void setDni (String dni){
        this.dni = dni;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public void setFechaNacimiento(int fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    public static void setPoblacion(int poblacion){ //Creamos con static 
        Individuo.poblacion=poblacion; //no ponemos this. ponemos Individuo (el objeto)
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    public String getDni(){
        return dni;
    }
    public String getNombre(){
        return nombre;
    }
    public int getFechaNacimiento(){
        return fechaNacimiento;
    }
    public static int getPoblacion(){ //Creamos con static
        return poblacion;
    }
    public double getAltura(){
        return altura;
    }
    public int getEdad(){
        return edad;
    }
    
    //Metodos que no devuelven ningun valor por eso no son SET o GET
    public void incrementarAltura() {
        altura = altura + 0.01; //Incremento 1 cm la altura, está en metros por eso es 0,01
    }
    public void saludar(){
        System.out.println("Hola. Mi nombre es: "+nombre);
        System.out.println("Encantado de saludarte. Tengo"+edad+" años y mido "+altura+" metros");
    }
}//Fin class
