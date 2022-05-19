package view;
import java.util.Scanner;
import model.Usuario;
public class UsuarioView {
	
	public void menuUsuario(Usuario user){
		Scanner ler =new Scanner(System.in);

		System.out.println("");
	    System.out.println("");
		System.out.println("  Olá, você está no menu de usuário");
		System.out.println("");
		System.out.println("1- deseja cadastrar");
		System.out.println("2- listar todoso os clientes cadastrados");
		System.out.println("3- atualizar sistema");
		System.out.println("4- deletar");
		System.out.println("5- voltar ao menu principal");
		System.out.println("");
		int x = ler.nextInt();
		System.out.println("");
        System.out.println("");

		switch(x){
			case 1 : menuCadastro();break;
			case 2 : menuListar(user);break;
			case 3 : menuAtualizar(user);break;
			case 4 : menuDeletar(user);break;
			case 5 : MenuView menu = new MenuView();
			         menu.menu();break;
			default: System.out.println("Opção inválida!");break;
		}


	}
	
	public void menuCadastro() {
		
		Scanner ler = new Scanner(System.in);
		
		Usuario user = new Usuario();

		System.out.println("");
	    System.out.println("");
		System.out.println("Cadastro de usuarios");
		System.out.println(" ");
		System.out.print("Informe o nome :");
		user.setUsername(ler.nextLine());
		System.out.print("Iforme sua senha  :");
		user.setPassword(ler.nextLine());
		System.out.println("");
		System.out.println("Cadastro realizado com sucesso");
		System.out.println("");
        System.out.println("");

		menuUsuario(user);
	}
	public void menuListar(Usuario user) {
		System.out.println("");
	    System.out.println("");
	    System.out.println("Usuarios já cadastrados");
	    System.out.println("");
		System.out.println("Usuario :" + user.getUsername() );
		System.out.println("Senha   : "+ user.getPassword());
		System.out.println("");
		System.out.println("");
		System.out.println("");

		menuUsuario(null);
	}
	

	
	public void menuAtualizar(Usuario user) {
		Scanner ler = new Scanner(System.in);

		System.out.println("");
	    System.out.println("");
		System.out.print("Atualizando nome :");
		user.setUsername (ler.nextLine());
		System.out.print("Atualizando senha :");
		user.setPassword (ler.nextLine());		
		System.out.println("Atualizado com sucesso !!!");
		System.out.println("");
	    System.out.println("");
	    
	}
	
	public void menuDeletar(Usuario user) {
		System.out.println("");
	    System.out.println("");
	    System.out.println("");
		System.out.println("Cadastro deletado com sucesso !!! ");
		System.out.println("");
	    System.out.println("");
		user.setUsername(null);
		user.setPassword(null);
	}
 
	
}
