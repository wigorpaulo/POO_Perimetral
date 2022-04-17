package View;

import java.util.Scanner;

public class MenuView {
	
	private int option;
		
	public void menu() {
		Scanner ler = new Scanner (System.in);
		
		System.out.println(" _______________________________________________ ");
		System.out.println("|                                               |");
		System.out.println("|                    M E N U                    |");
		System.out.println("|_______________________________________________|");
		System.out.println("|                                               |");
		System.out.println("| [1] Menu Usuarios                             |");
		System.out.println("| [2] Menu Fornecedores                         |");
		System.out.println("| [3] Menu Tipo Pessoa                          |");
		System.out.println("| [4] Menu Tipo Produto                         |");
		System.out.println("| [5] Menu Clientes                             |");
		System.out.println("| [6] Menu Produto                              |");
		System.out.println("| [0] Sair                                      |");
		System.out.println("|                                               |");
		System.out.println("|_______________________________________________|");
		System.out.println("\nDigite oque deseja fazer: ");
	
		option = ler.nextInt();
	
	switch(option) {
	
		case 0:
			System.out.println("Volte sempre! ");
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

}
