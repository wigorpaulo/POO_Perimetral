package view ;

import java.util.ArrayList;
import java.util.Scanner;

import controller.FornecedorController;
import model.Fornecedor;


public class FornecedorView{


	public void menuFornecedor(){
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
       case 2 : listarFornecedor();break;
       case 3 : atualizarFornecedor();break;
       case 4 : deletarFornecedor();break;
	   case 5 : MenuView menu = new MenuView();
	            menu.menu();break;
	   default: System.out.println("Opcao invalida !");break;
       }
        
	}
	
	public void cadastrarFornecedor() {
		
		Scanner ler =new Scanner(System.in);
		Fornecedor fornecedor = new Fornecedor();
		FornecedorController fornecedorController = new FornecedorController();
		
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println(" *** Cadastro de Fornecedor ***");
		System.out.println(" ");
		System.out.println("Digite [F] para pessoa fisica");
		System.out.println("Digite [J] para pessoa  juridica");
		 fornecedor.setTipoPessoa(ler.nextLine());
			System.out.println("Informe a Razao Social: ");
			fornecedor.setRazaoSocial(ler.nextLine());
		   System.out.print("Iforme o seu CNPJ:");
			fornecedor.setCnpj(ler.nextLine()); 
            System.out.println("Informe a Fantasia: ");
	   	    fornecedor.setFantasia(ler.nextLine()); 
			   System.out.println("");
			   System.out.println("______________________________");
			   System.out.println("");
			   System.out.println();
			   System.out.println(fornecedorController.cadastrar(fornecedor));
	   
			   menuFornecedor();   	
		
	}
	
	public void listarFornecedor () {
        FornecedorController fornecedorController = new FornecedorController();
        ArrayList <Fornecedor> listaFornecedor = fornecedorController.listar();

		if (listaFornecedor.isEmpty()){
		   System.out.println("Não possui cadastro");
		}else{
			System.out.println("");
			System.out.println("________________________________________");
			System.out.println("    *** Lista de Fornecedores ***");
			System.out.println("");

			for(int i = 0 ; i < listaFornecedor.size() ; i ++){
				System.out.println(listaFornecedor.get(i).toString());
			}
			System.out.println("");
			System.out.println("________________________________________");
			System.out.println("");
				
		}
		menuFornecedor();

	}
	
	public void atualizarFornecedor() {
		Scanner ler =new Scanner(System.in);
		Fornecedor fornecedor = new Fornecedor();

		System.out.println("");
		System.out.println("__________________________________");
	    System.out.println("Informe a Razão Social / Nome: ");
		  fornecedor.setRazaoSocial(ler.nextLine());
		System.out.print("Informe a nova Fantasia :");
		  fornecedor.setFantasia(ler.nextLine());	
		System.out.println("");
          FornecedorController fornecedorController = new FornecedorController();	  
		  if (!fornecedorController.atualizar(fornecedor)){
			  System.out.println("Fornecedor não encontrado ");
			  System.out.println("__________________________________");
			  System.out.println("");
		  }else {
			System.out.println(" *** Atualizado com sucesso ! ***"); 
			System.out.println("__________________________________");
			System.out.println("");
		  }
	    
		menuFornecedor();
	}

	public void deletarFornecedor() {
		    Scanner ler =new Scanner(System.in);
		    Fornecedor fornecedor = new Fornecedor();

		    System.out.println("");
		    System.out.println("__________________________________");
		    System.out.println("");
			System.out.println("Informe a Razão Social / Nome: ");
			 fornecedor.setRazaoSocial(ler.nextLine());
			FornecedorController fornecedorController = new FornecedorController();
            if (!fornecedorController.deletar(fornecedor)){
				System.out.println("Fornecedor não encontrado \n Tente novamente ");
				System.out.println("");
				System.out.println("__________________________________");
				System.out.println("");
			}else {
			System.out.println("Cadastro deletado com sucesso !!! ");
			System.out.println("");
		    System.out.println("__________________________________");
			System.out.println("");
			}	
		    menuFornecedor();
	}
	
}