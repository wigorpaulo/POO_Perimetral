package view;

import java.util.Scanner;

import model.Usuario;

public class UsuarioView {

	private int num;
	
	public void menuAtualizar(Usuario user) {
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Atualizando username");
		user.setUsername(ler.nextLine());
		System.out.println("Atualizando password");
		user.setPassword(ler.nextLine());
		System.out.println("*****Atualizando com sucesso*******");
		usuarioview(user);
		
		
	}
	
	public void listar(Usuario user) { //metodo refencia clss
		
	System.out.println("Usuario:" + user.getUsername());
	System.out.println("Senha:" + user.getPassword());

     usuarioview(null);
		
	}
	

	

	public void cadastro() {
		Scanner ler = new Scanner(System.in);
		
		Usuario user = new Usuario();
		
		System.out.println("\n****************CADASTRO****************\n");
		System.out.println("Usuario:");
		user.setUsername(ler.nextLine());
		System.out.println("Senha:");
		user.setPassword(ler.nextLine());
		System.out.println("\n**********CADASTRADO COM SUCESSO********\n");
		
		usuarioview(user);
	}



	public void usuarioview(Usuario user) {	
		Scanner ler = new Scanner(System.in);		
		
		
		System.out.println("|_________CADASTRO USUARIO_________|");
		System.out.println("| [1]Cadastra                      |");                   
		System.out.println("| [2]Listar                        |");
     	System.out.println("| [3]Atualizar                     |");
		System.out.println("| [4]Deletar                       |");
		System.out.println("| [0]Voltar para menu              |");
		System.out.println("|__________________________________|");
		
	
	num = ler.nextInt();
		
		switch(num){
		
		case 0:
			
			MenuView MenuView = new MenuView();
			MenuView.menu();
			
		case 1:
			cadastro();
			break;
		case 2:
			listar(user);
			break;
		case 3:
			menuAtualizar(user);
			break;
		case 4:
			break;
		case 5:
			break;
		}
	}
}
	

