package view;

import java.util.Scanner;

import controller.UsuarioController;

public abstract class ApplicationView {

   public Scanner ler;
   public UsuarioController usuarioController;

    public ApplicationView(){
        ler = new Scanner(System.in);
        usuarioController = new UsuarioController();
    }
}
