package view;

import java.util.Scanner;

import model.TipoProduto;

public class TipoProdutoView {
	
	public void menuTipoProduto(TipoProduto tipoProduto) {
		Scanner ler =new Scanner(System.in);

	    System.out.println("");
	    System.out.println("____________________________");
		System.out.println("  *** Menu de Tipo Produto ***");
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
       
       case 1 : cadastrarTipoProduto();break;
       case 2 : listarTipoProduto(tipoProduto);break;
       case 3 : atualizarTipoProduto(tipoProduto);break;
       case 4 : deletarTipoProduto(tipoProduto);break;
	   case 5 : MenuView menu = new MenuView();
	            menu.menu();break;
	   default: System.out.println("Opcao invalida !");break;
       }
        
	}
	
	public void cadastrarTipoProduto() {
		
		Scanner ler =new Scanner(System.in);
		TipoProduto tipoProduto = new TipoProduto();
		
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println(" *** Cadastro de Tipo Produto ***");
		System.out.println(" ");
		System.out.print("Informe o seu id :");
		tipoProduto.setId(ler.nextInt());
		System.out.println(" Informe a descricao do produto :"); 
		tipoProduto.setDescricao(ler.next());
		System.out.println(" *** Cadastro Realizado! ***");
		System.out.println("______________________________");
        System.out.println("");
        
        menuTipoProduto(tipoProduto);
	}
	
	public void listarTipoProduto(TipoProduto tipoProduto) {
		
		
		System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("  *** Tipo de Produtos  Cadastrados  ***");
	    System.out.println("");
		System.out.println("ID            :"+tipoProduto.getId());
		System.out.println("Descricao     :"+tipoProduto.getDescricao());
		System.out.println("");
		System.out.println("__________________________________");
		System.out.println("");
		
	    menuTipoProduto(tipoProduto);
	}
	
	public void atualizarTipoProduto(TipoProduto tipoProduto) {
		Scanner ler =new Scanner(System.in);
	
		
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println(" ");
		System.out.print("Atualizando o seu id :");
		tipoProduto.setId(ler.nextInt());
		System.out.println(" Atualizando a descricao do produto :"); 
		tipoProduto.setDescricao(ler.next());
		System.out.println(" *** Atualizado com sucesso! ***");
		System.out.println("______________________________");
        System.out.println("");
        
        menuTipoProduto(tipoProduto);
	
	}
	
	public void deletarTipoProduto(TipoProduto tipoProduto) {
	
			
		    System.out.println("");
		    System.out.println("__________________________________");
		    System.out.println("");
			System.out.println("Cadastro deletado com sucesso !!! ");
			System.out.println("");
		    System.out.println("__________________________________");
		    
		    tipoProduto.setId(0);
		    tipoProduto.setDescricao(null);
	        menuTipoProduto(tipoProduto);		    
	}
}
