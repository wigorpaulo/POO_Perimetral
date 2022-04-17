import java.util.Scanner;

public class MenuView {
    
    public static void(String[] agrs){
        //criando um menu para acessar metodos
        //caputar dados de entrada
        Scanner teclado = new Scanner(System.in);

        int escolha = 0;
        do{
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Deletar");
            System.out.println("5 - Voltar para o menu");
            escolha = teclado.nextInt();

        }while(escolha != 0);

        if(escolha < 1 || escolha > 5){
            System.out.println("Enter \"1\", \"2\", \"3\", \"4\" or \"5\");
            escolha = scanescolha.nextInt();
    
        }
    
        else if(escolha == 1) {
            // ..do something
        }
        else if(escolha == 2) {
            //..something else
        }
        else if(escolha == 3) {
            
        }
        else if(escolha == 4){

        }
        else if(escolha == 5){

        }
  
    }
}
