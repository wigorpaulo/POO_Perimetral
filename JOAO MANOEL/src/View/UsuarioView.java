package View;

import java.util.Scanner;
import Model.Usuario;

public class UsuarioView {
	private int option;
	
	public void cadastro() {
		
		Scanner ler = new Scanner (System.in);
		Usuario user1 = new Usuario();
		
		System.out.println("***** C A D A S T R O  U S U A R I O *****");
		System.out.println("Informe o Login: ");
		user1.setUserName(ler.next());
		System.out.println("Informe o Password: ");
		user1.setPassoword(ler.next());
		System.out.println("***** C A D A S T R O  R E A L I Z A D O *****");
		
		user(user1);
		}
	
	public void listar(Usuario user1) {
		Scanner ler = new Scanner (System.in);
		Usuario user = new Usuario();
		
		System.out.println("**** LISTA DE CADASTROS ****\n");
		System.out.println("Username: " + user1.getUserName());
		System.out.println("Password: " + user1.getPassoword());
		System.out.println(" ");
		
		user(null);
	}
	
	public void user(Usuario user) {
		Scanner ler = new Scanner (System.in);
			
		System.out.println(" _______________________________________________ ");
		System.out.println("|                                               |");
		System.out.println("|             M E N U  D O  U S U A R I O       |");
		System.out.println("|_______________________________________________|");
		System.out.println("|                                               |");
		System.out.println("| [1] Cadastrar                                 |");
		System.out.println("| [2] Listar Todos os Usuarios                  |");
		System.out.println("| [3] Atualizar Usuario                         |");
		System.out.println("| [4] Deletar Usuario                           |");
		System.out.println("| [0] Voltar                                    |");
		System.out.println("|                                               |");
		System.out.println("|_______________________________________________|");
		System.out.println("\nDigite oque deseja fazer: ");
		
		option = ler.nextInt();
		System.out.println("\n");
		
	switch(option) {
		
		case 0:
			MenuView menuView = new MenuView();
			menuView.menu();
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
		
	
}
