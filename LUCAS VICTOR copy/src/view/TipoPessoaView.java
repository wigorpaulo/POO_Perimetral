package view;

import java.util.Scanner;

import model.TipoPessoa;
public class TipoPessoaView {
	
	public void menuTipoPessoa(TipoPessoa tipoPessoa) {
		
		Scanner ler =new Scanner(System.in);

	    System.out.println("");
	    System.out.println("____________________________");
		System.out.println("  *** Menu de Tipo Pessoa ***");
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
			case 1 : tipoPessoaCadastrar();break;
			case 2 : tipoPessoaListar(tipoPessoa);break;
			case 3 : tipoPessoaAtualizar(tipoPessoa);break;
			case 4 : tipoPessoaDeletar(tipoPessoa);break;
			case 5 : MenuView menu = new MenuView();
			         menu.menu();break;
			default: System.out.println("Opcao invalida !");break;
		}

	}
	
	public void tipoPessoaCadastrar () {
		
		Scanner ler = new Scanner(System.in);
		
		TipoPessoa tipoPessoa = new TipoPessoa();
		
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println(" *** Cadastro de Tipo Pessoa ***");
		System.out.println(" ");
		System.out.print("Informe o ID :");
		tipoPessoa.setId(ler.nextInt());
		System.out.print("Iforme o Nome  :");
		tipoPessoa.setNome(ler.next());
		System.out.print("Infome o Tipo Pessoa :");
		tipoPessoa.setTipo(ler.next());
		System.out.println("");
		System.out.println(" *** Cadastro Realizado! ***");
		System.out.println("______________________________");
        System.out.println("");

			
		menuTipoPessoa(tipoPessoa);
	}
	
     public void tipoPessoaListar(TipoPessoa tipoPessoa) {
    		
 		System.out.println("");
 	    System.out.println("__________________________________");
 	    System.out.println("  *** Tipo de Pessoas  Cadastradas  ***");
 	    System.out.println("");
 		System.out.println("ID            :"+ tipoPessoa.getId() );
 		System.out.println("Nome          :"+ tipoPessoa.getNome());
 		System.out.println("Tipo Pessoa   :"+ tipoPessoa.getTipo());
 		System.out.println("");
 		System.out.println("__________________________________");
 		System.out.println("");
 		
 		menuTipoPessoa(tipoPessoa);
     }
     
     public void tipoPessoaAtualizar(TipoPessoa tipoPessoa) {
    	Scanner ler = new Scanner(System.in); 
    	 
    		
 		System.out.println("");
 	    System.out.println("______________________________");
 		System.out.println(" ");
 		System.out.print("Atualizando  o ID :");
 		tipoPessoa.setId(ler.nextInt());
 		System.out.print("Atualizando o Nome  :");
 		tipoPessoa.setNome(ler.nextLine());
 		System.out.println("Atualizando o Tipo Pessoa");
 		tipoPessoa.setTipo(ler.next());
 		System.out.println("");
 		System.out.println(" *** Atualizado com sucesso! ***");
 		System.out.println("______________________________");
        System.out.println("");
    	
        menuTipoPessoa(tipoPessoa);
     }
     
     public void tipoPessoaDeletar(TipoPessoa tipoPessoa) {
    	 
    	Scanner ler = new Scanner(System.in);
    	 
    	 
    	System.out.println("");
   	    System.out.println("__________________________________");
   	    System.out.println("");
   		System.out.println("Cadastro deletado com sucesso !!! ");
   		System.out.println("");
   	    System.out.println("__________________________________");
   		tipoPessoa.setId(0);
   		tipoPessoa.setNome(null);
   		tipoPessoa.setTipo(null);
   		menuTipoPessoa(tipoPessoa);
     }

}
