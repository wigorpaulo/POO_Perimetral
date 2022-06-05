package view;
import controller.UsuarioController;
import model.Usuario;
import java.util.ArrayList;


public class UsuarioView extends ApplicationView implements IAppplicationView{


    //___________________ETAPA DO USUARIO___________________
    public void menuDoUsuario() {

        int escolha;
        System.out.println("***BEM VINDO AO MENU DO USUARIO***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 3-Atualizar \n 4-Deletar \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: ");
        escolha = ler.nextInt();
        if (escolha == 1) {
            menuCadastro();
        }
        if (escolha == 2) {
            menuListar();
        }
        if (escolha == 3) {
            menuAtualizar();
        }
        if (escolha == 4) {
            menuDeletar();
        }
        if (escolha == 5){
            MenuView men = new MenuView();
            men.men();
        }
    }


    //MÉTODO DE CADASTRO DO USUARIO
    public void menuCadastro() {
        Usuario username = new Usuario();

        System.out.println("***CADASTRO DO USUARIO***");
        System.out.println("Informe seu Usuario: ");
        username.setUsername(ler.next());

        System.out.println("Informe sua Senha: ");
        username.setPassword(ler.next());

        System.out.println("Informe seu Id: ");
        username.setId(ler.nextInt());

        System.out.println("***CADASTRO REALIZADO***");


        System.out.println(usercontrol.Cadastrar(username));
        menuDoUsuario();


    }

    //MÉTODO DE LISTAR
    public void menuListar() {
        UsuarioController usercontroll = new UsuarioController();
        ArrayList<Usuario> userList = usercontroll.Listar();

        if(userList.isEmpty()){
            System.out.println("Não posssui usuario cadastrado");

        }else{
           for(int cont = 0; cont < userList.size(); cont++){
               System.out.println(userList.get(cont).toString());
           }
            System.out.println("");
            System.out.println("***************");
        }
        menuDoUsuario();
    }

    public void menuAtualizar(){

        Usuario username = new Usuario();

        System.out.println("ATUALIZAÇÃO DO USUARIO");

        System.out.println("***CADASTRO DO USUARIO***");
        System.out.println("Informe seu Usuario: ");
        username.setUsername(ler.next());

        System.out.println("Informe sua Senha: ");
        username.setPassword(ler.next());

        System.out.println("Informe seu Id: ");
        username.setId(ler.nextInt());



        if (! usercontrol.Atualizar(username)){
            System.out.println("Usuario não encontrado");
        }else{
            System.out.println("Usuario Atualizado");
        }

menuDoUsuario();
    }

public void menuDeletar(){

        Usuario usuario = new Usuario();

    System.out.println("***Remoção do Usuário***");
    System.out.println("Informe seu Usuario: ");
    usuario.setUsername(ler.next());


    if(!usercontrol.Deletar(usuario)){
        System.out.println("Usuário não encontrado");
    }else{
        System.out.println("Usuário excluido com Sucesso!!\n");
    }
    menuDoUsuario();
}

}
