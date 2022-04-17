package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import view.ClienteView;

public class ClienteService {
	
	public boolean validarCliente(String cpfCliente, String caminhoCliente) {
		boolean validar=false;
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoCliente))){
			String linha = br.readLine();
			while(linha!=null) {
				if(linha.contains(cpfCliente)==true) {					
					validar=true;
					break;
				}
				linha = br.readLine();
			}
		}			
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());			
		}		
		return validar;		
	}
	
	public void cadastrarCliente(String caminhoCliente, String cpfCliente) {
		Scanner scCliente = new Scanner(System.in);
		Cliente cadastroCliente = new Cliente();
		ClienteService cod = new ClienteService();
		Integer codCliente = cod.codigoCliente()+1;
		System.out.print("Nome: ");
		String nomeCliente = scCliente.nextLine().toUpperCase();
		System.out.print("Selecione: \n[1 - MASCULINO] [2 - FEMINIO] ==> ");
		String generoCliente=".";
		Integer g = scCliente.nextInt();
		while (g < 1 || g > 2) {
			System.out.print("Selecione: \n[1 - MASCULINO] [2 - FEMINIO] ==> ");
			g = scCliente.nextInt();
		}
		scCliente.nextLine();
		switch (g) {
		case 1:
			generoCliente = "MASCULINO";
			break;
		case 2:
			generoCliente = "FEMININO";
			break;
		}
		System.out.print("Endereço: ");
		String enderecoCliente = scCliente.nextLine().toUpperCase();
		System.out.print("Telefone: ");
		String telefoneCliente = scCliente.nextLine().toUpperCase();
		cadastroCliente = new Cliente(codCliente, nomeCliente, cpfCliente, generoCliente, enderecoCliente, telefoneCliente);
		try {
			FileWriter arq = new FileWriter(caminhoCliente,true);
			BufferedWriter escrever = new BufferedWriter(arq);
			escrever.write(cadastroCliente.getId()+";"+cadastroCliente.getNome()+";"+cadastroCliente.getCpf()+";"+cadastroCliente.getGenero()+";"+cadastroCliente.getEndereco()+";"+cadastroCliente.getTelefone());
			System.out.println("Cadastro Realizado!!!\n");
			escrever.newLine();
			escrever.close();
			arq.close();
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.print("Digite: \n[1 - Cadastrar novo cliente] [0 - Sair]\n==> ");
		Integer opcao = scCliente.nextInt();
		scCliente.nextLine();
		System.out.println("\n");
		if(opcao==1) {
			ClienteView menu = new ClienteView();
			menu.menuCadastro();
		}		
	}
	
	public void listarClientes(String caminhoCliente) {
		List<Cliente> listaClientes = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoCliente))){
			String linha = br.readLine();
			while(linha!=null) {
				String[] vetorClientes = linha.split(";");				
				Integer codCliente = Integer.parseInt(vetorClientes[0]);
				String nomeCliente = vetorClientes[1];
				String cpfCliente = vetorClientes[2];
				String generoCliente = vetorClientes[3];
				String enderecoCliente = vetorClientes[4];				
				String telefoneCliente = vetorClientes[5];	
				Cliente cliente = new Cliente(codCliente, nomeCliente, cpfCliente, generoCliente, enderecoCliente, telefoneCliente);
				listaClientes.add(cliente);
				linha = br.readLine();
			}
			System.out.println("* * * CLIENTES * * *\n");
			for(Cliente c : listaClientes) {
				System.out.println(c);
			}
			System.out.println("\n");			
		}		
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public void atualizarCliente(String caminho, String cpfAlterado) {
		try {
			Scanner ler = new Scanner(System.in);		
			FileReader lerNoARquivo = new FileReader(caminho);
			BufferedReader br = new BufferedReader(lerNoARquivo);		
			String linha = br.readLine();
			ArrayList <String>lista = new ArrayList<>();
			while(linha!=null) {
				if(linha.contains(cpfAlterado)==false) {
					lista.add(linha);					
				}
				else {
					String[] vetorClientes = linha.split(";");				
					Integer codidoClienteAlterar = Integer.parseInt(vetorClientes[0]);
					System.out.print("Nome: ");
					String nomeAlterado = ler.nextLine().toUpperCase();
					Integer gn=-1;
					while(gn<1|| gn>2) {
						System.out.print("Genero: \n[1 - MASCULINO] [2 - FEMININO] ==> ");
						gn = ler.nextInt();
						ler.nextLine();
					}
					String generoAlterado=".";
					if(gn==1) {
						generoAlterado="MASCULINO";
						
					}
					else {
						generoAlterado="FEMININO";
					}
					System.out.print("Endereço: ");
					String enderecoAlterado = ler.nextLine().toUpperCase();					
					System.out.print("Telefone: ");
					String telefoneAlterado = ler.nextLine().toUpperCase();					
					linha=codidoClienteAlterar+";"+nomeAlterado+";"+cpfAlterado+";"+generoAlterado+";"+enderecoAlterado+";"+telefoneAlterado;
					System.out.println("Cliente alterado com sucesso!\n");
					lista.add(linha);					
				}
				linha = br.readLine();
			}
			br.close();
			lerNoARquivo.close();
			FileWriter escrever = new FileWriter(caminho);	
			BufferedWriter bw = new BufferedWriter(escrever);
			for(int i=0; i<lista.size();i++) {
				bw.write(lista.get(i));
				bw.newLine();				
			}
			bw.close();
			escrever.close();			
		}	
		catch (IOException e){
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public Integer codigoCliente() {
		ClienteService c = new ClienteService();
		c.criarArquivo();
		String caminhoCliente= "Cliente.txt";
		Integer qtd=0;
		try {						
			FileReader lerNoARquivo = new FileReader(caminhoCliente);
			BufferedReader br = new BufferedReader(lerNoARquivo);		
			String linha = br.readLine();
			ArrayList <String>lista = new ArrayList<>();			
			while(linha!=null) {
				String[] vetorCliente = linha.split(";");				
				Integer idCliente = Integer.parseInt(vetorCliente[0]);
				qtd=idCliente;
				linha = br.readLine();
			}			
			br.close();		
		}	
		catch (IOException e){
			System.out.println("Erro: " + e.getMessage());
		}		
		return qtd;		
	}
	
	public boolean criarArquivo() {
		boolean retorno=false;
		File cliente = new File("Cliente.txt");
		if(cliente.isFile()) {
			retorno=true;
		}else {
			try {
				cliente.createNewFile();
				retorno=true;
			}
			catch(IOException e){
				System.out.println("Erro: " + e.getMessage());
			}
		}
		return retorno;
	}
	

}
