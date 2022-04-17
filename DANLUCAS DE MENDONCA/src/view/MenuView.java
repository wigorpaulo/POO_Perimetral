package view;

import java.util.Scanner;

public class MenuView {
	Scanner ler = new Scanner(System.in);
	
	private int num;
	
	public void menu() {

		
		
		System.out.println("|____________________MENU____________________|");
		System.out.println("| [1]Menu Usuario                            |");
		System.out.println("| [2]Menu Fornecedor                         |");
     	System.out.println("| [3]Menu Tipo Pessoa                        |");
		System.out.println("| [4]Menu Tipo Produto                       |");
		System.out.println("| [5]Menu Cliente                            |");
		System.out.println("| [6]Menu Produto                            |");
		System.out.println("| [0]Sair                                    |");
		System.out.println("|____________________________________________|");
				
		num = ler.nextInt();
				
		switch(num){
		
		case 0:
			System.exit(0);
			break;
		case 1:
			UsuarioView UsuarioView = new UsuarioView();
			UsuarioView.usuarioview(null);
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;		
		}
	} 	
}