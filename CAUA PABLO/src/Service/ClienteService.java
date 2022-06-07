package Service;
import model.Cliente;
import java.io.*;
import java.util.ArrayList;

public class ClienteService {

    //ATRIBUTOS
    private final String diretorioArq = "src/data_base/cliente.txt";
    private FileReader arqLeitura;
    private BufferedReader memoriaLeitura;
    private File arquivo;
    private FileWriter escArq;
    private BufferedWriter memoriaEscrita;

    public ClienteService(){
        try{
            arqLeitura = new FileReader(diretorioArq);
            memoriaLeitura = new BufferedReader(arqLeitura);
            arquivo = new File(diretorioArq);

        }catch (IOException e){
            System.out.println("Não foi possivel abrir o arquivo");
            System.out.println("O erro Gerado é:"+e.getMessage() );

        }
    }



    //METODO DE ESCRITA
    public boolean esc(Cliente cliente){
        try{
            if (existeArq()){
                int contLinha = 0;
                String linha = null;
                while ((linha = memoriaLeitura.readLine()) != null){
                    contLinha = contLinha +1;
                }

                contLinha = contLinha +1;

                String dadoParaEscrever = contLinha + "; " + "Id Do Cliente: "+cliente.getId() +"; " +"Nome do Cliente: "+cliente.getNome() +"; " +"Telefone do Cliente: "+cliente.getTelefone();
                escArq = new FileWriter(arquivo, true);
                memoriaEscrita = new BufferedWriter(escArq);

                memoriaEscrita.write(dadoParaEscrever);
                memoriaEscrita.newLine();

                memoriaEscrita.close();
                return true;

            }else{
                criarArq();
                esc(cliente);
            }
        }catch (FileNotFoundException e){
            System.out.println("arquivo não pode ser aberto");
            System.out.println("O erro gerado é: "+e.getMessage());
        }catch (IOException e){
            System.out.println("Não foi possivel abrir o arquivo");
            System.out.println("O erro Gerado é:"+e.getMessage() );
        }
        return false;
    }



    //METODO DE LEIITURA
    public Boolean ler(Cliente cliente){

        try{
            if(existeArq()){
                String linha = null;
                while ((linha = memoriaLeitura.readLine()) != null){
                    String[] linha_split = linha.split(";");

                    if(cliente.getNome().equals(linha_split[1])){
                        return true;
                    }
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("arquivo não pode ser aberto");
            System.out.println("O erro gerado é: "+e.getMessage());
        }catch (IOException e){
            System.out.println("Não foi possivel ler o arquivo");
            System.out.println("O erro Gerado é:"+e.getMessage() );
        }
        return false;
    }



    //METODO DE COLOCAR NOME EM LISTAS
    public ArrayList<Cliente> ler(){

        ArrayList<Cliente> listUser = new ArrayList<>();

        try{
            if(existeArq()){
                String linha = null;
                while ((linha = memoriaLeitura.readLine()) != null){
                    String[] linha_split = linha.split(";");

                    Cliente cliente = new Cliente();
                    cliente.setId(Integer.parseInt(linha_split[0]));
                    cliente.setNome((linha_split[1]));
                    cliente.setTelefone((linha_split[2]));

                    listUser.add(cliente);

                }

            }
        }catch (FileNotFoundException e){
            System.out.println("arquivo não pode ser aberto");
            System.out.println("O erro gerado é: "+e.getMessage());
        }catch (IOException e){
            System.out.println("Não foi possivel ler o arquivo");
            System.out.println("O erro Gerado é:"+e.getMessage() );
        }
        return listUser;
    }

    public boolean Deletar(Cliente cliente){
        boolean excluirCliente = false;
        try{

            if(existeArq()){
                ArrayList<String> userListGravar = new ArrayList<>();
                String linha = null;
                while ((linha = memoriaLeitura.readLine()) != null){
                    String[] linha_split = linha.split(";");

                    if(!cliente.getNome().equals(linha_split[1])){
                        userListGravar.add(linha);
                    }else{
                        excluirCliente = true;
                    }
                }
                arqLeitura.close();
                memoriaLeitura.close();

                escArq = new FileWriter(arquivo, false);
                memoriaEscrita = new BufferedWriter(escArq);

                for(String novaLinha: userListGravar){
                    memoriaEscrita.write(novaLinha);
                    memoriaEscrita.newLine();
                }

                memoriaEscrita.close();
            }else{

                return false;
            }
        }catch (FileNotFoundException e){
            System.out.println("arquivo não pode ser aberto");
            System.out.println("O erro gerado é: "+e.getMessage());
        }catch (IOException e){
            System.out.println("Não foi possivel ler o arquivo");
            System.out.println("O erro Gerado é:"+e.getMessage() );
        }
        return excluirCliente;

    }



    public boolean atualizar(Cliente cliente){
        boolean atualizarCliente = false;
        try{
            if(existeArq()){
                ArrayList<String> userListGravar = new ArrayList<>();
                String linha = null;
                while ((linha = memoriaLeitura.readLine()) != null){
                    String[] linha_split = linha.split(";");

                    if(!cliente.getNome().equals(linha_split[1])){
                        String novaLinha = linha_split[0] + ";" + linha_split[1] + ";" + cliente.getTelefone();
                        userListGravar.add(novaLinha);
                        atualizarCliente = true;
                    }else{
                        userListGravar.add(linha);
                    }
                    userListGravar.add(linha);
                }

                arqLeitura.close();
                memoriaLeitura.close();

                escArq = new FileWriter(arquivo, false);
                memoriaEscrita = new BufferedWriter(escArq);

                for(String novaLinha: userListGravar){
                    memoriaEscrita.write(novaLinha);
                    memoriaEscrita.newLine();
                }

                memoriaEscrita.close();

            }else{
                return false;
            }
        }catch (FileNotFoundException e){
            System.out.println("arquivo não pode ser aberto");
            System.out.println("O erro gerado é: "+e.getMessage());
        }catch (IOException e){
            System.out.println("Não foi possivel ler o arquivo");
            System.out.println("O erro Gerado é:"+e.getMessage() );
        }
        return atualizarCliente;
    }



    private boolean existeArq(){
        return arquivo.exists();
    }


    private boolean criarArq(){

        try {
            return arquivo.createNewFile();

        }catch (IOException e){
            System.out.println("Erro ao criar arquivo do usuario");
            System.out.println("Erro gerado"+e.getMessage());
            return false;

        }

    }




}
