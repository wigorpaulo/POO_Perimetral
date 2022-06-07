package view;
import java.util.ArrayList;
import java.util.Scanner;

import controller.FornecedorController;
import controller.UsuarioController;
import model.Fornecedor;
import model.Usuario;

public class FornecedorView extends ApplicationView {
Scanner ler = new Scanner(System.in);

    //___________________ETAPA DO FORNECEDOR___________________
    //MENU DE CADASTRO DO FORNECEDOR
    public void CadForn(Fornecedor fornecedor) {
        int escolha;
        System.out.println("***BEM VINDO AO MENU DE CADASTRO DO FORNECEDOR***");
        System.out.println(" 1-Cadastrar \n 2-Listar Todos \n 5-Voltar Para O Menu \n");
        System.out.println("Escolha a Opção Desejada: ");
        escolha = ler.nextInt();
        if (escolha == 1) {
            menuCadastroForn();
        }
        if (escolha == 2) {
            menuListarForn();
        }
        if (escolha == 5){
            MenuView men = new MenuView();
            men.men();
        }
    }

    //CADASTRO DO FORNECEDOR
    public void menuCadastroForn() {
        Fornecedor fornecedor = new Fornecedor();

        System.out.println("***CADASTRO DO FORNECEDOR***");
        System.out.println("Informe a Fantasia da empresa: ");
        fornecedor.setFantasia(ler.next());

        System.out.println("Informe seu Cnpj: ");
        fornecedor.setCnpj(ler.next());

        System.out.println("***CADASTRO REALIZADO***");
        System.out.println("***Seja Bem Vindo \n\n");
        CadForn(fornecedor);
        System.out.println("***CADASTRO REALIZADO***");


        System.out.println(fornecedorController.Cadastrar(fornecedor));


    }

    //MÉTODO DE LISTAR FORNECEDOR
    public void menuListarForn() {
        fornecedorController = new FornecedorController();
        ArrayList<Fornecedor> fornList = fornecedorController.Listar();

        if(fornList.isEmpty()){
            System.out.println("Não posssui usuario cadastrado");

        }else{
            for(int cont = 0; cont < fornList.size(); cont++){
                System.out.println(fornList.get(cont).toString());
            }
        }
    }





}
