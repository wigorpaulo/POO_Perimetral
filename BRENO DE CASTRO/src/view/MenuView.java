package view;

import model.Usuario;

import java.util.Scanner;

public class MenuView {
		
	private int option;
	
	public void menu() {
	
		
		System.out.println("╔══════════════════════════╗"); // ALT 205 "═" // ALT 186 "║" // ALT 187 "╗"
		System.out.println("║                  MENU                   ║");
		System.out.println("║──────────────────────────║"); // ALT 196 "─"
		System.out.println("║■ 1 -> Menu usuário                      ║"); // ALT 254 "■"
		System.out.println("║■ 2 -> Menu fornecedor                   ║");
		System.out.println("║■ 3 -> Menu tipo pessoa                  ║");
		System.out.println("║■ 4 -> Menu tipo produto                 ║");
		System.out.println("║■ 5 -> Cadastrar cliente                 ║");
		System.out.println("║■ 6 -> Cadastrar produto                 ║");
		System.out.println("║■ 0 -> Sair                              ║");
		System.out.println("╚══════════════════════════╝"); // ALT 200 "╚" // ALT 188 "╝"
		
		
                /*
		System.out.println(" ___________________________TESTE");
		System.out.println("|            MENU           |");
		System.out.println("|___________________________|");
		System.out.println("|■[1]-> Menu usuario        |");
		System.out.println("|■[2]-> Menu fornecedor     |");
		System.out.println("|■[3]-> Menu tipo pessoa    |");
		System.out.println("|■[4]-> Menu tipo produto   |");
		System.out.println("|■[5]-> Cadastrar cliente   |");
		System.out.println("|■[6]-> Cadastrar produto   |");
		System.out.println("|■[0]-> Sair                |");
		System.out.println("|___________________________|");
		*/
                
		Scanner ler = new Scanner(System.in);
		
			
		option = ler.nextInt();
		
		switch(option) {
			case 0:
				System.exit(0);
			case 1: 
				UsuarioView menu1 = new UsuarioView();
				menu1.menuUsuario(null);
				
		}
	}
}

