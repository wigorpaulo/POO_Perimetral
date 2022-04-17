package view;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Fornecedor;
import service.FornecedorService;

public class FornecedoresView {
	
	public void menuFornecedores() {
	
		System.out.println("* * * Menu Fornecedores * * *\n");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar Todos");
		System.out.println("3 - Atualizar");
		System.out.println("4 - Deletar");
		System.out.println("5 - Voltar para Menu");
		System.out.println("\n* * * * * *");
	}
	
	public void menuCadastro() {		
		//String caminho = "/Volumes/Milla&Bin/TÉCNICAS DE PROGRAMAÇÃO/Estoque/fornecedores.txt";
		FornecedorService cadFornecedor = new FornecedorService();
		cadFornecedor.criarArquivo();
		String caminho = "Fornecedor.txt";
		
		Scanner leia = new Scanner(System.in);
		System.out.print("CNPJ.: ");
		String cnpj = leia.nextLine();

		if(cadFornecedor.validarCNPJ(caminho, cnpj)==true) {
			System.out.printf("CPF / CNPJ %s já está cadastrado no banco de dados de Fornecedores.\n\n", cnpj);
		}
		else {
			cadFornecedor.cadastrarFornecedor(cnpj, caminho);
		}		
	}
	
	public void menuListar() {
		FornecedorService lista = new FornecedorService();
		lista.criarArquivo();
		String caminhoArqFornecedores = "Fornecedor.txt";
		lista.listarFornecedores(caminhoArqFornecedores);			
	}
	
	public void menuAtualizar() {
		Scanner ler = new Scanner(System.in);
		FornecedorService cadFornecedor = new FornecedorService();	
		cadFornecedor.criarArquivo();
		String caminho = "Fornecedor.txt";
		System.out.print("Informe o CPF / CNPJ do Fornecedor que deseja alterar: ");
		String cnpj = ler.nextLine();	
		if(cadFornecedor.validarCNPJ(caminho, cnpj)==true) {
			cadFornecedor.atualizarFornecedor(caminho, cnpj);
		}
		else {
			System.out.printf("CPF / CNPJ %s não localizado no banco de dados.\n\n", cnpj);
		}		
	}
	
	public void menuDeletar() {
		FornecedorService deletarFornecedor = new FornecedorService();
		deletarFornecedor.criarArquivo();
		String caminho = "Fornecedor.txt";
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe o CPF / CNPJ do fornecedor que deseja deletar: ");
		String cnpjDeletar = ler.nextLine().toUpperCase();
		if(deletarFornecedor.validarCNPJ(caminho, cnpjDeletar)==true) {
			deletarFornecedor.deletarFornecedor(caminho, cnpjDeletar);
			System.out.printf("O CPF / CNPJ %s foi deletado do banco de dados.\n\n", cnpjDeletar);
		}
		else {
			System.out.printf("CPF / CNPJ %s não localizado no banco de dados.\n\n", cnpjDeletar);
		}			
	}
	
}

