package view;
import java.util.Scanner;
import model.Usuario;
public class UsuarioView {
	
	public void menuUsuario(Usuario user){
		Scanner ler =new Scanner(System.in);

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
		int x=ler.nextInt();
		System.out.println("____________________________");
        System.out.println("");
		
		

		switch(x){
			case 1 : menuCadastro();break;
			case 2 : menuListar(user);break;
			case 3 : menuAtualizar(user);break;
			case 4 : menuDeletar(user);break;
			case 5 : MenuView menu = new MenuView();
			         menu.menu();break;
			default: System.out.println("Opcao invalida !");break;
		}


	}
	
	public void menuCadastro() {
		
		Scanner ler = new Scanner(System.in);
		
		Usuario user = new Usuario();
		
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println(" *** Cadastro de Usuario ***");
		System.out.println(" ");
		System.out.print("Informe Username :");
		user.setUsername(ler.nextLine());
		System.out.print("Iforme Password  :");
		user.setPassword(ler.nextLine());
		System.out.println("");
		System.out.println(" *** Cadastro Realizado! ***");
		System.out.println("______________________________");
        System.out.println("");

			
		menuUsuario(user);
	}
	public void menuListar(Usuario user) {
		
		System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("  *** Usuarios Cadastrados  ***");
	    System.out.println("");
		System.out.println("Usuario :" + user.getUsername() );
		System.out.println("Senha   : "+ user.getPassword());
		System.out.println("");
		System.out.println("__________________________________");
		System.out.println("");
		
		menuUsuario(null);
	}
	

	
	public void menuAtualizar(Usuario user) {
		Scanner ler = new Scanner(System.in);

		System.out.println("");
	    System.out.println("__________________________________");
		System.out.print("Atualizando username :");
		user.setUsername (ler.nextLine());
		System.out.print("Atualizando password :");
		user.setPassword (ler.nextLine());		
		System.out.println("Atualizado com sucesso !!!");
		System.out.println("");
	    System.out.println("__________________________________");
	    
		menuUsuario(user);
	}
	
	public void menuDeletar(Usuario user) {
        System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("");
		System.out.println("Cadastro deletado com sucesso !!! ");
		System.out.println("");
	    System.out.println("__________________________________");
		user.setUsername(null);
		user.setPassword(null);
		
	    menuUsuario(user);
	}
 
	
}
