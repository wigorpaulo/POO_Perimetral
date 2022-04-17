package Principal;
import Model.Fornecedor;
import View.LoginView;

public class Main{
	
	public static void main(String[] args) {
			
		//INSTANCIA DE FORNECEDOR:
		// Fornecedor form1 = new Fornecedor();
		
		// form1.setRazaoSocial("Carlos bovinos");
        // form1.setCnpj("1315984652-00");
        // form1.setFantasia_social("Trindadense");
        // form1.setId(59546);
        // form1.setTipo_pessoaId(58778);
        // System.out.println("Dados do cliente:");
		// System.out.println(form1.getRazaoSocial());
        // System.out.println(form1.getCnpj());		
		// System.out.println(form1.getFantasia_social());
		// System.out.println(form1.getId());
		// System.out.println(form1.getTipo_pessoaId());
		
		
		//INSTANCIA DE LOGIN VIEW:
		LoginView logv = new LoginView();
		
		//PUXAR METODO LOGIN:
		logv.login();
		
		
		
	}
}