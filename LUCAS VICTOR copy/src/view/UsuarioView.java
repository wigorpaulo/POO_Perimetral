package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Usuario;

public class UsuarioView extends ApplicationView implements IApplicationView{

	public void menuUsuario() {
		// Scanner ler = new Scanner(System.in);

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
				menuListar();
				break;
			case 3:
				menuAtualizar();
				break;
			case 4:
				menuDeletar();
				break;
			case 5:
				MenuView menuView = new MenuView();
				menuView.menu();
				break;
			default:
				System.out.println("Opcao invalida !");
				menuUsuario();
				;
				break;

		}

	}

	public void menuCadastro() {

		// Scanner ler = new Scanner(System.in);
		Usuario usuario = new Usuario();

		System.out.println("");
		System.out.println("______________________________");
		System.out.println(" *** Cadastro de Usuario ***");
		System.out.println(" ");
		System.out.print("Informe Username :");
		  usuario.setUsername(ler.nextLine());
		System.out.print("Informe Password  :");
		  usuario.setPassword(ler.nextLine());
		System.out.println("");
		System.out.println("______________________________");
		System.out.println("");

	//	UsuarioController usuarioController = new UsuarioController();
		System.out.println(usuarioController.cadastrar(usuario)); 
		menuUsuario();

	}

	public void menuListar() {
	
  //		UsuarioController usuarioController = new UsuarioController();
		ArrayList<Usuario> listaUsuario = usuarioController.listar();

		/* se o retorno do metodo listar() for vazio */
		
		if (listaUsuario.isEmpty()){
		   System.out.print("Não posui cadastro");
		}else {

		/* Se possui registro , mostra as informações de registro */

		/* Chamar o metodo toString de Usuario (modal) */

		System.out.println("");
		System.out.println("______________________________");
		System.out.println("");
		System.out.println(" *** Listagem de Usuario ***");
		for (int i = 0 ; i < listaUsuario.size() ; i ++){
			System.out.println(listaUsuario.get(i).toString());
		}
		System.out.println("");
		System.out.println("______________________________");
		System.out.println("");

	    }
	   menuUsuario();
	}

	public void menuAtualizar() {
		// Scanner ler = new Scanner(System.in);
		Usuario usuario = new Usuario();

		String username;

		System.out.println("");
		System.out.println("_______________Atualizando________________");
		System.out.println("");
		System.out.print("Atualizando username :");
		usuario.setUsername(ler.nextLine());
		System.out.print("Atualizando password :");
		usuario.setPassword(ler.nextLine());
		System.out.println("");

	//	UsuarioController usuarioController = new UsuarioController();
		if (!usuarioController.atualizar(usuario)) {
			System.out.println("Usuario não encontrado");
		} else {
			System.out.println(" Atualizando com sucesso !");
			System.out.println("______________________________");
			System.out.println("");

		}
		 menuUsuario();
	}

	public void menuDeletar() {
		// Scanner ler = new Scanner(System.in);
		Usuario usuario = new Usuario();
		// setar as informa��es

		System.out.println("");
		System.out.println("_______________Deletar_______________");
		System.out.println("");
		System.out.print("Informe o  username :");
		usuario.setUsername(ler.nextLine());

	//	UsuarioController usuarioController = new UsuarioController();
		if (!usuarioController.deletar(usuario)) {
			System.out.println("");
			System.out.println("Usuario nao encontrado ");
			System.out.println("Tente novamente");
			System.out.println("_______________________________________");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("Excluido com sucesso !");
			System.out.println("_______________________________________");
			System.out.println("");
		}
        menuUsuario();
	}

}
