package view;

import java.util.Scanner;

import model.Usuario;

public class UserView {
	private String username, password;

	public void menuUsuario(Usuario user) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-*-*-*-*-*- MENU USUÁRIO -*-*-*-*-*-");
		System.out.println("");
		System.out.println("1- CADASTRAR");
		System.out.println("2- LISTAR TODOS OS USUÁRIOS");
		System.out.println("3- ATUALIZAR LISTA/DADOS");
		System.out.println("4- DELETAR CADASTRO");
		System.out.println("5- VOLTAR PARA O MENU INICIAL");
		System.out.println("-*-*-*-*--*-*-*-*--*-*-*-*--*-*-*-*-");

		int opcao = sc.nextInt();
		
		switch (opcao) {
		case 1:
			menuCadastro();
			break;
		case 2:
			menuListar(user);
			break;	
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			MenuView menu = new MenuView();
			menu.menu();
			break;
		default:
			System.out.println("Opção invalida");
			menuUsuario(null);
			break;
		}
		
	}

	public void menuCadastro() {
		Scanner sc = new Scanner(System.in);
		
		Usuario user = new Usuario();
		
		
		System.out.println("-*-*-*-*-*-MENU CADASTRO USUÁRIO-*-*-*-*-*-");
		System.out.println("");
		System.out.println("Informe o username: ");
		user.setUsername(sc.nextLine());
		System.out.println("Informe o password: ");
		user.setPassword(sc.nextLine());
		System.out.println("CADASTRO REALIZADO COM SUCESSO!!!");
		System.out.println("");
		
		menuUsuario(user);
		
	}

	public void menuListar(Usuario user) {
		System.out.println("Lista de usuário(s): " + user.getUsername());
		System.out.println("Lista de senha(s): " + user.getPassword());
		
		menuUsuario(null);

	}

	public void menuAtualizar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("-*-*-*-*-*-MENU ATUALIZAÇÃO-> USUÁRIO-*-*-*-*-*-");
		System.out.println("");
		System.out.println("Informe o novo username: ");
		username = sc.nextLine();
		System.out.println("Informe a nova password: ");
		password = sc.nextLine();
		System.out.println("DADOS ATUALIZADOS!!!");
		System.out.println("");
		System.out.println("Usuário: " + username);
		System.out.println("Senha: " + password);
		//sc.close();
	}

	public void menuDeletar() {
		System.out.println("-> CADASTRO DELETADO");
		username = "";
		password = "";

		
	}
}
