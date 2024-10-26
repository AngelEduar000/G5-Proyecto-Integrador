package com.mycompany.proyectofinal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Bienvenid@");

        int option;

        do {
            System.out.println();
            System.out.println();
            Scanner sc = new Scanner(System.in); 
            System.out.print("Elige una opción:\n1) Cliente.\n2) Ayudante.\nEliges: ");
            option = sc.nextInt();
        } while (option > 2 || option < 1);
        System.out.println();
        
        if (option == 1) {
            do {
                System.out.println();
                System.out.println();
                Scanner sc = new Scanner(System.in); 
                System.out.print("Elige una opción:\n1) Solicitar Pago.\nEliges: ");
                option = sc.nextInt();
            } while (option != 1);
            System.out.println();
            new Cliente().SolicitarPago();
        }
        else {
            do {
                System.out.println();
                System.out.println();
                Scanner sc = new Scanner(System.in); 
                System.out.print("Elige una opción:\n1) Iniciar Sesión\nEliges: ");
                option = sc.nextInt();
            } while (option != 1);
            System.out.println();
            new ConexionBD().IniciarSesion();
        }

        //Proyecto p = new Proyecto(1, name_proyect);
        //p.VerProyecto();
        //ConexionBD conexion = new ConexionBD(1, name_proyect);
    }
}