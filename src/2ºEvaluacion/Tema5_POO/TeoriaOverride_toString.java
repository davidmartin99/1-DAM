@Override

//Se utiliza para forzar al compilador que esta sobreescribiendo
// un metodo y evita errores de ejecución.
//toString

@Override
public String toString{
	
}
//con esto evita el ERROR: "Method does not override method from superclass"

Ejemplo en Fecha (Individuo)
 //Metodo para MOSTRAR FECHA
    @Override
    public String toString(){
        StringBuilder fespañol = new StringBuilder(); //constructor String Aunque 
        //StringBuilder es un objeto dinámico que permite expandir el número de caracteres de la cadena que encapsula,
        if(dia<10){
            fespañol.append("0"); //.append para añadir
        }
        fespañol.append(dia);
        fespañol.append("-");
        if(mes<10){
            fespañol.append("0");
        }
        fespañol.append(mes);
        fespañol.append("-");
        fespañol.append(año);
        
        return fespañol.toString();
    }//Fin metodo
	
-------------------------------------------------------
JOptionPane.showInputDialog()
JOptionPane.showMessageDialog(frame, "mensaje", "titulo", tipoMensaje)

JOptionPane.showMessageDialog(frame, "X de Error", "Titulo", 0);
JOptionPane.showMessageDialog(frame, "I de información", "Titulo", 1); 
JOptionPane.showMessageDialog(frame, " ! de Aviso", "Titulo", 2); 
JOptionPane.showMessageDialog(frame, "? de Pregunta", "Titulo", 3);

https://docs.oracle.com/javase/8/docs/api/javax/swing/JOptionPane.html
(ejemplo en Tema05- banco- ejmploMensajes.java