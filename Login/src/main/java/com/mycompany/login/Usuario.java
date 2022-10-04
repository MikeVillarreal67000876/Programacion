            /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login;

/**
 *
 * @author Usuario
 */
public class Usuario  {

    private String  NombreUsuario ;
    private String Contrasena;

    public Usuario(String NombreUsuario, String Contrasena) {
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
    
    
}
