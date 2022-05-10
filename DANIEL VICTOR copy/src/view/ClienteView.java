package view;

import java.util.Scanner;

import model.Cliente;

public class ClienteView {
	public void menuCliente(Cliente cliente){
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
			case 2 : menuListar(cliente);break;
			case 3 : menuAtualizar(cliente);break;
			case 4 : menuDeletar(cliente);break;
			case 5 : MenuView menu = new MenuView();
			         menu.menu();break;
			default: System.out.println("Opcao invalida !");break;
		}


}
	
	public void menuCadastro() {
		
		Scanner ler = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println(" *** Cadastro de Cliente ***");
		System.out.println(" ");
		System.out.print("Informe o id :");
		cliente.setId(ler.nextInt());
		System.out.print("Informe o Nome :");
		cliente.setNome(ler.next());
		System.out.print("Iforme CPF:");
		cliente.setCpf(ler.nextLine());
		System.out.print("Informe o Gênero:");
		cliente.setGenero(ler.next());
		System.out.print("Informe o Endereço :");
		cliente.setEndereco(ler.next());
		System.out.print("Informe o Telefone:");
		cliente.setTelefone(ler.next());
		System.out.println("");
		System.out.println(" *** Cadastro Realizado! ***");
		System.out.println("______________________________");
        System.out.println("");

			
		menuCliente(cliente);
	}
	public void menuListar(Cliente cliente) {
		
		System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("  *** Usuarios Cadastrados  ***");
	    System.out.println("");
		System.out.println("id         :" + cliente.getId());
		System.out.println("Nome       :"+cliente.getNome());
		System.out.println("CPF        :"+cliente.getCpf());
		System.out.println("Gênero     : "+ cliente.getGenero());
		System.out.println("Endereço   :"+cliente.getEndereco());
		System.out.println("Telefone   :"+cliente.getTelefone());
		System.out.println("");
		System.out.println("__________________________________");
		System.out.println("");
		
		menuCliente(null);
	}
	

	
	public void menuAtualizar(Cliente cliente) {
		Scanner ler = new Scanner(System.in);

		System.out.println("");
	    System.out.println("__________________________________");
		System.out.print("Atualizando id:");
		cliente.setId (ler.nextInt());
		System.out.print("Atualizando Nome :");
		cliente.setNome (ler.next());		
		System.out.print("Atualizando CPF :");
		cliente.setCpf(ler.next());
		System.out.print("Atualizando Gênero :");
		cliente.setGenero(ler.next());
		System.out.print("Atualizando Endereço :");
		cliente.setEndereco(ler.next());
		System.out.print("Atualizando Telefone :");
		cliente.setTelefone(ler.next());
		System.out.println("Atualizado com sucesso !!!");
		System.out.println("");
	    System.out.println("__________________________________");
	    
		menuCliente(cliente);
	}
	
	public void menuDeletar(Cliente cliente) {
        System.out.println("");
	    System.out.println("__________________________________");
	    System.out.println("");
		System.out.println("Cadastro deletado com sucesso !!! ");
		System.out.println("");
	    System.out.println("__________________________________");
	    cliente.setId(0);
	    cliente.setNome(null);
	    cliente.setCpf(null);
	    cliente.setGenero(null);
	    cliente.setEndereco(null);
	    cliente.setTelefone(null);
	    menuCliente(cliente);
	}
 

}
