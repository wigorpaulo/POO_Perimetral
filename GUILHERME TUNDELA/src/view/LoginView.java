public class LoginView {
    
    //login e senha
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //Informe o seu login
        System.out.println("Login: ")
        String login = in.nextLine();
        //Informe a sua senha
        System.out.println("Senha: ");
        String senha = in.nextLine();
        //Armazenar em variaveis
        //login == "teste"
        if(login.equals("teste") && senha.equals("123456")){
            System.out.printf("Usuario %s logado com sucesso", login);
        }else{
            System.out.println("Login ou senha invalidos");
        }
    }
}
