package service;

import java.util.*;
import java.io.*;

import model.Usuario;

public class UsuarioService {

    // Atributos

    private final String dirUserDb = "src\\data_base\\usuario.txt";

    // Metodos

    public boolean escrever(Usuario usuario) {
        try {
           // -------------------------------------------------------
            System.out.println("Contar os registros dentro do arquivo");
            if (existiArquivo()) {
                FileReader arquivoDeLeitura = new FileReader(dirUserDb);
                BufferedReader memoriaDeLeitura = new BufferedReader(arquivoDeLeitura);

                // Variáveis
               
                int contadorDeLinha = 1;
                String linha = null;

                while ((linha = memoriaDeLeitura.readLine()) != null) {
                    contadorDeLinha = contadorDeLinha + 1;
                }
                contadorDeLinha = contadorDeLinha + 1;

           // -------------------------------------------------------

          // -------------------------------------------------------
                String dadoParaEscrever = usuario.getId() + ";" + usuario.getUsername() + ";" + usuario.getPassword();
                File arquivo = new File(dirUserDb);
                FileWriter escreverArquivo = new FileWriter(dirUserDb);
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

    public boolean ler(Usuario usuario) {
        return false;
        // try{
        //     FileReader fr = new FileReader(dirUserDb);
        //     BufferedReader bf = new BufferedReader(fr);
        //     String linha = bf.readLine();

        //     if (){

        //     }
        // }catch(IOException e){
        //    System.out.println("Erro "+e.getMessage());
        // }
    }

    public ArrayList<Usuario> ler() {
        ArrayList usuarios = new ArrayList<>();
        return usuarios;
    }

    public boolean atualizar(Usuario usuario) {
        if (existiArquivo()) {
        } else {
            return false;
        }
        return true;
    }

    public boolean excluir(Usuario usuario) {
        if (existiArquivo()) {
            ler(usuario);

        } else {
            return false;
        }
        return true;
    }

    private boolean existiArquivo() {
        File arquivo = new File(dirUserDb);

        return arquivo.exists();

    }

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
