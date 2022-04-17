package model;

public class Cliente {
	private Integer id;
	private String nome;
	private String cpf;
	private String genero;
	private String endereco;
	private String telefone;
	
	public Cliente() {
		
	}
	
	public Cliente(Integer id, String nome, String cpf, String genero, String endereco, String telefone) {
		this.id=id;
		this.nome=nome;
		this.cpf=cpf;
		this.genero=genero;
		this.endereco=endereco;
		this.telefone=telefone;
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id=id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero=genero;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone=telefone;
	}

	@Override
	public String toString() {
		return "Código Cliente: " + id + "\tNome: " + nome + "\nCPF: " + cpf + "\tGenero: " + genero + "\nEndereco: " + endereco
				+ "\nTelefone: " + telefone + "\n";
	}
	
	
	
}
