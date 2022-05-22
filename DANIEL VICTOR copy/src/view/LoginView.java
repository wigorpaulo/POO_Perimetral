package view;

import java.util.Scanner;

public class LoginView {

Scanner ler = new Scanner(System.in);

    // Metodo 

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
         
        MenuView menuView = new MenuView();
        menuView.menu();
    }
}

    