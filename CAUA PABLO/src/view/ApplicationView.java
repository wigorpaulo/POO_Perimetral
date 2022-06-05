package view;

import controller.UsuarioController;

import java.util.Scanner;

public abstract class ApplicationView {

    UsuarioController usercontrol;
    Scanner ler;

    public ApplicationView(){
        usercontrol = new UsuarioController();
        ler = new Scanner(System.in);
    }
}

