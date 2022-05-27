package service;

import java.util.*;
import java.io.*;
import java.sql.ClientInfoStatus;

import model.Fornecedor;
import view.FornecedorView;
    

public class FornecedorService {


        private final String dirUserDB = "C:\\Daniel_Victor\\Projetos_git\\Estoque_Faculdade\\POO_Perimetral\\DANIEL VICTOR copy\\src\\data_base\\fornecedor.txt";
        Scanner entrada = new Scanner(System.in);
    
        public ArrayList<Fornecedor> ler() {
            ArrayList<Fornecedor> listaFornecedor = new ArrayList<Fornecedor>();
    
            try {
    
                if (existeArquivo()) {
    
                    String linha = null;
    
                    FileReader arquivoLeitura = new FileReader(dirUserDB);
                    BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);
    
                    while ((linha = memoriaLeitura.readLine()) != null) {
                        String[] linhaSplit = linha.split(";");
    
                        Fornecedor fornecedor = new Fornecedor();
                        fornecedor.setId(Integer.parseInt(linhaSplit[0]));
                        fornecedor.setRazaoSocial(linhaSplit[1]);
                        fornecedor.setFantasia(linhaSplit[2]);
                        fornecedor.setCnpj(linhaSplit[3]);
                        fornecedor.setTipoPessoa(linhaSplit[4]);
                        listaFornecedor.add(fornecedor);
                    }
    
                }
    
            } catch (FileNotFoundException e) {
                System.out.println("Exceção de arquivo não encontrado ... O erro gerado é : " + e.getMessage());
    
            } catch (IOException e) {
                System.out.println("Não foi possivel ler o arquivo ... O erro gerado é : " + e.getMessage());
    
            }
            return listaFornecedor;
    
        }
    
        public boolean escrever(Fornecedor fornecedor) {
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
                    
                    String dadosCLiente = contadorLinha + ";" + fornecedor.getRazaoSocial() + ";" + fornecedor.getFantasia() +  ";" + fornecedor.getCnpj() + ";" + fornecedor.getTipoPessoa() + "\n";
                        
                    FileWriter escreverArquivo = new FileWriter(dirUserDB, true);
    
                    escreverArquivo.write(dadosCLiente);
                    escreverArquivo.close();
                    return true;
                } else {
    
                    criarArquivo();
                    escrever (fornecedor);
    
                }
    
                return true;
            } catch (FileNotFoundException e) {
                System.out.println("Exceção de arquivo não encontrado ... O erro gerado é : " + e.getMessage());
    
            } catch (IOException e) {
                System.out.println("Não foi possivel ler o arquivo ... O erro gerado é : " + e.getMessage());
    
            }
            return false;
        }
    
        public boolean ler(Fornecedor fornecedor) {
            try {
                if (existeArquivo()) {
    
                    String linha = null;
    
                    FileReader arquivoLeitura = new FileReader(dirUserDB);
                    BufferedReader memoriaLeitura = new BufferedReader(arquivoLeitura);
    
                    while ((linha = memoriaLeitura.readLine()) != null) {
                        String[] linhaSplit = linha.split(";");
    
                        if (fornecedor.getRazaoSocial().equals(linhaSplit[1])) {
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
    
        public boolean excluir(Fornecedor fornecedor) {
            boolean excluirFornecedor = false;
            try {
                File fw = new File(dirUserDB);
                if (existeArquivo()) {
    
                    FileReader fr = new FileReader(dirUserDB);
                    BufferedReader bf = new BufferedReader(fr);
    
                    ArrayList <String> listaForncedorGravar = new ArrayList<>();
    
                    String linha = null;
    
                    while ((linha = bf.readLine()) != null) {
                        String[] linhaSplit = linha.split(";");
                        if (!fornecedor.getRazaoSocial().equals(linhaSplit[1])){
                            listaForncedorGravar.add(linha);
                        }else {
                               excluirFornecedor = true;
                        }
                         
                    }
                        fr.close();
                        bf.close();
                        
                        File arquivo = new File(dirUserDB);
                        FileWriter escreverArquivo = new FileWriter(dirUserDB, false);
                        BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
                        
                        for (String novaLinha : listaForncedorGravar){
    
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
            return excluirFornecedor;
        }
    
        public boolean atualizar(Fornecedor fornecedor) {
            File fw = new File(dirUserDB);
            boolean atualizarFornecedor = false;
            try {
                if (existeArquivo()) {
                   
                    FileReader fr = new FileReader(dirUserDB);
                    BufferedReader bf = new BufferedReader(fr);
                    
                    ArrayList <String> listaFornecedorGravar = new ArrayList<>();
                    String linha = null;
    
                    while ((linha = bf.readLine()) != null) {
                        String[] linhaSplit = linha.split(";");
                        if (fornecedor.getRazaoSocial().equals(linhaSplit[1])){
                            String novaLinha = linhaSplit[0] + ";" + linhaSplit[1] + ";" + linhaSplit[2] + ";" +  linhaSplit[3] + ";" + fornecedor.getFantasia();
                            listaFornecedorGravar.add(novaLinha);
                            atualizarFornecedor = true;
                        }else {
                            listaFornecedorGravar.add(linha);
                        }
    
                    }
                        fr.close();
                        bf.close();
    
                        File arquivo = new File(dirUserDB);
                        FileWriter escreverArquivo = new FileWriter(dirUserDB, false);
                        BufferedWriter memoriaEscrita = new BufferedWriter(escreverArquivo);
                        
                        for (String novaLinha : listaFornecedorGravar){
    
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
        return atualizarFornecedor;
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
    
