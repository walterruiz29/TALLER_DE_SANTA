
package CLASES;


public class Ninos {
    private String nombre;
    private int identificacion;
    private  int edad;
    private String ciudad;
    private String direccioncompleta;
    
    
    public Ninos (String nombre, int identificacion, int edad, String ciudad, String direccioncompleta){
      this.nombre = nombre;
      this.identificacion = identificacion;
      this.edad = edad;
      this.ciudad = ciudad;
      this.direccioncompleta = direccioncompleta;
    }
    
    public String getnombre(){
    return nombre;
    }
    
    public int getidentificacion(){
    return identificacion;
    }
    
    public int getedad(){
    return edad;
    }
        
    public String getciudad(){
    return ciudad;
    }
            
    public String getdireccioncompleta(){
    return direccioncompleta;
    }
    
    
    
} 
