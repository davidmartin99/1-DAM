package ArrayObjetosTarea;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
public class Aspirante {
          //Atributos 
          private int number;
          private String name;
          private String secondname;
          enum levelStudies {PreSchool, ElementarySchool, MiddleSchool, HighSchool, College, Graduate};
          private levelStudies level;
          private String email;
          private int phone;

          //Constructores
          public Aspirante(){
                    
          }
          
          public Aspirante(int number, String name, String secondname, levelStudies level, String email, int phone) {
                    this.number = number;
                    this.name = name;
                    this.secondname = secondname;
                    this.level = level;
                    this.email = email;
                    this.phone = phone;
          }//Fin Constructor 
          
          //GET y SET 

          public int getNumber() {
                    return number;
          }
          public String getName() {
                    return name;
          }
          public String getSecondname() {
                    return secondname;
          }
          public levelStudies getLevel() {
                    return level;
          }
          public String getEmail() {
                    return email;
          }
          public int getPhone() {
                    return phone;
          }

          public void setNumber(int number) {
                    this.number = number;
          }
          public void setName(String name) {
                    this.name = name;
          }
          public void setSecondname(String secondname) {
                    this.secondname = secondname;
          }
          public void setLevel(levelStudies level) {
                    this.level = level;
          }
          public void setEmail(String email) {
                    this.email = email;
          }
          public void setPhone(int phone) {
                    this.phone = phone;
          }
          
          //Metodo toString que devuelve una cadena de representación del objeto
         @Override
         public String toString() {
                  return "Aspirante: "
                          + "Name: " + this.getName() + ", " + this.getSecondname()
                          + ", Number  " + this.getNumber()
                          + ", Studies: " + this.getLevel()
                          + ", Phone: " + this.getPhone()
                          + ", Email: "+ this.getEmail();
         }//Fin toString
         
         //Metodo para ir imprimiendo los Aspirantes
         public static void imprimirAspirantes(Aspirante[] aspirantes){
                   for (Aspirante aspirante : aspirantes){
                             System.out.println(aspirante.toString());
                   }//Fin for
         }//Fin imprimirAspirantes
         
         //Metodo para insertar aspirantes
          public static Aspirante[] insertarAspirantes(Aspirante[] aspirantes, int number, String name, String secondName, levelStudies level, String email,  int phone) {
                    Aspirante[] nuevoArray = Arrays.copyOf(aspirantes, aspirantes.length + 1);
                    nuevoArray[aspirantes.length] = new Aspirante(number, name, secondName, level, email, phone);
                    return nuevoArray;
          }//Fin insertarAspirantes
            
          // Métodos de ordenación
          // I- por número
          public static void ordenarPorNumero(Aspirante[] aspirantes) {
                    Arrays.sort(aspirantes, (a, b) -> a.getNumber() - b.getNumber());
          }

          // II- Por nombre
          public static void ordenarPorNombre(Aspirante[] aspirantes) {
                    Arrays.sort(aspirantes, (a, b) -> a.getName().compareTo(b.getName()));
          }

          // III- Por nivel de estudios (levelStudies)
          public static void ordenarPorNivelEstudios(Aspirante[] aspirantes) {
                    Arrays.sort(aspirantes, (a, b) -> a.getLevel().compareTo(b.getLevel()));
          }

          
     
}//Fin class
