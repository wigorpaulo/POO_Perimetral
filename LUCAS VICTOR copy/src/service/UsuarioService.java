package service;

import java.util.*;
import java.io.*;
import model.Usuario;
import view.UsuarioView;

public class UsuarioService {

	private final String dirUserDB = "C:\\LucasVictor\\ProjetosGitHub\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\user.txt";

	Scanner entrada = new Scanner(System.in);

	public ArrayList<Usuario> ler() {
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

		try {

			if (existeArquivo()) {

				String linha = null;

				FileReader arquivoLeitura = new FileReader(dirUserDB);
				BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);

				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linhaSplit = linha.split(";");

					Usuario usuario = new Usuario();
					usuario.setId(Integer.parseInt(linhaSplit[0]));
					usuario.setUsername(linhaSplit[1]);
					usuario.setPassword(linhaSplit[2]);
					listaUsuario.add(usuario);
				}

			}

		} catch (FileNotFoundException e) {
			System.out.println("Exceção de arquivo não encontrado ... O erro gerado é : " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Não foi possivel ler o arquivo ... O erro gerado é : " + e.getMessage());

		}
		return listaUsuario;

	}

	public boolean escrever(Usuario usuario) {
		/*
		 * Irá retorna true quando escrever no arquivo com sucesso !
		 * Irá retorna false quando não escrever no arquivo
		 */

		try {
			UsuarioView usuarioView = new UsuarioView();

			if (existeArquivo()) {

				FileReader arquivoLeitura = new FileReader(dirUserDB);
				BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);

				String linha = null;
				int contadorLinha = 0;

				while ((linha = memoriaLeitura.readLine()) != null) {

					contadorLinha = contadorLinha + 1;
				}
				contadorLinha = contadorLinha + 1;

				String dadosUsuario = contadorLinha + ";" + usuario.getUsername() + ";" + usuario.getPassword() + "\n";

				FileWriter escreverArquivo = new FileWriter(dirUserDB, true);

				escreverArquivo.write(dadosUsuario);
				escreverArquivo.close();
				return true;
			} else {

				criarArquivo();
				escrever(usuario);

			}

			return true;
		} catch (FileNotFoundException e) {
			System.out.println("Exceção de arquivo não encontrado ... O erro gerado é : " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Não foi possivel ler o arquivo ... O erro gerado é : " + e.getMessage());

		}
		return false;
	}

	public boolean ler(Usuario usuario) {
		/*
		 * Irá retornar true quando existir o username do usuario
		 * Irá retornar false quando não existir o username
		 */
		try {

			if (existeArquivo()) {

				String linha = null;

				FileReader arquivoLeitura = new FileReader(dirUserDB);
				BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);

				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linhaSplit = linha.split(";");

					if (usuario.getUsername().equals(linhaSplit[1])) {
						return true;

					}
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println("Exceção de arquivo não encontrado ... O erro gerado é : " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Não foi possivel ler o arquivo ... O erro gerado é : " + e.getMessage());

		}

		return false;
	}

	public boolean excluir(Usuario usuario) {
        boolean excluirUsuario = false;
		try {
			File fw = new File(dirUserDB);
			if (existeArquivo()) {

				FileReader fr = new FileReader(dirUserDB);
				BufferedReader bf = new BufferedReader(fr);

                ArrayList <String> listaUsuarioGravar = new ArrayList<>();

				String linha = null;

				while ((linha = bf.readLine()) != null) {
					String[] linhaSplit = linha.split(";");
					if (!usuario.getUsername().equals(linhaSplit[1])){
                       listaUsuarioGravar.add(linha);
					}else {
					   	excluirUsuario = true;
					}
                     
				}
					fr.close();
					bf.close();
                    
					File arquivo = new File(dirUserDB);
					FileWriter escreverArquivo = new FileWriter(dirUserDB, false);
                    BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
                    
					for (String novaLinha : listaUsuarioGravar){

                        memoriaEscrita.write(novaLinha);
				        memoriaEscrita.newLine();
					}
                    memoriaEscrita.close();

				}else {
					 return false;
				}
				 
		}catch(

	FileNotFoundException e)
	{
		System.out.println("Erro FileNotFoundException: " + e.getMessage());
	}catch(
	IndexOutOfBoundsException e)
	{
		System.out.println("Erro IndexOutOfBoundsException: " + e.getMessage());
	}catch(
	Exception e)
	{
			System.out.println("Erro Exception: " + e.getMessage());
		}
		return excluirUsuario;
	}

	public Usuario ler(String ler) {
		Usuario usuario = new Usuario();
		return usuario;
	}

	public boolean atualizar(Usuario usuario) {
		File fw = new File(dirUserDB);
		boolean atualizarUser = false;
		try {
		    if (fw.exists()) {
               
				FileReader fr = new FileReader(dirUserDB);
				BufferedReader bf = new BufferedReader(fr);
                
				ArrayList <String> listaUsuarioGravar = new ArrayList<>();
				String linha = null;

				while ((linha = bf.readLine()) != null) {
					String[] linhaSplit = linha.split(";");
					if (usuario.getUsername().equals(linhaSplit[1])){
						String novaLinha = linhaSplit[0] + ";" + linhaSplit[1] + ";" + usuario.getPassword();
						listaUsuarioGravar.add(novaLinha);
						atualizarUser = true;
					}else {
                        listaUsuarioGravar.add(linha);
					}

				}
					fr.close();
					bf.close();

					File arquivo = new File(dirUserDB);
					FileWriter escreverArquivo = new FileWriter(dirUserDB, false);
                    BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
                    
					for (String novaLinha : listaUsuarioGravar){

                        memoriaEscrita.write(novaLinha);
				        memoriaEscrita.newLine();
					}
                    memoriaEscrita.close();

		    }else {
			    return false;
		    }

	}catch (Exception e) {
		System.out.println("Erro" + e.getMessage());

	}
    return atualizarUser;
}
	private boolean existeArquivo() {
		File arquivo = new File(dirUserDB);

		return arquivo.exists();

	}

	private boolean criarArquivo() {

		try {
			File arquivo = new File(dirUserDB);

			return arquivo.createNewFile();

		} catch (IOException erro) {
			System.out.println("Ocorreu um erro ao criar um arquivo de usuario" + erro.getMessage());
			return false;
		}
	}
}
