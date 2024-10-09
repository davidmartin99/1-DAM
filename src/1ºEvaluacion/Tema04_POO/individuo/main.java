package individuo;

/**
 *
 * @author david
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        //Creacion de Objetos
        Individuo persona1 = new Individuo("23092309N", "Marcos", 2004);
        Individuo persona2 = new Individuo("11681168R", "Yassin", 1999);
        Individuo persona3 = new Individuo("00430043T", "Alejandro", 1995);
        Individuo persona4 = new Individuo("20102010D", "David", 1999);
        
        //Individuo con el nuevo metodo constructor 
        Individuo persona5 = new Individuo("11221122Z","Manuel", 2003, 1.75);
        
        //Calcular la población con el getPoblacion, no hace falta inicializar a 0.
        System.out.println("Poblacion Actual: "+Individuo.getPoblacion()+" personas");
        
        //añadimos la altura con set
        persona1.setAltura(1.93);
        persona1.setEdad(23);
        
        //Metodo Saludar  al Individuo
        persona1.saludar();
        persona5.saludar();
        
        //Metodo subir altura
        persona5.incrementarAltura();
        persona5.incrementarAltura();
        System.out.println("He crecido. Mi nueva altura es: "+persona5.getAltura()+" metros");
        
        //EMPLEADOS
        System.out.println("------------------------");
        Empleado Alejandro = new Empleado();
        Alejandro.setNombre("Alejandro");
        Alejandro.setSueldo(25000.50);
        Empleado Lucia = new Empleado("Lucia",26000.0);
        
        Alejandro.mostrarDatos();
        Lucia.mostrarDatos();
        
        Alejandro.subidaSueldo(3.1);
        System.out.println("El nuevo sueldo de "+Alejandro.getNombre()+ " es: "+Alejandro.getSueldo());
        
        //FECHA
        System.out.println("-----------------------");
        int d,m,a;
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Introduce el dia: ");
        d = teclado.nextInt();
        System.out.print("Introduce el mes: ");
        m = teclado.nextInt();
        System.out.print("Introduce el año: ");
        a = teclado.nextInt();
        
        //Creamos un objeto fecha1
        Fecha fecha1 = new Fecha(d,m,a);
        
        if (fecha1.fechaCorrecta()){
            System.out.println("La fecha: "+fecha1.getDia()+"-"+fecha1.getMes()+"-"+fecha1.getAño()+". Es Correcta");
            
            fecha1.diaSiguiente();
            System.out.println("Dia Siguiente: "+fecha1.getDia() + "-" + fecha1.getMes() + "-" + fecha1.getAño());
        }
        else{
            System.out.println("Fecha No valida.");
        }//Fin if-else
    }
}
