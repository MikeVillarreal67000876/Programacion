/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Principal {
     Scanner sc = new Scanner(System.in);
    static ArrayList <Usuario> datos = new ArrayList <Usuario>();
    
    public static void main(String[] args) {
       Llenadodatos();

    }
    
    public static void Llenadodatos (){
    int op ;
        char rta;
        Scanner sc = new Scanner(System.in);
        do{
            do{
            System.out.println("Digite que tipo de dato desea almacenar");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Ingresar");
            System.out.println("Opcion: ");
            op = sc.nextInt();
            }
            while(op < 1||op > 3 );
            switch (op){
                case 1: DatosUsuario();
                    break;
                case 2 : 
                break;
                case 3: 
                    break;
            }
            System.out.println("Desea Ingresar otro dato(s/n): ");
            rta= sc.next().charAt(0);
            }while(rta == 's' || rta== 'S' );
            }
    public static void DatosUsuario (){
        Scanner sc = new Scanner(System.in);
        String NombreUsuario ;
        char Contrasena;
 
        System.out.println("Ingrese el Nombre de el usuario: ");
        NombreUsuario = sc.next ();
        System.out.println("Ingrese la contraseña de el usuario : ");
        Contrasena = sc.next().charAt(0);
        Usuario  usuario = new Usuario (NombreUsuario,Contrasena ); 
    }
    public static void LogeoUsuario (){
        int a = 1, b ;
        Scanner sc = new Scanner(System.in);
        String NombreUsuario;
        while (a>0){
            
        }
}
}
    
