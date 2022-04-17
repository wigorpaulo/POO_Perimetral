package model;

import java.util.Date;
import java.util.Scanner;



public class Fornecedor {

	Scanner ler = new Scanner(System.in);
	
	public String id;
	private String razaoSocial;
	private String cnpj;
	private String tipoPessoaId;
	private String fantasia;
	
//-------------------------------------------------
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//-------------------------------------------------
	
	public String getRasaoSocial() {
		return razaoSocial;
	}
	public void setRasaoSocial(String rasaoSocial) {
		this.razaoSocial = rasaoSocial;
	}
//-------------------------------------------------
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
//-------------------------------------------------
	public String getTipoPessoaId() {
		return tipoPessoaId;
	}
	public void setTipoPessoaId(String tipoPessoaId) {
		this.tipoPessoaId = tipoPessoaId;
	}
//-------------------------------------------------
	public String getFantasia() {
		return fantasia;
	}
	public void setFantasia(String fantasia) {
		this.fantasia = fantasia;
	}
//-------------------------------------------------

  public void forn(){
 
		System.out.println("id:");
		id = ler.next();
		System.out.println("Razao Social:");
		razaoSocial = ler.next();
		System.out.println("CNPJ:");
		cnpj = ler.next();
		System.out.println("Tipo Pessoa:");
		tipoPessoaId= ler.next();
		System.out.println("Fantasia:");
		fantasia = ler.next();
		
  }

}
