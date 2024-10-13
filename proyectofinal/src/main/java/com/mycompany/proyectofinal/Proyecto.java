/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectofinal;
/**
 *
 * @author SAlA-9
 */

public class Proyecto {
    long id;
    String name_proyect;

    public Proyecto(long id, String name_proyect) {
        this.id = id;
        this.name_proyect = name_proyect;
    }

    public void verProyecto() {
        System.out.println("Nombre: "+ name_proyect +"");
    }
    
    public static void main(String[] args) {
        Proyecto p = new Proyecto(1, "Nemesis");
        p.verProyecto();
        ConexionBD conexion = new ConexionBD(1, "Nemesis");
    }
}