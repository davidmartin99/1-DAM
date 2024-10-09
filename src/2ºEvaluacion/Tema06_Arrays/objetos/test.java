package objetos;

/**
 *
 * @author david
 */
public class test {
         public static void main(String[] args){
                  //Creamos el objeto array llamando a la clase Biblioteca
                  Biblioteca[] listaLibros = new Biblioteca[3];
                  listaLibros[0] = new Biblioteca ("Programacion C");
                  listaLibros[1] = new Biblioteca ("Java");
                  listaLibros[2] = new Biblioteca ("Linux");

                  //Para recorrer el array
                  for (Biblioteca i:listaLibros){
                           System.out.println(i.getLibro());
                  }//Fin for
                  
                  Biblioteca[] listaLibros2 = new Biblioteca[3];
                  listaLibros2[0] = new Biblioteca("Programacion C", "Oscar Colmenarejo");
                  listaLibros2[1] = new Biblioteca("Java", "Juan");
                  listaLibros2[2] = new Biblioteca("Linux", "Pepe");
                  
                  //Imprimir con el @Override
                  for(Biblioteca j:listaLibros2){
                           System.out.println(j);
                  }//fin for
                 
                  
         }//Fin MAIN
         
}//Fin CLASS