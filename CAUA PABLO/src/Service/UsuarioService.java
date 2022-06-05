package Service;
import model.Usuario;
import java.io.*;
import java.util.ArrayList;
public class UsuarioService {

    //ATRIBUTOS
    private final String diretorioArq = "src/data_base/usuario.txt";
    private FileReader arqLeitura;
    private BufferedReader memoriaLeitura;
    private File arquivo;
    private FileWriter escArq;
    private BufferedWriter memoriaEscrita;

    public UsuarioService(){
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
public boolean esc(Usuario usuario){
try{
    if (existeArq()){
        int contLinha = 0;
        String linha = null;
        while ((linha = memoriaLeitura.readLine()) != null){
            contLinha = contLinha +1;
        }

        contLinha = contLinha +1;

        String dadoParaEscrever = contLinha + "; " + "Id Do Usuario: "+usuario.getId() +"; " +"Nome do Usuario: "+usuario.getUsername() +"; " +"Senha do Usuario: "+usuario.getPassword();
        escArq = new FileWriter(arquivo, true);
        memoriaEscrita = new BufferedWriter(escArq);

        memoriaEscrita.write(dadoParaEscrever);
        memoriaEscrita.newLine();

        memoriaEscrita.close();
        return true;

    }else{
        criarArq();
        esc(usuario);
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
public Boolean ler(Usuario usuario){

    try{
        if(existeArq()){
            String linha = null;
            while ((linha = memoriaLeitura.readLine()) != null){
                String[] linha_split = linha.split(";");

                if(usuario.getUsername().equals(linha_split[1])){
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
public ArrayList<Usuario> ler(){

    ArrayList<Usuario> listUser = new ArrayList<>();

    try{
        if(existeArq()){
            String linha = null;
            while ((linha = memoriaLeitura.readLine()) != null){
                String[] linha_split = linha.split(";");

                Usuario usuario = new Usuario();
                usuario.setId(Integer.parseInt(linha_split[0]));
                usuario.setUsername((linha_split[1]));
                usuario.setPassword((linha_split[2]));

                listUser.add(usuario);

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

public boolean Deletar(Usuario usuario){
    boolean excluirUser = false;
    try{

        if(existeArq()){
            ArrayList<String> userListGravar = new ArrayList<>();
            String linha = null;
            while ((linha = memoriaLeitura.readLine()) != null){
                String[] linha_split = linha.split(";");

                if(!usuario.getUsername().equals(linha_split[1])){
                    userListGravar.add(linha);
            }else{
                    excluirUser = true;
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
    return excluirUser;

}



public boolean atualizar(Usuario usuario){
boolean atualizarUser = false;
    try{
        if(existeArq()){
            ArrayList<String> userListGravar = new ArrayList<>();
            String linha = null;
            while ((linha = memoriaLeitura.readLine()) != null){
                String[] linha_split = linha.split(";");

                if(!usuario.getUsername().equals(linha_split[1])){
                    String novaLinha = linha_split[0] + ";" + linha_split[1] + ";" + usuario.getPassword();
                    userListGravar.add(novaLinha);
                    atualizarUser = true;
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
    return atualizarUser;
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
