package View;
import java.util.Scanner;
import View.MenuView;

public class LoginView{
	
	
	
	//Login do usuario;
	public void login(){
		String userName;
		String password;
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("Digite seu Email:");
		userName = scan.next();
		System.out.println(" ");
		System.out.println("Digite sua senha de acesso:");
		password = scan.next();
		System.out.println(" ");
		System.out.println("-------------------------------");
		System.out.println(" ");
		System.out.println("***LOGIN*** \n"  
		                   + userName+"\n" 
		                   + password +"\n"
		                   + "***Logado com sucesso!***");
		System.out.println(" ");
		System.out.println("-------------------------------");
		//INSTANCIA DE MenuView:
		MenuView me = new MenuView();
				
		//PUXAR METODO MENU:
		me.men();
		
	}
	
	
}