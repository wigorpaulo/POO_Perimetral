package View;

import java.util.Scanner;
import Model.Usuario;

public class UsuarioView {
	
//================================================================================================================//
	
	public void listar(Usuario user1) {
		Scanner ler = new Scanner (System.in);
		
		Usuario user = new Usuario();
		
		System.out.println(" > P E R F I L  C A D A S T R A D O <\n ");
		System.out.println("   Login: " + user1.getUsername());
		System.out.println("   Password: " + user1.getPassword());
		System.out.println("------------------------------------");
		System.out.println("  [0] Voltar ");
		int cod = ler.nextInt();
		
		if (cod == 0) {
			UsuarioView menu = new UsuarioView();
			menu.user(user);
		}
			
	}
	
//================================================================================================================//
	
	public void cadastro() {
		Scanner ler = new Scanner (System.in);
		
		Usuario user1 = new Usuario();
		
		System.out.println("***** C A D A S T R O  U S U A R I O *****");
		System.out.println("Informe o Login: ");
		user1.setUsername(ler.next());
		System.out.println("Informe o Password: ");
		user1.setPassword(ler.next());
		
		System.out.println("*** C A D A S T R O  R E A L I Z A D O ***\n\n");
		user(user1);
	}
	
//================================================================================================================//

	public void user(Usuario user) {
		Scanner ler = new Scanner (System.in);
		
		System.out.println("\n ___________________________________________________ ");
		System.out.println("|___________ M E N U  D O  U S U A R I O ___________|");
		System.out.println("|                                                   |");
		System.out.println("| [1] Cadastrar                                     |");
		System.out.println("| [2] Listar Todos os Usuarios                      |");
		System.out.println("| [3] Atualizar Usuario                             |");
		System.out.println("| [4] Deletar Usuario                               |");
		System.out.println("| [0] Voltar Para o Menu                            |");
		System.out.println("|___________________________________________________|");
		System.out.println("\nDigite oque deseja fazer: ");
		int cod = ler.nextInt();
		System.out.println("\n");
		
		switch(cod) {
		case 0:
			MenuView MenuView = new MenuView();
			MenuView.menu();
			break;
		case 1:
			cadastro();
			break;
		case 2:
			listar(user);
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		}
	}
	
//================================================================================================================//

}