package view;
import java.util.Scanner;
import model.Cliente;
public class ClienteView {
Scanner ler = new Scanner(System.in);


    //___________________ETAPA DO CLIENTE___________________
    //MENU DE CADASTRO DO CLIENTE
    public void CadCliente(Cliente cliente) {
        int escolha;
        System.out.println("***BEM VINDO AO MENU DE CADASTRO DO CLIENTE***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: ");
        escolha = ler.nextInt();
        if (escolha == 1) {
            menuCadastroCliente();
        }
        if (escolha == 2) {
            menuListarCliente(cliente);
        }
        if (escolha == 5){
            MenuView men = new MenuView();
            men.men();
        }
    }

    //CADASTRO DO FORNECEDOR
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
        CadCliente(cliente);
    }

    //MÉTODO DE LISTAR CLIENTE
    public void menuListarCliente(Cliente cliente) {
        System.out.println("***Bem Vindo a Lista do Cliente***");
        System.out.println("" + cliente.getNome());
        System.out.println("" + cliente.getTelefone());
        CadCliente(null);
    }

}



