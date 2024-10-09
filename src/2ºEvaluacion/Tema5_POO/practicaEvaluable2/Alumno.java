package practicaEvaluable2;

import java.util.Calendar;

/**
 *Clase Alumno.
 * Tiene herencia de la clase Persona, 
 * pero tambi�n calcular� la edad del Alumno
 * 
 * @author David Martin
 */

public class Alumno extends Persona {
         //Atributos
         private int edad;

         //Constructores
         public Alumno() {
         }
         /**
          * Constructor para crear instancias del Alumno.
          * Tiene dentro el m�todo para calcular la edad.
          * @param nombre
          * @param apellido
          * @param fechaNacimiento
          * @param dni
          * @throws Exception 
          */
         public Alumno(String nombre, String apellido, Fecha fechaNacimiento, DNI dni) throws Exception {
                  super(nombre, apellido, fechaNacimiento, dni);
                  calcularEdad(); // Calcular la edad al construir el objeto
         }//Fin Constructores


         //SET Y GET
         public int getEdad() {
                  return edad;
         }
         
         public void setEdad(int edad) {
                  this.edad = edad;
         }
         
        //Metodos Propios
         //Calcula la edad, para ello utiliza la fecha de actual con java.util.Calendar.
         private void calcularEdad() {
                        //Obtenemos la Fecha Actual
                  Calendar fechaActual = Calendar.getInstance();
                  int a�oActual = fechaActual.get(Calendar.YEAR);
                  int mesActual = fechaActual.get(Calendar.MONTH) + 1; // Se suma 1 porque enero es 0
                  int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

                  //Asignamos valores para compararlos con la Fecha Actual
                  int a�oNacimiento = this.getFechaNacimiento().getA�o();
                  int mesNacimiento = this.getFechaNacimiento().getMes();
                  int diaNacimiento = this.getFechaNacimiento().getDia();

                  // Calculamos la Edad.
                  this.edad = a�oActual - a�oNacimiento;
                  if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
                           this.edad--; // No ha cumplido a�os a�n
                  }//Fin if
         }//Fin calcularEdad

          //Metodo toString que devuelve una cadena de representaci�n del objeto
         @Override
         public String toString() {
                  return "\n-----------Alumno---------"
                          + "\n Nombre completo: " + super.getNombre() + " " + super.getApellido()
                          + "\n DNI:  " + super.getDni().toString()
                          + "\n Fecha Nacimiento: " + super.getFechaNacimiento()
                          + "\n Edad: " + this.edad;
         }//Fin toString
         
       
}//Fin subclase Alumno
