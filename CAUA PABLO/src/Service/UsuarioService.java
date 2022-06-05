package Service;
import model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class UsuarioService {
    //ATRIBUTOS
    private final String diretorioArq = "src/data_base/usuario.txt";


public boolean esc(Usuario usuario){

try{

    if (existeArq()){

        FileReader arqLeitura = new FileReader(diretorioArq);
        BufferedReader memoriaLeitura = new BufferedReader(arqLeitura);

        int contLinha = 1;
        String linha = null;
        while ((linha = memoriaLeitura.readLine()) != null){
            contLinha = contLinha +1;
        }

        contLinha = contLinha +1;

        String dadoParaEscrever = "Usuario: "+usuario.getUsername()+"Id: "+usuario.getId()+"Senha: "+usuario.getPassword();

        File arquivo = new File(diretorioArq);
        FileWriter escArq = new FileWriter(arquivo, true);

        escArq.write(dadoParaEscrever);
        escArq.close();
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








public Boolean ler(Usuario usuario){

    return false;
}

public ArrayList<Usuario> ler(){

    ArrayList<Usuario> listUser = new ArrayList<>();
    return listUser;
}

public boolean excluir(Usuario usuario){
    if(existeArq()){

    }else{
return false;
    }
    return true;
}


public boolean atualizar(Usuario usuario){

    if(existeArq()){
    }else{
       return false;
    }

    return true;
    }


private boolean existeArq(){
    File arquivo = new File(diretorioArq);
    return arquivo.exists();
}


private boolean criarArq(){

    try {
File arquivo = new File(diretorioArq);
return arquivo.createNewFile();

    }catch (IOException e){
        System.out.println("Erro ao criar arquivo do usuario");
        System.out.println("Erro gerado"+e.getMessage());
return false;

    }

}


}
