package MAIN;

import VISTA.inicioSesion;
import java.util.Scanner;
import Controlador.ConexionBD;

public class Main {
    public static void main(String[] args) {
        inicioSesion loginView = new inicioSesion();
        loginView.setVisible(true);
    }
}