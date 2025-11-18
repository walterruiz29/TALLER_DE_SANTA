
package CLASES;


public class Usuario {
    private String NombreUsuario;
    private String contrasena;
    
    public Usuario (String NombreUsuario, String contrasena){
      this.NombreUsuario = NombreUsuario;
      this.contrasena = contrasena;    
    }
    
    public String getNombreUsuario(){
    return NombreUsuario;
    }
    
    public boolean verificarcontrasena(String contrasena){
    return this.contrasena.equals(contrasena);
    }
    
    
    
    
} 
