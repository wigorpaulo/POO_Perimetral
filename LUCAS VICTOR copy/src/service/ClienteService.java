package service;

import java.util.*;
import java.io.*;
import java.sql.ClientInfoStatus;

import model.Cliente;
import view.ClienteView;


public class ClienteService {
    
        private final String dirUserDB = "C:\\LucasVictor\\ProjetosGitHub\\POO_Perimetral\\LUCAS VICTOR copy\\src\\data_base\\cliente.txt";
    
        Scanner entrada = new Scanner(System.in);
    
        public ArrayList<Cliente> ler() {
            ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    
            try {
    
                if (existeArquivo()) {
    
                    String linha = null;
    
                    FileReader arquivoLeitura = new FileReader(dirUserDB);
                    BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);
    
                    while ((linha = memoriaLeitura.readLine()) != null) {
                        String[] linhaSplit = linha.split(";");
    
                        Cliente cliente = new Cliente();
                        cliente.setId(Integer.parseInt(linhaSplit[0]));
                        cliente.setNome(linhaSplit[1]);
                        cliente.setCpf(linhaSplit[2]);
                        cliente.setTelefone(linhaSplit[3]);
                        listaCliente.add(cliente);
                    }
    
                }
    
            } catch (FileNotFoundException e) {
                System.out.println("Exceção de arquivo não encontrado ... O erro gerado é : " + e.getMessage());
    
            } catch (IOException e) {
                System.out.println("Não foi possivel ler o arquivo ... O erro gerado é : " + e.getMessage());
    
            }
            return listaCliente;
    
        }
    
        public boolean escrever(Cliente cliente) {
            try {
                if (existeArquivo()) {
    
                    FileReader arquivoLeitura = new FileReader(dirUserDB);
                    BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);
    
                    String linha = null;
                    int contadorLinha = 0;
    
                    while ((linha = memoriaLeitura.readLine()) != null) {
    
                        contadorLinha = contadorLinha + 1;
                    }
                    contadorLinha = contadorLinha + 1;
                    
                    String dadosCLiente = contadorLinha + ";" + cliente.getNome() + ";" + cliente.getCpf() +  ";" + cliente.getTelefone() + "\n";
                        
                    FileWriter escreverArquivo = new FileWriter(dirUserDB, true);
    
                    escreverArquivo.write(dadosCLiente);
                    escreverArquivo.close();
                    return true;
                } else {
    
                    criarArquivo();
                    escrever (cliente);
    
                }
    
                return true;
            } catch (FileNotFoundException e) {
                System.out.println("Exceção de arquivo não encontrado ... O erro gerado é : " + e.getMessage());
    
            } catch (IOException e) {
                System.out.println("Não foi possivel ler o arquivo ... O erro gerado é : " + e.getMessage());
    
            }
            return false;
        }
    
        public boolean ler(Cliente cliente) {
            try {
                if (existeArquivo()) {
    
                    String linha = null;
    
                    FileReader arquivoLeitura = new FileReader(dirUserDB);
                    BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);
    
                    while ((linha = memoriaLeitura.readLine()) != null) {
                        String[] linhaSplit = linha.split(";");
    
                        if (cliente.getNome().equals(linhaSplit[1])) {
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
    
        public boolean excluir(Cliente cliente) {
            boolean excluirCliente = false;
            try {
                File fw = new File(dirUserDB);
                if (existeArquivo()) {
    
                    FileReader fr = new FileReader(dirUserDB);
                    BufferedReader bf = new BufferedReader(fr);
    
                    ArrayList <String> listaUsuarioGravar = new ArrayList<>();
    
                    String linha = null;
    
                    while ((linha = bf.readLine()) != null) {
                        String[] linhaSplit = linha.split(";");
                        if (!cliente.getNome().equals(linhaSplit[1])){
                           listaUsuarioGravar.add(linha);
                        }else {
                               excluirCliente = true;
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
            return excluirCliente;
        }
    
        public boolean atualizar(Cliente cliente) {
            File fw = new File(dirUserDB);
            boolean atualizarCliente = false;
            try {
                if (existeArquivo()) {
                   
                    FileReader fr = new FileReader(dirUserDB);
                    BufferedReader bf = new BufferedReader(fr);
                    
                    ArrayList <String> listaClienteGravar = new ArrayList<>();
                    String linha = null;
    
                    while ((linha = bf.readLine()) != null) {
                        String[] linhaSplit = linha.split(";");
                        if (cliente.getNome().equals(linhaSplit[1])){
                            String novaLinha = linhaSplit[0] + ";" + linhaSplit[1] + ";" + linhaSplit[2] + ";" + cliente.getTelefone();
                            listaClienteGravar.add(novaLinha);
                            atualizarCliente = true;
                        }else {
                            listaClienteGravar.add(linha);
                        }
    
                    }
                        fr.close();
                        bf.close();
    
                        File arquivo = new File(dirUserDB);
                        FileWriter escreverArquivo = new FileWriter(dirUserDB, false);
                        BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
                        
                        for (String novaLinha : listaClienteGravar){
    
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
        return atualizarCliente;
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
    
