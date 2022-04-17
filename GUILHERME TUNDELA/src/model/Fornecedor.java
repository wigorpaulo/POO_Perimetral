package model;

public class Fornecedor {
    private int id;
    private String razaosocial;
    private String fantasia;
    private String cnpj;
    private int tipoPessoaId;

    public int getId(){
        return id;
    }
    public String setId(int id){
        this.id = id;
    } 
    public String setRazaosocial(){
        return razaosocial;
    }
    public void getRazaosocial(String razaosocial){
        this.razaosocial = razaosocial;
    }
    public String setFantasia(){
        return fantasia;
    }
    public void getFantasia(String fantasia(){
        return fantasia;
    }
    public String setCnpj(){
        return cnpj;
    }
    public void getCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public int getTipoPessoaId(){
        return tipoPessoaId;
    }
    public void setTipoPessoaId(int tipoPessoaId){
        this.tipoPessoaId = tipoPessoaId;
    }
}
