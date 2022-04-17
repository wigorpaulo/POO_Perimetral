package view;

import java.util.Scanner;

public class MenuView {
	public void menu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("-*-*-*-*- MENU -*-*-*-*-");
		System.out.println("");
		System.out.println("1- Cadastrar novo usuário: ");
		System.out.println("2- Cadastrar novo fornecedor: ");
		System.out.println("3- Cadastrar tipo pessoa: ");
		System.out.println("4- Cadastrar tipo produto: ");
		System.out.println("5- Cadastrar Produto: ");
		System.out.println("6- Cadastrar cliente; ");
		System.out.println("0- SAIR.");
		
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1: {
			UserView user = new UserView();
			user.menuUsuario(null);			
			break;
		}
		case 2: {
			
			break;
		}
		case 3: {

			break;
		}
		case 0: {
			System.out.println("Sistema finalizado!");
			System.exit(0);
			break;
		}
		default:
			System.out.println("Opção invalida!");
			menu();
		}

	}
}
