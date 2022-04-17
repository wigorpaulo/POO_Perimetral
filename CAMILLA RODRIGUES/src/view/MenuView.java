package view;

import java.util.Scanner;

public class MenuView {
	
	public void menu() {
		UsuarioView opcoesUsuario = new UsuarioView();
		FornecedoresView opcoesFornecedor = new FornecedoresView();
		ClienteView opcoesCliente = new ClienteView();		
		Scanner leia = new Scanner(System.in);
		Integer opcoesMenu=-1;
		Integer selecao=0;
		while(opcoesMenu!=0) {
			while(opcoesMenu<0 || opcoesMenu>6) {
				System.out.println("* * * MENU * * *\n");
				System.out.println("1 - Cadastrar Usuário");
				System.out.println("2 - Cadastrar Fornecedor");
				System.out.println("3 - Cadastrar Tipo Pessoa");
				System.out.println("4 - Cadastrar Tipo Produto");
				System.out.println("5 - Cadastrar Cliente");
				System.out.println("6 - Cadastrar Produto");
				System.out.println("0 - Sair");
				System.out.println("\n* * * * * * *");
				System.out.print("==>");
				opcoesMenu=leia.nextInt();
				leia.nextLine();
		}
			switch(opcoesMenu) {
			
			case 1 :
				while(selecao<1 || selecao>5) {
					opcoesUsuario.menuUsuario();
					System.out.print("==>");
					selecao=leia.nextInt();
					leia.nextLine();
				}
				if(selecao==5) {
					opcoesMenu=-1;	
					selecao=0;
				}
				else {
				switch(selecao) {
					case 1 :
						opcoesUsuario.menuCadastro();
						selecao=0;
						break;
					case 2 : 
						opcoesUsuario.menuListar();
						selecao=0;
						break;
					case 3: 
						opcoesUsuario.menuAtualizar();
						selecao=0;
						break;
					case 4 :
						opcoesUsuario.menuDeletar();
						selecao=0;
						break;	
					}// fim switch selecao usuário
					break;
				}
				break;
					
			case 2 :
				while(selecao<1 || selecao>5) {
					opcoesFornecedor.menuFornecedores();;
					System.out.print("==>");
					selecao=leia.nextInt();
					leia.nextLine();
				}
				if(selecao==5) {
					opcoesMenu=-1;	
					selecao=0;
				}
				else {
				switch(selecao) {
					case 1 :
						opcoesFornecedor.menuCadastro();
						selecao=0;
						break;
					case 2 : 
						opcoesFornecedor.menuListar();
						selecao=0;
						break;
					case 3: 
						opcoesFornecedor.menuAtualizar();
						selecao=0;
						break;
					case 4 :
						opcoesFornecedor.menuDeletar();
						selecao=0;
						break;	
					}// fim switch selecao fornecedor
					break;
				}
				break;
				
			case 3 :

				System.out.println("Teste entrar menu 3 - CADASTRAR TIPO PESSOA");
				opcoesMenu=-1;
				break;
				
			case 4 :
				System.out.println("Teste entrar menu 4 - CADASTRAR TIPO PRODUTO");
				opcoesMenu=-1;
				break;

			case 5 : 
				while(selecao<1 || selecao>5) {
					opcoesCliente.menuCliente();
					System.out.print("==>");
					selecao=leia.nextInt();
					leia.nextLine();
				}
				if(selecao==5) {
					opcoesMenu=-1;	
					selecao=0;
				}
				else {
				switch(selecao) {
					case 1 :
						opcoesCliente.menuCadastro();
						selecao=0;
						break;
					case 2 : 
						opcoesCliente.menuListar();
						selecao=0;
						break;
					case 3: 
						opcoesCliente.menuAtualizar();
						selecao=0;
						break;
					case 4 :
						opcoesCliente.menuDeletar();
						selecao=0;
						break;	
					}// fim switch selecao fornecedor
					break;
				}
				break;
				
			
			case 6 :
				
				System.out.println("Teste entrar menu 6 - CADASTRAR PRODUTO");
				opcoesMenu=-1;
				break;				
			
			}// ffim switch opcoes Menu
			
		}// fim while menu geral

		System.out.println("\nSISTEMA ENCERRADO");
		System.out.println(" * * * FIM * * *");			
		
	}

}

