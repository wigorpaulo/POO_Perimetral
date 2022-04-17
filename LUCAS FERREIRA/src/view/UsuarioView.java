package view;
import java.util.Scanner;
import model.Usuario;
public class UsuarioView {
	Scanner scan = new Scanner(System.in);
	public void menuUser(Usuario user) {
	
		
		System.out.println("*** Menu Usuario ***\n");
		System.out.println("-1- Cadastrar");
		System.out.println("-2- Listar todos");
		System.out.println("-3- Atualizar");
		System.out.println("-4- Deletar");
		System.out.println("-5- Voltar para o menu");
		
		int entrada = scan.nextInt();
		switch (entrada) {
		case 1:
			cadastrar();
			break;
		case 2:
			listar(user);
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			MenuView menu = new MenuView();
			menu.menu();}
			}
			
		
	public void cadastrar() {
			
			Usuario user = new Usuario();
			System.out.println("*** Cadastro de usuario ***\n");
			System.out.println("Informe Username:");
			user.setUsername(scan.next()); 
			System.out.println("Informe o password:");
			user.setPassword(scan.next());
			System.out.println("\n*** Cadastro realizado! ***");
			
			menuUser(user);
	}
	public void listar(Usuario user) {
		System.out.println("*** Lista de usuarios cadastrados ***\n");
		System.out.println("Usuario:" +user.getUsername());
		System.out.println("Password:"+user.getPassword());
		
		menuUser(null);
	}
	
	}
