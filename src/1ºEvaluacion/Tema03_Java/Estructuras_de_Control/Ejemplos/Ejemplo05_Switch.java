package tema3;
/**
 * Programa que genere de forma aleatoria letras minusculas y analice si es vocal o constante
 * Utiliza Switch y la funcion matemarica Math.random
 * @author David
 */

public class Ejemplo05_Switch {
    public static void main(String[] args){
        //Utilizamos Math.random para que nos de una letra aleatoria
        char letra = (char) (Math.random()*26+'a'); //En el teclado ASCII las letras empiezan por 97=a asi que puedo sumar 'a' o 97
                                                    //El abecedario son 26 letras
        System.out.println("La letra es: "+letra);
        
        //Ver si es vocal
        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es VOCAL");
                break;
            default: 
                System.out.println("Es CONSONANTE");
                
        }//Fin switch

    }//Fin main
    
}//Fin clase
