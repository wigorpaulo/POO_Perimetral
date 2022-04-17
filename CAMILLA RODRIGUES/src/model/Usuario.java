package model;

public class Usuario {
	
	private Integer idUsuario;
	private String username;
	private String password;
	
	public Usuario() {
		
	}
	
	public Usuario(Integer idUsuario, String username, String password) {
		this.idUsuario=idUsuario; 
		this.username=username;
		this.password=password;
	}
	
	public Integer getId() {
		return idUsuario;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username=username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String novaSenha) {
		this.password=novaSenha;
	}
	

	@Override
	public String toString() {
		return idUsuario + " - Usuario: " + username + "\tPassword: " + password;
	}
	
}
