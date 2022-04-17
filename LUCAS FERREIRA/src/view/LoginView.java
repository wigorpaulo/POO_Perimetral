package view;
import java.util.Scanner;

public class LoginView {
	public void login () {
		Scanner scan = new Scanner(System.in);
		System.out.println("****** Login ******\n\nUsername: ");
		String userName = scan.next();
		System.out.println("Password:");
		String password = scan.next();
		System.out.println("\n****** Logado com Sucesso ******");
		MenuView menu = new MenuView();
		menu.menu();
	}
	}