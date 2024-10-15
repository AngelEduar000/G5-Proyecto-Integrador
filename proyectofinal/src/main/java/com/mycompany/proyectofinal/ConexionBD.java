package com.mycompany.proyectofinal;

import java.util.Scanner;

public class ConexionBD {
    private void ManejarInicioSesion(String email, String password) {
        System.out.println("Esta en ManejarInicioSesion");
    }
    public void IniciarSesion() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Coloque su correo: ");
        String email = sc.nextLine();
        
        sc = new Scanner(System.in); 
        System.out.print("Coloque su contraseña: ");
        String password = sc.nextLine();
        
        System.out.println();
        new ConexionBD().ManejarInicioSesion(email, password);
    }
}