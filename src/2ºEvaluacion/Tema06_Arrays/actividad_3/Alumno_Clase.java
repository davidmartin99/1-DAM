package Practicas_Obligatorias.Practica_Evaluable_Tema_6_Parra_Llansó_Manuel.actividad_3;

public class Alumno_Clase {
     private String nombre;
     private int nota;
     public Alumno_Clase(String nombre, int nota){
         this.nombre=nombre;
         this.nota=nota;
     }//Fin del metodo constructor

    public int getNota() {
        return nota;
    }//Fin  de get nota

    public String getNombre() {
        return nombre;
    }//Fin de get nombre

    @Override
    public String toString(){
         return nombre+":"+nota;
    }//Fin del toString
    public int compareTo(Alumno_Clase otroAlumno) {
        return this.nombre.compareTo(otroAlumno.nombre);
    }//Fin de compareTo para nombres
    public int compararPorNotaDescendente(Alumno_Clase otroAlumno) {
        return Integer.compare(otroAlumno.nota, this.nota);
    }//Fin compareTo para notas
}
