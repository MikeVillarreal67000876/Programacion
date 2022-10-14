/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.login3;

import static java.lang.System.exit;
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
        return this.NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContrasena() {
        return this.Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    @Override
    public String toString() {
        return "Usuario" + "\n Nombre Usuario: " + this.NombreUsuario + ", Contrasena: " + this.Contrasena;
    }

    public static void CrearUsuario() {
        Scanner sc = new Scanner(System.in);
        int nUsuarios, contador = 0;
        System.out.print("Cuantos usuarios desea crear: ");
        nUsuarios = sc.nextInt();
        Usuario[] usuario = new Usuario[nUsuarios];
        while (contador < nUsuarios) {
            String NombreUsuario, Contrasena;
            System.out.println("Ingrese el nombre del usuario ");
            NombreUsuario = sc.next();
            System.out.println("Ingrese la contrasena del usuario: ");
            Contrasena = sc.next();
            usuario[contador] = new Usuario(NombreUsuario, Contrasena);
            contador = contador + 1;
        }
        Menu(usuario);
    }

    public static void MostrarUsuarios(Usuario[] usuario) {
        for (Usuario usuario1 : usuario) {
            System.out.println(usuario1);
            break;
        }
    }

    public static void EditarUsuario(Usuario[] usuario, Scanner sc) {
        int posicion = -1;
        System.out.println("Ingrese la contrasena del usuario: ");
        String contra = sc.next();
        for (int i = 0; i < usuario.length; i++) {
            if (contra.equals(usuario[i].getContrasena())) {
                posicion = i;
            }
        }
        if (posicion > -1) {
            System.out.println("Ingrese el nuevo nombre: ");
            String NuevoN = sc.next();
            System.out.println("Ingrese la nueva contrasena: ");
            String Nuevoc = sc.next();
            usuario[posicion] = new Usuario(NuevoN, Nuevoc);
        } else {
            System.out.println("El usuario no existe");
        }
    }

    public static void Menu(Usuario[] usuario) {
        //se crea el menu con multiples opciones a elegir al usuario
        Scanner sc = new Scanner(System.in);
        int a = 1, op , l;
        while (a > 0) {
            System.out.println("Menu" + "\n 1. Registrar Usuario" + "\n 2. Mostrar usuario" + "\n 3. Editar usuario" + "\n 4. Logearse");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    CrearUsuario();
                    break;
                case 2:
                    MostrarUsuarios(usuario);
                    break;
                case 3:
                    EditarUsuario(usuario, sc);
                    break;
                case 4:
                    System.out.println(" 1. Logearse usuario" + "\n 2. Logearse Redes sociales ");
                    l = sc.nextInt();
                    if (l == 1) {
                        LogearseUsuario(usuario);
                    } else {
                        LogearseRedes();
                    }
                    break;

            }
            System.out.println("Ingrese '1' para continuar o '0' para terminar");
            a = sc.nextInt();
        }

    }

    public static void LogearseUsuario(Usuario[] usuario) {
        //Se pide que el usuario ingrese el usuario y la contrasena
        int contador1 = 0;
        Scanner sc = new Scanner(System.in);
        String usu, contra;
        //recorre el arreglo y compara los usuarios creados si existe pide la contrasena
        while (contador1 < 3) {
            System.out.println("Ingrese el Usuario: ");
            usu = sc.nextLine();
            int i = BuscarUsuario(usuario, usu);
            if (i <= usuario.length) {
                System.out.println("Ingrese la contrasena: ");
                contra = sc.nextLine();
                if (contra.equals(usuario[i].getContrasena())) {
                    System.out.println("Bienvenido sr." + usuario[i].getNombreUsuario());
                    contador1 = 3;
                } else {
                    System.out.println("Usuario o contraseña incorrecta");
                    contador1++;
                    if(contador1 ==3){
                        System.out.println("Intentó muchas veces, !Adios¡");
                        exit(0);
                    }
                }
            } else {
                System.out.println("El usuario no existe");
                break;
            }
        }
    }

    public static int BuscarUsuario(Usuario[] usuario, String nombre) {
        String dato;
        boolean band = false;
        dato = nombre;
        //Busqueda Secuencial
        int i = 0;
        while (i < usuario.length && band == false) {
            if (dato.equals(usuario[i].getNombreUsuario())) {
                band = true;
                break;
            } else {
                band = false;
                i++;
            }
        }
        if (band != false) {
            return i;
        } else {
            int a = usuario.length + 1;
            return a;
        }
    }

    public static void LogearseRedes() {
        System.err.println("Coming soon");
    }

}
