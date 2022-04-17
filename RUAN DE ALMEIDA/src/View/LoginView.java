package View;

import java.util.Scanner;

public class LoginView {
	
//================================================================================================================//

	public void loginUser() {
		Scanner ler = new Scanner (System.in);
	
		System.out.println("*************** L O G I N ***************");
		
		System.out.println("Login: ");
		String username = ler.next();
		System.out.println("Password: ");
		String password = ler.next();
				
		System.out.println("*** L O G A D O  C O M  S U C E S S O ***\n\n");
		
		MenuView MenuView = new MenuView();
		MenuView.menu();
	}
	
//================================================================================================================//

}