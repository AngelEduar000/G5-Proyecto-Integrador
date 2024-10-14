package com.mycompany.proyectofinal;

import java.util.Scanner;

public class Proyecto {
    String nombre;
    String ubicacion;
    String estado;
    int torres;
    
    public Proyecto() {
        this.nombre = "x";
        this.ubicacion = "x";
        this.estado = "x";
        this.torres = 4;
    }
    
    // --------- PARTE DEL STAFF --------- //
    private void RegistrarProyecto() {

    }
    private void ModificarProyecto() {
        
    }
    private void EliminarProyecto(double id) {
        
    }
    private void IniciarSesion() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Coloque su correo: ");
        String email = sc.nextLine();
        
        sc = new Scanner(System.in); 
        System.out.print("Coloque su contraseña: ");
        String password = sc.nextLine();
        
        System.out.println();
        System.out.println("Has sido iniciado sesión con éxito.");
    }
    // --------- PARTE DEL STAFF --------- //
    
    
    
    
    
    
    // PARTE DEL CLIENTE //
    public void SolicitarPago() {
        
    }
    // PARTE DEL CLIENTE //
    
    
    
    public static void main(String[] args) {
        System.out.print("Bienvenid@");
        
        int option;
            
        do {
            System.out.println();
            System.out.println();
            Scanner sc = new Scanner(System.in); 
            System.out.print("Elige una opción:\n1) Iniciar Sesión\n2) Solicitar Pago\nEliges: ");
            option = sc.nextInt();
        } while (option > 2 || option < 1);
        System.out.println();
        
        if (option == 2) new Proyecto().SolicitarPago();
        else new Proyecto().IniciarSesion();

        
        //Proyecto p = new Proyecto(1, name_proyect);
        //p.VerProyecto();
        //ConexionBD conexion = new ConexionBD(1, name_proyect);
    }
}