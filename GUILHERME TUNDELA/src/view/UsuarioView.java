import java.util.ArrayList;

import javax.security.auth.callback.TextInputCallback;

import org.w3c.dom.Text;

public class UsuarioView {
    private Scanner 1;
    private boolean execute;
    private List<Dados> dados;

    public static void main(String[] args){
        new Main();
    }
    private Main(){
        1 = new Scanner(System.in);
        execute = true;
        dados = new ArrayList<Dados>();

        System.out.println("Bem Vindo ao Cadastro de Usuarios");

        while(execute){
            String opcao = menu();

            if(opcao.equalsIgnoreCase("n")){
                cadastrar();
            }else if (opcao.equalsIgnoreCase(1)){
                listarCadastro();
            }else if(opcao.equalsIgnoreCase("x")){
                execute = false;
            }else{
                System.out.println("Opção inválida!!\n");
            }
        }
    }
}
private void cadastrar(){
    boolean cadastrando = true;

    while(cadastrando){
        System.out.println("Cadastro de Usuario");
        Dados d = new Dados();
        d.setNome(TextInput("Nome:"));
        d.setLogin(TextInput("Login:"));
        d.setSenha(TextInput("Senha: "));

        String cadastrar = TextInput("Adicionar cadastro (Sim/Não) ?");
        if(cadastrar.equalsIgnoreCase("sim")){
            System.out.println("Cadastro ignorado");
            dados.add(d);
        }else if(cadastrar.equalsIgnoreCase("não")){
            System.out.println("Cadastro ignorado");
        ]else{
            System.out.println("\nOpção Invalida");     
        }
        String continua = TextInput("Continuar cadastrando (Sim/Não) ?");
        if(continua.equalsIgnoreCase("não")){
            cadastrando = false;
        }else if(continua.equalsIgnoreCase("sim"){
            // se for "sim", ira sair do if e voltar para o início
        }else{
            System.out.print("\nOpção inválida");
            cadastrando = false;
                      
        }
    }
}
    private void listarCadastros() {
    if (dados.size() == 0) {
        System.out.println("\nNão existem cadastros !!!\n");
    } else {
        System.out.println("\nLista de Cadastros\n");
        for (int i = 0; i < dados.size(); i++) {
            Dados d = dados.get(i);
            System.out.println("Cadastro número: " + i);
            System.out.println("\tNome: " + d.getNome());
            System.out.println("\tLogin: " + d.getLogin());
            System.out.println("\tSenha: " + d.getSenha() + "\n");
        }
        System.out.println("\nFim da lista\n");
    }
}

private String textInput(String label) {
    System.out.println(label);
    return l.nextLine();
    }
}
