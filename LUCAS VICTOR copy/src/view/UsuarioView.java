package view;

import java.util.Scanner;

import controller.UsuarioControle;
import controller.UsuarioController;
import model.Usuario;
import service.UsuarioService;

public class UsuarioView {

	public void menuUsuario(Usuario user) {
		Scanner ler = new Scanner(System.in);

		System.out.println("");
		System.out.println("____________________________");
		System.out.println("  *** Menu de Usuario ***");
		System.out.println("");
		System.out.println("[1]- Cadastrar");
		System.out.println("[2]- Listar Todos");
		System.out.println("[3]- Atualizar");
		System.out.println("[4]- Deletar");
		System.out.println("[5]- Voltar para o Menu");
		System.out.println("");
		int x = ler.nextInt();
		System.out.println("____________________________");
		System.out.println("");

		switch (x) {
			case 1:
				menuCadastro();
				break;
			case 2:
				menuListar(user);
				break;
			case 3:
				menuAtualizar(user);
				break;
			case 4:
				menuDeletar(user);
				break;
			case 5:
				MenuView menuView = new MenuView();
				menuView.menu();
				break;
			default:
				System.out.println("Opcao invalida !");
				menuUsuario(null);
				;
				break;

		}

	}

	public void menuCadastro() {

		Scanner ler = new Scanner(System.in);
		Usuario usuario = new Usuario();

		System.out.println("");
		System.out.println("______________________________");
		System.out.println(" *** Cadastro de Usuario ***");
		System.out.println(" ");
		System.out.print("Informe Username :");
		usuario.setUsername(ler.nextLine());
		System.out.print("Iforme Password  :");
		usuario.setPassword(ler.nextLine());
		System.out.println("");
		System.out.println(" *** Cadastro Realizado! ***");
		System.out.println("______________________________");
		System.out.println("");

		UsuarioController usuarioController = new UsuarioController();
		usuarioController.cadastrar(usuario);

	}

	public void menuListar() {
		Usuario usuario = new Usuario();
		UsuarioController usuarioController = new UsuarioController();
		usuarioController.listar();

		/* se o retorno do metodo listar() for vazio */
		System.out.print("Não Posui cadastro");

		/* Se possui registro , mostra as informações de registro */

		/* Chamar o metodo toString de Usuario (modal) */
	}

	public void menuAtualizar(Usuario user) {
		Scanner ler = new Scanner(System.in);

		String username;

		System.out.println("Informe o Username que deseja atualizar");
		username = ler.next();

		UsuarioController usuarioController = new UsuarioController();
		if (usuarioController.atualizar(user)) {
			System.out.println("Usu�rio Atualizado");
		} else {
			System.out.println("Usuario n�o encontrado");
		}

		/*
		 * username.toString();
		 * 
		 * if (username == null) {
		 * System.out.println("Usuario nao encontrdado");
		 * }
		 * 
		 * 
		 * System.out.println("");
		 * System.out.println("__________________________________");
		 * System.out.print("Atualizando username :");
		 * user.setUsername (ler.nextLine());
		 * System.out.print("Atualizando password :");
		 * user.setPassword (ler.nextLine());
		 * System.out.println("Atualizado com sucesso !!!");
		 * System.out.println("");
		 * System.out.println("__________________________________");
		 * 
		 */menuUsuario(user);
	}

	public void menuDeletar() {
		Usuario user = new Usuario();
		// setar as informa��es

		UsuarioController usuarioController = new UsuarioController();
		usuarioController.deletar(user);

		/*
		 * System.out.println("");
		 * System.out.println("__________________________________");
		 * System.out.println("");
		 * System.out.println("Cadastro deletado com sucesso !!! ");
		 * System.out.println("");
		 * System.out.println("__________________________________");
		 * user.setUsername(null);
		 * user.setPassword(null);
		 */

		menuUsuario();
	}

}
