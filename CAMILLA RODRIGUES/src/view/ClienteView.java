package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import model.Fornecedor;
import service.ClienteService;

public class ClienteView {
	
	public void menuCliente() {
			
			System.out.println("* * * Menu Cliente * * *\n");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Listar Todos");
			System.out.println("3 - Atualizar");
			System.out.println("4 - Deletar");
			System.out.println("5 - Voltar para Menu");
			System.out.println("\n* * * * * *");		
			
		}
	
	public void menuCadastro() {
		ClienteService cadastrarCliente = new ClienteService();
		cadastrarCliente.criarArquivo();
		String caminhoCliente= "Cliente.txt";
		Scanner scCliente = new Scanner(System.in);
		System.out.print("CPF / CNPJ.: ");
		String cpfCliente = scCliente.nextLine();
		if(cadastrarCliente.validarCliente(cpfCliente, caminhoCliente)==true) {
			System.out.printf("CPF / CNPJ %s já está cadastrado no banco de dados de clientes.\n\n", cpfCliente);
		}
		else {
			cadastrarCliente.cadastrarCliente(caminhoCliente, cpfCliente);
		}		
	}
	
	public void menuListar() {
		ClienteService listarClientes = new ClienteService();
		listarClientes.criarArquivo();
		String caminhoCliente= "Cliente.txt";
		listarClientes.listarClientes(caminhoCliente);		
	}
	
	
	public void menuAtualizar() {		
		ClienteService alterarCliente = new ClienteService();
		alterarCliente.criarArquivo();
		String caminho = "Cliente.txt";		
		Scanner scCliente = new Scanner(System.in);
		System.out.print("CPF / CNPJ.: ");
		String cpfCliente = scCliente.nextLine();		
		if(alterarCliente.validarCliente(cpfCliente, caminho)==false) {
			System.out.printf("CPF / CNPJ %s não localizado no banco de dados de clientes.\n\n", cpfCliente);
		}
		else {
			alterarCliente.atualizarCliente(caminho, cpfCliente);
		}		
	}
	
	//continuar daqui mudar para parte de service Cliente
	
	public void menuDeletar() {
		ClienteService deletarCliente = new ClienteService();
		deletarCliente.criarArquivo();
		String caminho = "Cliente.txt";		
		try {
			Scanner ler = new Scanner(System.in);
			System.out.print("Informe o código do cliente que deseja deletar: ");
			String codigoDeletar = ler.nextLine().toUpperCase();			
			FileReader lerNoARquivo = new FileReader(caminho);
			BufferedReader br = new BufferedReader(lerNoARquivo);
		
			String linha = br.readLine();
			ArrayList <String>lista = new ArrayList<>();
			while(linha!=null) {
				if(linha.contains(codigoDeletar)==false) {
					lista.add(linha);					
				}
				linha = br.readLine();
			}
			FileWriter apagar = new FileWriter(caminho, true);
			apagar.close();
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

}

