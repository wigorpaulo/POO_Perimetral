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

import model.Usuario;
import view.LoginView;
import view.UsuarioView;

public class UsuarioService {
	
	public void inserir(String caminho, Usuario user) {	
	try	{
		FileWriter arq = new FileWriter(caminho, true);
		BufferedWriter escrever = new BufferedWriter(arq);
		escrever.write(user.getUsername() + ";" + user.getPassword());
		escrever.newLine();
		escrever.close();
		arq.close();
	}
	catch(IOException e){
		System.out.println(e.getMessage());
	}
	}
	
	public boolean buscarUsername(String username, String caminho) {
		boolean retorno=false;
		try {
			FileReader lerNoARquivo = new FileReader(caminho);
			try (BufferedReader br = new BufferedReader(lerNoARquivo)) {
				String linha = br.readLine();
				while(linha!=null){
					if(linha.contains(username)==false) {
						linha = br.readLine();
					}
					else {						
						retorno = true;
						break;
					}						
				}
			}	
		}				
		catch (IOException e){
			System.out.println("Erro: " + e.getMessage());
		}		
		return retorno;
	}
	
	public boolean buscarSenha(String username, String senha) {
		ClienteService c = new ClienteService();
		c.criarArquivo();
		String caminho = "User.txt";
		String comparar = username+";"+senha;		
		boolean retorno=false;
		try {
			FileReader lerNoARquivo = new FileReader(caminho);
			try (BufferedReader br = new BufferedReader(lerNoARquivo)) {
				String linha = br.readLine();
				while(linha!=null && linha.contentEquals(comparar)==false){							
						linha = br.readLine();
					}
				if(linha == null) {
					System.out.println("Usuário ou Senha incorretos, informe novamente!\n");
					LoginView loginView = new LoginView();
					loginView.login();
				}
				if(linha.contentEquals(comparar)==true) {
					retorno=true;			
				}
			}
			catch (IOException e){
				System.out.println("Erro: " + e.getMessage());
			}
		}				
		catch (IOException e){
			System.out.println("Erro: " + e.getMessage());
		}
		return retorno;

	}
	
	public void listarUsuarios(String caminhoUsuarios) {
		List<Usuario> users = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(caminhoUsuarios))){
			String linha = br.readLine();
			Integer idUser = 1;
			while(linha!=null) {
				String[] vetorUsuarios = linha.split(";");				
				String nomeUsuario = vetorUsuarios[0];
				String senhaUsuario = vetorUsuarios[1];
				Usuario listaUsuario = new Usuario(idUser, nomeUsuario, senhaUsuario);
				users.add(listaUsuario);
				linha = br.readLine();
				idUser++;
			}
			System.out.println("* * * USUÁRIOS * * *\n");
			for(Usuario u : users) {
				System.out.println(u);
			}
			System.out.println("\n");			
		}		
		catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());			
		}
	}
	
	public void alterarUsuario(String nome, String senha, String caminho) {
		String comparar = nome+";"+senha;
		try {	
			FileReader lerNoARquivo = new FileReader(caminho);
			BufferedReader br = new BufferedReader(lerNoARquivo);			
			String linha = br.readLine();
			ArrayList<String> lista = new ArrayList<>();
			while (linha != null) {
				if (linha.contains(comparar)== false) {
					lista.add(linha);
				} else {
					Scanner ler = new Scanner (System.in);
					System.out.print("Informe Novo Username: ");
					String username = ler.nextLine().toUpperCase();
					System.out.print("Informe Nova Senha: ");
					String password = ler.nextLine();
					linha = username + ";" + password;
					lista.add(linha);
					System.out.println("Usuário alterado com sucesso!\n");
				}
				linha = br.readLine();
			}
			FileWriter apagar = new FileWriter(caminho, true);
			apagar.close();
			br.close();
			lerNoARquivo.close();
			FileWriter escrever = new FileWriter(caminho);
			BufferedWriter bw = new BufferedWriter(escrever);
			for (int i = 0; i < lista.size(); i++) {
				bw.write(lista.get(i));
				bw.newLine();
			}
			bw.close();
			escrever.close();
		
	}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}		
	}
	
	public void deletarUsuario(String nome, String caminho) {
		try {			
			FileReader lerNoARquivo = new FileReader(caminho);
			BufferedReader br = new BufferedReader(lerNoARquivo);
			String linha = br.readLine();
			ArrayList<String> lista = new ArrayList<>();
			while (linha != null) {
				if (linha.contains(nome) == false) {
					lista.add(linha);
				}
			linha = br.readLine();			}
			FileWriter apagar = new FileWriter(caminho, true);
			apagar.close();
			br.close();
			lerNoARquivo.close();
			FileWriter escrever = new FileWriter(caminho);
			BufferedWriter bw = new BufferedWriter(escrever);
			for (int i = 0; i < lista.size(); i++) {
				bw.write(lista.get(i));
				bw.newLine();
			}
			bw.close();
			escrever.close();
			System.out.printf("O cadastro do usário %s foi deletado.\n\n", nome);
		} 
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
	public boolean validarUserSenha(String user, String senha, String caminho) {
		boolean retorno=true;
		String comparar = user+";"+senha;
		try {	
			FileReader lerNoARquivo2 = new FileReader(caminho);
			BufferedReader br1 = new BufferedReader(lerNoARquivo2);
			String linha1 = br1.readLine();
			while(linha1!=null && linha1.contentEquals(comparar)==false){							
				linha1 = br1.readLine();
			}
			if(linha1 == null) {
				System.out.println("Usuário ou Senha incorretos.\n");
				retorno=false;
			}
			br1.close();
			lerNoARquivo2.close();		
		} 
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		return retorno;
	}
	
	public boolean criarArquivo() {
		boolean retorno=false;
		File user = new File("User.txt");
		if(user.isFile()) {
			retorno=true;
		}else {
			try {
				user.createNewFile();
				retorno=true;
			}
			catch(IOException e){
				System.out.println("Erro: " + e.getMessage());
			}
		}
		return retorno;
	}
}
