package service;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import model.Usuario;
import view.UsuarioView;

public class UsuarioService {

	Scanner entrada = new Scanner(System.in);

	public ArrayList<Usuario> ler() {
		Usuario usuario = new Usuario();
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

		listaUsuario.add(usuario);

		return listaUsuario;
	}

	public boolean escreverArquivo(Usuario usuario) {
        /*Irá retorna true quando escrever no arquivo com sucesso !
		  Irá retorna false quando não escrever no arquivo*/
		  
		try {
			UsuarioView usuarioView = new UsuarioView();

			FileWriter fw = new FileWriter(
					"C:\\projetos_github\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\usuario.txt", true);
			String texto = "1;" + usuario.getUsername() + ";" + usuario.getPassword() + "\n";
			fw.write(texto);
			fw.close();

			usuarioView.menuUsuario(usuario);

			return true;
		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());
			return false;
		}

	}

	public boolean lerArquivo(Usuario usuario) {
          /*Irá retornar true quando existir o username do usuario
		    Irá retornar false quando não existir o username */
		try {
			FileReader fr = new FileReader(
					"C:\\projetos_github\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\usuario.txt");
			BufferedReader bf = new BufferedReader(fr);
			String s = bf.readLine();
			if (s == usuario.getUsername() && s == usuario.getPassword()) {
				return true;
			} else {
				return false;
			}

		} catch (Exception e) {
			System.out.println("Erro" + e.getMessage());
			return (Boolean) null;
		}
	}

	public void criar() {

	}

	public boolean excluirRegistroArquivo(Usuario usuario) {
		try {
			File fw = new File("C:\\projetos_github\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\usuario.txt");
			if (fw.exists()) {

				FileReader fr = new FileReader("C:\\projetos_github\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\usuario.txt");
				BufferedReader bf = new BufferedReader(fr);
				String s = bf.readLine();

				String linha;
				while ((linha = bf.readLine()) != null) {
					for (int i = 0; i < linha.split(";").length; i++ ) {
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

	}

}
