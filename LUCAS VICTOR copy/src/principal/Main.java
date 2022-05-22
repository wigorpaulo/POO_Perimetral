package principal;

import service.UsuarioService;
import view.LoginView;

public class Main {

  public static void main(String[] args) {
    LoginView usuario = new LoginView();
    usuario.login();

  }
}
