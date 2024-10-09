package maquinaExpendedora2;


/**
 *
 * @author david
 */
public class Producto {
         //Definimos los atributos
         private String nombre;
         private double precio;
         private int cantidad;
         private int codigo;
         
         //Constructor
         public Producto(String nombre, double precio, int cantidad, int codigo) {
                  this.nombre = nombre;
                  this.precio = precio;
                  this.cantidad = cantidad;
                  this.codigo = codigo;
         }//Fin Constructor
         
         //SET y GET
         public String getNombre() {
                  return nombre;
         }
         public double getPrecio() {
                  return precio;
         }
         public int getCantidad() {
                  return cantidad;
         }
          public int getCodigo() {
                    return codigo;
          }
         

         public void setNombre(String nombre) {
                  this.nombre = nombre;
         }
         public void setPrecio(double precio) {
                  this.precio = precio;
         }
         public void setCantidad(int cantidad) {
                  this.cantidad = cantidad;
         }
         
                  
         @Override
         public String toString(){
                   return "\n[Codigo: "+codigo+"] "+nombre+" ("+precio+" euros)";
         }
         
}//Fin Class
