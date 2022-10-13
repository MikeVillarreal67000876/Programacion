/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Se instancia la clase usuario


public class Usuario {
    private String NombreUsuario;
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

    @Override
    public String toString() {
        return "Usuario" + "\n Nombre Usuario: " + NombreUsuario + ", Contrasena: " + Contrasena ;
    }
     public static void CrearUsuario(){
        Scanner sc = new Scanner(System.in);
        int nUsuarios=1 , contador =0 ;
        System.out.println("Cuantos usuarios desea crear: ");
        nUsuarios = sc.nextInt();
        Usuario [] usuario = new Usuario[nUsuarios];
        while(contador < nUsuarios){
            String NombreUsuario , Contrasena ;
            System.out.println("Ingrese el nombre del usuario " );
            NombreUsuario = sc.next();
            System.out.println("Ingrese la contrasena del usuario: ");
            Contrasena = sc.next();
            usuario[contador]=new Usuario(NombreUsuario,Contrasena);
            contador= contador + 1;
        }
        Menu(usuario);
    }
   public static void MostrarUsuarios(Usuario[] usuario){
        for(int i=0; i < usuario.length; i ++){
            System.out.println(usuario[i]);
            break;
        }
    }
   public static void EditarUsuario (Usuario[] usuario, Scanner sc){
       int posicion= -1 ;
       System.out.println("Ingrese la contrasena del usuario: ");
       String contra= sc.next();
       for (int i=0; i<usuario.length; i++){
           if(contra.equals(usuario[i].getContrasena())){
               posicion=i;
           }
       }
       if (posicion > -1 ){
           System.out.println("Ingrese el nuevo nombre: ");
           String NuevoN = sc.next();
           System.out.println("Ingrese la nueva contrasena: ");
           String Nuevoc = sc.next();
           usuario[posicion]= new Usuario(NuevoN,Nuevoc);
       }else{
           System.out.println("El usuario no existe");
       }
   }
     public static void Menu (Usuario[] usuario){
         //se crea el menu con multiples opciones a elegir al usuario
          Scanner sc = new Scanner(System.in);
        int a = 1 , op=0,nUsuarios=0,l=0 ;
        while (a > 0 ){
            System.out.println("Menu"+"\n 1. Registrar Usuario"+"\n 2. Mostrar usuario"+"\n 3. Editar usuario"+"\n 4.Logearse");
           op= sc.nextInt();
            switch (op){
                case 1:
                    CrearUsuario();
                    break;
                case 2 :
                    MostrarUsuarios(usuario);
                    break;
                case 3 :
                    EditarUsuario(usuario, sc);
                    break;
                case 4: 
                    System.out.println("1. Logearse usuario"+ "\n Logearse Redes sociales ");
                    l = sc.nextInt();
                    if(l==1){
                        LogearseUsuario(usuario);
                    }else{
                        LogearseRedes();
                    }
                    break;
                    
            }
            System.out.println("Ingrese 1 para continuar o 0 para terminar");
            a = sc.nextInt();
        }
       
    }
      public static void LogearseUsuario(Usuario[] usuario){
          //Se pide que el usuario ingrese el usuario y la contrasena
          Scanner sc = new Scanner(System.in);
          System.out.println("Ingrese el Usuario: ");
          String usu= sc.next();
          System.out.println("Ingrese la contrasena: ");
          String contra= sc.next();
          
          //recorre el arreglo y compara los usuarios creados si existe pide la contrasena 
          for(int i=0;i < usuario.length; i++ ){
              if(usu.equals(usuario[i].getNombreUsuario())){
               if(contra.equals(usuario[i].getContrasena())){
                   System.out.println("Bienvenido sr,usuario");
                   break;
               }
           }else{
                  System.out.println("El usuario no existe");
                  break;
              }
          }
            
        }
      public static void LogearseRedes(){
          System.err.println("Coming soon");
      }
    
    
   
}


