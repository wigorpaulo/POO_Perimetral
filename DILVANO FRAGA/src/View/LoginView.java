package View;

import java.util.Scanner;

public class LoginView {
   public void Login(){
      Scanner ler = new Scanner(System.in);
      
      System.out.println("***LOGIN***");
      System.out.println("\n \n-UserName: ");
      String username = ler.next();
      

      System.out.println("\n Password: ");
      String password = ler.next();

      System.out.println("***Logado Com Sucesso!***");

      MenuView menu = new MenuView();
      menu.menu();

   }
}
