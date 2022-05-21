package view;

import java.util.Scanner;

import model.Cliente;
import model.Usuario;

public class ClienteView {

	public void menuCliente() {
	Scanner ler =new Scanner(System.in);
    Cliente cliente = new Cliente();
		
	
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
		case 1 : cadastrarCliente();break;
		case 2 : listarCliente();break;
		case 3 : atualizarCliente();break;
		case 4 : deletarCliente();break;
		case 5 : MenuView menu = new MenuView();
		         menu.menu();break;
		default: System.out.println("Opcao invalida !");break;
	}
	}
	
	   public void cadastrarCliente() {
		   
			
			Scanner ler = new Scanner(System.in);
			
			Cliente cliente = new Cliente();
			
			System.out.println("");
		    System.out.println("______________________________");
			System.out.println(" *** Cadastro de Usuario ***");
			System.out.println(" ");
			System.out.print("Informe o ID :");
			cliente.setId(ler.nextInt());
			System.out.print("Informe o nome :");
			cliente.setNome(ler.next());
			System.out.print("Iforme o cpf :");
			cliente.setCpf(ler.next());
			System.out.print("Informe o G�nero :");
			cliente.setGenero(ler.next());
			System.out.print("Informe o Endere�o :");
			cliente.setEndereco(ler.next());
			System.out.println("Informe o Telefone :");
			cliente.setTelefone(ler.next());
			System.out.println("");
			System.out.println(" *** Cadastro Realizado! ***");
			System.out.println("______________________________");
	        System.out.println("");

				
			menuCliente();
		}
	   
	   public void listarCliente() {
			Cliente cliente = new Cliente();
			System.out.println("");
		    System.out.println("__________________________________");
		    System.out.println("  *** Usuarios Cadastrados  ***");
		    System.out.println("");
		    System.out.println("ID        : "+ cliente.getId());
			System.out.println("Nome      : "+ cliente.getNome() );
			System.out.println("CPF       : "+ cliente.getCpf());
			System.out.println("G�nero    : "+ cliente.getGenero());
			System.out.println("Edere�o   : "+ cliente.getEndereco());
			System.out.println("Telefone  : "+ cliente.getTelefone());
			System.out.println("");
			System.out.println("__________________________________");
			System.out.println("");
			
			menuCliente();
	   }
	   
	   public void atualizarCliente() {
		   Scanner ler = new Scanner(System.in);
			
			Cliente cliente = new Cliente();
			
			System.out.println("");
		    System.out.println("______________________________");
			System.out.println(" ");
			System.out.print("Atualizando o ID :");
			cliente.setId(ler.nextInt());
			System.out.print("Atualizando o nome :");
			cliente.setNome(ler.next());
			System.out.print("Atualizando o cpf :");
			cliente.setCpf(ler.next());
			System.out.print("Atualizando o G�nero :");
			cliente.setGenero(ler.next());
			System.out.print("Atualizando o Endere�o :");
			cliente.setEndereco(ler.next());
			System.out.println("Atualizando o Telefone :");
			cliente.setTelefone(ler.next());
			System.out.println("");
			System.out.println(" *** Atualizado com sucesso! ***");
			System.out.println("______________________________");
	        System.out.println("");

				
			menuCliente();
		   
	   }
	   
	   public void deletarCliente() {
			Cliente cliente = new Cliente(); 
			
		    System.out.println("");
		    System.out.println("__________________________________");
		    System.out.println("");
			System.out.println("Cadastro deletado com sucesso !!! ");
			System.out.println("");
		    System.out.println("__________________________________");
		    cliente.setNome(null);
		    cliente.setEndereco(null);
		    cliente.setGenero(null);
		    cliente.setTelefone(null);
		    cliente.setCpf(null);
		    cliente.setId(0);
		    
			menuCliente();
	   }
}
	   

