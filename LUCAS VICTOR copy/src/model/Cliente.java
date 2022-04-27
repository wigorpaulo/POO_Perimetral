package model;

public class Cliente {
 private int id ;
 private String nome ;
 private String cpf;
 private String genero;
 private String endereco;
 private String telefone;
 
 public int getId() {
	 return id;
 }
 public void setId(int id) {
	 this.id=id;
 }
 public String getNome() {
	 return nome;
 }
 public void setNome(String nome) {
	 this.nome = nome;
 }
public String getCpf() {
	return cpf;
}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public String getGenero() {
	return genero;
}
public void setGenero(String genero) {
	this.genero = genero;
}
public String getEndereco() {
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco = endereco;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}
 
}
