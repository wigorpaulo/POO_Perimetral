package view ;

import java.util.Scanner;
import model.Fornecedor;


public class FornecedorView{


	public void menuFornecedor(Fornecedor fornecedor){
		Scanner ler =new Scanner(System.in);

	    System.out.println("");
	    System.out.println("____________________________");
		System.out.println("  *** Menu de Fornecedor ***");
		System.out.println("");
		System.out.println("[1]- Cadastrar");
		System.out.println("[2]- Listar Todos");
		System.out.println("[3]- Atualizar");
		System.out.println("[4]- Deletar");
		System.out.println("[5]- Voltar para o Menu");
		System.out.println("");
		int x=ler.nextInt();
		System.out.println("____________________________");
        System.out.println("");
		
       switch (x) {
       
       case 1 : cadastrarFornecedor();break;
       case 2 : listarFornecedor(fornecedor);break;
       case 3 : atualizarFornecedor(fornecedor);break;
       case 4 : deletarFornecedor(fornecedor);break;
	   case 5 : MenuView menu = new MenuView();
	            menu.menu();break;
	   default: System.out.println("Opcao invalida !");break;
       }
        
	}
	
	public void cadastrarFornecedor() {
		
		Scanner ler =new Scanner(System.in);
		Fornecedor fornecedor = new Fornecedor();
		
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println(" *** Cadastro de Fornecedor ***");
		System.out.println(" ");
		System.out.print("Informe o seu id :");
		fornecedor.setId(ler.nextInt());
		System.out.println("Digite [1] para pessoa fisica :");
		System.out.println("Digite [2] para pessoa  juridica :");
		fornecedor.setTipoPessoa(ler.nextInt());
	    System.out.println("Informe a razao social :");
		fornecedor.setRazaoSocial(ler.next());
		System.out.println("Informe a Fantasia :");
		fornecedor.setFantasia(ler.next());
		System.out.print("Iforme o seu CPF/CNPJ :");
		fornecedor.setCnpj(ler.next());
		System.out.println("");
		System.out.println(" *** Cadastro Realizado! ***");
		System.out.println("______________________________");
        System.out.println("");
        
        menuFornecedor(fornecedor);
	}
	
	public void listarFornecedor (Fornecedor fornecedor) {
		System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("  *** Fornecedores Cadastrados  ***");
	    System.out.println("");
		System.out.println("Razao Social :"+ fornecedor.getRazaoSocial() );
		System.out.println("Fantasia     :"+ fornecedor.getFantasia());
		System.out.println("CFP/CNPJ     :"+ fornecedor.getCnpj());
		System.out.println("");
		System.out.println("__________________________________");
		System.out.println("");
		
		menuFornecedor(fornecedor);
	}
	
	public void atualizarFornecedor(Fornecedor fornecedor) {
		Scanner ler =new Scanner(System.in);
		
		System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("Atualizando o Tipo Pessoa [1]para pessoa fisica , [2] para pessoa juridica");
		fornecedor.setTipoPessoa(ler.nextInt());
		System.out.print(" Atualizando a Razao Social :");
		fornecedor.setRazaoSocial(ler.next());
		System.out.print("Atualizando a Fantasia :");
		fornecedor.setFantasia(ler.nextLine());	
		System.out.println("Atualizando CPF/CNPJ");
		fornecedor.setCnpj(ler.next());
		System.out.println("Atualizado com sucesso !!!");
		System.out.println("");
	    System.out.println("__________________________________");
	    
		menuFornecedor(fornecedor);
	}

	public void deletarFornecedor(Fornecedor fornecedor) {
		   System.out.println("");
		    System.out.println("__________________________________");
		    System.out.println("");
			System.out.println("Cadastro deletado com sucesso !!! ");
			System.out.println("");
		    System.out.println("__________________________________");
			fornecedor.setFantasia(null);
			fornecedor.setRazaoSocial(null);
			fornecedor.setId(0);
			fornecedor.setCnpj(null);
			fornecedor.setTipoPessoa(0);
			
		    menuFornecedor(fornecedor);
	}
	
}