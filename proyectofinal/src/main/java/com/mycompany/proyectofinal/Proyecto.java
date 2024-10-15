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
    private void MostrarDashboard() {
        
    }
    private void RegistrarProyecto() {

    }
    private void ModificarProyecto() {
        
    }
    private void EliminarProyecto(double id) {
        
    }
    private void VerificarCredenciales() {
        
    }
    public void IniciarSesion() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Coloque su correo: ");
        String email = sc.nextLine();
        
        sc = new Scanner(System.in); 
        System.out.print("Coloque su contraseña: ");
        String password = sc.nextLine();
        
        System.out.println();
        System.out.println(".....");
    }
    private void ManejarInicioSesion() {
        
    }
    // --------- PARTE DEL STAFF --------- //
}