package practicaEvaluable2;

/**
 * Clase Profesor
 *  Tiene herencia de la clase Persona,
 * además se le añaden dos atributos: cuenta y nomina.
 * 
 * @author David Martin
 */
public class Profesor extends Persona{
         //Atributos
         private String cuenta;
         private double nomina;

         //Constructores
         public Profesor() {
         }
         /**
          *  Constructor que crea instancias de Profesor
          * @param nombre
          * @param apellido
          * @param fechaNacimiento
          * @param dni
          * @param cuenta
          * @param nomina
          * @throws Exception  esta Excepcion es heredada de la clase Persona
          */
         public Profesor(String nombre, String apellido, Fecha fechaNacimiento, DNI dni, String cuenta, double nomina) throws Exception {
                  super(nombre, apellido, fechaNacimiento, dni);
                   if (!validarCuenta()) {
                             throw new Exception("La cuenta no es válida.");
                   } else {
                             this.cuenta = cuenta;
                   }
                  this.nomina = nomina;
         }//Fin Constructor

         
         //SET y GET
         public String getCuenta() {
                  return cuenta;
         }
         
         public double getNomina() {
                  return nomina;
         }
         
         //Valida que la cuenta sea correcta
         public void setCuenta(String cuenta) throws Exception {
                   this.cuenta = cuenta;
         }
         
         public void setNomina(double nomina) {
                  this.nomina = nomina;
         }
         
         //Metodos Propios
         /**
          *  Comprueba que la cuenta sea correcta
          * @return true si la cuenta es validada
          */
         private boolean validarCuenta(){
                  boolean valido = true;
                  
                  if (cuenta == null) {
                           valido = false;
                  } else if (cuenta.length() > 20 || cuenta.length() < 20) {
                           valido = false;
                  } else {
                           valido = true;
                  }//Fin if-elseif-else

                  return valido;
         }//Fin validarCuenta
         
          //Metodo toString que devuelve una cadena de representación del objeto
         @Override
         public String toString() {
                  return "\n-----------Profesor---------"
                          + "\n Nombre completo: " + super.getNombre() + " " + super.getApellido()
                          + "\n DNI:  " + super.getDni().toString()
                          + "\n Fecha Nacimiento: " + super.getFechaNacimiento()
                          + "\n Cuenta Corriente: " + this.getCuenta()
                          +"\n Nomina: " + this.getNomina();
         }//Fin toString

       

}//Fin class
