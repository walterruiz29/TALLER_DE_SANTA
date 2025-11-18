
package CLASES;

public class regalos {
    private String nombre;
    private int codigo;
    private  int cantidad;
    private String descripcion;
    private String marca;
    
    
    public regalos (String nombre, int codigo, int cantidad, String descripcion, String marca){
      this.nombre = nombre;
      this.codigo = codigo;
      this.cantidad = cantidad;
      this.descripcion = descripcion;
      this.marca = marca;
    }
    
    public String getnombre(){
    return nombre;
    }
    
    public int getcodigo(){
    return codigo;
    }
    
    public int getcantidad(){
    return cantidad;
    }
        
    public String getdescripcion(){
    return descripcion;
    }
            
    public String getmarca(){
    return marca;
    }
    
}
