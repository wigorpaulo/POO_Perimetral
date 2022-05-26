package model;

public class Usuario {

	// Atributos

	private int id;
	private String username;
	private String password;

	// Metodos

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return"ID: "+Integer.toString(getId())+ "  Username :" + getUsername()  + "  Password :" + getPassword();

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

}
