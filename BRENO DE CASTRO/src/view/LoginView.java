package view;

import java.util.Scanner;

import model.Usuario;

public class LoginView {
	
	public void login() {
	
	Scanner ler = new Scanner(System.in);
		
	System.out.println("**** LOGIN ****\n");
	System.out.println("Digite o username:");
	String username = ler.next();
	System.out.println("Digite o password: ");
	String password = ler.next();
	System.out.println("**** LOGADO COM SUCESSO ****\n");
	
	MenuView menuOpt = new MenuView();
		menuOpt.menu();
	}
}
