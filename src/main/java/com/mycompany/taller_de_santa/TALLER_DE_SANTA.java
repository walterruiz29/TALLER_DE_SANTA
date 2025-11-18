
package com.mycompany.taller_de_santa;

import java.util.ArrayList;
import java.util.Scanner;

public class TALLER_DE_SANTA {

    private static ArrayList <Usuario> usuarios = new ArrayList<>();
    private static Scanner SC = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        System.out.println("REGISTRO DE USUARIOS");
        
        while(true){
        System.out.println("Por favor ingrese su nombre de usuario: ");
        String NombreUsuario= Scanner.nextLine();
        
        if(existeusuario(NombreUsuario)){
        System.out.println("El Usuario Ingresado ya existe.");
        continue;
        
        
        
          }
        
        }
    }
}
