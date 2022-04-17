package View;
import Model.Usuario;
import View.MenuView;
import java.util.Scanner;

public class UsuarioView {
	    Scanner scan = new Scanner(System.in);
		Usuario use = new Usuario();
	    MenuView menu = new MenuView();
	    
	public void menuUsuario(){
		System.out.println(" ");
		System.out.println("***Menu usuario***");
		System.out.println(" ");
		System.out.println("1-Cadastrar: \n"+
		                   "2-Listar todos: \n"+
				           "3-Atualizar: \n"+
		                   "4-Deletar: \n"+
				           "5-Voltar para o menu:");
		System.out.println(" ");
		System.out.println("-------------------------");
		
		int a = scan.nextInt();
        
		switch (a) {
		case 1 :
			CadastrarUsuario1();
		break;
		case 2:
			ListaUsuario2();
		break;
		case 3:
			System.out.println("Lista atualizada:");
		break;
		case 4 :
			System.out.println("Dados deletados");
		break;
		case 5:
			menu.men();
		break;
		}
	}
		
		
		
	//METODO CADASTRAR USUARIO:
	public void CadastrarUsuario1() {
       
		
		System.out.println(" ");
		System.out.println("***Cadastre usuario***");
		System.out.println(" ");
		System.out.println("Informe UserName:");
		use.setUserName(scan.next());
		System.out.println(" ");
		System.out.println("Informe password:");
		use.setPassword(scan.next());
		System.out.println("\n");
		System.out.println("***Cadastro realizado com sucesso***");
		System.out.println(" ");
		System.out.println("----------------------------------------");
		menuUsuario();
	}		
	
	
	//METODO DE LISTAR USUARIO:
	public void ListaUsuario2(){
		System.out.println("***Lista Usuario***");
		System.out.println(" ");
		System.out.println(use.getUserName());
		System.out.println(" ");
		System.out.println(use.getPassword());
		System.out.println(" ");
		System.out.println("----------------------------------------");
		menuUsuario();
		
	}
	
	

}
