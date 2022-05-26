package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.ClienteController;
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
		case 5 : MenuView menu = new MenuView(); menu.menu();break;
		default: System.out.println("Opcao invalida !");break;
	}
	}
	
	   public void cadastrarCliente() {
		   
			
			Scanner ler = new Scanner(System.in);
			
			Cliente cliente = new Cliente();
			ClienteController clienteController = new ClienteController();
			
			System.out.println("");
		    System.out.println("______________________________");
			System.out.println(" *** Cadastro de Usuario ***");
			System.out.println(" ");
			System.out.print("Informe o nome :");
			  cliente.setNome(ler.next());
			System.out.print("Iforme o cpf :");
			  cliente.setCpf(ler.next());
			System.out.println("Informe o Telefone :");
			  cliente.setTelefone(ler.next());
			System.out.println("");
			System.out.println("______________________________");
	        System.out.println("");
           
		   System.out.println(clienteController.cadastrar(cliente));
				
			menuCliente();
		}
	   
	   public void listarCliente() {

		ClienteController clienteController = new ClienteController();
        ArrayList<Cliente> listaCliente = clienteController.listar();
		
		if (listaCliente.isEmpty()){
		   System.out.print("Não posui cadastro");
		}else {
			System.out.println("");
		    System.out.println("__________________________________");
		    System.out.println("  *** Lista de  Clientes ***");
		    System.out.println("");
		  
            for (int i = 0 ; i < listaCliente.size() ; i ++){
				System.out.println(listaCliente.get(i).toString());
			}

			System.out.println("");
			System.out.println("__________________________________");
			System.out.println("");
			
			menuCliente();
	   }
	} 


	   public void atualizarCliente() {
		    Scanner ler = new Scanner(System.in);
			Cliente cliente = new Cliente();
			
			System.out.println("");
		    System.out.println("______________________________");
			System.out.println(" ");
			System.out.print("Informe o nome :");
			  cliente.setNome(ler.next());
			System.out.print("Informe o novo Telefone :");
			  cliente.setTelefone(ler.next());
			System.out.println("");
			
			ClienteController clienteController = new ClienteController();
			if (!clienteController.atualizar(cliente)){
				System.out.println("Cliente não encontrado");
			}else {
			    System.out.println(" *** Atualizado com sucesso! ***");
			System.out.println("______________________________");
	        System.out.println("");
	
			}			
			menuCliente();
	   }


	   
	   public void deletarCliente() {
		   Scanner ler = new Scanner(System.in);
		   Cliente cliente = new Cliente();
			
		    System.out.println("");
		    System.out.println("__________________________________");
		    System.out.println("");
			System.out.println("Informe o Nome :");
			  cliente.setNome(ler.nextLine());
            ClienteController clienteController = new ClienteController();
			if(!clienteController.deletar(cliente)){
				  System.out.println("Cliente não encontrado \n Tente novamente...");
				  System.out.println("");
				  System.out.println("________________________________");
			}else {
				System.out.println("Cadastro deletado com sucesso !!! ");
				System.out.println("");
				System.out.println("__________________________________");
		    }
			menuCliente();
	   }
}
	   

