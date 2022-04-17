package view;
import java.util.Scanner;
import model.Usuario;
import view.MenuView;

public class UsuarioView {
	public static void menuUsuario(Usuario user) {
		Scanner ler = new Scanner(System.in);
		int opcao = 0;
		
			System.out.println("********** Usuario ***********");
			System.out.println("1 - Cadastrar Usuario");
			System.out.println("2 - Listar Usuarios");
			System.out.println("0 - Retornar ao menu principal");
			System.out.println("******************************");
			
			System.out.print("Informe opção: ");
			opcao = Integer.parseInt(ler.nextLine());
			
			switch (opcao) {
			  case 1:
				  menuCadastro();
			    break;
			  case 2:
				  if(user == null) {
					  System.out.println("Sem usuario cadastrado!");
					  menuUsuario(user);
				  }else {
					  menuListar(user);
				  }
			    break;
			  case 0:
				  MenuView obj = new MenuView();
					obj.menu();
			    break;
			  default:
				  System.out.println("Opção inválida.");
				  menuUsuario(user);
			    break;
			}

	}
	public static void menuCadastro() {
		Scanner ler = new Scanner(System.in);
    	Usuario user = new Usuario();
    	System.out.println("******************************");
    	System.out.print("Informe usuario: ");
		user.setUserName(ler.nextLine());
		System.out.print("Informe Senha: ");
		user.setPassword(ler.nextLine());
		System.out.println("Usuario cadastrado com sucesso!");
		System.out.println("******************************");
		menuUsuario(user);
	}
	public static void menuListar(Usuario user) {
		System.out.println("******************************");
		System.out.println("Usuario: " + user.getUserName());
		System.out.println("Senha: " + user.getPassword());
		System.out.println("******************************");
		menuUsuario(null);
	}
}
