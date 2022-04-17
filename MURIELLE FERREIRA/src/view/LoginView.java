package view;

import java.util.Scanner;

public class LoginView {
	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("********LOGIN********");
		System.out.println("Informe um nome: ");
		String username = sc.nextLine();
		System.out.println("Informe uma senha: ");
		String password = sc.nextLine();
		System.out.println("********LOGADO COM SUCESSO********");
		
		MenuView menu = new MenuView();
		menu.menu();
	}
}
