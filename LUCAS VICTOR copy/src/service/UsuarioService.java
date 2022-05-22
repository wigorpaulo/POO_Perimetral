package service;

import java.util.*;
import java.io.*;
import model.Usuario;
import view.UsuarioView;

public class UsuarioService {

	private final String dirUserDB = "C:\\LucasVictor\\ProjetosGitHub\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\user.txt";

	Scanner entrada = new Scanner(System.in);

	public ArrayList<Usuario> ler() {
		Usuario usuario = new Usuario();
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

		listaUsuario.add(usuario);

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

				String dadosUsuario = contadorLinha + ";" + usuario.getUsername() + ";" + usuario.getPassword();

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
		try {
			File fw = new File("C:\\projetos_github\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\usuario.txt");
			if (fw.exists()) {

				FileReader fr = new FileReader(
						"C:\\projetos_github\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\usuario.txt");
				BufferedReader bf = new BufferedReader(fr);
				String s = bf.readLine();

				String linha;
				while ((linha = bf.readLine()) != null) {
					for (int i = 0; i < linha.split(";").length; i++) {
						if (i == 1) {
							if (linha[i] == usuario.getPassword()) {

							}
						}
					}
				}

				if (usuario.getUsername() == s) {
					fw.delete();
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}

		} catch (FileNotFoundException e) {
			System.out.println("Erro FileNotFoundException: " + e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Erro IndexOutOfBoundsException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Erro Exception: " + e.getMessage());
		}
		return false;
	}

	public Usuario ler(String ler) {
		Usuario usuario = new Usuario();
		return usuario;
	}

	public boolean atualizar(Usuario usuario) {
		File fw = new File("C:\\projetos_github\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\usuario.txt");
		if (fw.exists()) {

			try {
				FileReader fr = new FileReader(
						"C:\\projetos_github\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\usuario.txt");
				BufferedReader bf = new BufferedReader(fr);
				String s = bf.readLine();
			} catch (Exception e) {
				System.out.println("Erro" + e.getMessage());
				return false;

			}

			return true;
		} else {
			return false;
		}

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
