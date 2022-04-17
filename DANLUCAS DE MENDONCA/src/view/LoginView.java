package view;

import java.util.Scanner;

import model.Usuario;

public class LoginView {

	Scanner ler = new Scanner(System.in);
	
	public void login(){
		
		Usuario user = new Usuario();
		
		System.out.println("******************LOGIN*****************");
		System.out.println("Usuario:");
		String username = ler.next();
		System.out.println("Password:");
		String password = ler.next();
		System.out.println("***********LOGADO COM SUCESSO***********");
		
		MenuView MenuView = new MenuView();
		MenuView.menu();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// logado com sucesso
}
