package view;

import java.util.Scanner;

public class LoginView {
	
	public void login() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("***LOGIN***");
		System.out.println("Username: ");
		String username = entrada.next();
		System.out.println("Password: ");
		String password = entrada.next();
		System.out.println("***LOGADO COM SUCESSO***");
			
		MenuView menu = new MenuView();
		menu.menu(); 
	
	}
}
