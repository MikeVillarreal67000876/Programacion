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
public class Usuario {
    private String  NombreUsuario ;
    private char Contrasena;

    public Usuario(String NombreUsuario, char Contrasena) {
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
    }

    
    
    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public char getContrasena() {
        return Contrasena;
    }

    public void setContrasena(char Contrasena) {
        this.Contrasena = Contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" + "NombreUsuario=" + NombreUsuario + ", Contrasena=" + Contrasena + '}';
    }
    
    
    
}
