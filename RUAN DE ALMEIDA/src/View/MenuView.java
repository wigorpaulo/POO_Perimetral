package View;

import java.util.Scanner;

public class MenuView {
	Scanner ler = new Scanner (System.in);
	
//================================================================================================================//
	
	public void menu() {
	
	System.out.println(" _______________________________");
	System.out.println("|___________ M E N U ___________|");
	System.out.println("|                               |");
	System.out.println("| [1] Menu Usuarios             |");
	System.out.println("| [2] Menu Fornecedorres        |");
	System.out.println("| [3] Menu Tipo Pessoa          |");
	System.out.println("| [4] Menu Tipo Produto         |");
	System.out.println("| [5] Menu Clientes             |");
	System.out.println("| [6] Menu Produtos             |");
	System.out.println("| [0] Sair                      |");
	System.out.println("|_______________________________|");
	System.out.println("\nDigite oque deseja fazer: ");
	int cod = ler.nextInt();
	
	
	switch(cod) {
		case 0:
			System.exit(0);
			break;
		case 1:
			UsuarioView menu = new UsuarioView();
			menu.user(null);
			break;
		case 2:
			
			break;
		case 3:
		
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
	}
	
	}
	
//================================================================================================================//

}