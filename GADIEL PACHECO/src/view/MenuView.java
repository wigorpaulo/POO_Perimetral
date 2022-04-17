package view;
import java.util.Scanner;

public class MenuView {
	public void menu() {
			
		
		Scanner ler = new Scanner(System.in);
		int opcao = 0;

		
			System.out.println("************ Menu ************");
			System.out.println("1 - Cadastrar Usuario");
			System.out.println("2 - Cadastrar Fornecedor");
			System.out.println("3 - Cadastrar Tipo Pessoa");
			System.out.println("4 - Cadastrar Tipo Produto");
			System.out.println("5 - Cadastrar Cliente");
			System.out.println("6 - Cadastrar Produto");
			System.out.println("0 - Sair");
			System.out.println("******************************");
			
			System.out.print("Informe opção: ");
			opcao = Integer.parseInt(ler.nextLine());

			switch (opcao) {
			  case 1:
				  UsuarioView user = new UsuarioView();
					user.menuUsuario(null);
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
			  default:
				  System.out.println("Opção inválida.");
				  menu();
			    break;
			  case 0:
				  System.out.println("Obrigado!");
				  ler.close();
			}
		
	}
}

