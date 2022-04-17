package model;

public class Fornecedor {
private int id;
private String razaoSocial;
private String CNPJ;
private int tipoPessoaId;
private String fantasia;

public String getRazaosocial (){
	return razaoSocial;
}

public void setRazaoSocial (String razaoSocial) {
	this.razaoSocial = razaoSocial;
}

public String getCNPJ () {
	return CNPJ;
}

public void setCNPJ(String CNPJ) {
	this.CNPJ = CNPJ;
}

public String getFantasia() {
	return fantasia;
}

public void setFantasia (String fantasia) {
	this.fantasia = fantasia;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getTipoPessoaId() {
	return tipoPessoaId;
}
public void setTipoPessoaId(int tipoPessoaId) {
	this.tipoPessoaId = tipoPessoaId;
}
}
