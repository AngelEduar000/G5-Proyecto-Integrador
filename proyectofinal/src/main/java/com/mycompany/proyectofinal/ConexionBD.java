package com.mycompany.proyectofinal;

public class ConexionBD {
    long id;
    String name_proyect;

    public ConexionBD(long id, String name_proyect) {
        this.id = id;
        this.name_proyect = name_proyect;
        System.out.println("Conectado al proyecto: " + name_proyect);
    }
}