package view;

import java.util.Scanner;

public class UsuarioView {

	public void usuario() {
			
		Scanner entrada = new Scanner(System.in);
		
		int opcao = entrada.nextInt();	
		MenuView menu = new MenuView();
		
		switch (opcao) {
		
		case 1:
			
			System.out.println("***MENU DO USUARIO***");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - LISTAR TODOS");
			System.out.println("3 - ATUALIZAR");	
			System.out.println("4 - DELETAR");
			System.out.println("0 - VOLTAR PARA O MENU PRINCIPAL");
			System.out.println("*********************");
			
			break;
			
		case 2:
			
			System.out.println("***MENU DO FORNECEDOR***");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - LISTAR TODOS");
			System.out.println("3 - ATUALIZAR");	
			System.out.println("4 - DELETAR");
			System.out.println("0 - VOLTAR PARA O MENU PRINCIPAL");
			System.out.println("*********************");
		
			break;
			
		case 3:
			
			System.out.println("***MENU DO TIPO PESSOA***");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - LISTAR TODOS");
			System.out.println("3 - ATUALIZAR");	
			System.out.println("4 - DELETAR");
			System.out.println("0 - VOLTAR PARA O MENU PRINCIPAL");
			System.out.println("*********************");
		
			break;
			
		case 4:
			
			System.out.println("***MENU DO TIPO PRODUTO***");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - LISTAR TODOS");
			System.out.println("3 - ATUALIZAR");	
			System.out.println("4 - DELETAR");
			System.out.println("0 - VOLTAR PARA O MENU PRINCIPAL");
			System.out.println("*********************");
			
			break;
			
		case 5:
			
			System.out.println("***MENU DO CLIENTE***");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - LISTAR TODOS");
			System.out.println("3 - ATUALIZAR");	
			System.out.println("4 - DELETAR");
			System.out.println("0 - VOLTAR PARA O MENU PRINCIPAL");
			System.out.println("*********************");
			
			break;
			
		case 6:	
			
			System.out.println("***MENU DO PRODUTO***");
			System.out.println("1 - CADASTRAR");
			System.out.println("2 - LISTAR TODOS");
			System.out.println("3 - ATUALIZAR");	
			System.out.println("4 - DELETAR");
			System.out.println("0 - VOLTAR PARA O MENU PRINCIPAL");
			System.out.println("*********************");
			
			break;
			
		case 0:
			
			System.out.println("Saindo...!");	
			break;
			
		default:
			System.out.println("Digite uma opcao valida!");
			menu.menu();
			
		}
	}
}