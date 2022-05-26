package view;

import java.util.ArrayList;
import java.util.Scanner;
import controller.UsuarioController;
import model.Usuario;

public class UsuarioView {

	public void menuUsuario() {

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
				menuListar();
				break;
			case 3:
				menuAtualizar();
				break;
			case 4:
				menuDeletar();
				break;
			case 5:
				MenuView menu = new MenuView();
				menu.menu();
				break;
			default:
				System.out.println("Opcao invalida !");
				menuUsuario();
				break;
		}

	}

	public void menuCadastro() {

		Scanner ler = new Scanner(System.in);

		Usuario usuario = new Usuario();
		UsuarioController usuarioController = new UsuarioController();

		System.out.println("");
		System.out.println("______________________________");
		System.out.println(" *** Cadastro de Usuario ***");
		System.out.println(" ");
		System.out.print("Informe Username :");
		  usuario.setUsername(ler.nextLine());
		System.out.print("Iforme Password  :");
		  usuario.setPassword(ler.nextLine());
		System.out.println("");
		System.out.println("______________________________");
		System.out.println("");

		System.out.println(usuarioController.cadastrar(usuario));
		menuUsuario(); 

	}

	public void menuListar() {
		UsuarioController usuarioController = new UsuarioController();
		ArrayList <Usuario> listaUsuario =  usuarioController.listar();
       
		if (listaUsuario.isEmpty()){
			System.out.println("Não possui cadastro!");
		}else{
		System.out.println(" ");
		System.out.println("______________________________");
		System.out.println(" ");
		System.out.println(" *** Lista de Usuarios ***");
		
		for(int i = 0; i< listaUsuario.size();i++){
            System.out.println(listaUsuario.get(i).toString());
		}
		System.out.println("______________________________");
		System.out.println(" ");
		}
		menuUsuario();
	}

	public void menuAtualizar() {
		Scanner ler = new Scanner(System.in);
		Usuario usuario = new Usuario();

		System.out.println("");
		System.out.println("__________________________________");
		System.out.print("Atualizando username :");
		usuario.setUsername(ler.nextLine());
		System.out.print("Atualizando password :");
		usuario.setPassword(ler.nextLine());
		System.out.println("Atualizado com sucesso !!!");
		System.out.println("");
		System.out.println("__________________________________");
		UsuarioController usuarioController = new UsuarioController();

		if (!usuarioController.atualizar(usuario)) {
			System.out.println("Usurio nao encontrado!");
		} else {
			System.out.println("Cadastro de Usuario atualizado com sucesso!");
		}

		menuUsuario();
	}

	public void menuDeletar() {

		Scanner ler = new Scanner(System.in);
		Usuario usuario = new Usuario();

		System.out.println("");
		System.out.println("__________________________________");
		System.out.print("Informe o username :");
		usuario.setUsername(ler.nextLine());
        UsuarioController usuarioController = new UsuarioController();
		if (!usuarioController.excluir(usuario)) {
			System.out.println("Usuario não encontrado");
		} else {
			System.out.println("Cadastro do usuario excluído com sucesso!");
			System.out.println("");
			System.out.println("__________________________________");
		}
		
		menuUsuario();
	}

}
