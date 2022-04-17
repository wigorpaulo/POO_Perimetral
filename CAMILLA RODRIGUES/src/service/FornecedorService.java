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

import model.Fornecedor;
import view.FornecedoresView;

public class FornecedorService {
	
	public void cadastrarFornecedor(String cnpj, String caminhoFornecedor) {		
			Scanner leia = new Scanner(System.in);
			FornecedorService cod = new FornecedorService();			
			Integer id = cod.codigoFornecedor()+1;
			System.out.print("Razão Social: ");
			String razaoSocial = leia.nextLine().toUpperCase();
			Integer tipoPessoa = -1;
			while(tipoPessoa<1|| tipoPessoa>2) {
				System.out.print("Selecione: \n[1 - PESSOA FISICA] [2 - PESSOA JURÍDICA] ==> ");
				tipoPessoa = leia.nextInt();
				leia.nextLine();
			}				
			System.out.print("Fantasia: ");
			String fantasia = leia.nextLine().toUpperCase();
			Fornecedor fornecedor = new Fornecedor(id, razaoSocial, cnpj, tipoPessoa, fantasia);
			try {
				FileWriter arq = new FileWriter(caminhoFornecedor,true);
				BufferedWriter escrever = new BufferedWriter(arq);
				escrever.write(fornecedor.getId()+";"+fornecedor.getRazaoSocial()+";"+fornecedor.getCnpj()+";"+fornecedor.getTipoPessoa()+";"+fornecedor.getFantasia());
				System.out.println("Cadastro Realizado!!!\n");
				escrever.newLine();
				escrever.close();
				arq.close();				
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}			
			System.out.print("Digite: \n[1 - Cadastrar novo fornecedor] [0 - Sair] ==> ");
			Integer opcao = leia.nextInt();
			leia.nextLine();
			if(opcao==1) {
				System.out.println();
				FornecedoresView menu = new FornecedoresView();
				menu.menuCadastro();
			}			
			System.out.println();		
	}
	
	public void listarFornecedores(String caminhoArqFornecedores) {
		List<Fornecedor> fornecedores = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoArqFornecedores))){
			String linha = br.readLine();
			while(linha!=null) {
				String[] vetorFornecedores = linha.split(";");				
				Integer idFornecedor = Integer.parseInt(vetorFornecedores[0]);
				String razaoSocial = vetorFornecedores[1];
				String cnpj = vetorFornecedores[2];
				Integer tipoPessoa = Integer.parseInt(vetorFornecedores[3]);
				String fantasia = vetorFornecedores[4];						
				Fornecedor listaFornecedor = new Fornecedor(idFornecedor, razaoSocial, cnpj, tipoPessoa, fantasia);
				fornecedores.add(listaFornecedor);
				linha = br.readLine();
			}
			System.out.println("* * * FORNECEDORES * * *\n");
			for(Fornecedor f : fornecedores) {
				System.out.println(f);
			}
			System.out.println("\n");		
		}			
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());			
		}
	}
	
	public boolean validarCNPJ(String caminho, String cnpj) {
		boolean retorno=false;
		try(BufferedReader br = new BufferedReader(new FileReader(caminho))){
			String linha = br.readLine();
			while(linha!=null) {
				if(linha.contains(cnpj)==true) {					
					retorno=true;
					break;
				}
				linha = br.readLine();
			}
		}			
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());			
		}		
		return retorno;		
	}
	
	public void atualizarFornecedor(String caminho, String cnpj) {
		try {
			Scanner ler = new Scanner(System.in);			
			FileReader lerNoARquivo = new FileReader(caminho);
			BufferedReader br = new BufferedReader(lerNoARquivo);		
			String linha = br.readLine();
			ArrayList <String>lista = new ArrayList<>();
			while(linha!=null) {
				if(linha.contains(cnpj)==false) {
					lista.add(linha);					
				}
				else {
					String[] vetorFornecedores = linha.split(";");				
					Integer codidoFornecedorAlterar = Integer.parseInt(vetorFornecedores[0]);
					System.out.print("Informe Nova Razão Social: ");
					String novaRazao = ler.nextLine().toUpperCase();
					Integer novoTipoPessoa=-1;
					while(novoTipoPessoa<1|| novoTipoPessoa>2) {
						System.out.print("Selecione: \n[1 - PESSOA FISICA] [2 - PESSOA JURÍDICA] ==> ");
						novoTipoPessoa = ler.nextInt();
						ler.nextLine();
					}
					System.out.print("Informe Nova Fantasia: ");
					String novoFantasia = ler.nextLine().toUpperCase();
					linha=codidoFornecedorAlterar+";"+novaRazao+";"+cnpj+";"+novoTipoPessoa+";"+novoFantasia;
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
		System.out.println("Fornecedor alterado com sucesso!\n");
	}
	
	public void deletarFornecedor(String caminho, String cnpjDeletar) {
		try {						
			FileReader lerNoARquivo = new FileReader(caminho);
			BufferedReader br = new BufferedReader(lerNoARquivo);		
			String linha = br.readLine();
			ArrayList <String>lista = new ArrayList<>();
			while(linha!=null) {
				if(linha.contains(cnpjDeletar)==false) {
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

	public Integer codigoFornecedor() {
		FornecedorService f = new FornecedorService();
		f.criarArquivo();
		String caminho = "Fornecedor.txt";
		Integer qtd=0;
		try {						
			FileReader lerNoARquivo = new FileReader(caminho);
			BufferedReader br = new BufferedReader(lerNoARquivo);		
			String linha = br.readLine();
			ArrayList <String>lista = new ArrayList<>();			
			while(linha!=null) {
				String[] vetorFornecedores = linha.split(";");				
				Integer idFornecedor = Integer.parseInt(vetorFornecedores[0]);
				qtd=idFornecedor;
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
		File fornecedor = new File("Fornecedor.txt");
		if(fornecedor.isFile()) {
			retorno=true;
		}else {
			try {
				fornecedor.createNewFile();
				retorno=true;
			}
			catch(IOException e){
				System.out.println("Erro: " + e.getMessage());
			}
		}
		return retorno;
	}
}
