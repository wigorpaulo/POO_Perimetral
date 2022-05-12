package view;
import java.util.Scanner;
import controller.UsuarioController;
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
			case 2 : menuListar();break;
			case 3 : menuAtualizar(user);break;
			case 4 : menuDeletar(user);break;
			case 5 : MenuView menu = new MenuView();
			         menu.menu();break;
			default: System.out.println("Opcao invalida !");break;
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
		System.out.println(" *** Cadastro Realizado! ***");
		System.out.println("______________________________");
        System.out.println("");

        
		usuarioController.cadastrar(usuario);	
		menuUsuario(usuario);
	}
	
	public void menuListar() {
		
	 Usuario usuario = new Usuario();
	 
	 UsuarioController usuarioController = new UsuarioController();
	 
	 usuarioController.listar();
	 
	 menuUsuario(usuario);
	 
//		System.out.println("");
//	    System.out.println("__________________________________");
//	    System.out.println("  *** Usuarios Cadastrados  ***");
//	    System.out.println("");
//		System.out.println("Usuario :" + usuario.listar(ler.next()));
//		System.out.println("Senha   : "+ usuario.listar(null));
//		System.out.println("");
//		System.out.println("__________________________________");
//		System.out.println("");
//		
		
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
