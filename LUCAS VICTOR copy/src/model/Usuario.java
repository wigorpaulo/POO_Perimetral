package model;

public class Usuario {

	//Atributos
	
	private int id;
	private String username;
	private String password;
	
	
	//M�todos
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString(){
		
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println("");
		System.out.println(" *** Listagem de Usuario ***");
        System.out.println("Username :" + getUsername());
        System.out.println("Password :" + getPassword());	
		System.out.println("");
	    System.out.println("______________________________");
		System.out.println("");
	}
	
}
