package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_3;
import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Un menu que tiene una serie de opciones entre ellas añadir un nuevo alumno al array de objetos de la clase de Alumno_Clase
 * @author Mparr
 * @version 1.0
 * @date  17/02/2024
 */

public class Main {
//Zona de declaracion externa
   static int i = 5;
     static Alumno_Clase[] alumnos = new Alumno_Clase[31];//Se puede cambiar el numero de alumnos que puede almacenar el array con un minímo de 5
    //Zona de inicializacion externa
    public  static void añadirAlumnos(){
      //Menu para añadir un objeto al array
            String nombre = JOptionPane.showInputDialog("Inserta el nombre del alumno");
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Inserta la nota del alumno"));
            if (i< 31) {
                 alumnos[i]= new Alumno_Clase(nombre,nota);
                i++;
            } else {
                JOptionPane.showMessageDialog(null, "La clase está llena","Error",JOptionPane.ERROR_MESSAGE);
            }//Fin else
    }//Fin de añadirAlumno
    public static void menu() {
        //Zona de declaracion de variables
        int eleccion;
        boolean salir =false;
        for (int j = 0; j < alumnos.length; j++) {
             alumnos[j]=new Alumno_Clase(" ",0);
        }
        alumnos[0]=new Alumno_Clase("Juan",6);
        alumnos[1]=new Alumno_Clase("Pepe",3);
        alumnos[2]=new Alumno_Clase("Sara",8);
        alumnos[3]=new Alumno_Clase("Elena",4);
        alumnos[4]=new Alumno_Clase("Alejandro",9);
        //Zona de salida
        do {
            String opciones = """
                    ----------------------------
                    Elige una de las opciones:
                    1->Muestra lista de alumnos por orden alfabético
                    2->Muestra lista de alumnos por mayor nota
                    3->Añadir un nuevo alumno
                    0->Salir
                    ----------------------------""";
            eleccion = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            switch (eleccion) {
                case 1:
                    Arrays.sort(alumnos, 0, i, Comparator.comparing(Alumno_Clase::getNombre));//El comparador va ordenando los nombres alfabeticamente
                    mostrarAlumnos();
                    break;
                case 2:
                    Arrays.sort(alumnos, Alumno_Clase::compararPorNotaDescendente);
                    mostrarAlumnos();
                    break;
                case 3:
                    añadirAlumnos();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    salir=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error");
                    break;
            }//Fin switch
        } while (!salir);
    }//Fin de menu
    public static void mostrarAlumnos() {
        //Declaro una variable que va ha funcionar para concatenar todas las lineas que muestre el array
        String resultado = "";
        for (Alumno_Clase alumno : alumnos) {
            if (alumno != null) {
                resultado += alumno.getNombre() + " : " + alumno.getNota() + "\n";
            }//Fin del if
        }//Fin del for
        //Muestro por ventana todos los alumnos en el orden que halla decido el usuario
        JOptionPane.showMessageDialog(null, resultado);
    }// Fin de mostrarAlumnos
    public static void main(String[] args) {
        //Llamo al metodo menu
            menu();
    }//Fin del main
}//Fin del clase Main