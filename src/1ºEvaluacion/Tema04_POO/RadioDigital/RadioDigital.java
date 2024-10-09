package radioDigital;

/**
 * Clase RadioDigital
 * 
 * Creamos la clase Emisora, que tendrá los parámetros nombre y frecuencia.
 * 
 * @author David Martin Pulgar
 */

public class RadioDigital {
    private static class Emisora {
        
        //Atributos
        private String nombre;
        private double frecuencia;
        
        //Metodos Constructores
        public Emisora() {
        } //Fin Metodo Constructor 1

        public Emisora(String nombre, double frecuencia) {
            this.nombre = nombre;
            this.frecuencia = frecuencia;
        }//Fin Metodo Constructor 2

        //Metodos SET Y GET
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getNombre() {
            return nombre;
        }
        public void setFrecuencia(double frecuencia) {
            this.frecuencia = frecuencia;
        }
        public double getFrecuencia() {
            return frecuencia;
        }
        
        //Metodos específicos de la clase
        /**
         * Muestra el estado del objeto
         * @return 
         */
        @Override
        public String toString() { //Nos muestra por pantalla los parámetros nombre y frecuencia
            return nombre + " _ "+ frecuencia +"MHz.";
        }//Fin Metodo específico
    }//Fin clase Emisora
    
    
    //Atributos
    private final Emisora[] emisora;
    private int emisoraFavorita; //emisoraFavorita será por donde comenzará la RadioDigital al encenderse
    
    //Metodos Constructores
    public RadioDigital() {
        //Creacion del objeto array con longitud 6
        emisora = new Emisora[6];
        
        //Creamos los arrays ordenados de menor a mayor frecuencia 
        emisora[0] = new Emisora("Europa FM", 91.0);
        emisora[1] = new Emisora("Cadena Dial", 91.7);
        emisora[2] = new Emisora("Cadena 100", 99.5);
        emisora[3] = new Emisora("Rock FM", 101.7);
        emisora[4] = new Emisora("Kiss FM", 102.7);
        emisora[5] = new Emisora("Radio Marca Nacional", 103.5);
        
        //Le damos el valor a la variable emisoraFavorita
        emisoraFavorita = 4;
    } //Fin Metodo Constructor 1

    
    //Metodos especificos de la clase
    public void mostrarEmisoraFavorita() { //Mostrará en pantalla la emisora favorita
        System.out.println("Emisora favorita: "+emisora[emisoraFavorita]);
    }//Fin mostrarEmisoraFavorita
    
    private void mostrarEmisoras(){ //Mostrará en pantalla la emisora actual y la siguiente
        System.out.println("Emisora actual: " + emisora[emisoraFavorita]);
        int emisoraSiguiente = emisoraFavorita +1; //Declaramos e inicializamos emisoraSiguiente
        if(emisoraSiguiente >= emisora.length){
            emisoraSiguiente = 0;
        }//Fin if
        System.out.println("Emisora siguiente: "+emisora[emisoraSiguiente]);
    }//Fin mostrarEmisoras

    /**
     * Metodo subirFrecuencia, subira la frecuencia siempre que no sea mayor que 
     * la longitud del array -1, en ese caso la emisoraFavorita volverá a 0.
     */
    public void subirFrecuencia() {
        if (emisoraFavorita < emisora.length -1){
            emisoraFavorita++;
        }
        else {
            emisoraFavorita = 0;
        }//Fin if-else
        mostrarEmisoras(); //Llamamos al metodo específico mostrarEmisoras()
    }//Fin subirFrecuencia
    
    /**
     * Metodo bajarFrecuencia, bajara la frecuencia siempre que sea mayor a 0,
     * en ese caso la emisoraFavorita volverá a ser la longitud del array -1.
     */
    public void bajarFrecuencia(){
        if (emisoraFavorita > 0){
            emisoraFavorita --;
        }
        else {
            emisoraFavorita = emisora.length -1;
        } //Fin if-else
        mostrarEmisoras(); //Llamamos al metodo específico mostrarEmisoras()
    }//Fin bajarFrecuencia

}//Fin class
