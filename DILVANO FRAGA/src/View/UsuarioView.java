package View;

import java.util.Scanner;
import Model.Usuario;

public class UsuarioView {
    public void menuUsuario(Usuario user) {
            Scanner ler = new Scanner(System.in);
            System.out.println("***Menu Usuario***");
            System.out.println("-");
            System.out.println("-1-Cadastar");
            System.out.println("-2-Listar Todos");
            System.out.println("-3-Atualizar");
            System.out.println("-4-Deletar");
            System.out.println("-5-Voltar para menu");
            System.out.println("-");
            System.out.println("******");
                
            int num = ler.nextInt();
            
            if(num == 1) {
                menuCadastro();
            }else if(num ==2) {
                
                menuListar(user);
            }
        };
        
        public void menuCadastro() {
            Scanner ler = new Scanner(System.in);
            Usuario user = new Usuario();
            System.out.println("***Cadastro Usuario***");
            System.out.println("-");
            System.out.println("-Informe Username: ");
            user.setUsername(ler.next());
            System.out.println("-Informe password: ");
            user.setPassword(ler.next());
            System.out.println("-");
            System.out.println("-Cadastro Realizado!!!");
            
            
            
            menuUsuario(user);
            
        };
        
        public void menuListar(Usuario user) {
            
            System.out.println("***Lista Usuario***");
            System.out.println("-");
            System.out.println(user.getUsername());

            menuUsuario(user);
        }
    
    }

