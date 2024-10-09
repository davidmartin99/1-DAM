package maquinaExpendedora;

/**
 *
 * @author david
 */
public class Producto {
         //Definimos los atributos
         private String nombre;
         private double precio;
         private int cantidad;
         private String tipo;
         
         //Constructor
         public Producto(String nombre, double precio, int cantidad, String tipo) {
                  this.nombre = nombre;
                  this.precio = precio;
                  this.cantidad = cantidad;
                  this.tipo = tipo;
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
         public String getTipo() {
                  return tipo;
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
         public void setTipo(String tipo) {
                  this.tipo = tipo;
         }
         
         
         
         
}//Fin Class
