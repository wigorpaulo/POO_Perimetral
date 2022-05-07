package view;

import java.util.Scanner;
import model.TipoProduto;

public class TipoProdutoView {
	public void menuTipoProduto(TipoProduto tipoProduto){
	Scanner ler =new Scanner(System.in);

    System.out.println("");
    System.out.println("____________________________");
	System.out.println("  *** Menu de Usuario ***");
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
		case 1 : menuCadastro();break;
		case 2 : menuListar(tipoProduto);break;
		case 3 : menuAtualizar(tipoProduto);break;
		case 4 : menuDeletar(tipoProduto);break;
		case 5 : MenuView menu = new MenuView();
		         menu.menu();break;
		default: System.out.println("Opcao invalida !");break;
	}


}

public void menuCadastro() {
	
	Scanner ler = new Scanner(System.in);
	
	TipoProduto tipoProduto = new TipoProduto();
	
	System.out.println("");
    System.out.println("______________________________");
	System.out.println(" *** Tipo Pessoa de Usuario ***");
	System.out.println(" ");
	System.out.print("Informe id :");
	tipoProduto.setId(ler.nextInt());
	System.out.print("Informe o Descrição  :");
	tipoProduto.setDescricao(ler.next());
	System.out.println("");
	System.out.println(" *** Cadastro Realizado! ***");
	System.out.println("______________________________");
    System.out.println("");

		
	menuTipoProduto(tipoProduto);
}
public void menuListar(TipoProduto tipoProduto) {
	
	System.out.println("");
    System.out.println("__________________________________");
    System.out.println("  *** Tipo Produto Cadastrados  ***");
    System.out.println("");
	System.out.println("id              :" + tipoProduto.getId() );
	System.out.println("Descrição       : "+ tipoProduto.getDescricao());
	System.out.println("");
	System.out.println("__________________________________");
	System.out.println("");
	
	menuTipoProduto(null);
}



public void menuAtualizar(TipoProduto tipoProduto) {
	Scanner ler = new Scanner(System.in);

	System.out.println("");
    System.out.println("__________________________________");
    System.out.println("Atualizando id :");
    tipoProduto.setId(ler.nextInt());
    System.out.print("Atualizando Descrição :");
    tipoProduto.setDescricao(ler.nextLine());		
	System.out.print("Atualizado com sucesso !!!");
	System.out.println("");
    System.out.println("__________________________________");
    
	menuTipoProduto(tipoProduto);
}

public void menuDeletar(TipoProduto tipoProduto) {
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
