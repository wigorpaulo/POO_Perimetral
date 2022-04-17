package View;

import java.util.Scanner;

public class LoginView {
	
	public void login() {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("*** LOGIN ***");
		
		System.out.println("Login: ");
		String Username = ler.next();
		System.out.println("Password: ");
		String password = ler.next();
		
		System.out.println("*** L O G A D O  C O M  S U C E S S O ***\n\n ");
		
		MenuView menuView = new MenuView();
		menuView.menu();
	
		}
       
}
