package view;
import java.util.ArrayList;
import java.util.Scanner;
import controller.ClienteController;
import model.Cliente;

public class ClienteView extends ApplicationView{
Scanner ler = new Scanner(System.in);

    //___________________ETAPA DO CLIENTE___________________
    //MENU DE CADASTRO DO CLIENTE
    public void menufornCadastro() {
        int escolha;
        System.out.println("***BEM VINDO AO MENU DE CADASTRO DO CLIENTE***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 3-Atualizar \n 4-Deletar \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: ");
        escolha = ler.nextInt();
        if (escolha == 1) {
            menuCadastroCliente();
        }
        if (escolha == 2) {
            menuListarCliente();
        }
        if (escolha == 3) {
            menuAtualizarCliente();
        }
        if (escolha == 4) {
            menuDeletar();
        }
        if (escolha == 5){
            MenuView men = new MenuView();
            men.men();
        }
    }

    //CADASTRO DO CLIENTE
    public void menuCadastroCliente() {
        Cliente cliente = new Cliente();

        System.out.println("***CADASTRO DO CLIENTE***\n");
        System.out.println("Informe Seu Nome: ");
        cliente.setNome(ler.next());

        System.out.println("Informe seu Cpf: ");
        cliente.setCpf(ler.next());

        System.out.println("Informe seu Id Desejado: ");
        cliente.setId(ler.nextInt());

        System.out.println("Informe seu Número de Telefone: ");
        cliente.setTelefone(ler.next());

        System.out.println("***CADASTRO REALIZADO***");
        System.out.println("***Seja Bem Vindo \n\n");

        menufornCadastro();

    }



    //MÉTODO DE LISTAR CLIENTE
    public void menuListarCliente() {
       ClienteController clienteController = new ClienteController();
        ArrayList<Cliente> cliList = clienteController.Listar();

        if(cliList.isEmpty()){
            System.out.println("Não posssui usuario cadastrado");

        }else{
            for(int cont = 0; cont < cliList.size(); cont++){
                System.out.println(cliList.get(cont).toString());
            }
            System.out.println("");
            System.out.println("***************");
        }
        menufornCadastro();
    }




    public void menuAtualizarCliente(){
        Cliente cliente = new Cliente();
        System.out.println("***ATUALIZAÇÃO DO CLIENTE ***");


        System.out.println("***Remoção do Usuário***");
        System.out.println("Informe seu Usuario: ");
        cliente.setNome(ler.next());

        System.out.println("Informe sua Senha: ");
        cliente.setTelefone(ler.next());

        System.out.println("Informe seu Id: ");
        cliente.setId(ler.nextInt());



        if (! clienteController.Atualizar(cliente)){
            System.out.println("Usuario não encontrado");
        }else{
            System.out.println("Usuario Atualizado");
        }

        menufornCadastro();
    }

    public void menuDeletar(){
        Cliente cliente = new Cliente();

        System.out.println("***Remoção do Usuário***");
        System.out.println("Informe seu Usuario: ");
        cliente.setNome(ler.next());


        if(! clienteController.Deletar(cliente)){
            System.out.println("Usuário não encontrado");
        }else{
            System.out.println("Usuário excluido com Sucesso!!\n");
        }

        menufornCadastro();

}

}



