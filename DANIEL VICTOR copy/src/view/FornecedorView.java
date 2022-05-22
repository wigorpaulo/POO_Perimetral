package view;
import model.Fornecedor;
import java.util.Scanner;

public class FornecedorView {
	
	
	public void menuFornecedor(Fornecedor fornecedor) {
	    Scanner ler = new Scanner(System.in);

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
	    
	 

	    switch(x){
	        case 1 : menuCadastro(null);
			  break;
	        case 2 : menuListar(fornecedor);
			  break;
	        case 3 : menuAtualizar(fornecedor);
			  break;
	        case 4 : menuDeletar(fornecedor);
			  break;
	        case 5 : MenuView menu = new MenuView();
	          menu.menu();
			  break;
	        default: System.out.println("Opcao invalida !");
			  menuFornecedor(null);
			  break;
	    }


	}	

	public void menuCadastro(Fornecedor fornecedor) {
			
	    Scanner ler = new Scanner(System.in);
	    
	    System.out.println("");
	    System.out.println("______________________________");
	    System.out.println(" *** Cadastro de Fornecedor ***");
	    System.out.println(" ");
	    System.out.print("Informe o id:");
	    fornecedor.setId(ler.nextInt());
	    System.out.print("Informe Raz�o Social:");
	    fornecedor.setRazaoSocial(ler.next());
	    System.out.print("Informe Fantasia  :");
	    fornecedor.setFantasia(ler.next());
	    System.out.println("Informe Tipo Pessoa");
	    System.out.println("Digite 0 para Pessoa Jur�dica");
	    System.out.println("Digite 1 para Pessoa F�sica");
	    fornecedor.setTipoPessoa(ler.nextInt());
	    System.out.println("Infrome o CNPJ :");
	    fornecedor.setCnpj(ler.next());
	    System.out.println("");
	    System.out.println(" *** Cadastro Realizado! ***");
	    System.out.println("______________________________");
	    System.out.println("");

	        
	    menuFornecedor(null);
	}

	public void menuListar(Fornecedor fornecedor) {
	    
	    System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("  *** Lista de Fornecedores  ***");
	    System.out.println("");
	    System.out.println("Raz�o Social :" + fornecedor.getRazaoSocial() );
	    System.out.println("Fantasia   : "+ fornecedor.getFantasia());
	    if (fornecedor.getTipoPessoa()==0) {
	    System.out.println("Tipo Pessoa Jur�dica");	
	    }else {
	    System.out.println("Tipo Pessoa F�sica");		
	    }
	    System.out.println("CNPJ :"+fornecedor.getCnpj());
	    System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("");
	    
	    menuFornecedor(null);
	}



	public void menuAtualizar(Fornecedor fornecedor){
	  Scanner ler = new Scanner(System.in);

	System.out.println("");
	System.out.println("__________________________________");
	System.out.print("Atualizando Raz�o Social :");
	fornecedor.setRazaoSocial (ler.nextLine());
	System.out.print("Atualizando Fantasia :");
	fornecedor.setFantasia (ler.nextLine());
	System.out.println("Atualizar CNPJ :");
	fornecedor.setCnpj(ler.nextLine());	
	System.out.println("Atualizar Tipo Pessoa :");
	fornecedor.setTipoPessoa(ler.nextInt());	
	System.out.println("Atualizado com sucesso !!!");
	System.out.println("");
	System.out.println("__________________________________");

	menuFornecedor(null);
	}
	public void menuDeletar(Fornecedor fornecedor) {
	    System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("");
	    System.out.println("Cadastro deletado com sucesso !!! ");
	    System.out.println("");
	    System.out.println("__________________________________");
	    fornecedor.setRazaoSocial(null);
	    fornecedor.setCnpj(null);
	    fornecedor.setFantasia(null);
	    fornecedor.setTipoPessoa(0);
	    
	    menuFornecedor(null);
	}
}
