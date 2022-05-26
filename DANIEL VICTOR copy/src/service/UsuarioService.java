package service;

import java.util.*;
import java.io.*;

import model.Usuario;

public class UsuarioService {

    // Atributos

    private final String dirUserDb = "C:\\Daniel_Victor\\Projetos_git\\Estoque_Faculdade\\POO_Perimetral\\DANIEL VICTOR copy\\src\\data_base\\usuario.txt";

    // Metodos

    public boolean escrever(Usuario usuario) {
        try {
            // -------------------------------------------------------
            // Contar os registros dentro do arquivo;

            if (existiArquivo()) {

                FileReader arquivoDeLeitura = new FileReader(dirUserDb);
                BufferedReader memoriaDeLeitura = new BufferedReader(arquivoDeLeitura);

                // Variáveis

                int contadorDeLinha = 0;
                String linha = null;

                while ((linha = memoriaDeLeitura.readLine()) != null) {
                    contadorDeLinha = contadorDeLinha + 1;
                }
                contadorDeLinha = contadorDeLinha + 1;

                // -------------------------------------------------------

                // -------------------------------------------------------
                String dadoParaEscrever = contadorDeLinha + ";" + usuario.getUsername() + ";" + usuario.getPassword()+"\n";

                FileWriter escreverArquivo = new FileWriter(dirUserDb, true);
                escreverArquivo.write(dadoParaEscrever);
                escreverArquivo.close();
                return true;
                // -------------------------------------------------------

            } else {
                criarArquivo();
                escrever(usuario);
            }

            return true;
        } catch (FileNotFoundException erro) {
            System.out.println("Execeção de arquivo não encontrado ... o erro gerado é :" + erro.getMessage());
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo ... o erro gerado é :" + e.getMessage());
        }
        return false;
    }

    // -------------------------------------------------------------------

    public boolean ler(Usuario usuario) {

        try {
            if (existiArquivo()) {

                FileReader arquivoDeLeitura = new FileReader(dirUserDb);
                BufferedReader memoriaDeLeitura = new BufferedReader(arquivoDeLeitura);

                String linha = null;

                while ((linha = memoriaDeLeitura.readLine()) != null) {
                    String[] linhaSprint = linha.split(";");

                    if (usuario.getUsername().equals(linhaSprint[1])) {
                        return true;
                    }

                }

            }
        } catch (FileNotFoundException erro) {
            System.out.println("Execeção de arquivo não encontrado ... o erro gerado é :" + erro.getMessage());
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo ... o erro gerado é :" + e.getMessage());
        }
        return false;
    }

    // -------------------------------------------------------------------

    public ArrayList<Usuario> ler() {
        ArrayList <Usuario> listaUsuarios = new ArrayList<Usuario>();
    

        try{
            if (existiArquivo()){
                FileReader arquivoDeLeitura = new FileReader(dirUserDb);
                BufferedReader memoriaDeLeitura = new BufferedReader(arquivoDeLeitura);

                String linha = null;

                while ((linha = memoriaDeLeitura.readLine()) != null) {
                    String[] linhaSprint = linha.split(";");
                    
                   Usuario usuario = new Usuario();
                   usuario.setId(Integer.parseInt(linhaSprint[0]));
                   usuario.setUsername(linhaSprint[1]);
                   usuario.setPassword(linhaSprint[2]);
                   listaUsuarios.add(usuario);
                }    

            }
           
        }catch (FileNotFoundException erro) {
            System.out.println("Execeção de arquivo não encontrado ... o erro gerado é :" + erro.getMessage());
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo ... o erro gerado é :" + e.getMessage());
        }
           return listaUsuarios;
    }

    // -------------------------------------------------------------------

    public boolean atualizar(Usuario usuario) {
        File fw = new File(dirUserDb);
		boolean atualizarUser = false;
		try {
		    if (existiArquivo()) {
               
				FileReader fr = new FileReader(dirUserDb);
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

					File arquivo = new File(dirUserDb);
					FileWriter escreverArquivo = new FileWriter(dirUserDb, false);
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

    // -------------------------------------------------------------------

    public boolean excluir(Usuario usuario) {
        boolean excluirUsuario = false;
        try{
            File fw = new File(dirUserDb);
            if (existiArquivo()) {
              
                FileReader fr = new FileReader(dirUserDb);
                BufferedReader bf = new BufferedReader(fr);

                ArrayList <String> listaUsuarioGravar = new ArrayList<>();

                String linha = null;

                while((linha = bf.readLine()) != null){
                String[] linhaSplit = linha.split(";");
                if(!usuario.getUsername().equals(linhaSplit[1])){
                    listaUsuarioGravar.add(linha);
                }else{
                    excluirUsuario = true;
                }
             } 
               fr.close();
               bf.close();

               File arquivo = new File(dirUserDb);
               FileWriter escreverArquivo = new FileWriter(dirUserDb,false);
               BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);

               for (String novaLinha : listaUsuarioGravar){

                  memoriaEscrita.write(novaLinha);
                  memoriaEscrita.newLine();
               }
                  memoriaEscrita.close();

            }else {
                return false;
            }

            }catch (FileNotFoundException erro) {
              System.out.println("Execeção de arquivo não encontrado ... o erro gerado é :" + erro.getMessage());
            } catch (IOException e) {
              System.out.println("Não foi possível ler o arquivo ... o erro gerado é :" + e.getMessage());
        }
        return excluirUsuario;
    }

    // -------------------------------------------------------------------

    private boolean existiArquivo() {
        File arquivo = new File(dirUserDb);

        return arquivo.exists();

    }

    // -------------------------------------------------------------------
    private boolean criarArquivo() {

        try {
            File arquivo = new File(dirUserDb);
            return arquivo.createNewFile();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro  ao criar um arquivo de usuario !");
            System.out.println("O erro gerado é :" + e.getMessage());
            return false;
        }
    }
}
