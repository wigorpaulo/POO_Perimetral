package view;

import java.util.Scanner;


public class LoginView {
    Scanner ler = new Scanner(System.in);
    // M�todo 
    public void login() {
    String username ,password;
    
        System.out.println("");
        System.out.println("____________________________");
        System.out.println("       ***Login***        ");
        System.out.println("");
        System.out.print  ("Username:");
        username = ler.nextLine();
        System.out.print  ("Password:");
        password = ler.nextLine();
        System.out.println("");
        System.out.println(" ***Logado com sucesso!***");
        System.out.println("____________________________");
        System.out.println("");
         
        MenuView menuPrincipal = new MenuView();
        menuPrincipal.menu();
    }
}

    