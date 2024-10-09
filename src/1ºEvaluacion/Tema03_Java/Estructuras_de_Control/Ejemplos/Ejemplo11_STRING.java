package tema3;

/**
 *
 * @author David
 */

public class Ejemplo11_STRING {
    public static void main(String[] args){
        String texto="Hola mundo";
        System.out.println("La longitud es: "+ texto.length());
        
        //Las cadenas de caracteres empiezan a contar desde 0, hasta (longitud-1)
        System.out.println(texto.charAt(1));
        
        //Obtener una parte de la cadena
        char buffer[]=new char[5];
        //getChars (desde, hasta, nombre char, 0)
        texto.getChars(5, 9, buffer, 0);
        System.out.println("El buffer copiado es: "+buffer);
        
        //Comparaciones
        String nombre1="Juan";
        String nombre2="Ana";
        //equals.IgnoreCase no diferencia mayus de minusculas
        if(nombre1.equalsIgnoreCase(nombre2)){
            System.out.println("Son iguales");
        }
        else
            System.out.println("No son iguales");
        
        
        //Comparaciones COMPARETO (devuelve un valor) sirve para ver el orden
            //Devuelve 0, si ambas cadenas son iguales
            //Devuelve valor negativo, si la cadena es menor
            //Devuelve valor positivo si la cadena es mayor
        if(nombre1.compareToIgnoreCase(nombre2)==0){
            System.out.println("Son iguales");
        }
        else if(nombre1.compareTo(nombre2)<0){
            System.out.println("Nombre1 MENOR que nombre2 ");
        }
        else if(nombre1.compareTo(nombre2)>0){
            System.out.println("Nombre1 MAYOR que nombre2");
        }
        
        
        //Convertir de variables a String
        //value of te transforma una variable a String
        System.out.println(String.valueOf(Math.PI));
        
        
        //BUSCAR CONTENIDO
        String sTexto = "palabra1 palabra2 palabra2"; //Cadena donde se va a buscar
        String busqueda= "palabra4"; //lo que se quiere buscar
        int contador = 0; //contador de ocurrencias
        //indexOf para buscar algo en una cadena
        while(sTexto.indexOf(busqueda) > -1){
            sTexto = sTexto.substring(sTexto.indexOf(busqueda) + busqueda.length(), sTexto.length() );
            contador ++; //Si encuentra la cadena suma uno, asi nos dice cuantas veces está
        }//Fin del While
        System.out.println("El contador es: "+contador);
        
        int intIndex= sTexto.indexOf(busqueda);
        System.out.println(intIndex);
        
    }//Fin MAIN
        
}//Fin CLASS
