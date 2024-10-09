package practicaEvaluable2;

/**
 * Clase Persona
 * Sirve para crear una persona con nombre, apellido, fecha de nacimiento y DNI
 * 
 * @author David Martin
 */
public class Persona {
         //Atributos
         protected String nombre;
         protected String apellido;
         protected Fecha fechaNacimiento;
         protected DNI dni;
         private String nif;

         //Constructores
         public Persona() {
         }

         /**
          * Constructor que crea instancias de Persona 
          * Verifica que la fecha introducida sea correcta
          * @param nombre
          * @param apellido
          * @param fechaNacimiento
          * @param dni
          * @throws Exception   Si la fecha no es correcta
          */
         public Persona(String nombre, String apellido, Fecha fechaNacimiento, DNI dni) throws Exception {
                  this.nombre = nombre;
                  this.apellido = apellido;
                  this.fechaNacimiento = fechaNacimiento;
                  if (!fechaNacimiento.fechaCorrecta()) {
                           throw new Exception("La fecha de nacimiento no es válida");
                  }
                  this.dni = dni;
         }//Fin Constructores
        
         //Metodos GET Y SET
         public String getNombre() {
                  return nombre;
         }
         
         public String getApellido() {
                  return apellido;
         }
         
         public Fecha getFechaNacimiento() {
                  return fechaNacimiento;
         }
         
         public DNI getDni() {
                  return dni;
         }

         public void setNombre(String nombre) {
                  this.nombre = nombre;
         }
         
         public void setApellido(String apellido) {
                  this.apellido = apellido;
         }
         
         public void setFechaNacimiento(Fecha fechaNacimiento) {
                  this.fechaNacimiento = fechaNacimiento;
         }
         
         //Valida que el DNI sea correcto
         public void setDni(DNI dni) throws Exception {
                  if (dni.validarNIF(nif)) {
                           throw new Exception("DNI incorrecto");
                  }
                  this.dni = dni;
         }
         
}//Fin clase Persona
