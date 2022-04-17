package view;
import java.util.Scanner;
import view.UsuarioView;
import model.Usuario;
import model.Fornecedor;
import model.Produto;
import model.TipoPessoa;
import model.TipoProduto;
public class MenuView {
	
	
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("*** Menu ***\n");
		System.out.println("-1- Cadastrar Usuario");
		System.out.println("-2- Cadastrar Fornecedor");
		System.out.println("-3- Cadastrar Tipo pessoa");
		System.out.println("-4- Cadastrar Tipo produto");
		System.out.println("-5- Cadastrar Cliente");
		System.out.println("-6- Cadastrar Produto");
		System.out.println("-0- Sair");
		System.out.println("\n*** ***");
		int i = scan.nextInt();
		switch (i) {
		case 1:
			UsuarioView user = new UsuarioView();
			user.menuUser(null);
			break;
		case 0:
			System.out.println("*** Programa encerrado! ***");
			
		}
		/*case 2:
			System.out.println("*** Cadastrar Fornecedor ***\n");
			System.out.println("Razão Social:");
			fornecedor.setRazaoSocial(scan.next());
			System.out.println("Nome Fantasia:");
			fornecedor.setFantasia(scan.next());
			System.out.println("CNPJ:");
			fornecedor.setCNPJ(scan.next());
		case 3:
			System.out.println("*** Cadastrar Tipo pessoa ***\n");
			System.out.println("ID:");
			tipoPessoa.setId(scan.nextInt());
			System.out.println("Descrição:");
			tipoPessoa.setDescricao(scan.next());
			break;
		case 4:
			System.out.println("*** Cadastrar tipo produto ***\n");
			System.out.println("");*/
		}
		
	}



