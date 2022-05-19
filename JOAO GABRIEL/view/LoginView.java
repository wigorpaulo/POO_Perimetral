package view;

import java.util.Scanner;

public class LoginView {
    
    Scanner ler = new Scanner(System.in);
    // Metodo 
    public void login() {
    String n;
    String s;
    System.out.println("");
        System.out.println("SEJA BEM VINDO!!!");
        System.out.println("Faça o seu Login");
        System.out.println("");
        System.out.print  ("Nome de usuario:");
        n = ler.nextLine();
        System.out.print  ("Senha:");
        s = ler.nextLine();
        System.out.println("");
        System.out.println("Parabéns, entrou com sucesso!");
        System.out.println("#");
        System.out.println("");

        MenuView menuPrincipal = new MenuView();
        menuPrincipal.menu();
    }
}