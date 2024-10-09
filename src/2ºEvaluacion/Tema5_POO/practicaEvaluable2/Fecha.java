package practicaEvaluable2;

/**
 * Clase Fecha
 * Nos va a ser de gran utilidad a la hora de asignar esta clase
 * a otras clasesque contengan atributos de tipo fecha.
 * 
 * @author David Martin
 */
public class Fecha {
         //Atributos      
         private int dia;
         private int mes;
         private int año;

         //Constructor por defecto
         public Fecha() {
         }

         //Constructor con Parametros
         /**
          * @param dia
          * @param mes
          * @param año 
          */
         public Fecha(int dia, int mes, int año) {
                  //se pone this.dia porq el argumento tiene el mismo nombre que el de la variable
                  this.dia = dia;
                  this.mes = mes;
                  this.año = año;
         }
         //Ejemplo->

         /*public Fecha(int diaM, int mesM, int añoM) {
        //se pone this.dia porq el argumento tiene el mismo nombre que el de la variable
        dia = diaM  
        mes = mesM;
        año = añoM;
        }*/

         //Metodos GET y SET
         public void setDia(int d) {
                  dia = d;
         }

         public void setMes(int m) {
                  mes = m;
         }

         public void setAño(int a) {
                  año = a;
         }

         public int getDia() {
                  return dia;
         }

         public int getMes() {
                  return mes;
         }

         public int getAño() {
                  return año;
         }

         //Metodo para comprobar si la FECHA es CORRECTA
         //No se usa el this. porque no hay argumentos con el mismo nombre de la variable
         /**
          *  Este metodo nos devuelve un valor true si la fecha es correcta
          * @return 
          */
         public boolean fechaCorrecta() {
                  //Declaramos diferentes booleans para comprobar el dia, mes y año
                  boolean diaCorrecto, mesCorrecto, añoCorrecto;
                  //Decimos que se tiene que cumplir para que el dia, mes y año sean correctos
                  añoCorrecto = año > 0;
                  mesCorrecto = mes <= 12 && mes >= 1;
                  switch (mes) { //Comprobamos los dias, segun el mes en el que estemos
                           case 2:
                                    if (esBisiesto()) {
                                             diaCorrecto = dia <= 29 && dia >= 1;
                                    } else {
                                             diaCorrecto = dia <= 28 && dia >= 1;
                                    }
                                    break;
                           case 4:
                           case 6:
                           case 9:
                           case 11:
                                    diaCorrecto = dia <= 30 && dia >= 1;
                                    break;
                           default:
                                    diaCorrecto = dia <= 31 && dia >= 1;
                  }//Fin switch
                  return diaCorrecto && mesCorrecto && añoCorrecto;
         }//Fin metodo fechaCorrecta

         //Metodo comprobar si el año es bisiesto 
         //Lo usaremos en el metodo fechaCorrecta
         private boolean esBisiesto() {
                  return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
         }//Fin metodo esBisiesto

         //Metodo toString para MOSTRAR FECHA
         @Override
         public String toString() {
                  StringBuilder fespañol = new StringBuilder(); //constructor String Aunque 
                  //StringBuilder es un objeto dinámico que permite expandir el número de caracteres de la cadena que encapsula,
                  if (dia < 10) {
                           fespañol.append("0"); //.append para añadir
                  }
                  fespañol.append(dia);
                  fespañol.append("-");
                  if (mes < 10) {
                           fespañol.append("0");
                  }
                  fespañol.append(mes);
                  fespañol.append("-");
                  fespañol.append(año);

                  return fespañol.toString();
         }//Fin metodo

          //Metodo toString que devuelve una cadena de representación del objeto
         @Override
         protected Object clone() throws CloneNotSupportedException {
                  Fecha nueva = new Fecha(this.dia, this.mes, this.año);
                  return nueva;
         }//Fin toString
         
}//Fin clase Fecha
