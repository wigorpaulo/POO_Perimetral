package model;

public class Usuario {	
	//atributos
	
	private String id;
	private String username;
	private String password;
		
	//-------------------------------------------------
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	//-------------------------------------------------
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//-------------------------------------------------
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	//-------------------------------------------------
	public void LoginUser() {
		

		
		System.out.println("id");
		id = ler.next();
		System.out.println("username");
		username = ler.next();
		System.out.println("password");
		password = ler.next();

		
	

		
		
		
		
		
		
	}
}
