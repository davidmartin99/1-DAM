package dni;



/**
 *
 * @author david
 */
public class DNI {
    //Atributos estaticos: todas las letras del DNI
    static final String LETRAS_DNI="TRWAGMYFPDXBNJZSQVHLCKE";//letras ordenadas T=1, R=2...
    //Atributos del objeto
    private int numDNI;
    
    //METODOS PUBLICOS
    //establecer son los metodos CONSTRUCTORES
    //establecer String nif es para el DNI completo con la letra
    public void establecer(String nif) throws Exception{ //ponemos throws Exception cuando de error pondremos un mensaje
        if (DNI.validarNIF(nif)){ //Si es valido se almacena
            this.numDNI = DNI.extraerNumeroNIF(nif);
        }
        else{//añado una excepcion con throw
            throw new Exception("NIF inválido"+nif);
        }//Fin if-else
    }//Fin metodo establecer
    
    //establecer int dni es para el dni SIN letra
    public void establecer(int dni) throws Exception{
        //if dni es mayor que 7 nueves y menor que 8 nueves
        if(dni>9999999 && dni<99999999){
            this.numDNI = dni;
        }
        else{//añado una excepcion con throw
            throw new Exception ("Numero DNI INVALIDO"+dni);
        }//fin if-else
    }//Fin metodo establecer
    
    //obtenerNIF sirve para ver el DNI en el main
    public String obtenerNIF(){ //Devuelve el NIF completo
        String cadenaNIF;
        char letraNIF;
        
        //Calculamos letra NIF
        letraNIF = calcularLetraNIF(numDNI);
        
        //Construir la cadena
        //Cambiamos la char letra que hemos declarado en calcularLetraNIF, a String
        cadenaNIF = Integer.toString(numDNI)+String.valueOf(letraNIF);
        return cadenaNIF;
    }//Fin metodo obtener
    
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
    
    private static boolean validarNIF(String nif){
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
    
    
}//Fin class DNI
