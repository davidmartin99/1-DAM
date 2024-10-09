package practicaEvaluable2;

/**
 * Esta es la clase DNI 
 * Permite obtener y validar el DNI con diferentes métodos.
 * 
 * @author David Martin 
 */
public class DNI {
    //Atributos estaticos: todas las letras del DNI
    static final String LETRAS_DNI="TRWAGMYFPDXBNJZSQVHLCKE";//letras ordenadas T=1, R=2...
    //Atributos del objeto
    protected int numDNI;
    
    //METODOS PUBLICOS
    //establecer son los metodos CONSTRUCTORES
    //establecer String nif es para el DNI completo con la letra
    /**
     * Establecer son los metodos Constructores
     * 
     * @param nif es el DNI completo String
     * @throws Exception para cuando el DNI sea inválido
     */
    public void establecer(String nif) throws Exception{ //ponemos throws Exception cuando de error pondremos un mensaje
        if (DNI.validarNIF(nif)){ //Si es valido se almacena
            this.numDNI = DNI.extraerNumeroNIF(nif);
        }
        else{//añado una excepcion con throw
            throw new Exception("NIF inválido"+nif);
        }//Fin if-else
    }//Fin metodo establecer
    
    /**
     * Obtener el DNI entero 
     * 
     * @return DNI
     */
    public String obtenerNIF(){ //Devuelve el NIF completo
        String cadenaNIF;
        char letraNIF;
        
        //Calculamos letra NIF
        letraNIF = calcularLetraNIF(numDNI);
        
        //Construir la cadena
        //Cambiamos la char letra que hemos declarado en calcularLetraNIF, a String
        
        String numDNIString = String.valueOf(numDNI);
        cadenaNIF = Integer.toString(numDNI) + String.valueOf(letraNIF);

        return cadenaNIF;
    }//Fin metodo obtener
    
    /**
     * Obtiene el número del DNI
     * 
     * @return el número del DNI
     */
    public int obtenerDNI(){
        return numDNI;
    }//Fin metodo obtenerDNI
    
    
    //METODOS PRIVADOS
    private static char extraerLetraNIF(String nif){
        char letra = nif.charAt(nif.length()-1);
        return letra;
    }//Fin metodo extraerLetraNIF
    
    private static int extraerNumeroNIF(String nif){
        int numero = Integer.parseInt(nif.substring(0, nif.length()-1));
        return numero;
    }//Fin metodo extraerNumeroNIF
    
    private static char calcularLetraNIF(int numeroDNI){
        char letra;
        letra = LETRAS_DNI.charAt(numeroDNI%23);// Sacamos la posicion de la letra con .charAt 
        //y con numeroDNI%23 calculamos el resto para sacar la letra
        return letra;
    }//Fin metodo calcularLetraNIF
    
    /**
     * Valida el DNI completo
     * 
     * @param nif (DNI completo)
     * @return true si el DNI es correcto
     */
    public static boolean validarNIF(String nif){
        boolean valido = true; //Suponemos que el NIF es valido
        //Declaramos variables para comprobar que es valido
        int numeroDNI;
        char letra_calculada;
        char letra_leida;

        //Si no hay un numeroDNI introducido da error
        if (nif == null){
            valido = false;
        }
        else if(nif.length()>9 || nif.length()<8){
            valido = false;
        }
        else{
            numeroDNI = DNI.extraerNumeroNIF(nif);
            letra_leida = DNI.extraerLetraNIF(nif);
            letra_calculada = DNI.calcularLetraNIF(numeroDNI);
            if (letra_calculada == letra_leida){
                valido = true;
            }
            else{
                valido = false;
            }//Fin if-else
        }//Fin if-elseif-else
        
        return valido;
    }//Fin metodo validarNIF
    

    //Metodo toString que devuelve una cadena de representación del objeto
         @Override
          public String toString() {
                    //Por si el numero empieza por 0, con "%08d", el dni siempre tendra 8 numeros 
                    //Si no tuviera 8 numeros se rellenan con 0 a la izquierda, para que así, sí los tenga
                    String numDNIString = String.format("%08d", numDNI);
                    // Calcular la letra del DNI
                    char letraNIF = calcularLetraNIF(numDNI);
                    // Devolver la representación del DNI como una cadena con el formato deseado
                    return String.format("%s-%c", numDNIString, letraNIF);
          }
}//Fin class DNI
