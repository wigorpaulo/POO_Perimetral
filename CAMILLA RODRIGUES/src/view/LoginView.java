package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import service.UsuarioService;

public class LoginView {
	
	public void login() {
		Scanner sc = new Scanner(System.in);
		String usuario, senha;
		Integer escape=-1;
		System.out.println("* * * LOGIN * * *");
		System.out.print("Username: ");
		usuario=sc.nextLine().toUpperCase();	
		System.out.print("Senha: ");
		senha=sc.nextLine();
		UsuarioService user = new UsuarioService();
			if(user.buscarSenha(usuario, senha)==true){
				System.out.println("* * * Logado com sucesso! * * * \n");	
				MenuView menu = new MenuView();
				menu.menu();
			}		
	}
}

