package service;

import java.util.*;
import java.io.*;
import model.Usuario;
import view.UsuarioView;

public class UsuarioService {

	private final String dirUserDB = "C:\\LucasVictor\\ProjetosGitHub\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\user.txt";
     private FileReader arquivoLeitura;
     private BufferedReader memoriaLeitura;
     private File arquivo;
	 private FileWriter escreverArquivo;
	 private BufferedWriter memoriaEscrita;

	 public UsuarioService(){
	 	try {
	 		  arquivoLeitura = new FileReader(dirUserDB);
	 		  memoriaLeitura = new BufferedReader(arquivoLeitura);
			  arquivo = new File(dirUserDB);

	 	} catch (Throwable e) {
 	      System.out.println("Exceção de arquivo não encontrado ... O erro gerado é : " + e.getMessage());

		}
		
   }

	Scanner entrada = new Scanner(System.in);

	public ArrayList<Usuario> ler() {
		ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();

		try {

			if (existeArquivo()) {

				

			//	 FileReader arquivoLeitura = new FileReader(dirUserDB);
			//	 BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);
				String linha = null;
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
		try {

			if (existeArquivo()) {

			//	 FileReader arquivoLeitura = new FileReader(dirUserDB);
			//	 BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);

				
				int contadorLinha = 0;
                String linha = null;

				while ((linha = memoriaLeitura.readLine()) != null) {

					contadorLinha = contadorLinha + 1;
				}
				contadorLinha = contadorLinha + 1;

				String dadosUsuario = contadorLinha + ";" + usuario.getUsername() + ";" + usuario.getPassword();

			//	File arquivo = new File (dirUserDB);
			    escreverArquivo = new FileWriter(arquivo, true);
                memoriaEscrita = new BufferedWriter(escreverArquivo);

				memoriaEscrita.write(dadosUsuario);
				memoriaEscrita.newLine();
				memoriaEscrita.close();
				return true;
			} else {

				criarArquivo();
				escrever(usuario);

			}
		} catch (FileNotFoundException e) {
			System.out.println("Exceção de arquivo não encontrado ... O erro gerado é : " + e.getMessage());

		} catch (IOException e) {
			System.out.println("Não foi possivel ler o arquivo ... O erro gerado é : " + e.getMessage());

		}
		return false;
	}

	public boolean ler(Usuario usuario) {
		try {
			if (existeArquivo()) {

			//	 FileReader arquivoLeitura = new FileReader(dirUserDB);
			//	 BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);

				String linha = null;
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
			if (existeArquivo()) {

				//  FileReader arquivoLeitura = new FileReader(dirUserDB);
				//  BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);

                ArrayList <String> listaUsuarioGravar = new ArrayList<>();

				String linha = null;

				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linhaSplit = linha.split(";");
					if (!usuario.getUsername().equals(linhaSplit[1])){
                       listaUsuarioGravar.add(linha);
					}else {
					   	excluirUsuario = true;
					}
                     
				}
				    arquivoLeitura.close();
					memoriaLeitura.close();
                    
				//	File arquivo = new File(dirUserDB);
				    escreverArquivo = new FileWriter(arquivo, false);
                    memoriaEscrita = new BufferedWriter(escreverArquivo);
                    
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

	public boolean atualizar(Usuario usuario) {
		boolean atualizarUser = false;
		try {
		    if (existeArquivo()) {
               
			//	 FileReader arquivoLeitura = new FileReader(dirUserDB);
			//	 BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);
                
				ArrayList <String> listaUsuarioGravar = new ArrayList<>();
				String linha = null;

				while ((linha = memoriaLeitura.readLine()) != null) {
					String[] linhaSplit = linha.split(";");
					if (usuario.getUsername().equals(linhaSplit[1])){
						String novaLinha = linhaSplit[0] + ";" + linhaSplit[1] + ";" + usuario.getPassword();
						listaUsuarioGravar.add(novaLinha);
						atualizarUser = true;
					}else {
                        listaUsuarioGravar.add(linha);
					}

				}
				    arquivoLeitura.close();
					memoriaLeitura.close();

				//	File arquivo = new File(dirUserDB);
				    escreverArquivo = new FileWriter(dirUserDB, false);
                    memoriaEscrita = new BufferedWriter(escreverArquivo);
                    
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
	//	File arquivo = new File(dirUserDB);

		return arquivo.exists();

	}

	private boolean criarArquivo() {

		try {
		//	File arquivo = new File(dirUserDB);
			return arquivo.createNewFile();

		} catch (IOException erro) {
			System.out.println("Ocorreu um erro ao criar um arquivo de usuario" + erro.getMessage());
			return false;
		}
	}
}
