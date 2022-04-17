package View;
import java.util.Scanner;
import View.UsuarioView;
public class MenuView {
	
	
	//CRIANDO MENU 
	public void men() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println(" ***Menu*** ");
		System.out.println(" ");
		System.out.println("1-Cadastrar usuario: \n"+
		                   "2-Cadastrar Fornecedor:\n"+
				           "3-Cadastar tipo pessoa:\n"+
		                   "4-Cadastrar tipo produto:\n"+
				           "5-Cadastrar cliente:\n"+
		                   "6-Cadastar produto:\n"+
				           "0-Sair:\n");
		System.out.println("-----------------------------");
		int escolha = scan.nextInt();
		
		switch(escolha) {
		case 1 :
			UsuarioView user = new UsuarioView();
			user.menuUsuario();
			
        break;
		case 2 :
			System.out.println("Cadastro de fornecedor");
		break;
		case 3 :
			System.out.println("Cadastro tipo pessoa");
		break;
		case 4 :
			System.out.println("Cadastro tipo produto");
	    break;
	    case 5 :
	    	System.out.println("Cadastrar cliente");	
	    break;
		case 6 :
			System.out.println("Cadastro produto");	
	    break;
		case 0 :
			System.out.println("Programa finalizado");
		break;
			
		}
		
		
	}

}
