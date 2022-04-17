package model;

public class Saida {
    private int id;
    private int produtoId;
    private float valor;
    private Date dataLancamento;
    private float quantidade;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getProdutoId(){
        return produtoId;
    }
    public void setProdutoId(int produtoId){
        this.produtoId = produtoId;
    }
    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }
    public Date getDataLancamento(){
        return dataLancamento;
    }
    public date setDataLancamento(date dataLancamento){
        this.dataLancamento = dataLancamento;
    }
    public float getQuantidade(){
        return quantidade;
    }
    public float setQuantidade(float quantidade){
        this.quantidade = quantidade;
    }
}