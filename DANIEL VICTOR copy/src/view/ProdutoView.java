package view;

import java.util.Scanner;

import model.Produto;

public class ProdutoView {
	public void menuProduto(Produto produto){
		Scanner ler =new Scanner(System.in);

	    System.out.println("");
	    System.out.println("____________________________");
		System.out.println("  *** Menu de Cliente ***");
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
			case 2 : menuListar(produto);break;
			case 3 : menuAtualizar(produto);break;
			case 4 : menuDeletar(produto);break;
			case 5 : MenuView menu = new MenuView();
			         menu.menu();break;
			default: System.out.println("Opção invalida !");break;
		}


}
	
	public void menuCadastro() {
		
		Scanner ler = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println(" *** Cadastro de Produto***");
		System.out.println(" ");
		System.out.print("Informe o Codigo :");
		produto.setCodigo(ler.nextInt());
		System.out.print("Informe a Descricao :");
		produto.setDescricao(ler.next());
		System.out.print("Informe a Marca :");
		produto.setMarca(ler.next());
		System.out.print("Informe a Cor :");
		produto.setCor(ler.next());
		System.out.print("Informe a Data Validade :");
		produto.setDataValidade(ler.next());
		System.out.print("Informe o preco compra :");
		produto.setPreco_compra(ler.nextFloat());
		System.out.print("Informe o preco venda :");
		produto.setPreco_venda(ler.nextFloat());
		System.out.print("Informe o Tipo Produto :");
		produto.setTipoProduto(ler.nextInt());
		System.out.println("");
		System.out.println(" *** Cadastro Realizado! ***");
		System.out.println("______________________________");
        System.out.println("");

			
		menuProduto(produto);
	}
	public void menuListar(Produto produto) {
		
		System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("  *** Usuarios Cadastrados  ***");
	    System.out.println("");
		System.out.println("Codigo           :" + produto.getCodigo());
		System.out.println("Descricao        :"+produto.getDescricao());
		System.out.println("Marca            :"+produto.getMarca());
		System.out.println("Cor              : "+ produto.getCor());
		System.out.println("Data Validade    :"+produto.getDataValidade());
		System.out.println("Preco Compra     :"+produto.getPreco_compra());
		System.out.println("Preco Venda      :"+produto.getPreco_venda());
		System.out.println("Tipo Produto     :"+produto.getTipoProduto());
		System.out.println("");
		System.out.println("__________________________________");
		System.out.println("");
		
		menuProduto(null);
	}
	

	
	public void menuAtualizar(Produto produto) {
		Scanner ler = new Scanner(System.in);

		System.out.println("");
	    System.out.println("__________________________________");
		System.out.print("Atualizando o Codigo :");
		produto.setCodigo(ler.nextInt());
		System.out.print("Atualizando a Descricao :");
		produto.setDescricao(ler.next());
		System.out.print("Atualizando a Marca :");
		produto.setMarca(ler.nextLine());
		System.out.print("Atualizando a Cor :");
		produto.setCor(ler.next());
		System.out.print("Atualizando a Data Validade :");
		produto.setDataValidade(ler.nextLine());
		System.out.print("Atualizando o preco compra :");
		produto.setPreco_compra(ler.nextFloat());
		System.out.print("Atualizando o preco venda :");
		produto.setPreco_venda(ler.nextFloat());
		System.out.print("Atualizando o Tipo Produto :");
		produto.setTipoProduto(ler.nextInt());
		System.out.println("Atualizado com sucesso !!!");
		System.out.println("");
	    System.out.println("__________________________________");
	    
		menuProduto(produto);
	}
	
	public void menuDeletar(Produto produto) {
        System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("");
		System.out.println("Cadastro deletado com sucesso !!! ");
		System.out.println("");
	    System.out.println("__________________________________");
	    produto.setCodigo(0);
	    produto.setDescricao(null);;
	    produto.setCor(null);
	    produto.setDataValidade(null);
	    produto.setMarca(null);
	    produto.setPreco_compra(0);
	    produto.setPreco_venda(0);
	    produto.setTipoProduto(0);	
	    
	    menuProduto(produto);
	}
 
}
